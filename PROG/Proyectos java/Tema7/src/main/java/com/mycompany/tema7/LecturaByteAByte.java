/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema7;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LecturaByteAByte {

    public static void main(String[] args) {

        boolean confirmacion;
        DataInputStream input;
        
        input=null;
        confirmacion = false;

        try {
            input = new DataInputStream(new BufferedInputStream(new FileInputStream("msvcr100.dll")));
            confirmacion = true;
            
        } catch (IOException ex1) {
            System.out.println("Se ha producido un problema al acceder al fichero");
        }

        if (confirmacion) {
            
            try {
                while (input.available() != 0) {
                    
                    System.out.print((char)input.readByte());
                    
                    
                }
                
                input.close();
            } catch (IOException ex) {
                System.out.println("Se ha producido un problema al acceder al fichero");
            }
            
        }

    }

}
