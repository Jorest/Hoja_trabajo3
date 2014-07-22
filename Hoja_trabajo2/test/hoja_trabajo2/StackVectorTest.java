/*
Universidad del Valle de Guatemala
Hoja de Trabajo 2 
22/07/2014
Irene Molina 13480
Jorge Garcia 13175
Moises Urias 13015
 */

package hoja_trabajo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Irene
 */
public class StackVectorTest {
    
    public StackVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        instance.push(String.valueOf(10));
        instance.push(String.valueOf(15));
        Object result = String.valueOf(instance.pop());
        Object expResult = String.valueOf(15);
        System.out.println("push: 10,15 / pull:"+result);
        
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector instance = new StackVector();
        instance.push(String.valueOf(10));
        instance.push(String.valueOf(15));
        Object result = instance.peek();
        Object expResult = String.valueOf(15);
        System.out.println("push: 10,15 / peek:"+result);
     
    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        instance.push(String.valueOf(10));
        boolean expResult = false;
        boolean result = instance.empty();
        if(result==expResult){
            System.out.println("¡La prueba funciona! push: 10 / empty:"+result);
        }
        else{
            System.out.println("La prueba no funciona");
        }
        
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        instance.push(String.valueOf(10));
        instance.push(String.valueOf(20));
        int expResult = 2;
        int result = instance.size();
        if(result==expResult){
            System.out.println("¡La prueba funciona! push: 10,20 / size:"+result);
        }
        else{
            System.out.println("La prueba no funciona");
        }
        
    }  
}
