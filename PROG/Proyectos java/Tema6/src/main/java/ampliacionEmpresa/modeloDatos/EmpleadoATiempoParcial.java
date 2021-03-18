/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ampliacionEmpresa.modeloDatos;


public class EmpleadoATiempoParcial extends Empleado {

    
    private double precioXHora;
    private int horasTrabajadas;
    
    public EmpleadoATiempoParcial(){}
    
    public EmpleadoATiempoParcial(double precioXHora,int horasTrabajadas,
            short id, String nombre, String apellidos, double salario, int telefono, String fechaNacimiento)throws IllegalArgumentException{
    
        super(id, nombre, apellidos, salario, telefono, fechaNacimiento);
        
        if(id<2000){
            throw new IllegalArgumentException();
        }
        
        this.precioXHora=precioXHora;
        this.horasTrabajadas=horasTrabajadas;
        
        
    }

    /**
     * @return the precioXHora
     */
    public double getPrecioXHora() {
        return precioXHora;
    }

    /**
     * @param precioXHora the precioXHora to set
     */
    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
        //10.478,52
    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    
    @Override
    public float calculaSueldoMes (int horasExtrasMes){
        float sueldoMes;
        
        sueldoMes = (float) (horasTrabajadas * precioXHora + horasExtrasMes * (salario/30/8) * 0.05) ;
        
        return sueldoMes;
    }
}
