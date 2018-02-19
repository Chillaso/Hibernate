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
public class AlumnoTest {
    
    public AlumnoTest() {
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
     * Test of getId_alum method, of class Alumno.
     */
    @Test
    public void testGetId_alum() {
	System.out.println("getId_alum");
	Alumno instance = new Alumno();
	int expResult = 0;
	int result = instance.getId_alum();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_alum method, of class Alumno.
     */
    @Test
    public void testSetId_alum() {
	System.out.println("setId_alum");
	int id_alum = 0;
	Alumno instance = new Alumno();
	instance.setId_alum(id_alum);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Alumno.
     */
    @Test
    public void testGetDni() {
	System.out.println("getDni");
	Alumno instance = new Alumno();
	String expResult = "";
	String result = instance.getDni();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Alumno.
     */
    @Test
    public void testSetDni() {
	System.out.println("setDni");
	String dni = "";
	Alumno instance = new Alumno();
	instance.setDni(dni);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
	System.out.println("getNombre");
	Alumno instance = new Alumno();
	String expResult = "";
	String result = instance.getNombre();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
	System.out.println("setNombre");
	String nombre = "";
	Alumno instance = new Alumno();
	instance.setNombre(nombre);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Alumno.
     */
    @Test
    public void testGetApellido() {
	System.out.println("getApellido");
	Alumno instance = new Alumno();
	String expResult = "";
	String result = instance.getApellido();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Alumno.
     */
    @Test
    public void testSetApellido() {
	System.out.println("setApellido");
	String apellido = "";
	Alumno instance = new Alumno();
	instance.setApellido(apellido);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Alumno.
     */
    @Test
    public void testGetEdad() {
	System.out.println("getEdad");
	Alumno instance = new Alumno();
	int expResult = 0;
	int result = instance.getEdad();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Alumno.
     */
    @Test
    public void testSetEdad() {
	System.out.println("setEdad");
	int edad = 0;
	Alumno instance = new Alumno();
	instance.setEdad(edad);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getI method, of class Alumno.
     */
    @Test
    public void testGetI() {
	System.out.println("getI");
	Alumno instance = new Alumno();
	Instituto expResult = null;
	Instituto result = instance.getI();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setI method, of class Alumno.
     */
    @Test
    public void testSetI() {
	System.out.println("setI");
	Instituto i = null;
	Alumno instance = new Alumno();
	instance.setI(i);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
