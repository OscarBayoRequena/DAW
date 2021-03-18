/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera_app_3;
import java.util.Scanner; 
/**
 *
 * @author Alumno
 */
public class Primera {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String texto, respuesta;
        String afirmativo = "Si";
        String negativo = "No";
        
        
        System.out.println("Introduce tu texto:");
        
        texto = teclado.nextLine();
	System.out.println("¿Tu texto es el siguiente?"
                            + "Responde Si o No");
        System.out.println(texto);
        
        respuesta = teclado.nextLine();
        
        if(respuesta == afirmativo){
            System.out.println("Perfecto");
        } else {
            if(respuesta == negativo){
                System.out.println("Vaya...");
            } else {
                System.out.println("Perdona no te he entendido");
            }
        }
	}
}
