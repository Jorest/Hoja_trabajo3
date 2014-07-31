/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo3;
import java.util.*;
import java.io.*;
/**
 *
 * @author Irene
 */
public class Datos {
    //se crea un arreglo para guardar los enteros random
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    /**
     *
     * @throws FileNotFoundException
     */
    public  void generarDatos()throws FileNotFoundException{
        //se crea PrintWriter para guardar los numeros en el archivo
        PrintWriter writer = new PrintWriter("Datos.txt"); 
        
        try{
           
            for(int i=0;i<2001;i++){
                Random random = new Random(); 
                int num = random.nextInt(2001);
                //System.out.println(num);
                //System.out.println(i);
                numeros.add(num); 
                
             }
            for(int i=0; i<numeros.size();i++){
                writer.print(numeros.get(i));
                writer.print(" ");
                
            }
            writer.close();
             
        }
        catch(Exception e)
        {
            System.out.println("Hubo un error generando los datos en la clase Datos");
            
            
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
        
    }
    
    
            
            
}
