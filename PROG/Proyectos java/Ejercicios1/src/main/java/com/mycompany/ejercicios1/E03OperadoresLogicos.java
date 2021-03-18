/*
Realizar un programa que muestre la tabla de verdad de los operadores lógicos 
y (&&), o (||), no (!). Para ellos se utilizarán tipos de datos bool.
 */
package com.mycompany.ejercicios1;
/**
 *
 * @author Alumno
 */
public class E03OperadoresLogicos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean falso=false;
        boolean verdadero=true;
 
        System.out.println("Tabla de &&\n"
                + "OP1\tOP2\tRESULTADO\n"
                + "FALSE\tFALSE\t" + (falso && falso));
        System.out.println("TRUE\tFALSE\t" + (verdadero && falso));
        System.out.println("FALSE\tTRUE\t" + (falso && verdadero));
        System.out.println("TRUE\tTRUE\t" + (verdadero && verdadero));
        
        System.out.println("\nTabla de ||\n"
                + "OP1\tOP2\tRESULTADO\n"
                + "FALSE\tFALSE\t" + (falso || falso));
        System.out.println("TRUE\tFALSE\t" + (verdadero || falso));
        System.out.println("FALSE\tTRUE\t" + (falso || verdadero));
        System.out.println("TRUE\tTRUE\t" + (verdadero || verdadero));
        
        System.out.println("\nTabla de !\n"
                + "OP\tRESULTADO\n"
                + "FALSE\t" + (!falso));
        System.out.println("TRUE\t" + (!verdadero));
        // TODO code application logic here
    }
    
}
