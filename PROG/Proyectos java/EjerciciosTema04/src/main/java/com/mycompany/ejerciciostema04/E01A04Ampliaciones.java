/**
 * 1.Realizar un programa que lea 10 enteros por teclado. Una vez finalizada la entrada 
 * el programa mostrará los números en el mismo orden que se han introducido separados por comas.
 * 2.Ampliar el ejercicio anterior para que muestre además los números en orden 
 * contrario al que se han introducido.
 * 3.Ampliar el ejercicio anterior para que muestre además la media aritmética 
 * de los  números introducidos, el valor mayor y la posición en la que 
 * se introdujo, el valor menor y la posición enla que se introdujo.
 * 4.Ampliar el ejercicio anterior para que el usuario pueda escoger el número 
 * de elementos que desea introducir. El valor escogido estará en el rango de 2 a 1000.
 */
package com.mycompany.ejerciciostema04;
import java.util.Scanner;

public class E01A04Ampliaciones {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        
        //Esta declaracion forma parte de la ampliacion 4
        int[] numeros;
        
        //Declaración e inicializador pre-ampliación 4
        //int[] numeros=new int[10];
        
        int suma;
        int mayor;
        int menor;
        float media;
        short tamanio;
        byte confirmacion;
        
        suma=0;
        mayor=-2147483647;
        menor=2147483647;
        tamanio=0;
        confirmacion=1;
        
        
        //--------------------------------------------
        //            Ampliacion 4 (Comienzo)
        //--------------------------------------------
        //Seleccion del tamaño del array
        while(confirmacion==1){
            System.out.println("Indica cuántos valores vas a introducir. (2-1000)");
            tamanio=teclado.nextShort();
            if(tamanio>=2 && tamanio<=2000){
                System.out.println("Tamaño válido. Introduce los valores");
                confirmacion=0;
            }else{
                System.out.println("Ese valor no esta dentro del rango soportado");
            }
        }
        numeros= new int[tamanio];
        //--------------------------------------------
        //            Ampliacion 4 (Fin)
        //--------------------------------------------
        
        
        //Introduccion de los números
        System.out.println("Introduce tu primer número");
        for(int i=0;i<numeros.length ;i++){
            if(i>=1){
                System.out.println("Introduce tu próximo número");
            }
            numeros[i]=teclado.nextInt();
        }
        //Muestra los números en el orden de introducción
        System.out.print("\nEstos son tus números en el orden de introducción:");
        for(int j=0;j<numeros.length;j++){
            System.out.print(numeros[j]);
            if(j<numeros.length-1){
                System.out.print(",");
            }
        }
        
        //--------------------------------------------
        //                  Ampliacion 1
        //--------------------------------------------
        //Muestra los números en el orden inverso al que se introdujeron
        System.out.print("\nEstos son tus números en el orden inverso al que se introdujeron:");
        for(int k=(numeros.length)-1;k>=0;k--){
            System.out.print(numeros[k]);
            if(k>0){
                System.out.print(",");
            }
        }
        //--------------------------------------------
        //                  Ampliacion 2
        //--------------------------------------------
        //Media de los números establecidos
        System.out.print("\nLa media de los números introducidos es: ");
        for(int l=0;l<numeros.length;l++){
            suma= suma+ numeros[l];
        }
        media=suma/numeros.length;
        System.out.print(media);
        
        //Hallar el número más grande de los introducidos
        System.out.print("\nEl número más grande es: ");
        for(int m=0;m<numeros.length;m++){
            if(mayor<numeros[m]){
                mayor=numeros[m];
            }
        }
        System.out.print(mayor);
        
        //
        System.out.print("\nEl número más pequeño es: ");
        for(int n=0;n<numeros.length;n++){
            if(menor>numeros[n]){
                menor=numeros[n];
            }
        }
        System.out.print(menor);
    }
    
}
