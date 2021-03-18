/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ampliacionEmpresa.modeloDatos;


public class Empleado extends Persona {
    
    protected short id;
    protected double salario;
    protected byte[] horasExtra=new byte[12];
    protected static int numeroEmpleados;
    
    Empleado(){}
    
    Empleado(String nombre, String apellidos,int telefono, String fechaNacimiento)throws IllegalArgumentException{
        
        super(nombre, apellidos, telefono, fechaNacimiento);
        rellenaHorasExtra(horasExtra);
        numeroEmpleados++;
        
    }
    
    Empleado(short id, String nombre, String apellidos, double salario, int telefono, String fechaNacimiento)throws IllegalArgumentException{
        
        this(nombre, apellidos, telefono, fechaNacimiento);
        
        this.id=id;
        this.salario=salario;
        
    }
    
    //<editor-fold desc="getter y setter" defaultstate="collapsed">
    void setId(short id){

        this.id=id;

    }
    
    void setSalario(double salario){
        
        this.salario=salario;

    }
    
    short getId(){
        
        return id;
    }

    double getSalario(){
        
        return salario;
    }
    
    public static int getNumEmpleados(){
        return numeroEmpleados;
    }
    //</editor-fold>
    
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
    
    public float calculaSueldoMes(int horasExtraMes){
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
    
    public String dimeSueldoTodosMeses(){
        String sueldoTodosMeses="";
        float [] sueldos=calculaSueldoCadaMes();
        
        for(int i=0;i<sueldos.length;i++){
            sueldoTodosMeses=sueldoTodosMeses+"Sueldo completo del mes " + (i+1) +": " + sueldos[i] +"\n";
        
        }
        sueldoTodosMeses=sueldoTodosMeses+"\n";
        return sueldoTodosMeses;
    }

    @Override
    public String toString(){
        
        String informacion;
        
        informacion="Id: " + id+
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nSalario: " + salario +"\n\n";
        
        return informacion;
    }
    
    String muestraInfoEmpleado(){
        String info;
        if(toString()!=null){
            info=toString()+dimeSueldoTodosMeses();
   
        }else{
            throw new NullPointerException("No hay nada almacenado en ese hueco de memoria");
        }
        return info;
    }
    
    public static String muestraInfoTodosEmpleados (Empleado [] empresa){
        String infoTodosEmpleados="";
        
        for(int i=0;i<empresa.length;i++){
            if(empresa[i]!=null){
                infoTodosEmpleados=infoTodosEmpleados+empresa[i].muestraInfoEmpleado()+"\n\n";
            }
        }
        
        return infoTodosEmpleados;
    }
    
}
