package com.mycompany.ejercicios1;
/*
Programa que lea el nombre del usuario que lo está utilizando 
y a continuación de muestre dicho nombre.
 */
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E04LeerYEscribirNombre {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        
        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Este tu nombre:" + nombre);
        
        // TODO code application logic here
    }
    
}
