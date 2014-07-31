/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo3;

import java.util.ArrayList;
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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of cambiar method, of class BubbleSort.
     */
    @Test
    public void testCambiar() {
        System.out.println("cambiar");
        ArrayList <Integer> numerosI = new ArrayList <Integer>();
        int i = 0;
        int j = 1;
        numerosI.add(5);
        numerosI.add(1);
        BubbleSort instance = new BubbleSort();
        instance.cambiar(numerosI, i, j);
        System.out.println(numerosI);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of bubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        ArrayList <Integer> numerosI = new ArrayList <Integer>();
        numerosI.add(1);
        numerosI.add(4);
        numerosI.add(3);
        numerosI.add(2);
        BubbleSort instance = new BubbleSort();
        instance.bubbleSort(numerosI);
        System.out.println(numerosI);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
