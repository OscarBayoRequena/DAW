/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import recursos.Utilidades;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int MAX_EMPLEADOS=10;
        
        Empleado empleado1=new Empleado((short)15,"Paco","Flores Campo",1500);
        Empleado empleado2=new Empleado((short)576,"Pepe","Villuela Pérez",1000);
                
        Empleado[] empresa= new Empleado[MAX_EMPLEADOS];
        
        empresa[0]=empleado1;
        empresa[1]=empleado2;
        
        
    }
    
    void anadirEmpleado(){
        
        System.out.println("Dime el id que se le asignará. 1-100:Directivo 500+:Empleado");
        Utilidades.pideInt();
        
        
    }
}
