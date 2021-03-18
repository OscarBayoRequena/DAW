/*
Escribe un programa que pida por teclado un día de la semana en letras y que diga
qué asignatura toca a primera hora ese día.
Ampliación: Crea una aplicación que nos pida por teclado un nombre de día que se
corresponda     y   nos   diga   que   módulo   nos   toca   ese   día   a   
cualquier   hora   y   si escribimos “salir” nos dirá adiós y finaliza
*/
package com.mycompany.ejerciciostema2;
import java.util.Scanner;
public class E01PreguntasHorario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int hora, confirmacion;
        String encendido,respuesta, diaSemana;
        
        encendido = "Si";
        System.out.println("");
     
         while("Si".equals(encendido)){
            confirmacion =0;
            System.out.println("¿Qué día quieres seleccionar? \n"
                + "Escribe su nombre\n"
                + "1.Lunes\n"
                + "2.Martes\n"
                + "3.Miércoles\n"
                + "4.Jueves\n"
                + "5.Viernes");
            diaSemana= teclado.nextLine();
            diaSemana=diaSemana.toLowerCase();
            switch(diaSemana){
                case "lunes":
                    System.out.println("¿Cuál es la hora?\n"
                            + "Introduce el número de la hora\n\n"
                            + "1. Primera hora\n"
                            + "2. Segunda hora\n"
                            + "3. Tercera hora\n"
                            + "4: Cuarta hora\n"
                            + "5. Quinta hora\n"
                            + "6. Sexta hora\n");
                    hora = teclado.nextInt();  
                    teclado.nextLine();
                    switch (hora){
                        case 1:
                            System.out.println("A esa hora toca: FOL");
                            break;
                        case 2:
                            System.out.println("A esa hora toca: FOL");
                            break;
                        case 3:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 4:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 5:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        case 6:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        default:
                            System.out.println("La hora introducida es incorrecta");
                            break;
                    }
                    break;
                case "martes":
                    System.out.println("¿Cuál es la hora?\n"
                            + "Introduce el número de la hora\n\n"
                            + "1. Primera hora\n"
                            + "2. Segunda hora\n"
                            + "3. Tercera hora\n"
                            + "4: Cuarta hora\n"
                            + "5. Quinta hora\n"
                            + "6. Sexta hora\n");
                    hora = teclado.nextInt();  
                    teclado.nextLine();
                    switch (hora){
                        case 1:
                            System.out.println("A esa hora toca: FOL");
                            break;
                        case 2:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 3:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 4:
                            System.out.println("A esa hora toca: LM");
                            break;
                        case 5:
                            System.out.println("A esa hora toca: LM");
                            break;
                        case 6:
                            System.out.println("A esa hora toca: ED");
                            break;
                        default:
                        System.out.println("La hora introducida es incorrecta");
                            break;
                    }
                    break;
                case "miércoles":
                    System.out.println("¿Cuál es la hora?\n"
                            + "Introduce el número de la hora\n\n"
                            + "1. Primera hora\n"
                            + "2. Segunda hora\n"
                            + "3. Tercera hora\n"
                            + "4: Cuarta hora\n"
                            + "5. Quinta hora\n"
                            + "6. Sexta hora\n");
                    hora = teclado.nextInt(); 
                    teclado.nextLine();
                    switch (hora){
                        case 1:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 2:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 3:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 4:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 5:
                            System.out.println("A esa hora toca: LM");
                            break;
                        case 6:
                            System.out.println("A esa hora toca: LM");
                            break;
                        default:
                            System.out.println("La hora introducida es incorrecta");
                            break;
                    }
                    break;
                case "jueves":
                    System.out.println("¿Cuál es la hora?\n"
                            + "Introduce el número de la hora\n\n"
                            + "1. Primera hora\n"
                            + "2. Segunda hora\n"
                            + "3. Tercera hora\n"
                            + "4: Cuarta hora\n"
                            + "5. Quinta hora\n"
                            + "6. Sexta hora\n");
                    hora = teclado.nextInt();
                    teclado.nextLine();
                    switch (hora){
                        case 1:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 2:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 3:
                            System.out.println("A esa hora toca: ED");
                            break;
                        case 4:
                            System.out.println("A esa hora toca: ED");
                            break;
                        case 5:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        case 6:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        default:
                            System.out.println("La hora introducida es incorrecta");
                            break;
                    }
                    break;
                case "viernes":
                    System.out.println("¿Cuál es la hora?\n"
                            + "Introduce el número de la hora\n\n"
                            + "1. Primera hora\n"
                            + "2. Segunda hora\n"
                            + "3. Tercera hora\n"
                            + "4: Cuarta hora\n"
                            + "5. Quinta hora\n"
                            + "6. Sexta hora\n");
                    hora = teclado.nextInt(); 
                    teclado.nextLine();
                    switch (hora){
                        case 1:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        case 2:
                            System.out.println("A esa hora toca: SSII");
                            break;
                        case 3:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 4:
                            System.out.println("A esa hora toca: BBDD");
                            break;
                        case 5:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        case 6:
                            System.out.println("A esa hora toca: PROG");
                            break;
                        default:
                            System.out.println("La hora introducida es incorrecta");
                            break;
                    }
                    break;
                default:
                System.out.println("El día introducido es incorrecto");
                break;
            }
        while (confirmacion==0){
            System.out.println("\n¿Desea mirar más horas?\n"
            + "Si o No");
            respuesta = teclado.nextLine();
            respuesta=respuesta.toLowerCase();
            switch(respuesta){
                case "si":
                    confirmacion=1;
                    break;
                case "no":
                    System.out.println("Hasta la próxima");
                    confirmacion=1;
                    encendido="No";                    
                    break;
                default:
                    System.out.println("Lo siento no te he entendido,\n"
                            + "repítelo de nuevo");
                    break;
            }
        }
        
         
        }
    }       
}





