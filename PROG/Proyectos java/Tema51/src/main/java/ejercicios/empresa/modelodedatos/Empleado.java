/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.empresa.modelodedatos;


public class Empleado {
    
    private short id;
    private String nombre;
    private String apellidos;
    private double salario;
    private byte[] horasExtra=new byte[12];
    static int numeroEmpleados;
    
    public Empleado(){
        rellenaHorasExtra(horasExtra);
        numeroEmpleados++;
    }
    
    public Empleado(short id, String nombre, String apellidos, double salario){
        
        this();
        
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.salario=salario;
        
    }
        //<editor-fold desc="getter y setter" defaultstate="collapsed">
    void setId(short id){

        this.id=id;

    }
    
    void setNombre(String nombre){
        
        this.nombre=nombre;

    }
    
    void setApellidos(String apellidos){
        
        this.apellidos=apellidos;

    }
    
    void setSalario(double salario){
        
        this.salario=salario;

    }
    
    short getId(){
        
        return id;
    }
    
    String getNombre(){
        
        return nombre;
    }
    
    String getApellidos(){
        
        return apellidos;
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
    
    private float calculaSueldoMes(int horasExtraMes)throws NullPointerException{
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
    
    String dimeSueldoTodosMeses(){
        String sueldoTodosMeses="";
        float [] sueldos=calculaSueldoCadaMes();
        
        for(int i=0;i<sueldos.length;i++){
            sueldoTodosMeses=sueldoTodosMeses+"Sueldo completo del mes " + i +": " + sueldos[i] +"\n";
        
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
