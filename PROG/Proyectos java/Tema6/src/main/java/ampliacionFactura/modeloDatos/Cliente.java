/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ampliacionFactura.modeloDatos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente {

    
    private String nombre;
    private String apellidos;
    private int dni;
    private String direccion;
    
    Cliente(){}
    
    Cliente(String nombre,String apellidos,int dni,String direccion){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
    }
    
    
    //<editor-fold desc="getter y setter" defaultstate="collapsed">
        
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //</editor-fold>
    
    public String toString(){
    
        return "Nombre: " + nombre
                + "\nApellidos: " + apellidos
                + "\nDNI: " + dni
                + "\nDirección: " + direccion;
    }
}
