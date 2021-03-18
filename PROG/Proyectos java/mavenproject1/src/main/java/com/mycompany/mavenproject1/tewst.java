/*
Programa que carga una matriz (array de 2 dimensiones) de 5 filas y 10 columnas 
con númerosenteros generados aleatoriamente. 
Mostrar la matriz generada por pantalla, el valor mayor y elmenor y la posición que ocupan en la matriz.

Con la matriz del problema anterior. Realizar una función que cálcule la 
matriz transpuesta y lacopie en otra matriz de igual dimensión. 

La función tendrá la siguiente cabecera:int [][] traspuesta(int [][]matriz, int nFilas, int nCols);

Nota: la matriz transpuesta es aquella en la que cambiamos filas por columnas, por tanto cambiala dimensión.
 */
package com.mycompany.mavenproject1;


public class tewst {
    
    
    public static void main(String[] args) {
        
        byte[][] matriz=new byte[5][10];
        byte[][] traspuesta;
        
        aleatorizar(matriz);
        muestraMatriz(matriz);
        System.out.println("\n\n\n");
        traspuesta=hacerTraspuesta(matriz,matriz[0].length,matriz.length);
        muestraMatriz(traspuesta);
        
    }
    
    static void aleatorizar(byte [][] array){
        for(byte i=0;i<array.length;i++){
            for(byte j=0;j<array[i].length;j++){
                array[i][j]=(byte) (Math.random()*100) ;
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

    static byte[][] hacerTraspuesta(byte [][]array, int nFilas, int nCols){
        byte [][]traspuesta=new byte[nFilas][nCols];
        
        for(byte i=0;i<array.length;i++){
            for(byte j=0;j<array[i].length;j++){
                traspuesta [j][i] = array [i][j];
            }
        }
        return traspuesta;
            
    }
    
}


