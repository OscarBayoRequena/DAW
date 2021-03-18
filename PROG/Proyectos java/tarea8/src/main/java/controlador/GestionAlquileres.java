/*
Partiendo de la tarea evaluable de la UD 3 Vivienda (utiliza una copia como punto de partida) crea
una nueva clase principal, "GestionAlquileres" para que se muestre un menú que permita añadir, 
darde baja y modificar los datos de las viviendas. 
También deberá haber una opción para listar a todos las viviendas y por último una opción para salir del programa.

Convierte todos los atributos de la clase vivienda en privados y genera los métodos accesores y modificadores (getters y setters) en vez de (dime y establece) 
que necesites.Utiliza la estructura de datos dinámica que creas que mejor se ajusta a las necesidades de funcionamiento de la empresa. 

Justifica porque has elegido esta estructura mediante los comentarios al principio de la clase.
Modifica todo lo que sea necesario para solucionar los errores que se indicaron en la rubrica de corrección de la tarea 3.
 */
package controlador;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import modeloDatos.Vivienda;
import modeloDatos.comparadorReferencias;
import recursos.Utilidades;

/**
 *
 * @author Oscar Bayo Requena
 * @version 1.0 4/3/2021
 */
public class GestionAlquileres {
    //Creo la estructura de almacenamiento para las viviendas
    /*
    He elegido HashSet dado que no permite duplicados del mismo objeto en la colección
    Otra opción que tenia en mente era utilizar HashMap, pero ya que HashSet supone una estructura 
    de almacenamiento que consume menos recursos y podia hacerse con HashSet opte por ella
    */
    static TreeSet<Vivienda> registroAlquileres = new TreeSet<>();

    public static void main(String[] args) {

        //Declaro las variables que utilizaré para controlar el programa y las selecciones del usuario
        String referenciaABuscar;
        String referenciaViviendaAEliminar;
        boolean encendido;
        
        //Datos de prueba 
        /*
        registroAlquileres.add((new Vivienda("vivhu001","Huelva","Calle del Salado 2","fotos vivienda 1",240,(byte)2,(short)7,(byte)2,"Si",true,false,1200)));
        registroAlquileres.add((new Vivienda("vivhu002","Huelva","Calle de la Gamba 34","fotos vivienda 2",69,(byte)1,(short)3,(byte)1,"No",false,true,420)));
        registroAlquileres.add((new Vivienda("vivse001","Sevilla","Calle del Miarma 8","fotos vivienda 3",80,(byte)1,(short)2,(byte)1,"No",false,false,600)));
        registroAlquileres.add((new Vivienda("vivse004","Sevilla","Calle del Betis 56","fotos vivienda 4",40,(byte)1,(short)1,(byte)1,"Si",true,false,500)));
        registroAlquileres.add((new Vivienda("vivma003","Madrid","Gran Vía 210","fotos vivienda 5",120,(byte)1,(short)3,(byte)1,"Si",false,true,2000)));
        */
        
        System.out.println("Bienvenido");
        Utilidades.pausaPrograma(3,"Se ha producido un error.Inténtalo de nuevo");
        
        //Incializo encendido a true para comenzar el programa
        encendido = true;
        while (encendido) {

            switch (menu()) {//Aquí elijo la selección indicada por el usuario
                case 'c'://Crear vivienda
                    creaVivienda();
                    break;

                case 'a':
                    System.out.println("Introduce la referencia de la vivienda que deseas buscar");
                    referenciaABuscar = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

                    alteraVivienda(referenciaABuscar);

                    break;

                case 'e'://Eliminar una vivienda
                        System.out.println("Introduce la referencia de la vivienda que deseas buscar");
                        referenciaViviendaAEliminar= Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");
                        eliminarVivienda(referenciaViviendaAEliminar);
                    
                    break;

                case 'm'://Mostrar todas las viviendas    
                        
                        muestraAlquileres();
                        Utilidades.pausaPrograma(10,"Se ha producido un error.Inténtalo de nuevo");
                    break;

                case 's'://Salir del programa

                    if (Utilidades.preguntaSiONo("¿Estas seguro de que deseas salir?", "Esa no es una respuesta válida. Inténtalo de nuevo.")) {
                        System.out.println("Hasta la próxima");
                        encendido = false;//Termino el ciclo que ejecuta todo el programa
                    }

                    break;

                default:
                    System.out.println("La selección introducida no está contemplada");
                    Utilidades.pausaPrograma(3,"Se ha producido un error.Inténtalo de nuevo");
            }

        }
    }

    /**
     * Método que muestra por pantalla el menú de la aplicación y acepta un caracter 
     * introducido para después devolverlo
     * @return char que contiene la seleción hecha por el usuario
     */
    static char menu() {

        char seleccion;

        Utilidades.limpiaPantalla();

        System.out.println(
                "____________________________________________________\n"
                + "||                  INMOBILIARIA                  ||\n"
                + "||                                                ||\n"
                + "|| C. Crear una nueva vivienda                    ||\n"
                + "|| A. Alterar los datos de una vivienda           ||\n"
                + "|| E. Eliminar una vivienda                       ||\n"
                + "|| M. Mostrar información de todas las viviendas  ||\n"
                + "|| S. Salir                                       ||\n"
                + "||________________________________________________||\n"
                + "Introduzca su selección");

        seleccion = Utilidades.pideChar("Se ha producido un error.Inténtalo de nuevo");

        return seleccion;
    }
    
    /**
     * Método que pregunta los datos necesarios para añadir una nueva vivienda y la
     * añade al registro
     */
    static void creaVivienda() {

        String referencia;
        String direccion;
        String poblacion;
        String fotosDireccion;
        String garage;
        int superficie;
        int precio;
        byte banos;
        byte plantas;
        short habitaciones;
        boolean amueblado;
        boolean disponible;

        boolean confirmacion1;
        boolean confirmacion2;
        boolean confirmacion3;

        confirmacion1 = true;
        confirmacion2 = true;
        confirmacion3 = true;

        System.out.println("Introduce la referencia");
        referencia = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce la población");
        poblacion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce la dirección");
        direccion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce las fotos de la dirección");
        fotosDireccion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce la nueva superficie");
        superficie = Utilidades.pideInt("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce el nuevo número de plantas");
        plantas = Utilidades.pideByte("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce el nuevo número de habitaciones");
        habitaciones = Utilidades.pideShort("Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce el nuevo número de baños");
        banos = Utilidades.pideByte("Se ha producido un error.Inténtalo de nuevo");

        if (Utilidades.preguntaSiONo("Introduce si tiene garage o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo")) {
            garage = "Si";
        } else {
            garage = "No";
        }

        amueblado = Utilidades.preguntaSiONo("Introduce si está amueblado o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo");

        disponible = Utilidades.preguntaSiONo("Introduce si está disponible o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo");

        System.out.println("Introduce el precio");
        precio = Utilidades.pideInt("Se ha producido un error.Inténtalo de nuevo");

        if(!registroAlquileres.add(new Vivienda(referencia, poblacion, direccion, fotosDireccion, 
                superficie, plantas, habitaciones, banos, garage, amueblado, disponible, precio))){
            System.out.println("Esa referencia ya está en uso, no se puede sobreescribir");
            Utilidades.pausaPrograma(2,"Se ha producido un error.Inténtalo de nuevo");
        }

    }
/*
    static void muestraOrdenadoPor(){
        
        System.out.println("1.Referencia 2. Direccion 3. Disponibilidad");
    
        switch(Utilidades.pideInt("Se ha producido un error.Inténtalo de nuevo")){
            case 1:
                Collections.sort(registroAlquileres, new comparadorReferencias());
        }
    }*/
    
    
    /**
     * Método que permite modificar los valores asociados a una vivienda siempre
     * que esta exista previamente
     * @param referenciaABuscar String que contiene la referencia de la vivienda que 
     * se desea alterar
     */
    static void alteraVivienda(String referenciaABuscar) {

        String nuevaDireccion;
        String nuevaPoblacion;
        String nuevasFotosDireccion;
        String nuevoGarage;
        boolean nuevoAmueblado;
        boolean nuevoDisponible;
        int nuevaSuperficie;
        int nuevoPrecio;
        byte nuevosBanos;
        byte nuevasPlantas;
        short nuevasHabitaciones;

        boolean encontrado;
        Vivienda viviendaAModificar=new Vivienda();
        
        encontrado = false;

        for (Vivienda vivienda1 : registroAlquileres) {
            
            if (!encontrado) {//Esto es para forzar la salida del for-each en caso de encontrarlo, asi recortamos tiempo de ejecucion
                if (vivienda1.getReferencia().equals(referenciaABuscar)) {

                    System.out.println(vivienda1);
                    if (Utilidades.preguntaSiONo("¿Es esta la vivienda que deseas modificar?", "Se ha producido un error.Inténtalo de nuevo")) {
                        
                        encontrado = true;
                        viviendaAModificar= new Vivienda(referenciaABuscar);
                        
                    }

                }
            } else {
                break;
            }
        }

        if (encontrado) {

            System.out.println("Introduce los nuevos datos de la vivienda. "
                    + "\nSe guardarán los cambios bajo la misma referencia indicada");

            System.out.println("Introduce la nueva población");
            nuevaPoblacion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce la nueva dirección");
            nuevaDireccion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce las nuevas fotos de la dirección");
            nuevasFotosDireccion = Utilidades.pideString("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce la nueva superficie");
            nuevaSuperficie = Utilidades.pideInt("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce el nuevo número de plantas");
            nuevasPlantas = Utilidades.pideByte("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce el nuevo número de habitaciones");
            nuevasHabitaciones = Utilidades.pideShort("Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce el nuevo número de baños");
            nuevosBanos = Utilidades.pideByte("Se ha producido un error.Inténtalo de nuevo");

            if (Utilidades.preguntaSiONo("Introduce si tiene garage o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo")) {
                nuevoGarage = "Si";
            } else {
                nuevoGarage = "No";
            }

            nuevoAmueblado = Utilidades.preguntaSiONo("Introduce si está amueblado o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo");

            nuevoDisponible = Utilidades.preguntaSiONo("Introduce si está disponible o no (Si/No)", "Se ha producido un error.Inténtalo de nuevo");

            System.out.println("Introduce el nuevo precio");
            nuevoPrecio = Utilidades.pideInt("Se ha producido un error.Inténtalo de nuevo");
            
            registroAlquileres.remove(viviendaAModificar);
            registroAlquileres.add(new Vivienda(referenciaABuscar, nuevaPoblacion, nuevaDireccion, nuevasFotosDireccion, nuevaSuperficie, nuevasPlantas, nuevasHabitaciones, nuevosBanos, nuevoGarage, nuevoAmueblado, nuevoDisponible, nuevoPrecio));

        } else {
            System.out.println("No se ha encontrado la vivienda con la referencia especificada");
        }
    }

    /**
     * Método que permite eliminar una vivienda del registro
     * @param referenciaViviendaAEliminar String que contiene la referencia de la vivienda que 
     * se desea eliminar
     */
    static void eliminarVivienda(String referenciaViviendaAEliminar) {

        boolean encontrado;

        encontrado = false;

        for (Vivienda vivienda1 : registroAlquileres) {

            if (vivienda1.getReferencia().equals(referenciaViviendaAEliminar)) {

                System.out.println(vivienda1);
                if (Utilidades.preguntaSiONo("¿Es esta la vivienda que deseas eliminar?", "Se ha producido un error.Inténtalo de nuevo")) {
                    encontrado = true;
                }

            }
            if (encontrado) {
                registroAlquileres.remove(vivienda1);
                break;//Esto es para forzar la salida del for-each en caso de encontrarlo, asi recortamos tiempo de ejecución
            }
        }

    }
    
    /**
     * Método que mostrará por pantalla todos los datos de todas las viviendas
     */
    static void muestraAlquileres(){
    
        for (Vivienda vivienda1 : registroAlquileres) {
            
            System.out.println("\n" + vivienda1);
            
        }
    }

}
