package com.mycompany.ejercicios1;
/*
Realizar un programa que lea dos números enteros por pantalla y muestre el 
resultado de las siguientes operaciones relacionales con los dos números:
Igual
Distinto
Menor
Mayor
Menor o igual
Mayor o igual
 */
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E07Relacionales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero1, numero2;
        boolean igual, distinto, mayor, menor, mayorOIgual, menorOIgual;
        
        System.out.println("Introduce tu primer número");
        numero1 = teclado.nextInt();
        System.out.println("Introduce tu segundo número");
        numero2 = teclado.nextInt();
        
        igual= numero1 == numero2;
        distinto= numero1 != numero2;
        mayor= numero1 > numero2;
        menor= numero1 < numero2;
        mayorOIgual= numero1 >= numero2;
        menorOIgual= numero1 <= numero2;
        
        System.out.println("¿Tus números son iguales?\n" + igual);
        System.out.println("¿Tus números son distintos?\n" + distinto);
        System.out.println("¿El primer número es mayor que el segundo?\n" + mayor);
        System.out.println("¿El primer número es menor que el segundo?\n" + menor);
        System.out.println("¿El primer número es mayor o igual que\n"
                + " el segundo?\n" + mayorOIgual);
        System.out.println("¿El primer número es menor o igual que\n"
                + " el segundo?\n" + menorOIgual);
        // TODO code application logic here
    }
    
}
