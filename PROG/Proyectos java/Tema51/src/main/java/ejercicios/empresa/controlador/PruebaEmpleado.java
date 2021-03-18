
package ejercicios.empresa.controlador;

import ejercicios.empresa.modelodedatos.Empleado;
import recursos.Utilidades;


public class PruebaEmpleado {
    
    static final private int MAX_EMPLEADOS=10;
    
    public static void main(String[] args) {
      
        Empleado[] empresa= new Empleado[MAX_EMPLEADOS];
        
        empresa[0]=new Empleado((short)15,"Paco","Flores Campo",1500);;
        empresa[1]=new Empleado((short)576,"Pepe","Villuela Pérez",1000);
        
        
        
    }
    
    static void anadirEmpleado(Empleado [] empresa){
        
        short id;
        String nombre;
        String apellidos;
        double salario;
        
        if(Empleado.getNumEmpleados()<MAX_EMPLEADOS){
            System.out.println("Dime el id que se le asignará. (1-100:Directivo 500+:Empleado)");
            id=Utilidades.pideShort();

            System.out.println("Dime el nombre del empleado");
            nombre=Utilidades.pideString();

            System.out.println("Dime los apellidos del empleado");
            apellidos=Utilidades.pideString();

            System.out.println("Dime cual sera el salario del empleado");
            salario=Utilidades.pideDouble();
            
            empresa[Empleado.getNumEmpleados()]= new Empleado(id,nombre,apellidos,salario);
        }else{
            System.out.println("La empresa ha llegado a su máximo aforo");
        }
        
        
    }
}
