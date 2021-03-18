/*
Haz una aplicacion utilizando StringBuilder que pida por teclado una palabra y muestre por un lado las 
vocales y por otro lado las consonantes, despues de hacer esto pedirá si queremos volver a introducir otra palabra
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;

public class E_Extra {


    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        StringBuilder palabra;
        
        StringBuilder vocales=new StringBuilder();
        
        
        byte encendido,confirmacion;
        String respuesta,cadena;
        
        
        
        encendido=1;
        while(encendido==1){
            confirmacion=0;
            
            System.out.println("Introduce tu palabra");
            palabra=new StringBuilder(teclado.nextLine());
            
            cadena=separaVocalesYConsonantes(palabra);
            
            System.out.println(cadena);
            
            while(confirmacion==0){
                System.out.println("¿Deseas introducir otra palabra?");
                respuesta=teclado.nextLine();
                
                respuesta=respuesta.toLowerCase();
                switch(respuesta){
                    case "si":
                        confirmacion=1;
                        break;
                    case "no":
                        System.out.println("Hasta la próxima");
                        confirmacion=1;
                        encendido=0;
                        break;
                    default:
                        System.out.println("Lo siento no te he entendido.Repítelo de nuevo");
                }
            }
        }
        
    }
    
    static String separaVocalesYConsonantes(StringBuilder palabra){
        String vocalesYConsonantes;
        String vocales="";
        String consonantes="";
        char letra;
        
        for(int i=0;i<palabra.length();i++){
            letra=palabra.charAt(i);
            
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                vocales=vocales+palabra.charAt(i);
                
            }else{
                consonantes=consonantes+palabra.charAt(i);
            }
            
        }
        
        vocalesYConsonantes= vocales +"\t"+ consonantes;
        
        return vocalesYConsonantes;
    }
    
}
