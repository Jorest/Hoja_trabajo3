/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo3;

import java.util.Vector;

/**
 * Esta clase se utiliza para generar dos mil nuemros aleatorior y guardar los 
 * mismos en un arvhivo de texto. 
 * @author Samuel Urias
 */

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class EscribirNumeros {

    /**
     * @param args the command line arguments
     * @version 1.0.0
     */
    
    
    /*Atributos de la clase EscribirNumeros*/
    private Vector vector = new Vector();
    private int numero; /*Se almacena el numero aleatorio generado*/
    private String cadena = ""; /*Cadena de numeros aleatorios que se guarda en el archivo*/
    private File file = new File ("numeros.txt"); /*Guarda el nombre del archivo de texto*/

    
    
    /*Constructor de la clase*/
    public EscribirNumeros() 
    {
        
    }
        
       
        
    /**
     * Este metodo se utiliza para crear un archivo de texto que contiene
     * dos mil numeros aleatorios
     * @exception No se puede generar el archivo
     */    
    public void crearArchivo()
    {
        //Pre: Haber generado los 2000 numeros aleatorios
        
        /*Se verifica si no se han generado numeros aleatorios*/
        /*Escritura de un archivo*/
        if (cadena.equals(""))
        {
            this.generarAleatorios();
        }
        
        try {
            System.out.println("Se crea el archivo de texto con los numeros "
                    + "aleatorios");
            
            FileWriter w = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            
            wr.write(cadena); //Escribimos en el archivo
              
                                          //borrar lo existente
            /*Cerramos los flujos de canales de datos, al cerrarlos, el 
            archivo queda guardado con la informacion excrita. De no hacerlo
            no se escribira nada en el archivo*/
            
            wr.close();
            bw.close();
            
            
        } catch (Exception e) {
            
            /*Se muestra un cuadro de dialogo de error si hubo un problema
            generando el arvhcio*/
            JOptionPane.showMessageDialog(null, "Se ha producido un erro en la"
                    + " escritura del archivo de texto");
            
        }
    }
     
    /**
     * Este metodo se utiliza para generar una cantidad de 2000 numeros 
     * aleatorios. Estos numeos no se generan para ser devueltos al usuario,
     * sino que se genran para ser escritos en un archivo de texto con el
     * metodo 
     */
    public void generarAleatorios()
    {
        //post: Genera 2000 numeros aleatorios
        
        Random rnd = new Random();
        for (int i = 0; i<=2000; i++) {
            numero = rnd.nextInt(100);
            System.out.println("El numero aleatorio generado es: " + numero);
            
            if (i<2000)
                cadena = cadena + numero+ " ";
            else
                cadena = cadena + numero;
        }
        System.out.println(cadena);
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        EscribirNumeros en= new EscribirNumeros();
        en.generarAleatorios();
        en.crearArchivo();
       
        
        
    }
    
}
