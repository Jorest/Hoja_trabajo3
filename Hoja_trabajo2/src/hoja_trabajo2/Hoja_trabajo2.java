/*
Universidad del Valle de Guatemala
Hoja de Trabajo 2 
22/07/2014
Irene Molina 13480
Jorge Garcia 13175
Moises Urias 13015
 */
package hoja_trabajo2;

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class Hoja_trabajo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaracion de variables*/
        String micadena = null;
        String linea=null;
        Stack<String> miStack = new StackVector<String>();
        
        FileReader fr;
        BufferedReader br;
                
        
        try
        {
            /*Lectura del archivo*/
            fr = new FileReader("datos.txt");
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                linea = micadena;
                System.out.println(micadena);
            }
          
        }
        
        /*Error en caso de que no se pueda leer el archivo*/
        catch(Exception e)
        {
            System.out.println("Hubo un error leyendo el archivo. No se"
                    + "encuentra el archivo 'datos.txt'");
            
            
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
        
        /*Despues de leer el archivo*/
        /*Se crea un string tokenizer*/
        System.out.println(linea);
        StringTokenizer tokens = new StringTokenizer(linea," ");
        
        
        
        
        /*Se revisan los caracteres del archivo uno por uno*/
        while (tokens.hasMoreTokens())
        {
            
            /*Se almacena el caracter en un string para comprarlo
             ya sea con un '+' o '-' o '*' o '/'*/
            String token;
            token = tokens.nextToken();
            
            System.out.println("El token actual es: " + token);
            /*Si es un caracter de operacion se sacan dos elementos de la pila,
             se almacenan en variables y depues se operan*/
            if ((token.equals("+")) ||(token.equals("-"))|| (token.equals("*"))||(token.equals("/")))
            {
                  int operando1 = 0;
                  int operando2 = 0;
                  int suma;
                  
                  operando1 = Integer.parseInt(miStack.pop());
                  operando2 = Integer.parseInt(miStack.pop());
                  
                  if (token.equals("+"))
                  {
                      suma = operando1 + operando2;
                      miStack.push(String.valueOf(suma));
                  }
                  else if (token.equals("-"))
                  {
                      suma = operando1 - operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else if (token.equals("*"))
                  {
                      suma = operando1 * operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else
                  {
                      suma = operando1 / operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
            }
            else 
            {
                /*Si no es un caracter de operacion, se asume que es un numero y
             se almacena en la pila*/
                miStack.push(token);
            }
        }
        
        String moi = miStack.pop();
        System.out.println(moi);
        JOptionPane.showMessageDialog(null, "El resultado de las operaciones fue:\n" + moi, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
