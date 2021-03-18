/* 1.- eliminaciÃ³n objetos */
drop table llevar;
drop table puerto;
drop table etapa;
drop table maillot;
drop table ciclista;
drop table equipo;

/* 2.- CreaciÃ³n de tablas */

create table EQUIPO (	nomeq varchar2(25) primary key,
                        director varchar2(50));


create table CICLISTA (	dorsal int primary key,
                        nombre varchar2(50),
                        edad int,
			nomeq varchar2(25) references EQUIPO);
						


create table ETAPA (    netapa int primary key,
                        km int,
                        salida varchar2(35),
                        llegada varchar2(35),
                        dorsal int references CICLISTA);
						


create table PUERTO (	nompuerto varchar2(35) primary key,
						altura int,
						categoria varchar2(1),
						pendiente float,
						netapa int references ETAPA,
						dorsal int references CICLISTA);
						


create table MAILLOT (	codigo varchar2(3) primary key,
						tipo varchar2(30),
						color varchar2(30),
						premio int);

create table LLEVAR (	dorsal int references CICLISTA,
						netapa int not null references ETAPA,
						codigo varchar2(3) not null references MAILLOT,
						primary key (netapa, codigo));


/* 3.- Carga de datos */

INSERT INTO EQUIPO (nomeq, director)  VALUES ('Amore Vita','Ricardo Padacci');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Artiach','José Peréz');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Banesto','Miguel Echevarria');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Bresciali-Refin','Pietro Armani');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Carrera','Luigi Petroni');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Castorama','Jean Philip');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Euskadi','Pedro Txucaru');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Gatorade','Gian Luca Pacceli');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Gewiss','Moreno Argentin');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Jolly Club','Johan Richard');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Kelme','Álvaro Pino');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Lotus Festina','Suarez Cuevas');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Mapei-Clas','Juan Fernández');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Mercatone Uno','Ettore Romano');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Motorola','John Fidwell');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Navigare','Lonrenzo Sciacci');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('ONCE','Manuel Sainz');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('PDM','Piet Van Der Kruis');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Seguros Amaya','Minguez');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Telecom','Morgan Reikcard');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('TVM','Steveens Henk');
INSERT INTO EQUIPO (nomeq, director)  VALUES ('Wordperfect','Bill Gates');


INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (1,'Miguel Induráin',32,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (2,'Pedro Delgado',35,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (3,'Alex Zulle',27,'ONCE');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (4,'Tony Rominger',30,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (5,'Gert-Jan Theunisse',32,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (6,'Adriano Baffi',33,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (7,'Massimiliano Lelli',30,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (8,'Jean Van Poppel',33,'Lotus Festina');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (9,'Massimo Podenzana',34,'Navigare');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (10,'Mario Cipollini',28,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (11,'Flavio Giupponi',31,'Bresciali-Refin');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (12,'Alessio Di Basco',31,'Amore Vita');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (13,'Lale Cubino',28,'Seguros Amaya');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (14,'Roberto Pagnin',33,'Navigare');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (15,'Jesper Skibby',31,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (16,'Dimitri Konishev',29,'Jolly Club');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (17,'Bruno Leali',37,'Bresciali-Refin');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (18,'Robert Millar',37,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (19,'Julian Gorospe',34,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (20,'Alfonso Gutiérrez',29,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (21,'Erwin Nijboer',31,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (22,'Giorgio Furlan',32,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (23,'Lance Armstrong',27,'Motorola');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (24,'Claudio Chiappucci',29,'Carrera');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (25,'Gianni Bugno',32,'Gatorade');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (26,'Mikel Zarrabeitia',27,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (27,'Laurent Jalabert',28,'ONCE');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (28,'Jesus Montoya',33,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (29,'Angel Edo',28,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (30,'Melchor Mauri',28,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (31,'Vicente Aparicio',30,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (32,'Laurent Dufaux',28,'ONCE');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (33,'Stefano della Santa',29,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (34,'Angel Yesid Camargo',30,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (35,'Erik Dekker',28,'Wordperfect');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (36,'Gian Matteo Fagnini',32,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (37,'Scott Sunderland',29,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (38,'Javier Palacin',25,'Euskadi');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (39,'Rudy Verdonck',30,'Lotus Festina');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (40,'Viatceslav Ekimov',32,'Wordperfect');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (41,'Rolf Aldag',25,'Telecom');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (42,'Davide Cassani',29,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (43,'Francesco Casagrande',28,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (44,'Luca Gelfi',27,'Gatorade');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (45,'Alberto Elli',26,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (46,'Agustin Sagasti',24,'Euskadi');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (47,'Laurent Pillon',32,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (48,'Marco Saligari',29,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (49,'Eugeni Berzin',23,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (50,'Fernando Escartin',27,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (51,'Udo Bolts',30,'Telecom');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (52,'Vladislav Bobrik',26,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (53,'Michele Bartoli',28,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (54,'Steffen Wesemann',30,'Telecom');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (55,'Nicola Minali',28,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (56,'Andrew Hampsten',29,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (57,'Stefano Zanini',28,'Navigare');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (58,'Gerd Audehm',34,'Telecom');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (59,'Mariano Picolli',28,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (60,'Giovanni Lombardi',28,'Bresciali-Refin');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (61,'Walte Castignola',26,'Navigare');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (62,'Raul Alcala',30,'Motorola');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (63,'Alvaro Mejia',32,'Motorola');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (64,'Giuseppe Petito',28,'Mercatone Uno');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (65,'Pascal Lino',29,'Amore Vita');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (66,'Enrico Zaina',24,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (67,'Armand de las Cuevas',28,'Castorama');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (68,'Angel Citracca',28,'Navigare');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (69,'Eddy Seigneur',27,'Castorama');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (70,'Sandro Heulot',29,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (71,'Prudencio Induráin',27,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (72,'Stefano Colage',28,'Bresciali-Refin');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (73,'Laurent Fignon',35,'Gatorade');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (74,'Claudio Chioccioli',36,'Amore Vita');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (75,'Juan Romero',32,'Seguros Amaya');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (76,'Marco Giovannetti',34,'Gatorade');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (77,'Javier Mauleon',33,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (78,'Antonio Esparza',35,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (79,'Johan Bruyneel',33,'ONCE');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (80,'Federico Echave',37,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (81,'Piotr Ugrumov',33,'Gewiss');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (82,'Edgar Corredor',30,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (83,'Hernan Buenahora',32,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (84,'Jon Unzaga',31,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (85,'Dimitri Abdoujaparov',30,'Carrera');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (86,'Juan Martinez Oliver',32,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (87,'Fernando Mota',32,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (88,'Angel Camarillo',28,'Mapei-Clas');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (89,'Stefan Roche',36,'Carrera');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (90,'Ivan Ivanov',27,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (91,'Nestor Mora',28,'Kelme');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (92,'Federico Garcia',27,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (93,'Bo Hamburger',29,'TVM');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (94,'Marino Alonso',30,'Banesto');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (95,'Manuel Guijarro',31,'Lotus Festina');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (96,'Tom Cordes',29,'Wordperfect');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (97,'Casimiro Moreda',28,'ONCE');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (98,'Eleuterio Anguita',25,'Artiach');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (99,'Per Pedersen',29,'Seguros Amaya');
INSERT INTO CICLISTA(dorsal, nombre, edad, nomeq) VALUES (100,'William Palacios',30,'Jolly Club');


INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (1,9,'Valladolid','Valladolid',1);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (2,180,'Valladolid','Salamanca',36);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (3,240,'Salamanca','Caceres',12);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (4,230,'Almendralejo','Córdoba',83);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (5,170,'Córdoba','Granada',27);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (6,150,'Granada','Sierra Nevada',52);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (7,250,'Baza','Alicante',22);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (8,40,'Benidorm','Benidorm',1);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (9,150,'Benidorm','Valencia',35);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (10,200,'Igualada','Andorra',2);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (11,195,'Andorra','Estación de Cerler',65);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (12,220,'Benasque','Zaragoza',12);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (13,200,'Zaragoza','Pamplona',93);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (14,172,'Pamplona','Alto de la Cruz de la Demanda',86);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (15,207,'Santo Domingo de la Calzada','Santander',10);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (16,160,'Santander','Lagos de Covadonga',5);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (17,140,'Cangas de Onis','Alto del Naranco',4);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (18,195,'Ávila','Ávila',8);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (19,190,'Ávila','Destilerias Dyc',2);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (20,52,'Segovia','Destilerias Dyc',2);
INSERT INTO ETAPA(netapa, km, salida, llegada, dorsal) VALUES (21,170,'Destilerias Dyc','Madrid',27);


INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Alto del Naranco',565,'1',6.90,10,30);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Arcalis',2230,'E',6.50,10,4);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Cerler-Ampriu',2500,'E',5.87,11,9);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Coll de la Comella',1362,'1',8.07,10,2);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Coll de Ordino',1980,'E',5.30,10,7);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Cruz de la Demanda',1850,'E',7.00,11,20);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Lagos de Covadonga',1134,'E',6.36,16,42);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Navacerrada',1860,'1',7.50,19,2);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Puerto de Alisas',672,'1',5.80,15,1);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Pto de la Morcuera',1760,'2',6.50,19,2);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Puerto de Mijares',1525,'1',4.90,18,24);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Puerto de Navalmoral',1521,'2',4.30,18,2);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('P Pedro Bernardo',1250,'1',4.20,18,25);
INSERT INTO PUERTO(nompuerto, altura, categoria, pendiente, netapa, dorsal) VALUES ('Sierra Nevada',2500,'E',6.00,2,26);

INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MGE','General','Amarillo',8000000);
INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MMO','Montaña','Blanco y Rojo',2000000);
INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MMS','Mas Sufrido','Estrellitas moradas',2000000);
INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MMV','Metas volantes','Rojo',2000000);
INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MRE','Regularidad','Verde',200000);
INSERT INTO MAILLOT(codigo, tipo, color, premio) VALUES ('MSE','Sprints especiales','Rosa',2000000);


INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,1,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,1,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (67,1,'MMS');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,1,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,1,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,1,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,2,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (25,2,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (69,2,'MMS');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (6,2,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (27,2,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (8,2,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,3,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (25,3,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (67,3,'MMS');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (16,3,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (27,3,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (12,3,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,4,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (24,4,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (69,4,'MMS');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (17,4,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (27,4,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (8,4,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (2,5,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (25,5,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (16,5,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (27,5,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (12,5,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (2,6,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,6,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (16,6,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,6,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (12,6,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (2,7,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,7,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (33,7,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,7,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,7,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (4,8,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,8,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (33,8,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,8,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,8,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,9,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,9,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (48,9,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,9,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,9,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,10,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,10,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (48,10,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,10,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,10,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (3,11,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (30,11,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (48,11,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,11,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,11,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (3,12,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (30,12,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (48,12,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,12,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,12,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (30,13,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (48,13,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,13,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (99,13,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (30,14,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,14,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,14,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,14,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,14,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (30,15,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,15,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (2,15,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,15,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,15,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,16,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,16,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,16,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,16,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,16,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,17,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,17,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,17,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,17,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,17,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,18,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (26,18,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,18,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (27,18,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (10,18,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,19,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,19,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,19,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,19,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,19,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,20,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (28,20,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,20,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,20,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,20,'MSE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (1,21,'MGE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (2,21,'MMO');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (42,21,'MMV');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (20,21,'MRE');
INSERT INTO LLEVAR(dorsal, netapa, codigo) VALUES (22,21,'MSE');

/* 4.- Ejercicios SQL*/

--1.	Obtener el código, el tipo, el color y el premio de todos los maillots que hay.
SELECT codigo, tipo, color, premio
FROM maillot;

select *
from maillot;

select maillot.codigo, maillot.tipo, maillot.premio, maillot.color
from maillot;

select m.codigo
from maillot m;
--2.	Obtener el dorsal y el nombre de los ciclistas cuya edad sea menor o igual que 25 años.
select dorsal, nombre
from ciclista
where edad <= 25;
--3.	Obtener el nombre y la altura de todos los puertos de categoría "E" (Especial).
select nompuerto, altura
from puerto
where categoria = 'E';
--4.	Obtener el valor del atributo netapa de aquellas etapas con salida y llegada en la misma ciudad.
select netapa
from etapa
where salida = llegada;
--5.	¿Cuántos ciclistas hay?
select count(*) cantidad
from ciclista;
--6.	¿Cuántos ciclistas hay con edad superior a 25 años?
select count(*)
from ciclista
where edad > 25;
--7.	¿Cuántos equipos hay?
select COUNT(*)
from equipo;
--8.	¿Cuántos equipos con ciclistas hay?
select count(distinct nomeq)
from ciclista;
--9.	Obtener la media de edad de los ciclistas.
select avg(edad)
from ciclista;
--10.	Obtener la altura mínima y máxima de los puertos de montaña.
select min(altura) as minimo, max(altura) as maximo
from puerto;
--11.	Obtener el nombre de cada ciclista junto con el nombre del equipo al que pertenece, ordenado por nombre de equipo y dentro de cada equipo por nombre del ciclista en orden inverso.
select nomeq, nombre
from ciclista
    order by nomeq, nombre desc;
--12.	Obtener el nombre de los ciclistas que sean de Banesto.
select nombre
from ciclista
where lower(nomeq) = 'banesto';
--13.	¿Cuántos ciclistas pertenecen al equipo Amore Vita?
select count(*)
from ciclista
where lower(nomeq) = 'amore vita';
--14.	Edad media de los ciclistas del equipo TVM.
select avg(edad)
from ciclista
where nomeq = 'TVM';
--15.	Nombre y edad de los ciclistas que pertenezcan al mismo equipo que Miguel Induráin
select nombre
from ciclista
where nomeq = (	select nomeq
				from ciclista
				where lower(nombre) = 'miguel induráin');
                
select d.nombre
from ciclista c, ciclista d
where lower(c.nombre) = 'miguel induráin' and c.nomeq = d.nomeq;                
--16.	Nombre de los ciclistas que han ganado alguna etapa.
select distinct ciclista.nombre
from ciclista, etapa
where ciclista.dorsal = etapa.dorsal;

select nombre
from ciclista
where dorsal in (	select dorsal
					from etapa);

--17.	Nombre de los ciclistas que han llevado el maillot General.
select  distinct ciclista.* 
from ciclista, maillot, llevar
where ciclista.dorsal = llevar.dorsal and llevar.codigo = maillot.codigo
  and maillot.tipo = 'General'
order by 1;


select nombre 
from ciclista
where dorsal in (	select dorsal
					from llevar
					where codigo in (	select codigo
										from maillot
										where tipo = 'General'));
--18.	Obtener el nombre del ciclista más joven.
select nombre
from ciclista
where edad in (	select min(edad)
				from ciclista);
--19.	Obtener el número de ciclistas de cada equipo.
select nomeq, count(*)
from ciclista
group by nomeq;
--20.	Obtener el nombre de los equipos que tengan más de 5 ciclistas.
select nomeq, count(*)
from ciclista
group by nomeq
having count(*) > 5;
--21.	Obtener el número de puertos que ha ganado cada ciclista, indicando el dorsal.
select dorsal, count(*) puertos
from puerto
group by dorsal;

select ciclista.nombre, count(*) puertos
from puerto, ciclista
where puerto.dorsal = ciclista.dorsal
group by ciclista.nombre
order by count(*) desc;

select ciclista.nombre, count(*) puertos
from puerto, ciclista
where puerto.dorsal = ciclista.dorsal
group by ciclista.nombre
order by 2 desc;
--22.	Obtener el nombre de los ciclistas que han ganado más de un puerto.
select nombre
from ciclista, puerto
where ciclista.dorsal = puerto.dorsal
group by nombre
having count(*) > 1;

select nombre 
from ciclista
where dorsal in (	select dorsal
					from puerto
					group by dorsal
					having count(*) > 1);
--23.	Obtener el nombre y el director de los equipos a los que pertenezca algún ciclista mayor de 33 años.
select * 
from equipo
where nomeq in (select nomeq 
				from ciclista
				where edad > 33);

select distinct e.*
from equipo e, ciclista c
where e.nomeq = c.nomeq and c.edad > 33;
--24.	Nombre de los ciclistas que no pertenezcan ni a Kelme ni a Banesto.
select * 
from ciclista
where lower(nomeq) not in ('kelme', 'banesto');

select * 
from ciclista
where lower(nomeq) != 'kelme' and lower(nomeq) != 'banesto';
--25.	Nombre de los ciclistas que no hayan ganado ninguna etapa.
select *
from ciclista
where dorsal  not in (	select dorsal
						from etapa
						where dorsal is not null);
--26.	Nombre de los ciclistas que no hayan ganado ningún puerto de montaña.
select *
from ciclista 
where dorsal not in (	select dorsal
						from puerto
						where dorsal is not null);
--27.	Nombre de los ciclistas que hayan ganado más de una etapa con puertos.
select c.nombre
from ciclista c, etapa e , puerto p
where c.dorsal = e.dorsal and p.netapa=e.netapa
group by c.nombre
having count(*) > 1;

select *
from ciclista
where dorsal in (	select dorsal
					from etapa
                    where netapa in (select netapa from puerto) 
					group by dorsal
					having count(*) > 1);
--28.	¿Qué ciclistas han llevado el mismo maillot que Miguel Induráin?
select * 
from ciclista
where dorsal in (	select dorsal 
					from llevar
					where codigo in (	select codigo
										from llevar
										where dorsal in (	select dorsal 
															from ciclista
															where lower(nombre) = 'miguel induráin')));

select distinct c2.*
from ciclista c1, llevar l1, ciclista c2, llevar l2
where c1.dorsal = l1.dorsal 
  and c2.dorsal = l2.dorsal
  and lower(c1.nombre) = 'miguel induráin'
  and l1.codigo = l2.codigo;
--29.	De cada equipo obtener la edad media, la máxima edad y la mínima edad.
select nomeq, avg(edad) media, max(edad) maximo, min(edad) minima
from ciclista
group by nomeq;
--30.	Nombre de aquellos ciclistas que tengan una edad entre 25 y 30 años y que no pertenezcan a los equipos Kelme y Banesto.
select *
from ciclista
where edad >= 25 and edad <= 30 and lower(nomeq) != 'kelme' and lower(nomeq) != 'banesto';

select *
from ciclista
where edad between 25 and 30 and lower(nomeq) not in ('kelme', 'banesto');
--31.	Nombre de los ciclistas que han ganado la etapa que comienza en Zaragoza. 
select *
from ciclista
where dorsal in (	select dorsal
					from etapa
					where lower(salida)= 'zaragoza');
--32.	Nombre de los ciclistas que han ganado etapas cuyo inicio está en una localidad que comienza por la letra B.
select *
from ciclista
where dorsal in (	select dorsal
					from etapa
					where lower(salida) like  'b%');

--33.	Obtén el nombre y la categoría de los puertos ganados por ciclistas del equipo Banesto.
select *
from puerto
where dorsal in (	select dorsal
					from ciclista
					where lower(nomeq) = 'banesto');
--34.	Obtener el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto.
select puerto.nompuerto, puerto.netapa, etapa.km 
from etapa, puerto
where etapa.netapa = puerto.netapa;
--35.	Obtener el nombre de los ciclistas con el color de cada maillot que hayan llevado.
select distinct ciclista.nombre, maillot.color
from ciclista, llevar, maillot
where ciclista.dorsal = llevar.dorsal
  and llevar.codigo = maillot.codigo;
--36.	Obtener pares de nombre de ciclista y número de etapa tal que ese ciclista haya ganado esa etapa habiendo llevado el maillot de color amarillo al menos una vez.
select ciclista.nombre, etapa.netapa
from ciclista, etapa
where ciclista.dorsal = etapa.dorsal
  and ciclista.dorsal in (	select dorsal
							from llevar
							where codigo in (	select codigo
												from maillot 
												where lower(color) = 'amarillo'));




select distinct ciclista.nombre, etapa.netapa
from ciclista, etapa, llevar, maillot
where ciclista.dorsal = etapa.dorsal
  and ciclista.dorsal = llevar.dorsal
  and llevar.codigo = maillot.codigo
  and lower(maillot.color) = 'amarillo';


--36b.	Obtener pares de nombre de ciclista y número de etapa tal que ese ciclista haya ganado esa etapa habiendo llevado el maillot de color amarillo antes de ganar esa etapa																 

select distinct ciclista.nombre, etapa.netapa
from ciclista, etapa, llevar, maillot
where ciclista.dorsal = etapa.dorsal
  and ciclista.dorsal = llevar.dorsal
  and llevar.codigo = maillot.codigo
  and maillot.color = 'Amarillo'
  and llevar.netapa < etapa.netapa;
  
--37.	Obtener el valor del atributo netapa de las etapas que no comienzan en la misma ciudad en que acaba la anterior etapa.
select * 
from etapa eAnterior, etapa eSiguiente
where eSiguiente.salida != eAnterior.llegada
  and eSiguiente.netapa = eAnterior.netapa + 1;
--38.	Obtener el valor del atributo netapa y la ciudad de salida de aquellas etapas que no tengan puertos de montaña.
select * from etapa
where netapa not in (	select
						netapa
						from puerto);
--39.	Obtener la edad media de los ciclistas que han ganado alguna etapa.
select avg(edad)
from ciclista
where dorsal  in (	select dorsal
					from etapa);
--40.	Selecciona el nombre de los puertos con una altura superior a la altura media de todos los puertos.
select nompuerto
from puerto
where altura > (	select avg(altura)
					from puerto);
--41.	Obtener el nombre de la ciudad de salida y de llegada de las etapas donde están los puertos con mayor pendiente.
select *
from etapa
where netapa in (	select netapa
					from puerto
					where pendiente = (	select max(pendiente)
										from puerto));

select *
from etapa
where netapa in (	select netapa
					from puerto
					where pendiente >=	all (	select pendiente		
												from puerto));
select *
from etapa, puerto
where etapa.netapa = puerto.netapa
  and pendiente in (	select max(pendiente)
						from puerto);

select etapa.salida, etapa.llegada
from etapa, puerto p1, puerto p2
where etapa.netapa = p1.netapa 
group by etapa.salida, etapa.llegada, p1.pendiente
having max(p2.pendiente) = p1.pendiente;
--42.	Obtener el dorsal y el nombre de los ciclistas que han ganado los puertos de mayor altura.
select * 
from ciclista
where dorsal in (	select dorsal	
					from puerto
					where altura in (	select max(altura)
										from puerto));
--43.	Obtener el nombre del ciclista más joven que ha ganado al menos una etapa.
select *
from ciclista
where dorsal in (	select dorsal
					from etapa
					where dorsal in (	select dorsal
										from ciclista 
										where edad = (	select min(edad)
														from ciclista
														where dorsal in (	select dorsal
																			from etapa))));

select ciclista.*
from ciclista, etapa
where ciclista.dorsal = etapa.dorsal 
  and ciclista.edad = (	select min(edad)
						from ciclista, etapa
						where ciclista.dorsal = etapa.dorsal);	
--44.	Obtener el valor del atributo netapa de aquellas etapas tales que todos los puertos que están en ellas tienen más de 700 metros de altura.
select *
from etapa e
where not exists (	select *
					from puerto
					where netapa = e.netapa
					  and altura <= 700)
 and exists (	select *
				from puerto
				where netapa = e.netapa);

select distinct e.netapa
from etapa e, puerto
where not exists (	select *
					from puerto
					where netapa = e.netapa
					  and altura <= 700)
  and e.netapa = puerto.netapa;

select e.netapa, count(*)
from etapa e, puerto p
where e.netapa = p.netapa and p.altura > 700
group by e.netapa
having count(*) = (	select count(*)
					from etapa ee, puerto pp
					where ee.netapa = pp.netapa
					  and ee.netapa = e.netapa);

select distinct netapa
from puerto
where netapa not in (	select netapa	
						from puerto
						where altura <= 700);

--45.	Obtener el nombre y el director de los equipos tales que todos sus ciclistas son mayores de 28 años.
select *
from equipo e
where not exists (	select *
					from ciclista
					where nomeq = e.nomeq
					and edad < 28)
	and exists (	select *
					from ciclista
					where nomeq = e.nomeq);
--46.	Obtener todos los datos de los ciclistas tales que todas las etapas que han ganado tienen más de 170 km (es decir que solo han ganado etapas de más de 170 km).
select c.dorsal, nombre
from ciclista c, etapa
where c.dorsal = etapa.dorsal and 
  170 <= all (	select km
					from etapa
					where etapa.dorsal = c.dorsal)
order by c.dorsal;

select c.dorsal, nombre
from ciclista c
where 170 <= all (	select km
					from etapa
					where etapa.dorsal = c.dorsal)
 and exists (select *
			from etapa 
			where dorsal = c.dorsal);

select c.dorsal, nombre
from ciclista c
where 170 <= all (	select km
					from etapa
					where etapa.dorsal = c.dorsal)
 and exists (select km
					from etapa
					where etapa.dorsal = c.dorsal);

select distinct c.dorsal, c.nombre
from ciclista c, etapa e
where c.dorsal = e.dorsal
and not exists	(	select *
					from etapa
					where dorsal = c.dorsal
					  and km <= 170);

--47.	Obtener el nombre de los ciclistas que han ganado todos los puertos de una etapa y además han ganado esa misma etapa.
select c.nombre, e.netapa, c.dorsal, count(*)
from ciclista c, etapa e, puerto p
where c.dorsal = e.dorsal 
  and p.netapa = e.netapa 
group by c.nombre, e.netapa, c.dorsal
having count(*) = (	select count(*)
					from puerto
					where dorsal = c.dorsal
					  and puerto.netapa = e.netapa);

select distinct c.nombre
from ciclista c, etapa e, puerto p
where c.dorsal = e.dorsal
  and e.netapa = p.netapa
  and c.dorsal = all (	select dorsal
						from puerto
						where netapa = e.netapa);

--48.	Obtener el nombre de los equipos tales que todos sus corredores han llevado algún maillot o han ganado algún puerto.
select distinct nomeq
from ciclista
where nomeq not in (	select nomeq
						from ciclista c
						where c.dorsal not in (	select dorsal
												from ciclista cn
												where dorsal  in (	select dorsal
																	from puerto)
													or dorsal  in (	select dorsal
																	from llevar)));


select distinct nomeq
from ciclista
where nomeq not in (	select nomeq
						from ciclista c
						where c.dorsal  in (	select dorsal
												from ciclista cn
												where dorsal  not in (	select dorsal
																		from puerto)
													and dorsal  not in (	select dorsal
																			from llevar)));

--49.	Obtener el código y el color de aquellos maillots que sólo han sido llevados por ciclistas de un mismo equipo.
select m.codigo, m.color
from maillot m, llevar l, ciclista c
where m.codigo = l.codigo
  and l.dorsal = c.dorsal
group by m.codigo, m.color
having count(distinct c.nomeq) = 1;

select codigo, color
from maillot
where codigo in (	select l.codigo
					from llevar l, ciclista c
					where l.dorsal = c.dorsal
					  and not exists (	select *
										from llevar ll, ciclista cc
										where ll.dorsal = cc.dorsal
										  and ll.codigo = l.codigo
										  and cc.nomeq <> c.nomeq));

--50.	Obtener el nombre de aquellos equipos tal que sus ciclistas solo hayan ganado puertos de 1ª categoría.
select distinct nomeq
from ciclista c
where dorsal in (	select dorsal
					from puerto)
  and nomeq not in (	select nomeq
						from ciclista
						where dorsal in (	select dorsal
											from puerto
											where categoria != '1'));

select c.nomeq, min(categoria), max(categoria)
from puerto p, ciclista c
where p.dorsal = c.dorsal
group by c.nomeq
having min(categoria) = max(categoria)
   and max(categoria) = '1';

select distinct c.nomeq, *
from ciclista c, puerto p
where c.dorsal = p.dorsal 
  and categoria = '1'
  and not exists (	select *
					from ciclista cc, puerto pp
					where cc.dorsal = pp.dorsal
					  and categoria <> '1'
					  and cc.nomeq = c.nomeq);
					  
select c.nomeq
from puerto p, ciclista c 
where p.dorsal = c.dorsal 
group by c.nomeq
having count(*) = (	select count(*)
					from puerto pp, ciclista cc
					where pp.dorsal = cc.dorsal
					  and pp.categoria = '1'
					  and cc.nomeq = c.nomeq);

--51.	Obtener el valor del atributo netapa de aquellas etapas que tienen puertos de montaña indicando cuántos tiene.
select netapa, count(*)
from puerto
group by netapa;
--52.	Obtener el nombre de todos los equipos indicando cuántos ciclistas tiene cada uno.
select nomeq, count(*)
from ciclista
group by nomeq;
--53.	Obtener el nombre de todos los equipos indicando cuántos ciclistas tiene cada uno, incluido el de los equipos sin ciclistas.
select e.nomeq, count(c.dorsal)
from ciclista c, equipo e
where c.nomeq(+)=e.nomeq
group by e.nomeq;

select e.nomeq, count(c.dorsal)
from ciclista c full join equipo e on (c.nomeq=e.nomeq)
group by e.nomeq;
--54.	Obtener el director y el nombre de los equipos que tengan más de 3 ciclistas y cuya edad media sea igual o inferior a 30 años.
select e.director, e.nomeq
from equipo e, ciclista c
where e.nomeq = c.nomeq
group by e.director, e.nomeq
having count(*) >= 3
   and avg(edad) <= 30;
--55.	Obtener el nombre de los ciclistas que pertenezcan a un equipo que tenga más de cinco corredores y que hayan ganado alguna etapa indicando cuántas etapas ha ganado.
select c.nombre, count(*)
from ciclista c, etapa e
where c.nomeq in (	select nomeq
					from ciclista
					group by nomeq
					having count(*) >= 5)
  and c.dorsal = e.dorsal
group by c.nombre;

--56.	Obtener el nombre de los equipos y la edad media de sus ciclistas de aquellos equipos que tengan la media de edad máxima de todos los equipos.
select nomeq, avg(edad)
from ciclista
group by nomeq
having avg(edad) >= all(	select avg(edad)
							from ciclista
							group by nomeq);
--57.	Obtener el director de los equipos cuyos ciclistas han llevado más días maillots de cualquier tipo.
select *
from equipo
where nomeq in (	select nomeq
					from llevar l, ciclista c
					where l.dorsal = c.dorsal
					group by nomeq
					having count(distinct netapa) >= all (	select count(distinct netapa)
															from llevar ll, ciclista cc
															where ll.dorsal = cc.dorsal
															group by nomeq));
--58.	Obtener el código y el color del maillot que ha sido llevado por algún ciclista que no ha ganado ninguna etapa.
select codigo, color
from maillot
where codigo in (	select codigo	
					from llevar
					where dorsal not in (	select dorsal
											from etapa));
--59.	Obtener el valor del atributo netapa, la ciudad de salida y la ciudad de llegada de las etapas de más de 190 km y que tengan por lo menos dos puertos.
select *
from etapa e
where km > 190 
  and 2 <= (select count(*)
			from puerto
			where netapa = e.netapa);
--60.	Obtener el dorsal y el nombre de los ciclistas que no han llevado todos los maillots que ha llevado el ciclista de dorsal 2.

select *
from ciclista c
where EXISTS(	select *
			    from llevar l
				where l.dorsal=2 
				  and not exists(	select *
							        from llevar l2
									where l2.dorsal=c.dorsal 
									  and l2.codigo=l.codigo));



select distinct c.*
from ciclista c, llevar ll
where EXISTS(	select *
			    from llevar l
				where l.dorsal=2 
				  and not exists(	select *
							        from llevar l2
									where l2.dorsal=c.dorsal 
									  and l2.codigo=l.codigo))
  and c.dorsal = ll.dorsal;

--61.	Obtener el dorsal y el nombre de los ciclistas que han llevado al menos un maillot de los que ha llevado el ciclista de dorsal 2.
 select *
 from ciclista
 where dorsal in (	select dorsal
					from llevar
					where codigo in (	select codigo
										from llevar
										where dorsal = 2));
--62.	Obtener el dorsal y el nombre de los ciclistas que no han llevado ningún maillot de los que ha llevado el ciclista de dorsal 2.
select c.dorsal, nombre
from ciclista c
where dorsal not in (	select dorsal
						from llevar
						where codigo in (	select codigo
											from llevar
											where dorsal = 2));

select distinct c.dorsal, nombre, llevar.codigo
from ciclista c
left join llevar 
on c.dorsal  = llevar.dorsal
where c.dorsal not in (	select dorsal
						from llevar
						where codigo in (	select codigo
											from llevar
											where dorsal = 2));
--63.	Obtener el dorsal y nombre de los ciclistas que han llevado exactamente los mismos maillots que ha llevado el ciclista de dorsal 1.


select *
from ciclista c
where exists (	select *
				from llevar l
				where not exists (	select *
									from llevar l2
									where l2.dorsal = 1
									  and not exists (	select *
														from llevar l3
														where l3.codigo = l2.codigo 
														  and l3.dorsal = c.dorsal)));

select c.dorsal, nombre
from ciclista c
where not exists (select codigo
				  from llevar
				  where dorsal=1
				    and codigo not in (select codigo
										from llevar l	
										where l.dorsal=c.dorsal));		  




--64.	Obtener el dorsal y el nombre del ciclista que ha llevado durante más kilómetros un mismo maillot e indicar también el color de dicho maillot.

select c.dorsal, c.nombre, m.color, sum(e.km)
from ciclista c, etapa e, llevar l, maillot m
where c.dorsal = l.dorsal
  and l.netapa = e.netapa
  and l.codigo = m.codigo
group by m.color, c.dorsal, c.nombre
having sum(e.km) = (select max(sum(e.km))
												from llevar l, etapa e
												where l.netapa = e.netapa
												group by l.dorsal, l.codigo);

select c.dorsal, c.nombre, m.color, sum(e.km)
from ciclista c, etapa e, llevar l, maillot m
where c.dorsal = l.dorsal
  and l.netapa = e.netapa
  and l.codigo = m.codigo
group by m.color, c.dorsal, c.nombre
having sum(e.km) >= all (	select sum(e.km)
							from ciclista c, etapa e, llevar l, maillot m
							where c.dorsal = l.dorsal
							 and l.netapa = e.netapa
							  and l.codigo = m.codigo
							group by m.color, c.dorsal, c.nombre);

--65.	Obtener el dorsal y el nombre de los ciclistas que han llevado dos tipos de maillot menos de los que ha llevado el ciclista de dorsal 3. 
 
select c.dorsal, c.nombre 
from llevar l, ciclista c
where l.dorsal = c.dorsal
group by c.dorsal, c.nombre
having count(distinct codigo) + 2 = (	select count(distinct codigo)
										from llevar
										where dorsal = 3);

/
-- 1.- Procedimiento que muestre todos los equipos.
create or replace procedure dimeEquipos is
cursor cursor1 is select * from equipo;

begin 

for registro1 in cursor1 loop

    dbms_output.put_line(registro1.nomeq);

end loop;

exception

    when others then
        
        raise_application_error(-21001,'Error en dime equipos'||SQLERRM||' '||SQLCODE);

end;

set serveroutput on;
exec dimeEquipos;
/
-- 2.- Procedimiento que muestre los ciclistas de un equipo (recibido como parametro).
create or replace procedure ciclistasDeUnEquipo (nEquipo equipo.nomeq%type) is
cursor cursor1 is select * from ciclista where ciclista.nomeq=nEquipo;
begin

for registro1 in cursor1 loop

    dbms_output.put_line(registro1.nombre);

end loop;

exception

when others then
    raise_application_error(-21001,'Se ha producido un error en ciclistasDeUnEquipo '||SQLERRM||' '||SQLCODE);

end;

set serveroutput on;
exec ciclistasDeUnEquipo ('Banesto');
-- 3.- Procedimiento que muestrs los ciclistas de cada equipo.
/
create or replace procedure ciclistasDeCadaEquipo is
cursor cursor1 is select * from equipo;
cursor cursor2 (nEquipo ciclista.nomeq%type) is select ciclista.nombre from ciclista where ciclista.nomeq=nEquipo;

begin

for registro1 in cursor1 loop
    dbms_output.put_line(registro1.nomeq);
    for registro2 in cursor2(registro1.nomeq) loop
        
        dbms_output.put_line(registro2.nombre);
        
    end loop;
    dbms_output.put_line('');
end loop;

exception
when others then
    raise_application_error(-21001,'Se ha producido un error en ciclistasDeCadaEquipo '||SQLERRM||' '||SQLCODE);

end;

set serveroutput on;
exec ciclistasDeCadaEquipo;
/
-- 4.- Procedimiento que recorra los puertos y coloque el ganador a null 
--         si el ciclista ganador es de un equipo que no gano ninguna etapa;

create or replace procedure actualizaGanadoresPuertos is
cursor cursor1 is select * from puerto for update;
cursor cursor2 is select dorsal from etapa;
begin
    
    for registro1 in cursor1 loop
        
        for registro2 in cursor2 loop
            if(registro1.dorsal = registro2.dorsal)then
                update puerto set dorsal=null where CURRENT OF cursor1;
            end if;
        end loop;
    end loop;

exception
when others then
    raise_application_error(-21001,'Error en actualizaGanadoresPuertos '||SQLERRM||' '||SQLCODE);
    
end;

set serveroutput on;
exec actualizaGanadoresPuertos;

commit;
rollback;
/


