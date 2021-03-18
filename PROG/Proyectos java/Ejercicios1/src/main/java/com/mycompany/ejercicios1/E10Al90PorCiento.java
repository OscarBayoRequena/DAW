/*
Realiza un programa que lea un importe (entero) por teclado y calcule y 
visualice el importe con un 10% de descuento utilizando la expresión: 
importeConDesc = Importe * 0.9
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E10Al90PorCiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int importe;
        double importeConDesc;
        
        System.out.println("Introduce tu precio:");
        importe= teclado.nextInt();
        importeConDesc = importe*0.9;
        
        System.out.println("Tu precio con el descuento aplicado asciende a:\n" + importeConDesc);
        
        // TODO code application logic here
    }
    
}
