/*
Realiza un programa que muestre las siguientes secuencias de escape:
\b
\t
\n
\f
\r
 */
package com.mycompany.ejercicios1;
/**
 *
 * @author Alumno
 */
public class E08SecuenciasDeEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Hola\b\n"
                + "Vaya... borré una letra sin querer, lo intento de nuevo");
        System.out.println("\nHo\rla\nOtra vez me equivoqué, está vez moví\n"
                + "el carro cuando no debía");
        System.out.println("Mejor empiezo de nuevo\f");
        System.out.println("\nH\to\tl\ta");
        System.out.println("¡¡¡No, otra vez no!!! ¡%@#$&!");
        // TODO code application logic here
        System.out.println("\nEn el primer caso utilicé \\b para borrar la \n"
                + "última letra de la palabra");
        System.out.println("En el segundo \\r para mover el carro de escritura");
        System.out.println("A continuación utilizo \\f para empezar en una\n"
                + "página nueva");
        System.out.println("Por último, utilicé \\t para tabular entre letras.\n"
                + "Además durante la escritura de este programa usé \\n para\n"
                + "para hacer los saltos de línea necesarios");
    }
    
}
