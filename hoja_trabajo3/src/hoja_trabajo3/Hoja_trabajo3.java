/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja_trabajo3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jorge
 */
public class Hoja_trabajo3 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se le pregunta al usuario que algoritmo desea usar
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el numero del algoritmo que desea correr: 1.BubbleSort 2.MergeSort 3.InsertionSort 4.QuickSort"));
        
        //si el usuario elige la opcion 1
        if(opcion==1){
            BubbleSort bubbleSort; 
            bubbleSort = new BubbleSort(); 
            try{
                bubbleSort.abrir();
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en la clase bubbleSort");
                 /*Si hubo error cargando el archivo, termina el programa*/
                System.exit(0);
            }
        }
        //si el usuario elige la opcion 2
        if(opcion==2){
            MergeSort mergeSort; 
            mergeSort = new MergeSort(); 
            try{
                
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en la clase MergeSort");
                 /*Si hubo error cargando el archivo, termina el programa*/
                System.exit(0);
            }
        }
        //si el usuario elige la opcion 3
        if(opcion==3){
            Sorting insertionSort; 
            insertionSort = new Sorting(); 
            try{
                insertionSort.abrir();
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en la clase Sorting");
                 /*Si hubo error cargando el archivo, termina el programa*/
                System.exit(0);
            }
        }
        //si el usuario elige la opcion 4
        if(opcion==4){
            QuickSort quickSort; 
            quickSort = new QuickSort(); 
            try{
                
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en la clase QuickSort");
                 /*Si hubo error cargando el archivo, termina el programa*/
                System.exit(0);
            }
        }
        


    // TODO code application logic here
    }
}
