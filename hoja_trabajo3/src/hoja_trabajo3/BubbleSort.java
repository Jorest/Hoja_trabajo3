/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
ESTO FUE LO PRIMERO QUE EDITEEEEEEEEEEEE
 */

package hoja_trabajo3;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


/**
 *
 * @author Irene
 */
public class BubbleSort {
    
    int numeros[];
    /*Declaracion de variables*/
    String micadena = null;
    String linea=null;
    FileReader fr;
    BufferedReader br;
    int i, j; 

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
        ArrayList <String> numerosS = new ArrayList <String>();
        //while it has next ..
        while(scanner.hasNext()){
                //Initialise str with word read
                String str=scanner.next();
                //add to ArrayList
                numerosS.add(str);

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
        public ArrayList<Integer> generarListaInt(ArrayList<String> numerosS){
        ArrayList<Integer> numerosI = new ArrayList<Integer>();
        for(String string: numerosS){
            //convertir String a entero
            numerosI.add(Integer.parseInt(string));  
        }
        System.out.println(numerosI); 
        bubbleSort(numerosI); 
        return numerosI; 
        
    } 
    
    
    //Referencia: Java Structures: Data Structures for the Principled Programmer

    /**
     *
     * @param numerosI
     * @param i
     * @param j
     */
        public void cambiar(ArrayList<Integer> numerosI, int i, int j){
        int temp; 
        temp = numerosI.get(i);
        //int jValue=numerosI.get(j);
        //numerosI.set(i, jValue); 
        numerosI.set(i, numerosI.get(j)); 
        numerosI.set(j, temp);
        temp = numerosI.get(j); 
        
    }
    
    //Referencia: Java Structures: Data Structures for the Principled Programmer

    /**
     *
     * @param numerosI
     */
        public void bubbleSort(ArrayList<Integer> numerosI){
        int numSorted = 0; 
        int index; 
        while(numSorted<numerosI.size()){
            //se cambia el elemento mas grande a una posicion mas arriba
            for(i = 1; i<numerosI.size()-numSorted; i++){
                if((numerosI.get(i-1)).compareTo(numerosI.get(i))>0){
                    //System.out.println(numerosI.get(i-1)+" >"+ numerosI.get(i));
                    cambiar(numerosI,i-1,i); 
                }
             }
            numSorted++; 
        }
        System.out.println(numerosI); 
    }
    
}
