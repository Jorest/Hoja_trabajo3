/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_trabajo3;

/**
 *
 * @author Jorge
 */
public class Hoja_trabajo3 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datos datos; 
        datos = new Datos(); 
        try{
            datos.generarDatos();
        }
        catch(Exception e)
        {
            System.out.println("Hubo un error ");
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
        
        


    // TODO code application logic here
    }
}
