/*
Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. 
Se utilizarán los tramos de 6 a12, de 13 a 20 y de 21 a 5. respectivamente. 
Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 */
package com.mycompany.ejerciciostema2;
import java.util.Scanner;
public class E02BuenosDiasTardesNoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        short hora;
        
        System.out.println("Dime que hora es sin especificar minutos \n"
                + "y en formato de 24h\n");
        hora = teclado.nextShort();
        
        if((hora<=5 && hora>=0) || (hora>=21 && hora<24)){
            System.out.println("Buenas noches");
        } else{
            if(hora>=6 && hora<=11){
                System.out.println("Buenos días");
            } else{
                if(hora>=12 && hora<=20){
                    System.out.println("Buenas tardes");
                } else {
                    System.out.println("¿Qué hora es esa?");
                }
            }        
        }
    }  
}
