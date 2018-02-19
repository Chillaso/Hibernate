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
public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of getId_profesor method, of class Profesor.
     */
    @Test
    public void testGetId_profesor() {
	System.out.println("getId_profesor");
	Profesor instance = new Profesor();
	int expResult = 0;
	int result = instance.getId_profesor();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_profesor method, of class Profesor.
     */
    @Test
    public void testSetId_profesor() {
	System.out.println("setId_profesor");
	int id_profesor = 0;
	Profesor instance = new Profesor();
	instance.setId_profesor(id_profesor);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Profesor.
     */
    @Test
    public void testGetDni() {
	System.out.println("getDni");
	Profesor instance = new Profesor();
	String expResult = "";
	String result = instance.getDni();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Profesor.
     */
    @Test
    public void testSetDni() {
	System.out.println("setDni");
	String dni = "";
	Profesor instance = new Profesor();
	instance.setDni(dni);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Profesor.
     */
    @Test
    public void testGetNombre() {
	System.out.println("getNombre");
	Profesor instance = new Profesor();
	String expResult = "";
	String result = instance.getNombre();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Profesor.
     */
    @Test
    public void testSetNombre() {
	System.out.println("setNombre");
	String nombre = "";
	Profesor instance = new Profesor();
	instance.setNombre(nombre);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Profesor.
     */
    @Test
    public void testGetApellido() {
	System.out.println("getApellido");
	Profesor instance = new Profesor();
	String expResult = "";
	String result = instance.getApellido();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Profesor.
     */
    @Test
    public void testSetApellido() {
	System.out.println("setApellido");
	String apellido = "";
	Profesor instance = new Profesor();
	instance.setApellido(apellido);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getI method, of class Profesor.
     */
    @Test
    public void testGetI() {
	System.out.println("getI");
	Profesor instance = new Profesor();
	Instituto expResult = null;
	Instituto result = instance.getI();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setI method, of class Profesor.
     */
    @Test
    public void testSetI() {
	System.out.println("setI");
	Instituto i = null;
	Profesor instance = new Profesor();
	instance.setI(i);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
