/*
Realiza un programa que lea un importe (entero) por teclado y calcule y visualice 
el importe con un 10% de descuento utilizando la expresión: 
importeConDesc = Importe * (90 / 100)
¿Se comporta igual que el anterior? ¿Por qué?
 */
package com.mycompany.ejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E11Al90PorCiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int importe;
        double importeConDesc;
        
        System.out.println("Introduce tu precio:");
        importe= teclado.nextInt();
        importeConDesc = importe * (90/100);
        /*
        Lo que sucede es que en la operación 90/100 ambos valores son números enteros
        por lo tanto al hacer la operaciñon lo guardará en un valor de tipo entero
        también lo almacena como entero pero es uno decimal por eso resulta en 0
        Después cuando ese valor va a multiplicar nuestro número pasa lo mismo además
        de que ahora uno de los valores es cero y resulta en un fallo
        */
        
        System.out.println("Tu precio con el descuento aplicado asciende a:\n"
                + importeConDesc);
        
        // TODO code application logic here
    }
    
}
