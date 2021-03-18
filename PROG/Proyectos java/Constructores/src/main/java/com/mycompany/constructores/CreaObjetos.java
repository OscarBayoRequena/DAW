/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.constructores;
import java.util.Scanner;
public class CreaObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        String userAutor, userTitulo, userEditorial;
        Scanner teclado= new Scanner (System.in);
        Libro libro1=new Libro("Paco","El lobo del beti","Anaya",23);
        
        
        System.out.println(libro1.autor + libro1.titulo + libro1.editorial + libro1.numero);
    }
    
}
