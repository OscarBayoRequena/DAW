
CREATE TABLE cliente (
    cif           VARCHAR2(9) NOT NULL,
    nombre        VARCHAR2(30),
    rsocial       VARCHAR2(30),
    telefono      VARCHAR2(12),
    observacion   VARCHAR2(200),
    desestimado   VARCHAR2(2)
);

ALTER TABLE cliente
    ADD CHECK (
        desestimado IN (
            'NO','SI'
        )
    );

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( cif );

CREATE TABLE habitacion (
    cod_serv   INTEGER NOT NULL,
    h_ncli     INTEGER,
    h_pos      VARCHAR2(8)
);

ALTER TABLE habitacion
    ADD CHECK (
        h_pos IN (
            'Exterior','Interior'
        )
    );

ALTER TABLE habitacion ADD CONSTRAINT habitacion_pk PRIMARY KEY ( cod_serv );

CREATE TABLE itemr (
    i_cod               INTEGER NOT NULL,
    cantidad            NUMBER(10,2),
    reserva_r_cod       INTEGER NOT NULL,
    servicio_cod_serv   INTEGER NOT NULL
);

ALTER TABLE itemr ADD CONSTRAINT itemr_pk PRIMARY KEY ( i_cod );

CREATE TABLE mesa (
    cod_serv     INTEGER NOT NULL,
    m_comensal   NUMBER(1)
);

ALTER TABLE mesa ADD CONSTRAINT mesa_pk PRIMARY KEY ( cod_serv );

CREATE TABLE precio (
    codigop     INTEGER NOT NULL,
    servicio    INTEGER NOT NULL,
    precio      NUMBER(10,2),
    temporada   INTEGER NOT NULL
);

ALTER TABLE precio ADD CONSTRAINT precio_pk PRIMARY KEY ( codigop );

CREATE TABLE reserva (
    cod_reserva         INTEGER NOT NULL,
    fecha_reserva       DATE,
    fecha_cancelacion   DATE,
    fecha_factura       DATE,
    cliente_cif         VARCHAR2(9)
);

ALTER TABLE reserva ADD CONSTRAINT reserva_pk PRIMARY KEY ( cod_reserva );

CREATE TABLE salon (
    cod_serv   INTEGER NOT NULL,
    s_aforo    INTEGER
);

ALTER TABLE salon ADD CONSTRAINT salon_pk PRIMARY KEY ( cod_serv );

CREATE TABLE servicio (
    cod_serv   INTEGER NOT NULL,
    s_tipo     VARCHAR2(10) NOT NULL
);

ALTER TABLE servicio ADD CONSTRAINT servicio_pk PRIMARY KEY ( cod_serv );

CREATE TABLE temporada (
    codigot   INTEGER NOT NULL,
    nombre    INTEGER,
    fec_ini   DATE,
    fec_fin   DATE
);

ALTER TABLE temporada ADD CONSTRAINT temporada_pk PRIMARY KEY ( codigot );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_servicio_fk FOREIGN KEY ( cod_serv )
        REFERENCES servicio ( cod_serv );

ALTER TABLE itemr
    ADD CONSTRAINT itemr_reserva_fk FOREIGN KEY ( reserva_r_cod )
        REFERENCES reserva ( cod_reserva );

ALTER TABLE itemr
    ADD CONSTRAINT itemr_servicio_fk FOREIGN KEY ( servicio_cod_serv )
        REFERENCES servicio ( cod_serv );

ALTER TABLE mesa
    ADD CONSTRAINT mesa_servicio_fk FOREIGN KEY ( cod_serv )
        REFERENCES servicio ( cod_serv );

ALTER TABLE precio
    ADD CONSTRAINT precio_temporada_fk FOREIGN KEY ( temporada )
        REFERENCES temporada ( codigot );

ALTER TABLE reserva
    ADD CONSTRAINT reserva_cliente_fk FOREIGN KEY ( cliente_cif )
        REFERENCES cliente ( cif );

ALTER TABLE salon
    ADD CONSTRAINT salon_servicio_fk FOREIGN KEY ( cod_serv )
        REFERENCES servicio ( cod_serv );

ALTER TABLE precio
    ADD CONSTRAINT servicio_fk FOREIGN KEY ( servicio )
        REFERENCES servicio ( cod_serv );


/*
-------------------------------------------------------------------------
NOTA

Recorde que habia una funcion para extraer los años de una fecha pero no recorde bien como se implementaba
Es por eso que en las partes donde debería de ir lo he indicado con YEARS(fecha) 
--------------------------------------------------------------------------
*/

--1.Cancelar a fecha de hoy todas las reservas de salones.
update reserva set fecha_cancelacion=SYSDATE where cod_reserva in(select reserva_r_cod 
                                                                            from itemr join servicio on itemr.servicio_cod_serv=servicio.cod_serv
                                                                                            where lower(s_tipo)='salon');

--2. Dejamos de ofrecer servicios de salones, eliminamos todos los datos relacionados con este servicio.
delete reserva where cod_reserva in (select reserva_r_cod 
                                            from itemr join servicio on itemr.servicio_cod_serv=servicio.cod_serv
                                                        where lower(s_tipo)='salon');
delete itemr where servicio_cod_serv in (select cod_serv from servicio
                                                        where lower(s_tipo)='salon');
                                                        
delete salon where cod_serv in (select cod_serv from servicio
                                                        where lower(s_tipo)='salon');
                                                        
delete servicio where lower(s_tipo)='salon';

--3. Llega una nueva reserva de un nuevo cliente, reservará una mesa para tres comensales. La mesa y su precio se deben crear para la temporada de
--código 202101 ya existente. Realizar todas las sentencia necesarias.
rollback;
insert into cliente (cif,nombre,rsocial,telefono,observacion,desestimado) values('45678896d','Pablo','Calle del Espeto N30','555 278 847','Ninguna','NO');

insert into servicio (cod_serv, s_tipo) values (123,'mesa');

insert into mesa (cod_serv,m_comensal) values(123,3); 

insert into precio (codigop,servicio,precio,temporada) values(234,123,50,202101);

insert into reserva (cod_reserva,fecha_reserva,cliente_cif) values(345,'19/04/2021','45678896d');

insert into itemr (i_cod,cantidad,reserva_r_cod,servicio_cod_serv) values(10,1,345,123); 

rollback;

--4. Mostrar el total facturado para cada temporada
--select sum(precio*count());
select precio.temporada, sum(precio*cantidad)
        from precio join servicio on precio.servicio=servicio.cod_serv
                    join itemr on servicio.cod_serv=itemr.servicio_cod_serv
                        group by precio.temporada;


--5. Mostrar todos los datos de las habitaciones que no se alquilaron en 2020.
select habitacion.* from habitacion
        where habitacion.cod_serv not in (select habitacion.cod_serv 
                                                    from habitacion join servicio on habitacion.cod_serv=servicio.cod_serv
                                                            join itemr on itemr.servicio_cod_serv=servicio.cod_serv
                                                            join reserva on reserva.cod_reserva=itemr.reserva_r_cod
                                                                where YEARS(reserva.fecha_reserva)=2020);

--6. Mostrar todos los nombres de los clientes que nos reservaron mesas más de tres veces en 2020
select cliente.nombre from cliente
        where cif in (select reserva.cliente_cif
                            from mesa join servicio on mesa.cod_serv=servicio.cod_serv
                                            join itemr on itemr.servicio_cod_serv=servicio.cod_serv
                                            join reserva on reserva.cod_reserva=itemr.reserva_r_cod
                                                       where YEARS(reserva.fecha_reserva)=2020);
                                                       
                                                       
--7. Contar los servicios de habitacion reservados por cada cliente mostrando el precio total ingresado ordenado de mayor a menor
select count(reserva.cod_reserva), sum(precio*cantidad) 
    from habitacion join servicio on habitacion.cod_serv=servicio.cod_serv
                    join itemr on itemr.servicio_cod_serv=servicio.cod_serv
                    join reserva on reserva.cod_reserva=itemr.reserva_r_cod
                    join precio on precio.servicio=servicio.cod_serv
                            group by reserva.cliente_cif
                                order by sum(precio);
                                
                                
--8. Mostrar todos los nombres de los clientes que alquilaron la habitacion mas cara en 2020
select cliente.nombre from cliente
    where cif in (select reserva.cliente_cif 
                        from habitacion join servicio on habitacion.cod_serv=servicio.cod_serv
                                    join itemr on itemr.servicio_cod_serv=servicio.cod_serv
                                    join reserva on reserva.cod_reserva=itemr.reserva_r_cod
                                    join precio on precio.servicio=servicio.cod_serv
                                            where precio.precio = (select max(precio) 
                                                                        from habitacion join servicio on habitacion.cod_serv=servicio.cod_serv
                                                                                        join itemr on itemr.servicio_cod_serv=servicio.cod_serv
                                                                                        join reserva on reserva.cod_reserva=itemr.reserva_r_cod
                                                                                        join precio on precio.servicio=servicio.cod_serv
                                                                                                where years(reserva.fecha_reserva)=2020));
    
--9. Mostrar el CIF del cliente, codigo y precio del servicio mas caro que ha realizado cada cliente
select cliente.cif, servicio.cod_serv, max(precio)
        from cliente join reserva on cliente.cif=reserva.cliente_cif
                     join itemr on reserva.cod_reserva=itemr.reserva_r_cod
                     join servicio on servicio.cod_serv=itemr.servicio_cod_serv
                     join precio on servicio.cod_serv=precio.servicio
                            group by cliente.cif,servicio.cod_serv;

