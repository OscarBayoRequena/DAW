/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferreteria;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Factura {

     private String numPieza;
     private String descrip;
     private int cantidad;
     private double precioPorUnidad;
     
     Factura(){}
     
     Factura(String numPieza, String descrip, int cantidad, double precioPorUnidad){
         
         this.numPieza=numPieza;
         this.descrip=descrip;
         this.cantidad=cantidad;
         this.precioPorUnidad=precioPorUnidad;
     
     }

     void setNumPieza(String numPieza){
         this.numPieza=numPieza;
     }
     
     void setDescrip(String descrip){
         this.descrip=descrip;
     }
     
     void setCantidad(int cantidad){
         this.cantidad=cantidad;
     }
     
     void setPrecioPorUnidad(double precioPorUnidad){
         this.precioPorUnidad=precioPorUnidad;
     }
     
     String getNumPieza(){
         return numPieza;
     }
     
     String getDescrip(){
         return descrip;
     }
     
     int getCantidad(){
         return cantidad;
     }
     
     double getPrecioPorUnidad(){
         return precioPorUnidad;
     }
     
     double obtenerTotalFactura(){
         double total;
         double precio;
         int cantidadProducto;
         
         precio=getPrecioPorUnidad();
         cantidadProducto=getCantidad();
         
         if(precio<0){
             precio=0;
         }
         
         if(cantidadProducto<0){
             cantidadProducto=0;
         }
         
         total=precio*cantidadProducto;
         
         return total;
     }
}
