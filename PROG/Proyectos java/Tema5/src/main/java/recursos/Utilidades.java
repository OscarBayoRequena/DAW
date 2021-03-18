/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
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
    
    public static float pideFloat(){
        Scanner teclado=new Scanner(System.in);
        float decimal=0;
        boolean error=true;
        
        while(error){
            try{
                
                decimal=teclado.nextFloat();
                error=false;
                
            }catch(Exception ex1){
                System.err.println("Se ha producido un error. Inténtalo de nuevo");
                teclado.next();
            }
        }
        
        return decimal;
    }
}
