/*
 PARTE DEL CODIGO PROPORCIONADA EN CLASE 
 */

package hoja_trabajo3;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;



//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   /*public static void selectionSort (Comparable[] list)
   {
      int min;
      Comparable temp;

      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan].compareTo(list[min]) < 0)
               min = scan;

         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }*/

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   //método que llama ala clase Datos para generar los numeros que se utilizaran 

    /**
     *
     * @throws FileNotFoundException
     */
       public void abrir() throws FileNotFoundException{
        Datos datos; 
        datos = new Datos(); 
        try{
            
            datos.generarDatos();
        }
        catch(Exception e)
        {
            System.out.println("Hubo un error generando los datos ");
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
             

        }
        generarLista();

    }
    
    
    //se copia el archivo de datos a una lista 

    /**
     *
     * @throws FileNotFoundException
     */
        public void generarLista() throws FileNotFoundException {
        //Static Scanner and File Objects
	 Scanner scanner = new Scanner(new File("Datos.txt"));
        //Instantiate Scanner s with f variable within parameters
        //surround with try and catch to see whether the file was read or not
        try {
                scanner = new Scanner(new File("Datos.txt"));
        } 
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        //Instantiate a new ArrayList of String type
        String[] numerosS = new String[2000];
        //while it has next ..
        while(scanner.hasNext()){
            for (int i=1; i<numerosS.length;i++){
                //Initialise str with word read
                String str=scanner.next();
                //add to ArrayList
                str = numerosS[i];
            }

        }
        //System.out.println(numerosS);  
        generarListaInt(numerosS);
        
    }
    //se cambian los datos del arrayList numerosS a enteros 

    /**
     *
     * @param numerosS
     * @return
     */
    public void generarListaInt(String[] numerosS){
        int[] numerosI = new int [2000];
        for(String string: numerosS){
            for(int i=1; i<numerosI.length;i++ ){
                //convertir String a entero
                 numerosI[i]= Integer.parseInt(string); 
            }
        }
        System.out.println(numerosI); 
        insertionSort(numerosI); 
        //return numerosI; 
        
    } 
   
    public static void insertionSort(int numerosI[])
        // pre: 0 <= n <= data.length
        // post: values in data[0..n-1] are in ascending order
    {
        int numSorted = 1; // number of values in place
        int index; // general index
        while (numSorted < numerosI.length)
        {
            // take the first unsorted value
            int temp = numerosI[numSorted];
            // ...and insert it among the sorted:
            for (index = numSorted; index > 0; index--)
        {
        if (temp < numerosI[index-1])
        {
            numerosI[index] = numerosI[index-1];
        } else {
         break;
        }
        }
        // reinsert value
        numerosI[index] = temp;
        numSorted++;
        }
    }
}