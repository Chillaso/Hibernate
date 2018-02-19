/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
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
public class VentanaTest {
    
    public VentanaTest() {
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
     * Test of paint method, of class Ventana.
     */
    @Test
    public void testPaint() {
	System.out.println("paint");
	Graphics g = null;
	Ventana instance = new Ventana();
	instance.paint(g);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Ventana.
     */
    @Test
    public void testMain() {
	System.out.println("main");
	String[] args = null;
	Ventana.main(args);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of isConectado method, of class Ventana.
     */
    @Test
    public void testIsConectado() {
	System.out.println("isConectado");
	Ventana instance = new Ventana();
	boolean expResult = false;
	boolean result = instance.isConectado();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
