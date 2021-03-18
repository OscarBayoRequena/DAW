package modeloDatos;

import java.util.Objects;

public class Vivienda implements Comparable<Vivienda> {

    private String referencia;
    private String direccion;
    private String poblacion;
    private String fotosDireccion;
    private String garage;
    private int superficie;
    private int precio;
    private byte banos;
    private byte plantas;
    private short habitaciones;
    private boolean amueblado;
    private boolean disponible;

    public Vivienda() {
    }
    
    public Vivienda(String referencia) {
        this.referencia = referencia;
    }

    public Vivienda(String referencia, String poblacion, String direccion, String fotosDireccion,
            int superficie, byte plantas, short habitaciones, byte banos, String garage, boolean amueblado, boolean disponible, int precio) {

        this.referencia = referencia;
        this.poblacion = poblacion;
        this.direccion = direccion;
        this.fotosDireccion = fotosDireccion;
        this.superficie = superficie;
        this.plantas = plantas;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.garage = garage;
        this.amueblado = amueblado;
        this.disponible = disponible;
        this.precio = precio;

    }
    
    //<editor-fold desc="Métodos nuevos" defaultstate="collapsed">
    /**
     * Método que devuelve la referencia de la vivienda
     *
     * @return String La referencia de la vivienda 
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Método que sirve para establecer todos los datos de un objeto de tipo vivienda.
     *
     * @param referencia String que contiene la referencia de la vivienda
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Método que devuelve la dirección de la vivienda
     *
     * @return String La dirección de la vivienda 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que sirve para establecer la dirección de un objeto de tipo vivienda.
     *
     * @param direccion String que contiene la direccion de la vivienda
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve la población de la vivienda
     *
     * @return String que contiene la población de la vivienda
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Método que sirve para establecer la población de un objeto de tipo vivienda.
     *
     * @param poblacion String que contiene la población de la vivienda
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * Método que devuelve las fotos de la dirección de la vivienda
     *
     * @return String que contiene las fotos de la direccion de la vivienda
     */
    public String getFotosDireccion() {
        return fotosDireccion;
    }

    /**
     * Método que sirve para establecer la referencia de un objeto de tipo vivienda.
     *
     * @param fotosDireccion String que contiene las fotos de la vivienda
     */
    public void setFotosDireccion(String fotosDireccion) {
        this.fotosDireccion = fotosDireccion;
    }

    /**
     * Método que devuelve si la vivienda tiene garage o no
     *
     * @return String que devuelve "si" o "no" en función de si tiene garage o no la vivienda
     */
    public String getGarage() {
        return garage;
    }

    /**
     * Método que sirve para establecer la variable garage de un objeto de tipo vivienda.
     *
     * @param garage String que contiene si la vivienda tiene garage o no
     */
    public void setGarage(String garage) {
        this.garage = garage;
    }

    /**
     * Método que devuelve la superficie de la vivienda
     *
     * @return int que contiene la superficie en m2 de la vivienda
     */
    public int getSuperficie() {
        return superficie;
    }

    /**
     * Método que sirve para establecer la superficie de un objeto de tipo vivienda.
     *
     * @param superficie Int que contiene la superficie de la vivienda en m2
     */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    /**
     * Método que devuelve el precio de la vivienda
     *
     * @return int que contiene el precio de la vivienda
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Método que sirve para establecer el precio de un objeto de tipo vivienda.
     *
     * @param precio Int que contiene el precio de la vivienda
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el número de baños de la vivienda
     *
     * @return byte que contiene el número de baños de la vivienda
     */
    public byte getBanos() {
        return banos;
    }

    /**
     * Método que sirve para establecer el número de baños de un objeto de tipo vivienda.
     *
     * @param banos Byte que contiene el número de baños de la vivienda
     */
    public void setBanos(byte banos) {
        this.banos = banos;
    }

    /**
     * Método que devuelve el número de plantas de la vivienda
     *
     * @return byte que contiene el número de plantas de la vivienda
     */
    public byte getPlantas() {
        return plantas;
    }

    /**
     * Método que sirve para establecer el número de plantas de un objeto de tipo vivienda.
     *
     * @param plantas Byte que contiene el número de plantas de la vivienda
     */
    public void setPlantas(byte plantas) {
        this.plantas = plantas;
    }

    /**
     * Método que devuelve el número habitaciones de la vivienda
     *
     * @return short que contiene el número de habitaciones de la vivienda
     */
    public short getHabitaciones() {
        return habitaciones;
    }

    /**
     * Método que sirve para establecer el número de habitaciones de un objeto de tipo vivienda.
     *
     * @param habitaciones Short que contiene el número de habitaciones de la vivienda
     */
    public void setHabitaciones(short habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Método que devuelve si la vivienda está amueblado o no
     *
     * @return boolean que devuelve true si está amueblado y false en caso contrario
     */
    public boolean isAmueblado() {
        return amueblado;
    }

    /**
     * Método que sirve para establecer la variable amueblado de un objeto de tipo vivienda.
     *
     * @param amueblado String que contiene si la vivienda está amueblada o no
     */
    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    /**
     * Método que devuelve si la vivienda está disponible o no
     *
     * @return String que devuelve true si está disponible y false en caso contrario
     */
    public boolean estaDisponible() {
        return disponible;
    }

    /**
     * Método que sirve para establecer la variable amueblado de un objeto de tipo vivienda.
     *
     * @param disponible Boolean que contiene si la vivienda está disponible o no
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Método que nos devuelve una descripción de la vivienda con algunos de sus datos
     * @return String que contiene la descripción de la vivienda con datos varios
     */
    public String descripcion() {
        return "Vivienda situada en " + poblacion + " con una superficie de "
                + superficie + "m2 con " + habitaciones + " habitaciones y "
                + banos + " baños.\nSu precio es de " + precio + "€";
    }

    @Override
    /**
     * Método que de vuelve toda la información de la vivienda en forma de cadena de caracteres
     * @return String que contiene toda la información de la vivienda
     */
    public String toString() {

        String amueblado1;
        String disponible1;

        if (amueblado = true) {
            amueblado1 = "Si";
        } else {
                amueblado1 = "No";
        }

        if (disponible = true) {
            disponible1 = "Si";
        } else {
                disponible1 = "No";
        }

        return "Características"
                + "\nReferencia:\t" + referencia
                + "\nPoblacion:\t" + poblacion
                + "\nDireccion:\t" + direccion
                + "\nFotos de la dirección:\t" + fotosDireccion
                + "\nSuperficie:\t" + superficie + "m2"
                + "\nPlantas:\t" + plantas
                + "\nHabitaciones:\t" + habitaciones
                + "\nBaños:\t" + banos
                + "\nGarage:\t" + garage
                + "\nAmueblado:\t" + amueblado1
                + "\nDisponible:\t" + disponible1
                + "\nPrecio:\t" + precio + "€";
    }

    //</editor-fold>
    
    
    @Override
    /**
     * Método que indica como deben compararse dos objetos de la clase Vivienda
     * para deducir si son iguales o no
     * 
     * @param obj Object que será el supuesto objeto a comparar con el otro que realiza
     * la llamada a este método
     */
    public boolean equals(Object obj){
        
        if (obj instanceof Vivienda){
        
            Vivienda otro= (Vivienda) obj;
        
            return referencia.equals(otro.getReferencia());
        }
        return false;
        
    }

    @Override
    /**
     * Método que devuelve el HashCode, es decir la posición en memoria
     * del objeto de tipo vivienda indicado
     * @return int que contiene el HashCode del objeto de tipo vivienda
     */
    public int hashCode() {
        return referencia.hashCode();
    }
    
    @Override
    public int compareTo(Vivienda viv2){
        
        
        
        return 0;
        
    }
}
