/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

import recursos.Utilidades;


public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String numPieza;
        String descrip;
        int cantidad;
        double precioPorUnidad;
        
        Factura facturaDePrueba;
        
        System.out.println("Introduce el código del producto");
        numPieza=Utilidades.pideString();
        
        System.out.println("Introduce la descripción del producto");
        descrip=Utilidades.pideString();
        
        System.out.println("Introduce la cantidad del producto");
        cantidad=Utilidades.pideInt();
        
        System.out.println("Introduce el precio por unidad");
        precioPorUnidad=Utilidades.pideDouble();
        
                
        facturaDePrueba= new Factura(numPieza,descrip,cantidad,precioPorUnidad);
        
        System.out.println("El total asciende a " + facturaDePrueba.obtenerTotalFactura());
        
        
    }
    
}
