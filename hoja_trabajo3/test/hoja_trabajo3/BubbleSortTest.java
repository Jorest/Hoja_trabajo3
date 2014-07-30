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
     * Test of abrir method, of class BubbleSort.
     */
    @Test
    public void testAbrir() throws Exception {
        System.out.println("abrir");
        BubbleSort instance = new BubbleSort();
        instance.abrir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarLista method, of class BubbleSort.
     */
    @Test
    public void testGenerarLista() throws Exception {
        System.out.println("generarLista");
        BubbleSort instance = new BubbleSort();
        instance.generarLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarListaInt method, of class BubbleSort.
     */
    @Test
    public void testGenerarListaInt() {
        System.out.println("generarListaInt");
        ArrayList<String> numerosS = null;
        BubbleSort instance = new BubbleSort();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.generarListaInt(numerosS);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiar method, of class BubbleSort.
     */
    @Test
    public void testCambiar() {
        System.out.println("cambiar");
        ArrayList<Integer> numerosI = null;
        int i = 0;
        int j = 0;
        BubbleSort instance = new BubbleSort();
        instance.cambiar(numerosI, i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        ArrayList<Integer> numerosI = null;
        BubbleSort instance = new BubbleSort();
        instance.bubbleSort(numerosI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
