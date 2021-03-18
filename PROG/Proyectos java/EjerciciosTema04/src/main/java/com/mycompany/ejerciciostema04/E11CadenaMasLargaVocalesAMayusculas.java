/*
ntroducir valores a dos cadenas desde el teclado y, en la más larga, sustituir 
cada vocal por lamisma vocal en mayúsculas; 
el programa debe finalizar visualizando ambas cadenas
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;

public class E11CadenaMasLargaVocalesAMayusculas {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        String cadena1,cadena2;
        int tamanio1,tamanio2;
        
        System.out.println("Introduce tu primera cadena de caracteres");
        cadena1=teclado.nextLine();
        
        System.out.println("Introduce tu segunda cadena de caracteres");
        cadena2=teclado.nextLine();
        
        tamanio1=cadena1.length();
        tamanio2=cadena2.length();
        
        if(tamanio1>tamanio2){
            
            cadena1=cadena1.replace("a", "A");
            cadena1=cadena1.replace("e", "E");
            cadena1=cadena1.replace("i", "I");
            cadena1=cadena1.replace("o", "O");
            cadena1=cadena1.replace("u", "U");
        
        }else{
            if(tamanio1<tamanio2){
                
                cadena2=cadena2.replace("a", "A");
                cadena2=cadena2.replace("e", "E");
                cadena2=cadena2.replace("i", "I");
                cadena2=cadena2.replace("o", "O");
                cadena2=cadena2.replace("u", "U");
                
            }else{
                if(tamanio1==tamanio2){
                
                    cadena1=cadena1.replace("a", "A");
                    cadena1=cadena1.replace("e", "E");
                    cadena1=cadena1.replace("i", "I");
                    cadena1=cadena1.replace("o", "O");
                    cadena1=cadena1.replace("u", "U");
                    
                    cadena2=cadena2.replace("a", "A");
                    cadena2=cadena2.replace("e", "E");
                    cadena2=cadena2.replace("i", "I");
                    cadena2=cadena2.replace("o", "O");
                    cadena2=cadena2.replace("u", "U");
                }
            }
        }
        System.out.println("");
        System.out.println("Estas son tus cadenas procesadas");
        System.out.println(cadena1);
        System.out.println(cadena2);
        
    }
}
