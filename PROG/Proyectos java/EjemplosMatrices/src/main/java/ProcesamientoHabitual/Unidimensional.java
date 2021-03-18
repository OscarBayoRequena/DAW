
package ProcesamientoHabitual;

import java.util.Scanner;

/**
 *
 * @author d1
 */
public class Unidimensional {

    static int[] matrizAtributo = new int[4];
    static int[] matrizAtributo1 = {5, 2, 6, 9};

    public static void main(String[] args) {

     //   int[] matrizNull = new int[4];             // se inicializan a 0
     //   char[] matrizChar = new char[4];           // se inicializan a '\u0000'
     //   boolean[] matrizBoleana = new boolean[4];  // se inicializan a false

        int[] matrizVariable = new int[6];

      //  imprimirMatriz(matrizNull);
      //   inicializaDesdeTeclado();
      //   inicializaDesdeTecladoXParametros(matrizVariable);
      buscaMayor();
      //  sumaElementos();
    }

    static void inicializaDesdeTeclado() {

        Scanner input = new java.util.Scanner(System.in);

        System.out.println("Introduce " + matrizAtributo.length + " valores: ");

        for (int i = 0; i < matrizAtributo.length; i++) {
            matrizAtributo[i] = input.nextInt();
        }
        for (int i = 0; i < matrizAtributo.length; i++) {
            System.out.printf("el valor de i[%d] es %d \n",i,matrizAtributo[i]);
        }
        
        
    }

    static void inicializaDesdeTecladoXParametros(int[] matriz) {

        Scanner input = new java.util.Scanner(System.in);

        System.out.println("Introduce " + matriz.length + " valores: ");

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = input.nextInt();
        }
        
        imprimirMatriz(matriz);

    }

    
    static void imprimirMatriz(int[] miMatriz) {

        for (byte i = 0; i < miMatriz.length; i++) {
             System.out.printf("el valor de i[%d] es %d \n",i,miMatriz[i]);
        }
        

    }

    static void sumaElementos() {

        int total = 0;
        for (byte i = 0; i < matrizAtributo1.length; i++) {
            total += matrizAtributo1[i];
            
        }
        System.out.println("La suma total es "+ total);
        imprimirMatriz(matrizAtributo1);
    }

    static void buscaMayor() {

        int mayor = matrizAtributo1[0];

        for (int i = 1; i < matrizAtributo1.length; i++) {
            if (matrizAtributo1[i] > mayor) {
                mayor = matrizAtributo1[i];
            }
        }
        System.out.println("El elemento mayor es " + mayor);
    }

    static void mezclarAleatoriamente() {

        for (int i = 0; i < matrizAtributo.length; i++) {
            int j = (int) (Math.random() * matrizAtributo.length);    // genero un indice al azar

            int temp = matrizAtributo[i];                       //intercambio valores
            matrizAtributo[i] = matrizAtributo[j];
            matrizAtributo[j] = temp;
        }
    }

    static void desplazarElementos() {

        int temp = matrizAtributo1[0];            // Retener el primer elemento
        
        // Desplazar elementos restantes
        for (int i = 1; i < matrizAtributo1.length; i++) {
            matrizAtributo1[i - 1] = matrizAtributo1[i];
        }
        // Mover el primer elemento para rellenar la última posición
        matrizAtributo1[matrizAtributo1.length - 1] = temp;
    }

}// fin de la clase
