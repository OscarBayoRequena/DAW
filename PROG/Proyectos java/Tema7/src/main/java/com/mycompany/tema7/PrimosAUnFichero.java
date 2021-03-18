package com.mycompany.tema7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PrimosAUnFichero {

    static ArrayList<Integer> primos = new ArrayList();

    public static void main(String[] args) {

        primos.add(2);

        for (int i = 1; i <= 500; i++) {

            if (esPrimo(i)) {

                primos.add(i);

            }

        }

        try {
            FileWriter archivo = new FileWriter("primos.txt", true);
            PrintWriter escritor = new PrintWriter(archivo);

            for (Integer primo : primos) {

                escritor.print(primo);
                escritor.print("\n");

                if (primos.size() - 1 == primos.indexOf(primo)) {
                    archivo.close();
                }

            }
            
        } catch (IOException ex) {
            System.err.println("Se ha producido un error al abrir el fichero");
        }

    }

    static boolean esPrimo(int numero) {
        boolean esPrimo;

        esPrimo = true;

        if (numero == 1) {
            esPrimo = false;
        } else {

            for (Integer primo : primos) {

                if (numero % primo == 0) {
                    esPrimo = false;
                }
            }
        }

        return esPrimo;
    }

}
