package com.mycompany.ejercicios1;
/*
 Programa que haga lo mismo que el algoritmo anterior pero con números reales
 */
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E06OperacionesConReales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero1, numero2, suma, resta, multiplic, division, resto;
        
        System.out.println("Introduce tu primer número");
        numero1 = teclado.nextInt();
        System.out.println("Introduce tu segundo número");
        numero2 = teclado.nextInt();
        
        suma= numero1 + numero2;
        resta= numero1 - numero2;
        multiplic= numero1 * numero2;
        division= numero1 / numero2;
        resto= numero1 % numero2;
        
        System.out.println("La suma de tus números es:" + suma);
        System.out.println("La resta de tus números es:" + resta);
        System.out.println("La multiplicación de tus números es:" + multiplic);
        System.out.println("La división de tus números es:" + division);
        System.out.println("El resto de la división de tus números es:" + resto);
        // TODO code application logic here
    }
    
}
