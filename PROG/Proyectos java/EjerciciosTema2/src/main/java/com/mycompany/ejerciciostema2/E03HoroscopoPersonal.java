package com.mycompany.ejerciciostema2;

/*
Escribe  un programa que nos diga el  horóscopo a partir  del día y el mes  de nacimiento.
 */

import java.util.Scanner;
public class E03HoroscopoPersonal {


    public static void main(String[] args) {
        // TODO code application logic here
        String mes;
        byte dia;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce tu mes de nacimiento");
        mes = teclado.nextLine();
        mes = mes.toLowerCase();
        teclado.nextLine();
        switch(mes){
            case "enero":
                System.out.println("Introduce tu dia de nacimiento");
                dia = teclado.nextByte();
                if (dia<0 && dia>=19){
                    System.out.println("Eres capriconio");
                } else {
                    if(dia>19 && dia<=31){
                        System.out.println("Eres acuario");
                    }else{
                        System.out.println("Ese no es un día válido");
                    }
                }
                break;     
            case "febrero":
                System.out.println("Introduce tu dia de nacimiento");
                dia = teclado.nextByte();
                if (dia<0 && dia>=18){
                    System.out.println("Eres acuario");
                } else {
                    if(dia>18 && dia<=29){
                        System.out.println("Eres piscis");
                    }else{
                        System.out.println("Ese no es un día válido");
                    }
                }
                break; 
            case "marzo":
                System.out.println("Introduce tu dia de nacimiento");
                dia = teclado.nextByte();
                if (dia<0 && dia>=20){
                    System.out.println("Eres piscis");
                } else {
                    if(dia>20 && dia<=31){
                        System.out.println("Eres aries");
                    }else{
                        System.out.println("Ese no es un día válido");
                    }
                }
                break; 
            case "abril":
                System.out.println("Introduce tu dia de nacimiento");
                dia = teclado.nextByte();
                if (dia<0 && dia>=20){
                    System.out.println("Eres aries");
                } else {
                    if(dia>20 && dia<=30){
                        System.out.println("Eres tauro");
                    }else{
                        System.out.println("Ese no es un día válido");
                    }
                }
                break; 
            case "mayo":
                System.out.println("Introduce tu dia de nacimiento");
                dia = teclado.nextByte();
                if (dia<0 && dia>=20){
                    System.out.println("Eres tauro");
                } else {
                    if(dia>19 && dia<=31){
                        System.out.println("Eres géminis");
                    }else{
                        System.out.println("Ese no es un día válido");
                    }
                }
                break; 
        }
    }
    
}
