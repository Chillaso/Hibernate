/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class InstitutoTest {
    
    public InstitutoTest() {
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
     * Test of getId_instituto method, of class Instituto.
     */
    @Test
    public void testGetId_instituto() {
	System.out.println("getId_instituto");
	Instituto instance = new Instituto();
	int expResult = 0;
	int result = instance.getId_instituto();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_instituto method, of class Instituto.
     */
    @Test
    public void testSetId_instituto() {
	System.out.println("setId_instituto");
	int id_instituto = 0;
	Instituto instance = new Instituto();
	instance.setId_instituto(id_instituto);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Instituto.
     */
    @Test
    public void testGetNombre() {
	System.out.println("getNombre");
	Instituto instance = new Instituto();
	String expResult = "";
	String result = instance.getNombre();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Instituto.
     */
    @Test
    public void testSetNombre() {
	System.out.println("setNombre");
	String nombre = "";
	Instituto instance = new Instituto();
	instance.setNombre(nombre);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalidad method, of class Instituto.
     */
    @Test
    public void testGetLocalidad() {
	System.out.println("getLocalidad");
	Instituto instance = new Instituto();
	String expResult = "";
	String result = instance.getLocalidad();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalidad method, of class Instituto.
     */
    @Test
    public void testSetLocalidad() {
	System.out.println("setLocalidad");
	String localidad = "";
	Instituto instance = new Instituto();
	instance.setLocalidad(localidad);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
