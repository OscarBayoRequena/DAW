/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Empleado {
    
    private short id;
    private String nombre;
    private String apellidos;
    private double salario;
    private byte[] horasExtra=new byte[12];
    static int numeroEmpleados;
    
    Empleado(){
        rellenaHorasExtra(horasExtra);
        numeroEmpleados++;
    }
    
    Empleado(short id, String nombre, String apellidos, double salario){
        
        this();
        
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.salario=salario;
        
    }
    
    void setId(short id){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold> 
        
        this.id=id;

    }
    
    void setNombre(String nombre){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        this.nombre=nombre;

    }
    
    void setApellidos(String apellidos){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        this.apellidos=apellidos;

    }
    
    void setSalario(double salario){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        this.salario=salario;

    }
    
    short getId(){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold> 
        
        return id;
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
    
    double getSalario(){
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
        //</editor-fold>
        
        return salario;
    }
    
    private void rellenaHorasExtra(byte[] horasExtra){
    
        for(int i=0;i<horasExtra.length;i++){
            horasExtra[i]=(byte) (Math.random()*41);
        
        }
        
    }
    
    
    
    private float[] calculaSueldoCadaMes(){
        float [] sueldosAnio= new float[12];
        
        for(int i=0;i<sueldosAnio.length;i++){
        
            int horasExtraMes= horasExtra[i];
            
            sueldosAnio[i]=calculaSueldoMes(horasExtraMes);
        
        }
        
        return sueldosAnio;
    }
    
    private float calculaSueldoMes(int horasExtraMes){
        float sueldoMes=0;
        
        
        if(getId()<101 && getId()>0){
            
            sueldoMes=(float)(salario+((salario/30/8)*1.1*horasExtraMes));
            
        }else{
            if(getId()>500){
                sueldoMes=(float)(salario+((salario/30/8)*1.05*horasExtraMes));
            }else{
                System.out.println("Su id no está en ningún rango conplemtado");
            }
        }
        
        
        return sueldoMes;
    }
    
    void dimeSueldoTodosMeses(){
    
        float [] sueldos=calculaSueldoCadaMes();
        
        for(int i=0;i<sueldos.length;i++){
            System.out.println("Sueldo completo del mes " + i +": " + sueldos[i]);
        
        }
    }
    
    
}
