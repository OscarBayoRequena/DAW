/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacionEmpresa.modeloDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import recursos.Utilidades;


public class Persona {

    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    protected String nombre;
    protected String apellidos;
    protected int telefono;
    private LocalDate fechaNacimiento;

    Persona(){}
    
    Persona(String nombre,String apellidos,int telefono,String fechaNacimiento)throws IllegalArgumentException{
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
        
        
    
    }
    
    

    void setNombre(String nombre) {
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>

        this.nombre = nombre;

    }

    void setApellidos(String apellidos) {
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>

        this.apellidos = apellidos;

    }

    String getNombre(){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        return nombre;
    }
    
    String getApellidos(){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        return apellidos;
    }    
    
    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono)throws IllegalArgumentException {
        if(Utilidades.esValidoTelefono(String.valueOf(telefono))){
        this.telefono = telefono;
        }else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento)throws IllegalArgumentException {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento,formatoFecha);
    }
    
    public boolean esTuDia(){
    
        boolean hoyEsTuCumple;
        
        if(LocalDate.now().getDayOfYear()==fechaNacimiento.getDayOfYear()){
            hoyEsTuCumple=true;
        }else{
            hoyEsTuCumple=false;
        }
        
        return hoyEsTuCumple;
    }

}
