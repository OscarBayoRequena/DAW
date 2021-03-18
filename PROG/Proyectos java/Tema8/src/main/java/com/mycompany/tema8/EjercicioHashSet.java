/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import recursos.Utilidades;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EjercicioHashSet { 
    
    
    public static void main(String[] args) {

        HashSet<String> listado1 = new HashSet<String>();
        HashSet<String> listado2 = new HashSet<String>();
        
        leeYMuestraLista(listado1);

        borrarElemento(listado1);
        borrarElemento(listado1);
        
        //leeYMuestraDosListasSinRepetidos(listado1,listado2);
        for(String nombre : listado1){
            System.out.println(nombre);
        }
        
    }

    static void leeYMuestraLista(HashSet<String> lista) {

        String nuevaLinea;
        boolean continuar;
        
        Iterator<String> miIterador;
        

        continuar = true;
        while (continuar) {
            
            System.out.println("Introduce un nombre o pon \"Fin\" para terminar de enumerar");
            nuevaLinea = Utilidades.pideString();

            if (nuevaLinea.equalsIgnoreCase("fin")) {
                continuar=false;
            }else{
                lista.add(nuevaLinea);
            }
        }
        
        Utilidades.limpiaPantalla();
        
        /*
        for(String nombre : lista){
            System.out.println(nombre);
        }*/
        
        miIterador=lista.iterator();
        while(miIterador.hasNext()){
            
            System.out.println(miIterador.next());
            
        }
    }

    
    static void leeYMuestraDosListas(HashSet<String> lista1,HashSet<String> lista2){
    
        leeYMuestraLista(lista1);
        leeYMuestraLista(lista2);

    }
    
    //Apartado b y c
    static void leeYMuestraDosListasSinRepetidos(HashSet<String> lista1,HashSet<String> lista2){
        
        TreeSet<String> listadoUnico= new TreeSet<String>();
        
        leeYMuestraLista(lista1);
        leeYMuestraLista(lista2);
        
        listadoUnico.addAll(lista1);
        listadoUnico.addAll(lista2);
        System.out.println("");
        System.out.println("");
        for(String nombre : listadoUnico){
            System.out.println(nombre);
        }
        
        
    }
    
    static void borrarElemento(HashSet<String> lista){
    
        String elementoABorrar;
        boolean encontrado;
        Iterator<String> it=lista.iterator();
        
        System.out.println("Introduce que elemento quieres buscar para borrarlo");
        elementoABorrar=Utilidades.pideString();
        
        encontrado=false;
        while(it.hasNext()){
            
            if(it.next().equalsIgnoreCase(elementoABorrar)){
                it.remove();
                encontrado=true;
            }
            
        }
        
        if(!encontrado){
            System.out.println("No se ha encontrado el nombre especificado");
        }
        
    }

}
