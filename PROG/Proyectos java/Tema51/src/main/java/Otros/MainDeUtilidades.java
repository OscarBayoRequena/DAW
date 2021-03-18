/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otros;

import java.util.Scanner;
import recursos.Utilidades;


public class MainDeUtilidades {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        
        System.out.println("Introduce un número");
        
        valor=Utilidades.pideInt();
        
        System.out.println("Tu número es: "+valor);
    }
    
    
}
