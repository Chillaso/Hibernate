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
public class NotaTest {
    
    public NotaTest() {
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
     * Test of getId_alum method, of class Nota.
     */
    @Test
    public void testGetId_alum() {
	System.out.println("getId_alum");
	Nota instance = new Nota();
	Alumno expResult = null;
	Alumno result = instance.getId_alum();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_alum method, of class Nota.
     */
    @Test
    public void testSetId_alum() {
	System.out.println("setId_alum");
	Alumno id_alum = null;
	Nota instance = new Nota();
	instance.setId_alum(id_alum);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getId_asig method, of class Nota.
     */
    @Test
    public void testGetId_asig() {
	System.out.println("getId_asig");
	Nota instance = new Nota();
	Asignatura expResult = null;
	Asignatura result = instance.getId_asig();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asig method, of class Nota.
     */
    @Test
    public void testSetId_asig() {
	System.out.println("setId_asig");
	Asignatura id_asig = null;
	Nota instance = new Nota();
	instance.setId_asig(id_asig);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getNota method, of class Nota.
     */
    @Test
    public void testGetNota() {
	System.out.println("getNota");
	Nota instance = new Nota();
	int expResult = 0;
	int result = instance.getNota();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class Nota.
     */
    @Test
    public void testSetNota() {
	System.out.println("setNota");
	int nota = 0;
	Nota instance = new Nota();
	instance.setNota(nota);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
