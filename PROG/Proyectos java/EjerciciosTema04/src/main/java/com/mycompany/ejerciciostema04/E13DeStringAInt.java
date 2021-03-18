/*
Diseñar un algoritmo que permita traducir una cadena numérica que contiene 
un número int alnúmero que representa. 
Por ejemplo: strANum("2020") devolvería un número real con el valor 2020.
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;


public class E13DeStringAInt {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        
        String cadena1;
        double numeroResultante=0;

        
        System.out.println("Introduce tu número");
        cadena1=teclado.nextLine();
        
        try{
            numeroResultante=deStringADouble(cadena1);
        }catch(java.lang.NumberFormatException Ex1 ){
            System.err.println("Esa cadena de caracteres no se ha podido convertir a un número");
        }
        System.out.println(numeroResultante);
    }
    
    static double deStringADouble(String numeroString)throws java.lang.NumberFormatException{
        double numero;

        numero=Double.valueOf(numeroString).doubleValue();

        return numero;
    }
    
}
