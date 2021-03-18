/*
Escribir un programa que lea las dimensiones de una matriz por teclado. 
Con estos datos seintroducirá el valor de los elementos de dicha matriz por 
teclado y se mostrará la matriz enpantalla. Igualmente calculará y mostrará 
el valor y la posición del elemento mayor y menor.
 */
package com.mycompany.ejerciciostema04;

import java.util.Scanner;

public class E09ValorMasAlto {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        short [][] matriz;
        byte x,y;
        
        System.out.println("Introduce el tamaño de la matriz");
        System.out.println("Introduce el número de columnas");
        x=teclado.nextByte();
        System.out.println("Introduce el número de filas");
        y=teclado.nextByte();
        
        matriz= new short [y][x];
        
        System.out.println("Rellena tu matriz");
        for(byte i=0;i<matriz.length;i++){
            System.out.println("Fila " + (i+1));
            for(byte j=0;j<matriz[0].length;j++){
                System.out.println("Columna "+ (j+1));
                matriz[i][j]=teclado.nextShort();
            }
        }
        
        muestraMatriz(matriz);
        System.out.println("");
        dimeMayor(matriz);
        System.out.println("");
        dimeMenor(matriz);
        
    }
    
        static void muestraMatriz(short [][] array){
            for(byte i=0;i<array.length;i++){
                for(byte j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+"\t");
                }
                System.out.println("");
            }
        }
        
        static void dimeMayor(short [][] array){
            
            short mayor=array[0][0];
            byte x=1;
            byte y=1;
            
            for(byte i=0;i<array.length;i++){
                for(byte j=0;j<array[i].length;j++){
                    if(mayor<array[i][j]){
                        mayor=array[i][j];
                        x=(byte)(j+1);
                        y=(byte)(i+1);
                    }
                }
                
            }
            System.out.println("El mayor es " + mayor
                    + " en la fila " + y
                    + " ,columna "+ x);
        }
        
        static void dimeMenor(short [][] array){
            
            short menor=array[0][0];
            byte x=1;
            byte y=1;
            
            for(byte i=0;i<array.length;i++){
                for(byte j=0;j<array[i].length;j++){
                    if(menor>array[i][j]){
                        menor=array[i][j];
                        x=(byte)(j+1);
                        y=(byte)(i+1);
                    }
                }
                
            }
            System.out.println("El menor es " + menor
                    + " en la fila " + y
                    + " ,columna "+ x);
        }
}
