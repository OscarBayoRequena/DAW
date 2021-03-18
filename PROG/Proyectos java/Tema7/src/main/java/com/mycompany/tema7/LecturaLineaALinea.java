/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LecturaLineaALinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena;
        
        try{
            
            BufferedReader input = new BufferedReader(new FileReader("msvcr100.dll"));
            
            cadena=input.readLine();
            while(cadena!=null){
            
                System.out.println(cadena);
                cadena=input.readLine();
            }
            
        }catch(IOException ex){
        
            System.out.println("Se ha producido un error al intentar acceder al archivo");
            
        }
        
    }
    
}
