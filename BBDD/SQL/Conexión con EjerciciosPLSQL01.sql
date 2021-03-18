
--1.-Crear  un  procedimiento  llamado  escribir  que  reciba  una  cadena  y  la  presente  en  el terminal de salida. 

create or replace procedure escribe(cad varchar2) is
cadena varchar2(100):=cad;
begin
    dbms_output.put_line(cadena);
exception 
    when others then
    raise_application_error(SQLCODE,SQLERRM);
end;

--2.-Procedimiento que muestre las iniciales de un nombre recibido como parámetro.
create or replace procedure sacaIniciales(cad varchar2) is
cadena varchar2(50):=trim(cad);
iniciales varchar2(10);
begin
iniciales:=upper(substr(cadena,1,1));
for x in 1..length(cadena) loop
    if (substr(cadena,x,1)=' ') then
        iniciales:=iniciales||upper(substr(cadena,x+1,1));
    end if;
end loop;
dbms_output.put_line(iniciales);

exception
    when others then
        raise_application_error(-20000,SQLCODE||': '||SQLERRM);
        dbms_output.put_line('Se ha producido un error');
        
end;

--3.-Procedimiento  que  muestre  ordenados  de  mayor  a  menor  de  dos  númerosrecibidos como parámetros.
create or replace procedure ordena2(num1 number,num2 number) is

begin
if(num2>num1)then
    dbms_output.put_line(num2||' '||num1);
else
    dbms_output.put_line(num1||' '||num2);
end if;

exception
    when others then
        raise_application_error(-20000,SQLCODE||': '||SQLERRM);
        dbms_output.put_line('Se ha producido un error');
end;

--4.-Procedimiento  que  muestre ordenados  de  mayor  a  menor  de  tres  números  recibidos como parámetros.
create or replace procedure ordena3(num1 number,num2 number,num3 number) is
resultadoOrdenado varchar2(10);
begin
if(num1>=num2 and num1>=num3)then
    resultadoOrdenado:=num1;
        
    if(num2>=num3)then
        resultadoOrdenado:=resultadoOrdenado||' '||num2||' '||num3;
    else
        resultadoOrdenado:=resultadoOrdenado||' '||num3||' '||num2;
    end if;
elsif (num2>=num1 and num2>=num3) then
    
    resultadoOrdenado:=num2;
        
    if(num1>=num3)then
        resultadoOrdenado:=resultadoOrdenado||' '||num1||' '||num3;
    else
        resultadoOrdenado:=resultadoOrdenado||' '||num3||' '||num1;
    end if;

elsif (num3>=num1 and num3>=num2) then
    
    resultadoOrdenado:=num3;
        
    if(num1>=num2)then
        resultadoOrdenado:=resultadoOrdenado||' '||num1||' '||num2;
    else
        resultadoOrdenado:=resultadoOrdenado||' '||num2||' '||num1;
    end if;
end if;

dbms_output.put_line(resultadoOrdenado);

exception
    when others then
        raise_application_error(-20000,SQLCODE||': '||SQLERRM);
        dbms_output.put_line('Se ha producido un error');
        
end;

--5.-Crear un procedimiento que reciba una cadena de caracteres y presente en pantalla el número de vocales, 
--consonantes y espacios en blanco que contiene.
create or replace procedure cuentaTiposCaracteres(cad varchar2) is
cadena varchar2(100):=cad;
contVocales number(3):=0;
contConsonantes number(3):=0;
contEspacios number(3):=0;
begin

for x in 1..length(cadena) loop
    if(regexp_like(substr(cadena,x,1), '[AEIOUaeiou]')) then
        contVocales:=contVocales+1;
    elsif (substr(cadena,x,1) like ' ') then
            contEspacios:=contEspacios+1;
        elsif (regexp_like(substr(cadena,x,1), '[QWRTYPSDFGHJKLÑZXCVBNMqwrtypsdfghjklñzxcvbnm]')) then
            contConsonantes:=contConsonantes+1;
        
    end if;
end loop;


dbms_output.put_line('Vocales: '|| contVocales||chr(10)||'Consonantes: '|| contConsonantes||chr(10)||'Espacios: '|| contEspacios);

exception
    when others then
        raise_application_error(-20000,SQLCODE||': '||SQLERRM);
        dbms_output.put_line('Se ha producido un error');
end;

--6.-Función que devuelva las iniciales de un nombre recibido como parámetro.
create or replace function sacaInicialesFuncion(cad varchar2) return varchar2 is
cadena varchar2(50):=trim(cad);
iniciales varchar2(10);
begin
iniciales:=upper(substr(cadena,1,1));
for x in 1..length(cadena) loop
    if (substr(cadena,x,1)=' ') then
        iniciales:=iniciales||upper(substr(cadena,x+1,1));
    end if;
end loop;
return iniciales;

exception
    when others then
        raise_application_error(-20000,SQLCODE||': '||SQLERRM);
        dbms_output.put_line('Se ha producido un error');
        
end;

--7.-Función que devuelva el mayor de dos números recibidos como parámetros.

--8.-Función que devuelva el mayor de tres números recibidos como parámetros.

--9.-Crear una función que reciba un carácter y devuelva verdadero si es una vocal.

--10.-Crear  una  función  que  reciba  una  cadena  de  caracteres  y  devuelva  el  número  de vocales que contiene.

--11.-Crear un  procedimiento  que  inserte  1000  vehículos  en una  tabla
--llamada  coche (matricula varchar2, modelonumber, fecha_compra date). 
--La matrícula se completará con valores aleatorios de 3 letras mayúsculas 
--y 4 dígitos numéricos.El modelo lo tomará de una tabla  de  modelos  de  
--vehículos  con  la  estructura  (codmodelo  number,  nombre  varchar2) 
--esta  tabla  debe  estar  completada  con  algunos  registros  antes  de  
--iniciar  la  inserción  en vehículos. La fecha será una fecha aleatoria de los últimos 365 días.
create table Coche(matricula varchar2(8) primary key,
                    modelo number references Modelo(codModelo),
                    fecha_compra date);
                    
create table Modelo(codModelo number primary key,
                    nombre varchar2(20));

insert into Modelo values(1,'Ibiza');
insert into Modelo values(2,'León');
insert into Modelo values(3,'A4');
insert into Modelo values(4,'206');
insert into Modelo values(5,'C3');
insert into Modelo values(6,'Camaro');
insert into Modelo values(7,'Supra');


create or replace procedure inserta1000Coches is
matricula varchar2(8);
modelo number;
fecha date;
begin
for x in 1..10 loop
    matricula:=trunc(dbms_random.value(0,9))||trunc(dbms_random.value(0,9))||trunc(dbms_random.value(0,9))||trunc(dbms_random.value(0,9));
    matricula:=matricula||' '||dbms_random.string('U',3);
    select codModelo into modelo from (select * from Modelo order by dbms_random.random) where rownum<2;
    dbms_output.put_line(matricula||' '||modelo);
    --insert into Coche(matricula,modelo,fecha_compra) values(matricula,modelo,fecha);
end loop;

end;

set serveroutput on;
begin

inserta1000coches;
end;
--12.-Crear un procedimiento llamado borracoches, que elimine todos los registros 
--de una tabla  llamada  vehículos,  donde  el  campo  fecha_compra,  tipo  date,  
--sea  menor  a  la  fecha que  le  pasemos  como  parámetro  al  procedimiento.  
--Crear  una  función  que  devuelva verdadero  cuando  el  número  de  registros  
--de  la  tabla  vehículos  del  ejercicio  anterior sea mayor a 500.

--13.-Sobre  la  tabla  vehículos  de  los  ejercicios  anteriores,  crear  un  
--procedimiento  que compruebe si el tamaño de la tabla vehículos es mayor a 500
--registros y si es así llame al procedimiento borracoches pasándole la fecha necesaria 
--para que elimine los vehículos con  antigüedad superior a 180 días. 



