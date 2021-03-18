/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import java.util.Scanner;


public class Utilidades {
    
    
    
    public static int pideInt(){
        Scanner teclado=new Scanner(System.in);
        int integer=0;
        boolean error=true;
        
        while(error){
            try{
                
                integer=teclado.nextInt();
                error=false;
                
            }catch(Exception ex1){
                System.err.println("Se ha producido un error. Inténtalo de nuevo");
                teclado.next();
            }
        }
        
        return integer;
    }
    
    public static short pideShort(){
        Scanner teclado=new Scanner(System.in);
        short numero=0;
        boolean error=true;
        
        while(error){
            try{
                
                numero=teclado.nextShort();
                error=false;
                
            }catch(Exception ex1){
                System.err.println("Se ha producido un error. Inténtalo de nuevo");
                teclado.next();
            }
        }
        
        return numero;
    }
    
    public static String pideString(){
        Scanner teclado=new Scanner(System.in);
        String text="";
        boolean error=true;
        
        while(error){
            try{
                
                text=teclado.nextLine();
                error=false;
                
            }catch(Exception ex1){
                System.err.println("Se ha producido un error. Inténtalo de nuevo");
                teclado.next();
            }
        }
        
        return text;
    }
    
    public static double pideDouble(){
        Scanner teclado=new Scanner(System.in);
        double decimal=0;
        boolean error=true;
        
        while(error){
            try{
                
                decimal=teclado.nextDouble();
                error=false;
                
            }catch(Exception ex1){
                System.err.println("Se ha producido un error. Inténtalo de nuevo");
                teclado.next();
            }
        }
        
        return decimal;
    }
    
    public static void textoEnRojo(String texto) {
        
        //\033[31m
        String A_ROJO="\u001B[31m";
        //String A_ROJO = "\033[31m";

        System.out.println(A_ROJO + texto);

    }


    public static void pausaPrograma(float tiempo) {

        float pausado = tiempo * 1000;
        boolean error = true;

        //while (error) {
            try {
                Thread.sleep((long) pausado);
                error=false;
                
            } catch (java.lang.InterruptedException Ex2) {
                System.err.println("Se ha producido un error al pausar el programa");
            }
        //}
    }

    public static void limpiaPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
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
