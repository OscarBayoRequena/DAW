/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inmobiliaria;


public class Vivienda {
    
    String referencia, direccion, poblacion, fotosDireccion,
            garage,amueblado,disponible;
    int superficie,precio;
    byte banos,plantas;
    short habitaciones;
    
    Vivienda(){}
    
    Vivienda(String referencia, String poblacion,String direccion,String fotosDireccion,
            int superficie, byte plantas, short habitaciones, byte banos,String garage, String amueblado, String disponible, int precio){
        
        this.referencia=referencia;
        this.poblacion=poblacion;
        this.direccion=direccion;
        this.fotosDireccion=fotosDireccion;
        this.superficie=superficie;
        this.plantas=plantas;
        this.habitaciones=habitaciones;
        this.banos=banos;
        this.garage=garage;
        this.amueblado=amueblado;
        this.disponible=disponible;
        this.precio=precio;
        
    }
    
    /**
    * Método que sirve para establecer todos los datos de una vivienda
    * 
    * @param referencia String que contiene la referencia de la vivienda
    * @param poblacion String que contiene la población de la vivienda
    * @param direccion String que contiene la direccion de la vivienda
    * @param fotosDireccion String que contiene las fotos de la vivienda
    * @param superficie Int que contiene la superficie de la vivienda
    * @param plantas Byte que contiene el número de plantas de la vivienda
    * @param habitaciones Short que contiene el número de habitaciones de la vivienda
    * @param banos Byte que contiene el número de baños de la vivienda
    * @param precio Int que contiene el precio de la vivienda
    */
    void nuevaVivienda(String referencia, String poblacion,String direccion,String fotosDireccion,
            int superficie, byte plantas, short habitaciones, byte banos,boolean garage,
            boolean amueblado, boolean disponible, int precio){
        
        estableceReferencia(referencia);
        establecePoblacion(poblacion);
        estableceDireccion(direccion);
        estableceFotosDireccion(fotosDireccion);
        estableceSuperficie(superficie);
        establecePlantas(plantas);
        estableceHabitaciones(habitaciones);
        estableceBanos(banos);
        establecePrecio(precio);
    
    }
    
    /**
    * Método que sirve para establecer todos los datos de un objeto de tipo
    * vivienda.
    * @param referencia String que contiene la referencia de la vivienda
    */
    void estableceReferencia(String referencia){
        this.referencia=referencia;
    }
    String dimeReferencia(){
        return referencia;
    }
    
    /**
    * Método que sirve para establecer la dirección de un objeto de tipo
    * vivienda.
    * @param direccion String que contiene la direccion de la vivienda
    */
    void estableceDireccion(String direccion){
        this.direccion=direccion;
    }
    String dimeDireccion(){
        return direccion;
    }
    
    /**
    * Método que sirve para establecer la población de un objeto de tipo
    * vivienda.
    * @param poblacion String que contiene la población de la vivienda
    */
    void establecePoblacion(String poblacion){
        this.poblacion=poblacion;
    }
    String dimePoblacion(){
        return poblacion;
    }
    
    /**
    * Método que sirve para establecer la referencia de un objeto de tipo
    * vivienda.
    * @param fotosDireccion String que contiene las fotos de la vivienda
    */
    void estableceFotosDireccion(String fotosDireccion){
        this.fotosDireccion=fotosDireccion;
    }
    String dimeFotosDireccion(){
        return fotosDireccion;
    }
    
    /**
    * Método que sirve para establecer la superficie de un objeto de tipo
    * vivienda.
    * @param superficie Int que contiene la superficie de la vivienda
    */
    void estableceSuperficie(int superficie){
        this.superficie=superficie;
    }
    int dimeSuperficie(){
        return superficie;
    }
    
    /**
    * Método que sirve para establecer el precio de un objeto de tipo
    * vivienda.
    * @param precio Int que contiene el precio de la vivienda
    */
    void establecePrecio(int precio){
        this.precio=precio;
    }
    int dimePrecio(){
        return precio;
    }
    
    /**
    * Método que sirve para establecer el número de baños de un objeto de tipo
    * vivienda.
    * @param banos Byte que contiene el número de baños de la vivienda
    */
    void estableceBanos(byte banos){
        this.banos=banos;
    }
    byte dimeBanos(){
        return banos;
    }
    
    /**
    * Método que sirve para establecer el número de plantas de un objeto de tipo
    * vivienda.
    * @param plantas Byte que contiene el número de plantas de la vivienda
    */
    void establecePlantas(byte plantas){
        this.plantas=plantas;
    }
    byte dimePlantas(){
        return plantas;
    }
    
    /**
    * Método que sirve para establecer el número de habitaciones de un objeto de tipo
    * vivienda.
    * @param habitaciones Short que contiene el número de habitaciones de la vivienda
    */
    void estableceHabitaciones(short habitaciones){
        this.habitaciones=habitaciones;
    }
    short dimeHabitaciones(){
        return habitaciones;
    }
    
    /**
    *Método que nos devuelve una descripción de la vivienda con algunos de sus datos
    */
    void descripcion(){
        System.out.println("Vivienda situada en " + poblacion + " con una superficie de "
                + superficie + "m2 con " + habitaciones + " habitaciones y "
                        + banos +" baños.\nSu precio es de " + precio + "€");
    }
    
    /**
    *Método que nos devuelve un listado de todos los atributos del objeto
    * de tipo vivienda
    */
    void caracteristicas(){
        System.out.println("Características"
                        + "\nReferencia:\t" + referencia 
                        + "\nPoblacion:\t" + poblacion
                        + "\nDireccion:\t" + direccion
                        + "\nFotos de la dirección:\t" + fotosDireccion
                        + "\nSuperficie:\t" + superficie +"m2"
                        + "\nPlantas:\t" +plantas
                        + "\nHabitaciones:\t" +habitaciones
                        + "\nBaños:\t" +banos
                        + "\nPrecio:\t" + precio + "€");
    }
    
}
