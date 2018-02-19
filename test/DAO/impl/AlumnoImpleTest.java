/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Modelo.Alumno;
import Modelo.Instituto;
import java.util.Collection;
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
public class AlumnoImpleTest {
    
    public AlumnoImpleTest() {
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
     * Test of getAll method, of class AlumnoImple.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	AlumnoImple instance = new AlumnoImple();
	Collection<Alumno> expResult = null;
	Collection<Alumno> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAlum method, of class AlumnoImple.
     */
    @Test
    public void testFiltrarAlum() {
	System.out.println("filtrarAlum");
	String dni = "";
	String nom = "";
	String ape = "";
	int edad = 0;
	String in = "";
	AlumnoImple instance = new AlumnoImple();
	Collection<Alumno> expResult = null;
	Collection<Alumno> result = instance.filtrarAlum(dni, nom, ape, edad, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAlumno method, of class AlumnoImple.
     */
    @Test
    public void testGetAlumno_int() {
	System.out.println("getAlumno");
	int id_alum = 0;
	AlumnoImple instance = new AlumnoImple();
	Alumno expResult = null;
	Alumno result = instance.getAlumno(id_alum);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAlumno method, of class AlumnoImple.
     */
    @Test
    public void testGetAlumno_String_boolean() throws Exception {
	System.out.println("getAlumno");
	String identificador = "";
	boolean dni = false;
	AlumnoImple instance = new AlumnoImple();
	Alumno expResult = null;
	Alumno result = instance.getAlumno(identificador, dni);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class AlumnoImple.
     */
    @Test
    public void testGetInstituto() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	AlumnoImple instance = new AlumnoImple();
	Instituto expResult = null;
	Instituto result = instance.getInstituto(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AlumnoImple.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Alumno a = null;
	AlumnoImple instance = new AlumnoImple();
	instance.insert(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AlumnoImple.
     */
    @Test
    public void testDelete() {
	System.out.println("delete");
	Alumno a = null;
	AlumnoImple instance = new AlumnoImple();
	instance.delete(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AlumnoImple.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Alumno a = null;
	AlumnoImple instance = new AlumnoImple();
	instance.update(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class AlumnoImple.
     */
    @Test
    public void testSaveOrUpdate() {
	System.out.println("saveOrUpdate");
	Alumno a = null;
	AlumnoImple instance = new AlumnoImple();
	instance.saveOrUpdate(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
