/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.constructores.personas;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Persona {

    public Scanner teclado2 = new Scanner(System.in);
    String apellidos, nombre;
    String sexo;
    int dni;
    short anioDeNacimiento;
    float altura, peso;

    Persona() {
    }

    Persona(int dni, String nombre, String apellidos, short anioDeNacimiento,
            String sexo, float peso, float altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioDeNacimiento = anioDeNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    void verDatosPersona() {
        System.out.println("Tus datos\n"
                + "\nDNI: " + dni
                + "\nNombre: " + nombre
                + "\nApellidos: " + apellidos
                + "\nAño de nacimiento: " + anioDeNacimiento
                + "\nSexo: " + sexo
                + "\nPeso: " + peso
                + "kg\nAltura: " + altura + "m");
    }

    void leeDatosPersona() {
        System.out.println("Introduce tu DNI");
        this.dni = teclado2.nextInt();
        teclado2.nextLine();
        System.out.println("Introduce tu nombre");
        this.nombre = teclado2.nextLine();
        System.out.println("Introduce tus apellidos");
        this.apellidos = teclado2.nextLine();
        System.out.println("Introduce tu año de nacimiento");
        this.anioDeNacimiento = teclado2.nextShort();
        teclado2.nextLine();
        System.out.println("Introduce tu sexo");
        this.sexo = teclado2.nextLine();
        System.out.println("Introduce tu peso");
        this.peso = teclado2.nextFloat();
        System.out.println("Introduce tu altura");
        this.altura = teclado2.nextFloat();

    }
}
