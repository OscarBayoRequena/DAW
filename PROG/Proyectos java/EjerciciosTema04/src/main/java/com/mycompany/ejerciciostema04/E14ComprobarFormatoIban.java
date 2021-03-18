/*
 * Diseña una aplicación que nos pida por teclado un numero de cuenta 
bancaria en formato IBANy que sea capaz de determinar si es un numero válido 
para cuentas bancarias o no.
 */
package com.mycompany.ejerciciostema04;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class E14ComprobarFormatoIban {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        Pattern patron=Pattern.compile("[A-Z]{2}+[0-9]{20}");
        
        String codigoIban;
        
        System.out.println("Introduce tu código IBAN");
        codigoIban=teclado.nextLine();
        
        Matcher coincidente=patron.matcher(codigoIban);
        
        if(coincidente.matches()){
            System.out.println("Tu código IBAN es correcto");
        }else{
            System.out.println("Tu código IBAN no es correcto");
        }
        
    }
    
}
