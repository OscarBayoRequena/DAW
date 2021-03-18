/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacionEmpresa.controlador;
import ampliacionEmpresa.modeloDatos.EmpleadoATiempoParcial;
import ampliacionEmpresa.modeloDatos.Empleado;

import recursos.Utilidades;


public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    
    static final int MAX_EMPLEADOS=10;
    static EmpleadoATiempoParcial[] empresa= new EmpleadoATiempoParcial[MAX_EMPLEADOS];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        EmpleadoATiempoParcial empleado1=new EmpleadoATiempoParcial(65.5,50,(short)2000,"Paco","Flores Campo",1500,123456789,"15/12/2000");
        EmpleadoATiempoParcial empleado2=new EmpleadoATiempoParcial(57.4,67,(short)5769,"Pepe","Villuela Pérez",1000,987654321,"06/09/1982");
                
        //(double precioXHora,int horasTrabajadas,
        //    short id, String nombre, String apellidos, double salario, int telefono, String fechaNacimiento)
        
        
        empresa[0]=empleado1;
        empresa[1]=empleado2;
        
        System.out.println("Introduce un empleado a tiempo parcial");
        anadirEmpleadoATiempoParcial();
        System.out.println("Espera...");
        Utilidades.pausaPrograma(5);
        Utilidades.limpiaPantalla();
        

        /*        
        System.out.println("Introduce otro empleado a tiempo parcial");
        anadirEmpleadoATiempoParcial();
        System.out.println("Espera...");
        Utilidades.pausaPrograma(5);
        Utilidades.limpiaPantalla();
        */

        empresa[2].dimeSueldoTodosMeses();
        
        if(empresa[2].esTuDia()){
            System.out.println("Hoy es tu cumpleaños");
        }
        
        
        System.out.println(Empleado.getNumEmpleados());
        Utilidades.pausaPrograma(5);
        
        /*System.out.println("");
        Empleado.muestraInfoTodosEmpleados(empresa);*/
        System.out.println(EmpleadoATiempoParcial.muestraInfoTodosEmpleados(empresa));
    }
    
    static void anadirEmpleadoATiempoParcial(){
        
        double precioXHora;
        int horasTrabajadas;
        short id;
        String nombre;
        String apellidos;
        double salario;
        int telefono;
        String fechaNacimiento;
        
        if(EmpleadoATiempoParcial.getNumEmpleados()<MAX_EMPLEADOS){
        System.out.println("Dime el id que se le asignará. \n1-100:Directivo 500-1999:Empleado. 2000+:Empleado a tiempo parcial");
        id=(short)Utilidades.pideInt();
        
        System.out.println("Introduce el nombre del empleado");
        nombre=Utilidades.pideString();
        
        System.out.println("Introduce los apellidos del empleado");
        apellidos=Utilidades.pideString();
        
        System.out.println("Introduce el salario del empleado");
        salario=Utilidades.pideDouble();
        
        System.out.println("Introduce el teléfono del empleado");
        telefono=Utilidades.pideInt();
        
        System.out.println("Introduce la fecha de nacimiento del empleado. (dd/mm/aaaa)");
        fechaNacimiento=Utilidades.pideString();
        
        System.out.println("Introduce el precio por hora del empleado.");
        precioXHora=Utilidades.pideDouble();
        
        System.out.println("Introduce las horas trabajadas del empleado.");
        horasTrabajadas=Utilidades.pideInt();
        
        try{
        empresa[EmpleadoATiempoParcial.getNumEmpleados()]= new EmpleadoATiempoParcial(precioXHora,horasTrabajadas,
                                                                        id, nombre, apellidos, salario, telefono, fechaNacimiento);
        }catch(IllegalArgumentException Ex1){
            System.err.println("Se ha producido un error en la introducción de datos");
        }
        }else{
            System.out.println("La empresa ha llegado a su máximo aforo");
        }

    }
    
}
