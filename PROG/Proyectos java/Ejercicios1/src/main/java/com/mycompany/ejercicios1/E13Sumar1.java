/*
Realiza un programa que asigne una variable del tipo byte al valor 127
A continuacion sumale uno con el operador ++ y muestra el valor de la variable
Haz lo mismo con una de tipo short a la que le asignes el valor 32767
 */
package com.mycompany.ejercicios1;

/**
 *
 * @author Alumno
 */
public class E13Sumar1 {

    public static void main(String[] args) {
        byte NUMERO_1 = 127;
        short NUMERO_2 =32767;
        
        NUMERO_1= ++NUMERO_1;
        NUMERO_2= ++NUMERO_2;
        
        System.out.println("Este es el primer número: " + NUMERO_1);
        System.out.println("Este es el segundo número: " + NUMERO_2);
        
    }
    
}
