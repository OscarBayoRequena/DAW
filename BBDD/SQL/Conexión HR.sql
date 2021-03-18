set SERVEROUTPUT on;
/*
declare

nombreRegion regions.region_name%type;
nombrePais countries.country_name%type;

begin

    nombrePais:='&dime_nombre_pais';
    
    select distinct region_name into nombreRegion 
                            from regions join countries on regions.region_id = countries.region_id 
                                    where lower(countries.country_name)=lower(nombrePais);

    dbms_output.put_line('Ese país pertenece a '|| nombreRegion);
    
exception

    when no_data_found then
        dbms_output.put_line('No se ha encontrado ese país en la base de datos');

end;*/

/*
declare
num1 number(3):=&dime_num1;
num2 number(3):=&dime_num2;
num3 number(3):=&dime_num3;
begin

case 
    when (num1>num2 and num1>num3) then 
    dbms_output.put_line('El primer numero es el mayor');
    
    when (num2>num1 and num2>num3) then 
    dbms_output.put_line('El segundo numero es el mayor');
    
    when (num3>num2 and num3>num1) then 
    dbms_output.put_line('El tercer numero es el mayor');

    when (num1=num2 and num1>num3) then 
    dbms_output.put_line('El primer y segundo numero son los mayores');
    
    when (num3=num2 and num2>num1) then 
    dbms_output.put_line('El tercer y segundo numero son los mayores');
    
    when (num1=num3 and num1>num2) then 
    dbms_output.put_line('El primer y tercer numero son los mayores');
    
    when (num1=num2 and num1=num3) then 
    dbms_output.put_line('Todos los numeros son iguales');

    else
    dbms_output.put_line('Algo ha fallado');
    
end case;
end;*/

/*
declare
palabra varchar2(30):='&dime_palabra';
begin

dbms_output.put_line('La inicial de la palabra es '||substr(palabra,1,1));

end;*/

declare
numPaises number(3);
begin

select count(countries.country_id) into numPaises from countries;

dbms_output.put_line('El total de paises es: ' || numPaises);
end;

declare
edad number(3):=&dime_edad;
begin

case 
    when (edad<65 and edad>0) then
        dbms_output.put_line('Esa persona no está jubilada');
        
    when (edad>65) then
        dbms_output.put_line('Esa persona está jubilada');
        
    else
        dbms_output.put_line('La introducida no es correcta');
        
end case;
end;        
    