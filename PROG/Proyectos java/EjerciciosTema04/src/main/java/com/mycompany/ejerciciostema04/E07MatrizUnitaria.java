/*
Programa que genera e imprime una matriz unitaria de orden N. Una matriz 
unitaria de orden Nes la que tiene N filas y N columnas con todos sus 
componentes a cero, excepto las de ladiagonal principal, que están a 1. 
N será un valor pedido por teclado.
 */
package com.mycompany.ejerciciostema04;
import java.util.Scanner;

public class E07MatrizUnitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
        byte [][] matrizUnitaria;
        short n;
        
        System.out.println("Crear tu matriz unitaria");
        System.out.println("Introduce el tamaño de la matriz");
        n=teclado.nextShort();
        
        matrizUnitaria=new byte[n][n];
        
        matrizUnitaria(matrizUnitaria);
        muestraMatriz(matrizUnitaria);
    }
    
    static void matrizUnitaria(byte [][] array){
        for(byte i=0;i<array.length;i++){
            for(byte j=0;j<array[i].length;j++){
                if(j==i){
                array[i][j]=1;
                }else{
                    array[i][j]=0;
                }
                
            }
        }
    }
    
    static void muestraMatriz(byte [][] array){
        for(byte i=0;i<array.length;i++){
            for(byte j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
