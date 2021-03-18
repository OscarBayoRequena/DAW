/*
En el programa anterior que pasa si ponemos la expresión:
importeConDesc = Importe * (90f / 100)
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E12Al90PorCiento3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int importe;
        double importeConDesc;
        
        System.out.println("Introduce tu precio:");
        importe= teclado.nextInt();
        importeConDesc = importe * (90f/100);
        
        System.out.println("Tu precio con el descuento aplicado asciende a:\n"
                + importeConDesc);
        /*
        Ahora el programa si que funciona porque uno de los dos valores al 
        menos es un valor decimal, que esto lo logramos añadiendo esa f detrás
        del 90 para indicar que es ese tipo de dato.
        Por último, al ahora tener otro valor que es decimal vuelve a suceder 
        lo mismo con el número introducido y este número que ahora si es un valor 
        decimal y nos lo vuelve a convertir de nuevo automáticamente a un decimal
        que será el que se muestre en pantalla
        */
        
        // TODO code application logic here
    }
    
}
