/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema7;

import com.mycompany.tema7.recursos.Utilidades;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EscribirEnFicherosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fichero;
        
        System.out.println("Introduce el nombre y tipo del fichero de texto. Debe existir previamente.");
        fichero=Utilidades.pideString("Se ha producido un error inténtalo de nuevo");
        
        try{
        
            leeFichero(fichero);
            
            escribeFichero(fichero,Utilidades.pideString("Se ha producido un error inténtalo de nuevo"));
            
            leeFichero(fichero);
            
        }catch(IOException ex){
        
        }
        
        
    }
    
    static String leeFichero(String ficheroObjetivo) throws IOException{
    
        String cadena;
        String nuevaLinea;
        BufferedReader buffer= new BufferedReader(new FileReader(ficheroObjetivo));
        
        cadena="";
        nuevaLinea=buffer.readLine();
        while(nuevaLinea!=null){
            cadena=cadena+nuevaLinea;
            nuevaLinea=buffer.readLine();
        }
        
        return cadena;
    }
    
    static void escribeFichero(String ficheroObjetivo, String mensaje) throws IOException{
    
        FileWriter archivo= new FileWriter(ficheroObjetivo, true);
        
        PrintWriter escritor= new PrintWriter(archivo);
        
        escritor.println(mensaje);
    
        archivo.close();
        
    }
    
}
