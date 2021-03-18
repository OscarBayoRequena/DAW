/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria;
import java.util.Scanner;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GestionAlquileres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio Scanner
        Scanner teclado= new Scanner(System.in);
        
        //Declaro las variables que utilizaré para modificar los objetos
        String nuevaReferencia, nuevaDireccion, nuevaPoblacion, nuevasFotosDireccion,
                nuevoGarage,nuevoAmueblado,nuevoDisponible;
        int nuevaSuperficie,nuevoPrecio;
        byte nuevosBanos,nuevasPlantas;
        short nuevasHabitaciones;
        
        //Declaro las variables que utilizaré para controlar el programa y las selecciones del usuario
        String seleccion;
        byte numVivienda,campoElegido,encendido,confirmacion1,confirmacion2,confirmacion3;
        
        //Creo los 4 objetos de tipo vivienda
        Vivienda vivhu001= new Vivienda();
        Vivienda vivhu002= new Vivienda();
        Vivienda vivhu003= new Vivienda();
        Vivienda vivhu004= new Vivienda();
        
        System.out.println("Bienvenido");
        
        //Incializo encendido a 1 para comenzar el programa
        encendido=1;
        while(encendido==1){
            
            
            System.out.println(
                      "____________________________________________________\n"
                    + "||                  INMOBILIARIA                  ||\n"
                    + "|| C. Crear una nueva vivienda                    ||\n"
                    + "|| M. Mostrar información de las viviendas        ||\n"
                    + "|| E. Eliminar dato de una vivienda               ||\n"
                    + "|| S. Salir                                       ||\n"
                    + "||________________________________________________||\n"
                    + "Introduzca su selección");
            /*Pido al usuario que elija que va a hacer y controlo los posibles errores
            que pueda causar el usuario al introducir valores
            */
            try{
                
                seleccion= teclado.nextLine();

                seleccion=seleccion.substring(0,1);
                seleccion= seleccion.toLowerCase();

        switch(seleccion){//Aquí elijo la selección indicada por el usuario
                    case "c"://Crear vivienda
                        System.out.println("¿En qué espacio quieres crear la nueva vivienda?"
                                + "\n1." + (vivhu001.dimeReferencia())
                                + "\n2." + (vivhu002.dimeReferencia())
                                + "\n3." + (vivhu003.dimeReferencia())
                                + "\n4." + (vivhu004.dimeReferencia()));
                    
                        try{
                            //Pido al usuario que hueco de guardado quiere utilizar
                            numVivienda=teclado.nextByte();
                            
                            try{//Pido que introduzca todos los datos que quiera y controlo los posibles errores
                                
                                    System.out.println("Introduce la nueva referencia");
                                    teclado.nextLine();
                                    nuevaReferencia=teclado.nextLine();
                                    System.out.println("Introduce la nueva población");
                                    nuevaPoblacion=teclado.nextLine();
                                    System.out.println("Introduce la nueva dirección");
                                    nuevaDireccion=teclado.nextLine();
                                    System.out.println("Introduce las nuevas fotos de la dirección");
                                    nuevasFotosDireccion=teclado.nextLine();
                                    System.out.println("Introduce la nueva superficie");
                                    nuevaSuperficie=teclado.nextInt();
                                    System.out.println("Introduce el nuevo número de plantas");
                                    nuevasPlantas=teclado.nextByte();
                                    System.out.println("Introduce el nuevo número de habitaciones");
                                    nuevasHabitaciones=teclado.nextShort();
                                    System.out.println("Introduce el nuevo número de baños");
                                    nuevosBanos=teclado.nextByte();
                                    confirmacion1=0;
                                    while(confirmacion1==0){
                                        System.out.println("Introduce si tiene garage o no");
                                        nuevoGarage=teclado.nextLine();
                                    }
                                    System.out.println("Introduce el nuevo precio");
                                    nuevoPrecio=teclado.nextInt();
                            
                            
                                }catch(java.util.InputMismatchException Ex1){//Capturo el error producido al introducir datos que no soporta una variable
                                    System.err.println("Error: el formato de un valor no es válido");
                                    break;
                                }catch(java.lang.NumberFormatException Ex2){//Capturo el error producido si un número se va fuera del rango de la variable
                                    System.err.println("Error: un valor númerico no está dentro del rango designado");
                                    break;
                                }catch(Exception Ex3){//Error genérico que emitirá en caso de no haberlo contemplado antes
                                    System.out.println("Se ha producido un error");
                                    break;
                                }
                            
                            switch(numVivienda){//Envío la información introducida al objeto seleccionado
                                case 1:
                                    
                                    vivhu001.nuevaVivienda(nuevaReferencia,nuevaPoblacion,nuevaDireccion,nuevasFotosDireccion,
                                    nuevaSuperficie,nuevasPlantas,nuevasHabitaciones,nuevosBanos,nuevoGarage,nuevoAmueblado,
                                    nuevoDisponible,nuevoPrecio);
                            
                                    break;
                                case 2:

                                    vivhu002.nuevaVivienda(nuevaReferencia,nuevaPoblacion,nuevaDireccion,nuevasFotosDireccion,
                                    nuevaSuperficie,nuevasPlantas,nuevasHabitaciones,nuevosBanos,nuevoGarage,nuevoAmueblado,
                                    nuevoDisponible,nuevoPrecio);
                            
                                    break;
                                case 3:

                                    vivhu003.nuevaVivienda(nuevaReferencia,nuevaPoblacion,nuevaDireccion,nuevasFotosDireccion,
                                    nuevaSuperficie,nuevasPlantas,nuevasHabitaciones,nuevosBanos,nuevoGarage,nuevoAmueblado,
                                    nuevoDisponible,nuevoPrecio);
                            
                                    break;
                                case 4:
                                    
                                    vivhu004.nuevaVivienda(nuevaReferencia,nuevaPoblacion,nuevaDireccion,nuevasFotosDireccion,
                                    nuevaSuperficie,nuevasPlantas,nuevasHabitaciones,nuevosBanos,nuevoGarage,nuevoAmueblado,
                                    nuevoDisponible,nuevoPrecio);
                            
                                    break;
                            default:
                                System.out.println("Se ha introducido el número de un espacio de vivienda inexistente");
                            }
                        
                        }catch(java.util.InputMismatchException Ex1){//Capturo el error producido al introducir datos que no soporta una variable
                            System.err.println("Error: el formato del número del espacio de vivienda no es válido");
                        }catch(java.lang.NumberFormatException Ex2){//Capturo el error producido si un número se va fuera del rango de la variable
                            System.err.println("Error: el valor númerico del espacio de vivienda excede el rango designado");
                        }catch(Exception Ex3){//Error genérico que emitirá en caso de no haberlo contemplado antes
                            System.out.println("Se ha producido un error");
                        }
                        
                        break;
                        
                    case "m"://Mostrar vivienda
                        System.out.println("¿De qué espacio de vivienda quieres ver la información?"
                                + "\n1." + (vivhu001.dimeReferencia())
                                + "\n2." + (vivhu002.dimeReferencia())
                                + "\n3." + (vivhu003.dimeReferencia())
                                + "\n4." + (vivhu004.dimeReferencia()));
                    
                        try{
                            //Pido al usuario que hueco de guardado quiere visualizar
                            numVivienda=teclado.nextByte();
                            
                            switch(numVivienda){//En función de la selección muestro la información
                                case 1:
                                    vivhu001.descripcion();
                                    System.out.println("\n\n\n");
                                    vivhu001.caracteristicas();
                                    break;
                                case 2:
                                    vivhu002.descripcion();
                                    System.out.println("\n\n\n");
                                    vivhu002.caracteristicas();
                                    break;
                                case 3:
                                    vivhu003.descripcion();
                                    System.out.println("\n\n\n");
                                    vivhu003.caracteristicas();
                                    break;
                                case 4:
                                    vivhu004.descripcion();
                                    System.out.println("\n\n\n");
                                    vivhu004.caracteristicas();
                                    break;
                                default:
                                    System.out.println("Se ha introducido el número de un espacio de vivienda inexistente");
                            }
                        }catch(java.util.InputMismatchException Ex1){//Capturo el error producido al introducir datos que no soporta una variable
                            System.err.println("Error: el formato de un valor no es válido");
                        }catch(java.lang.NumberFormatException Ex2){//Capturo el error producido si un número se va fuera del rango de la variable
                            System.err.println("Error: un valor númerico no está dentro del rango designado");
                        }
                        break;
                        
                    case "e"://Eliminar dato de una vivienda
                        
                        System.out.println("¿De qué espacio de vivienda quieres borrar información?"
                                + "\n1." + (vivhu001.dimeReferencia())
                                + "\n2." + (vivhu002.dimeReferencia())
                                + "\n3." + (vivhu003.dimeReferencia())
                                + "\n4." + (vivhu004.dimeReferencia()));
                        
                        try{//Controlo los errores al introducir los próximos datos
                            //Pido al usuario que hueco de guardado quiere utilizar
                            teclado.nextByte();
                            numVivienda=teclado.nextByte();
                            
                            System.out.println("¿Qué dato quieres borrar?\n"
                                    + "1. Referencia\n"
                                    + "2. Población\n"
                                    + "3. Dirección\n"
                                    + "4. Fotos de la dirección\n"
                                    + "5. Superficie\n"
                                    + "6. Plantas\n"
                                    + "7. Habitaciones\n"
                                    + "8. Baños\n"
                                    + "9. Precio");
                            //Pido al usuario qué dato quiere borrar 
                            campoElegido=teclado.nextByte();
                            
                            switch(numVivienda){//Voy a la vivienda elegida
                                case 1:
                                    switch(campoElegido){//Borro el dato indicado
                                        case 1:
                                            vivhu001.estableceReferencia(null);
                                            break;
                                        case 2:
                                            vivhu001.establecePoblacion(null);
                                            break;
                                        case 3:
                                            vivhu001.estableceDireccion(null);
                                            break;
                                        case 4:
                                            vivhu001.estableceFotosDireccion(null);
                                            break;
                                        case 5:
                                            vivhu001.estableceSuperficie(0);
                                            break;
                                        case 6:
                                            vivhu001.establecePlantas((byte)0);
                                            break;
                                        case 7:
                                            vivhu001.estableceHabitaciones((short)0);
                                            break;
                                        case 8:
                                            vivhu001.estableceBanos((byte)0);
                                            break;
                                        case 9:
                                            vivhu001.establecePrecio(0);
                                            break;     
                                    }
                                    break;
                                case 2:
                                    switch(campoElegido){//Borro el dato indicado
                                        case 1:
                                            vivhu002.estableceReferencia(null);
                                            break;
                                        case 2:
                                            vivhu002.establecePoblacion(null);
                                            break;
                                        case 3:
                                            vivhu002.estableceDireccion(null);
                                            break;
                                        case 4:
                                            vivhu002.estableceFotosDireccion(null);
                                            break;
                                        case 5:
                                            vivhu002.estableceSuperficie(0);
                                            break;
                                        case 6:
                                            vivhu002.establecePlantas((byte)0);
                                            break;
                                        case 7:
                                            vivhu002.estableceHabitaciones((short)0);
                                            break;
                                        case 8:
                                            vivhu002.estableceBanos((byte)0);
                                            break;
                                        case 9:
                                            vivhu002.establecePrecio(0);
                                            break;     
                                    }
                                    break;
                                case 3:
                                    switch(campoElegido){//Borro el dato indicado
                                        case 1:
                                            vivhu003.estableceReferencia(null);
                                            break;
                                        case 2:
                                            vivhu003.establecePoblacion(null);
                                            break;
                                        case 3:
                                            vivhu003.estableceDireccion(null);
                                            break;
                                        case 4:
                                            vivhu003.estableceFotosDireccion(null);
                                            break;
                                        case 5:
                                            vivhu003.estableceSuperficie(0);
                                            break;
                                        case 6:
                                            vivhu003.establecePlantas((byte)0);
                                            break;
                                        case 7:
                                            vivhu003.estableceHabitaciones((short)0);
                                            break;
                                        case 8:
                                            vivhu003.estableceBanos((byte)0);
                                            break;
                                        case 9:
                                            vivhu003.establecePrecio(0);
                                            break;     
                                    }
                                    break;
                                case 4:
                                    switch(campoElegido){//Borro el dato indicado
                                        case 1:
                                            vivhu004.estableceReferencia(null);
                                            break;
                                        case 2:
                                            vivhu004.establecePoblacion(null);
                                            break;
                                        case 3:
                                            vivhu004.estableceDireccion(null);
                                            break;
                                        case 4:
                                            vivhu004.estableceFotosDireccion(null);
                                            break;
                                        case 5:
                                            vivhu004.estableceSuperficie(0);
                                            break;
                                        case 6:
                                            vivhu004.establecePlantas((byte)0);
                                            break;
                                        case 7:
                                            vivhu004.estableceHabitaciones((short)0);
                                            break;
                                        case 8:
                                            vivhu004.estableceBanos((byte)0);
                                            break;
                                        case 9:
                                            vivhu004.establecePrecio(0);
                                            break;     
                                    }
                                    break;
                                default:
                                    System.out.println("Se ha introducido el número de un espacio de vivienda inexistente");
                            }
                        }catch(java.util.InputMismatchException Ex1){//Capturo el error producido al introducir datos que no soporta una variable
                            System.err.println("Error: el formato de un valor no es válido");
                        }catch(java.lang.NumberFormatException Ex2){//Capturo el error producido si un número se va fuera del rango de la variable
                            System.err.println("Error: un valor númerico no está dentro del rango designado");
                        }
                        break;
                        
                    case "s"://Salir del programa
                        System.out.println("Hasta la próxima");
                        encendido=0;//Termino el ciclo que ejecuta todo el programa
                        break;
                    default:
                        System.out.println("La selección introducida no está contemplada");
                }
                
            }catch(java.util.InputMismatchException Ex1){//Capturo el error producido al introducir datos que no soporta una variable
                System.err.println("Error: el formato del valor introducido no es válido");
            }catch(Exception Ex3){//Error genérico que emitirá en caso de no haberlo contemplado antes
                System.out.println("Se ha producido un error");
            }
            
            teclado.nextLine();//Limpio el buffer para un nuevo posible ciclo
        }
    }
    
}
