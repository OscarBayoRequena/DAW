/*
Realizar un programa que lea 10 nombres por teclado en el formato “nombre ape1 ape2”. 
Unavez leídos todos los nombres  mostrarlos en el formato “ape1 ape2, nombre”.
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;

public class E10NombresYApellidos {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        String nombre1="nulo";
        String nombre2="nulo";
        String nombre3="nulo";
        String nombre4="nulo";
        String nombre5="nulo";
        
        String nombre6="nulo";
        String nombre7="nulo";
        String nombre8="nulo";
        String nombre9="nulo";
        String nombre10="nulo";
        
        String introduccion;
        
        System.out.println("Introdce 10 nombres y apellidos");
        System.out.println("Introduce el primer nombre");
        
        for(int i=1;i<=10;i++){
            if(i>1){
            System.out.println("Introduce el próximo nombre");
            }
            introduccion=teclado.nextLine();
            
            switch(i){
                case 1:
                    nombre1=introduccion;
                    nombre1=apellidosNombre(nombre1);
                    break;
                case 2:
                    nombre2=introduccion;
                    nombre2=apellidosNombre(nombre2);
                    break;
                case 3:
                    nombre3=introduccion;
                    nombre3=apellidosNombre(nombre3);
                    break;
                case 4:
                    nombre4=introduccion;
                    nombre4=apellidosNombre(nombre4);
                    break;    
                case 5:
                    nombre5=introduccion;
                    nombre5=apellidosNombre(nombre5);
                    break;
                case 6:
                    nombre6=introduccion;
                    nombre6=apellidosNombre(nombre6);
                    break;
                case 7:
                    nombre7=introduccion;
                    nombre7=apellidosNombre(nombre7);
                    break;
                case 8:
                    nombre8=introduccion;
                    nombre8=apellidosNombre(nombre8);
                    break;
                case 9:
                    nombre9=introduccion;
                    nombre9=apellidosNombre(nombre9);
                    break;
                case 10:
                    nombre10=introduccion;
                    nombre10=apellidosNombre(nombre10);
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }
        }
        
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);
        System.out.println(nombre4);
        System.out.println(nombre5);
        
        System.out.println(nombre6);
        System.out.println(nombre7);
        System.out.println(nombre8);
        System.out.println(nombre9);
        System.out.println(nombre10);
     
    }
    
    static String apellidosNombre(String nombre){
        String nombreProcesado;
        String espacio=" ";
        String nombre1;
        String apellidos;
        
        nombre1=nombre.substring(0,nombre.indexOf(espacio) );
        apellidos=nombre.substring((nombre.indexOf(espacio)+1));
        
        nombreProcesado=apellidos+","+nombre1;
        
        return nombreProcesado;
    }
    
}
