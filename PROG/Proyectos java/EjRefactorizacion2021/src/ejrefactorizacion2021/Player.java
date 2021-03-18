/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrefactorizacion2021;

/**
 *
 * @author JC Alfaro
 */
public class Player {
    
 
    private Coord posicion;
    
    public Player(){
        this.posicion = new Coord(0,0);
    }
  
    /**
     *  Este método permite el movimiento del jugador a diferentes posiciones
     * @param m Especifica el movimiento
     * @see "http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/109"
     * @deprecated
     * 
     */
    public void movement(String m){
        
        switch(m.toLowerCase()){
            case "derecha":
                this.posicion.moveToRight(1);
                break;
            case "izquierda":
                this.posicion.moveToLeft(1);
                break;
            case "abajo":
                this.posicion.moveToDown(1);
                break;
            case "arriba":
                this.posicion.moveToUp(1);
                break;
        }
    }
    
}
