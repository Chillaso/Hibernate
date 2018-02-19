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
public class AsignaturaTest {
    
    public AsignaturaTest() {
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
     * Test of getId_asig method, of class Asignatura.
     */
    @Test
    public void testGetId_asig() {
	System.out.println("getId_asig");
	Asignatura instance = new Asignatura();
	int expResult = 0;
	int result = instance.getId_asig();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asig method, of class Asignatura.
     */
    @Test
    public void testSetId_asig() {
	System.out.println("setId_asig");
	int id_asig = 0;
	Asignatura instance = new Asignatura();
	instance.setId_asig(id_asig);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesor method, of class Asignatura.
     */
    @Test
    public void testGetProfesor() {
	System.out.println("getProfesor");
	Asignatura instance = new Asignatura();
	Profesor expResult = null;
	Profesor result = instance.getProfesor();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setProfesor method, of class Asignatura.
     */
    @Test
    public void testSetProfesor() {
	System.out.println("setProfesor");
	Profesor profesor = null;
	Asignatura instance = new Asignatura();
	instance.setProfesor(profesor);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class Asignatura.
     */
    @Test
    public void testGetInstituto() {
	System.out.println("getInstituto");
	Asignatura instance = new Asignatura();
	Instituto expResult = null;
	Instituto result = instance.getInstituto();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setInstituto method, of class Asignatura.
     */
    @Test
    public void testSetInstituto() {
	System.out.println("setInstituto");
	Instituto instituto = null;
	Asignatura instance = new Asignatura();
	instance.setInstituto(instituto);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Asignatura.
     */
    @Test
    public void testGetNombre() {
	System.out.println("getNombre");
	Asignatura instance = new Asignatura();
	String expResult = "";
	String result = instance.getNombre();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Asignatura.
     */
    @Test
    public void testSetNombre() {
	System.out.println("setNombre");
	String nombre = "";
	Asignatura instance = new Asignatura();
	instance.setNombre(nombre);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
