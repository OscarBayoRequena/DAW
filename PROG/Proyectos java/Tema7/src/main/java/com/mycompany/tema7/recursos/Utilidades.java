
package com.mycompany.tema7.recursos;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que contiene métodos útiles en múltiples situaciones
 * 
 * @author Óscar Bayo Requena
 * @version 1.0 10/02/2021
 */
public class Utilidades {
    
    //<editor-fold desc="Métodos para pedir datos" defaultstate="collapsed">
    
    /**
     *Pide un byte por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return numero Byte introducido por el usuario
     */
    public static byte pideByte(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        byte numero=0;
        boolean error=true;
        
        while(error){
            try{
                
                numero=teclado.nextByte();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return numero;
    } 
    
    /**
     *Pide un short por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return numero Short introducido por el usuario
     */
    public static short pideShort(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        short numero=0;
        boolean error=true;
        
        while(error){
            try{
                
                numero=teclado.nextShort();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return numero;
    }
    
    /**
     *Pide un int por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return numero Int introducido por el usuario
     */
    public static int pideInt(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        int numero=0;
        boolean error=true;
        
        while(error){
            try{
                
                numero=teclado.nextInt();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return numero;
    }
    
    /**
     *Pide un long por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return numero Long introducido por el usuario
     */
    public static long pideLong(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        long numero=0;
        boolean error=true;
        
        while(error){
            try{
                
                numero=teclado.nextLong();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return numero;
    }
    
    /**
     *Pide un caracter por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return numero Char introducido por el usuario
     */
     public static char pideChar(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        char letra='F';
        boolean error=true;
        
        while(error){
            try{
                
                letra=teclado.nextLine().charAt(0);
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return letra;
    }
    
     /**
     *Pide un conjunto de caracteres por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return text String introducido por el usuario
     */
    public static String pideString(String mensajeError){


        Scanner teclado=new Scanner(System.in);
        String text="";
        boolean error=true;
        
        while(error){
            try{
                
                text=teclado.nextLine();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return text;
    }
    
    /**
     *Pide un decimal por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return decimal Double introducido por el usuario
     */
    public static double pideDouble(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        double decimal=0;
        boolean error=true;
        
        while(error){
            try{
                
                decimal=teclado.nextDouble();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return decimal;
    }
    
    /**
     *Pide un decimal por teclado y cuida que no se produzcan errores al introducir los datos 
     * 
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     * @return decimal Float introducido por el usuario
     */
    public static float pideFloat(String mensajeError){
        Scanner teclado=new Scanner(System.in);
        float decimal=0;
        boolean error=true;
        
        while(error){
            try{
                
                decimal=teclado.nextFloat();
                error=false;
                
            }catch(Exception ex1){
                System.err.println(mensajeError);
                teclado.next();
            }
        }
        
        return decimal;
    }
    
    //</editor-fold>
    
    /**
     * Método al que se le pasa una pregunta de si o no que el usuario respoderá y se devolverá su respuesta
     * 
     * @param pregunta Línea de texto con la pregunta que se desea hacer
     * @param mensajeError Mensaje que el programa soltará si se responde con otra cosa
     * que no se si o no, o un valor que cause un error del programa
     * @return salida Boolean de salida en función de la respuesta del usuario fue positiva o negativa
     */
    public static boolean preguntaSiONo (String pregunta,String mensajeError){
        
        boolean confirmacion=false;
        String respuesta;
        boolean salida=true;
        
        while (!confirmacion) {
                        System.out.println(pregunta);
                        respuesta = Utilidades.pideString(mensajeError);
                        respuesta = respuesta.toLowerCase();

                        switch (respuesta) {
                            case "si":
                                salida =true;
                                confirmacion = true;
                                break;
                            case "no":
                                salida=false;
                                confirmacion = true;
                                break;
                            default:
                                System.out.println(mensajeError);
                                break;
                        }
        }
        
        return salida;
    }

    /**
     * Método para realizar pausas de tiempo en la línea normal del programa
     * 
     * @param tiempo Decimal que indica en segundos cuánto tiempo ha de parar el programa
     * @param mensajeError Mensaje que el programa soltará si se responde con 
     * un valor que cause un error del programa
     */
    public static void pausaPrograma(float tiempo,String mensajeError) {

        float pausado = tiempo * 1000;
        boolean error = true;

        //while (error) {
            try {
                Thread.sleep((long) pausado);
                error=false;
                
            } catch (java.lang.InterruptedException Ex2) {
                System.err.println(mensajeError);
            }
        //}
    }
    
    /**
     * Método para limpiar todo el contenido de la pantalla
     */
    public static void limpiaPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
    }

    /**
     * Método que comprueba si una cadena de carácteres cumple con el formato de un DNI
     * 
     * @param dni String Texto a evaluar si es un DNI válido o no 
     * @return Boolean que indica si el texto pasado cumple con el formato de DNI
     */
    public static boolean esValidoDni(String dni){
        
        char [] letras= {'T','R','A','W','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        boolean resultado;
        char letraDni;
        long numeroDni;
        int resto;
        
        Pattern patron=Pattern.compile("[0-9]{8}+[TRAWGMYFPDXBNJZSQVHLCKEtrawgmyfpdxbnjzsqvhlcke]");
        
        Matcher coincidencia=patron.matcher(dni);

        if(coincidencia.matches()){

            numeroDni=Long.parseLong(dni.substring(0,8));
            resto=(int) (numeroDni%23);
            
            
            resultado = Character.toUpperCase(dni.charAt(8))==letras[resto];
  
        }else{
            resultado=false;
        }
        
        return resultado;
    }
    
    /**
     * Método que comprueba si una cadena de carácteres cumple con el formato de un teléfono
     * 
     * @param telefono String Texto a evaluar si es un teléfono válido o no 
     * @return Boolean que indica si el texto pasado cumple con el formato de teléfono
     */
    public static boolean esValidoTelefono(String telefono){
        
        Pattern patron=Pattern.compile("[0-9]{9}");
        
        Matcher coincidencia=patron.matcher(telefono);

        return coincidencia.matches();
    }
    
    /*
       <build>
            <pluginManagement>
                <plugins>
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-jar-plugin</artifactId>
                        <configuration>
                            <archive>
                                <manifest>
                                   <mainClass>
                                        com.domingo.ejemplost3.EntradaTeclado
                                    </mainClass>
                                </manifest>
                            </archive>
                        </configuration>
                    </plugin>

                </plugins>
            </pluginManagement>
        </build>
     */
}
