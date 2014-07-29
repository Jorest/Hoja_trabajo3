/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo3;

import java.util.Vector;

/**
 * Esta clase tiene permite ordenar un arreglo utilizando el algoritmo QuickSort
 * Esta clase solo funciona con numeros enteros
 * @author Irene Molina
 * @author Moises Urias
 */


public class QuickSort {
Vector<Integer> arreglo = new Vector();
int pivote, izq,der;

    public void ordenar()   
    {
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(4);
        arreglo.add(9);
        arreglo.add(8);
        arreglo.add(10);
        arreglo.add(2);
        arreglo.add(3);

        System.out.println(arreglo.get(0));
        System.out.println(arreglo.get(1));
        System.out.println(arreglo.get(2));
        System.out.println("");
        arreglo.insertElementAt(100, 0);
        arreglo.removeElementAt(1);
        System.out.println("");
        System.out.println(arreglo.get(0));
        System.out.println(arreglo.get(1));
        System.out.println(arreglo.get(2));
        
        System.out.println("Imprme el vector actual");
        for (int i=0;i<arreglo.size();i++)
        {
            System.out.println(arreglo.get(i));
        }
        System.out.println("Empieza el quicksort");
        ordenarQuickSort(arreglo);
        System.out.println("Imprme el vector ordenado");
        for (int i=0;i<arreglo.size();i++)
        {
            System.out.println(arreglo.get(i));
        }
}

    public void ordenarQuickSort(Vector<Integer > vector)
    {
        vector = quicksort(vector);
    } 

    private Vector quicksort(Vector vector) {
      return quick(vector,0,vector.size()-1);
    }
    
    private Vector quick(Vector<Integer> vector, int izq, int der)
    {
        if (izq>=der)
        {
            return vector;
        } 
        int i = izq; //Hace referencia al puntero izquierdo
        int d = der; //Hace referencia al puntero derecho
        
        if (izq!=der)
        {
            int pivote;
            int aux;
            pivote = izq;
            while (izq!=der)
            {
                while (vector.get(der)>=vector.get(pivote) && izq<der)
                {
                    der--;
                }
                
                while (vector.get(izq)<vector.get(pivote) && izq<der)
                {
                    izq++;;
                }
                
                if (der!=izq)
                {
                    aux = vector.get(der);
                    
                    vector.insertElementAt(izq, der);
                    vector.removeElementAt(der + 1);
                    
                    vector.insertElementAt(aux, izq);
                    vector.removeElementAt(izq+1);
                    
                }
                
                if (izq==der)
                {
                    quick(vector,i,izq-1);
                    quick(vector,izq+1,d);
                }
            }
        }
        else
        {
            return vector;
        }
        return vector;
    }
   
    
    
    
}
