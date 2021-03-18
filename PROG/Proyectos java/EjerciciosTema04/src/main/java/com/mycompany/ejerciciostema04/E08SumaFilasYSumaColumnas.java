/*
 * Dada una matriz Z, introducida por teclado almacenar en un vector A 
   la suma por sus columnasy en un vector B la suma por sus filas.
 */
package com.mycompany.ejerciciostema04;
import java.util.Scanner;

public class E08SumaFilasYSumaColumnas {

    public static void main(String[] args) {

        
        Scanner teclado=new Scanner(System.in);
        
        short [] vectorA;
        short [] vectorB;
        short [][] matriz;
        byte x,y;
        
        System.out.println("Introduce el tamaño de la matriz");
        System.out.println("Introduce el número de columnas");
        x=teclado.nextByte();
        System.out.println("Introduce el número de filas");
        y=teclado.nextByte();
        
        vectorA=new short[x];
        vectorB=new short[y];
        matriz= new short [y][x];
        
        System.out.println("Rellena tu matriz");
        for(byte i=0;i<matriz.length;i++){
            System.out.println("Fila " + (i+1));
            for(byte j=0;j<matriz[0].length;j++){
                System.out.println("Columna "+ (j+1));
                matriz[i][j]=teclado.nextShort();
            }
        }
        System.out.println("Esta es tu matriz");
        muestraMatriz(matriz);
        System.out.println("");
        
        System.out.println("Este es el vector resultante de la suma de las filas:");
        vectorB=creaVectorB(matriz);
        muestraVector(vectorB);
        
        System.out.println("\n\nEste es el vector resultante de la suma de las columnas:");
        vectorA=creaVectorA(matriz);
        muestraVector(vectorA);
        
    }
    static void muestraMatriz(short [][] array){
        for(byte i=0;i<array.length;i++){
            for(byte j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    static short[] creaVectorA(short[][] matriz){
        short[] vectorA=new short[matriz[0].length];
            
        for(byte i=0;i<matriz[0].length;i++){
            
            for(byte j=0;j<matriz.length;j++){
                
                vectorA[i]= (short) (vectorA[i]+ matriz[j][i]);
                
            }
        } 
        
        return vectorA;
    }
    
    static short[] creaVectorB(short[][] matriz){
        short[] vectorB=new short[matriz.length];
        
        for(byte i=0;i<matriz.length;i++){
            
            for(byte j=0;j<matriz[0].length;j++){
                
                vectorB[i]= (short) (vectorB[i]+ matriz[i][j]);
                
            }
        }        
        return vectorB;
    }
    
    static void muestraVector(short [] vector){
        for(byte i=0;i<vector.length;i++){
            System.out.print(vector[i]+"\t");
        }
    }
}
