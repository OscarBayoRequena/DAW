/*
ntroducir valores a dos cadenas desde el teclado y comparar cual está antes 
en orden alfabético.
En una tercera cadena, se concatenarán las dos anteriores en orden 
alfabético separadas por elsímbolo +.
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;

public class E12OrdenaCadenasAlfabeticamente {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String cadena1,cadena2,cadena3;
        
        System.out.println("Introduce tu primera cadena de caracteres");
        cadena1=teclado.nextLine();
        
        System.out.println("Introduce tu segunda cadena de caracteres");
        cadena2=teclado.nextLine();
        
        if(cadena1.compareTo(cadena2)>0){
            cadena3=cadena2+"+"+cadena1;
        }else{
            if(cadena1.compareTo(cadena2)<0){
                cadena3=cadena1+"+"+cadena2;
            }else{
                System.out.println("Las cadenas introducidas están en la misma posición lexicográfica");
                cadena3=cadena1+"+"+cadena2;
            }
        }
        System.out.println(cadena3);
    }
    
}
