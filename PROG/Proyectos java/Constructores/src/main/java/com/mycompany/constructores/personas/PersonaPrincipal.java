/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.constructores.personas;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PersonaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte seleccion, confirmacion, encendido;
        String respuesta;
        encendido = 1;

        Persona usuario = new Persona();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();
        Persona persona6 = new Persona();
        Persona persona7 = new Persona();
        Persona persona8 = new Persona();
        Persona persona9 = new Persona();
        Persona persona10 = new Persona();

        
        
        while (encendido == 1){
            confirmacion=0;
            
            System.out.println("Indique su seleción\n"
                + "1. Ver tus datos\n"
                + "2. Introducir tus datos\n"
                + "3. Ver datos de las 10 personas\n"
                + "4. Introducir datos para 10 personas");
            seleccion = teclado.nextByte();
            teclado.nextLine();
            switch (seleccion) {
                case 1:
                    usuario.verDatosPersona();
                    break;
                case 2:
                    usuario.leeDatosPersona();
                    break;
                case 3:
                    persona1.verDatosPersona();
                    persona2.verDatosPersona();
                    persona3.verDatosPersona();
                    persona4.verDatosPersona();
                    persona5.verDatosPersona();
                    persona6.verDatosPersona();
                    persona7.verDatosPersona();
                    persona8.verDatosPersona();
                    persona9.verDatosPersona();
                    persona10.verDatosPersona();
                    break;
                case 4:
                    persona1.leeDatosPersona();
                    persona2.leeDatosPersona();
                    persona3.leeDatosPersona();
                    persona4.leeDatosPersona();
                    persona5.leeDatosPersona();
                    persona6.leeDatosPersona();
                    persona7.leeDatosPersona();
                    persona8.leeDatosPersona();
                    persona9.leeDatosPersona();
                    persona10.leeDatosPersona();
                    break;
                case 0:
                    System.out.println("Hasta la próxima");
                    encendido=0;
                    break;
                default:
                    System.out.println("No has hecho una selección válida");
            }
            
            while(confirmacion==0){
                System.out.println("¿Desea hacer algo más?  (Si/No)");
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
                        System.out.println("No te he entendido bien, repítelo de nuevo");
                }
            }
        }
    }

}
