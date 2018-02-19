/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.event.ListSelectionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chillaso
 */
public class TableListenerTest {
    
    public TableListenerTest() {
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
     * Test of valueChanged method, of class TableListener.
     */
    @Test
    public void testValueChanged() {
	System.out.println("valueChanged");
	ListSelectionEvent e = null;
	TableListener instance = null;
	instance.valueChanged(e);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getParams method, of class TableListener.
     */
    @Test
    public void testGetParams() {
	System.out.println("getParams");
	TableListener instance = null;
	Object[] expResult = null;
	Object[] result = instance.getParams();
	assertArrayEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
