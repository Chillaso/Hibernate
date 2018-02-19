/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Modelo.Profesor;
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
public class ProfesorImpleTest {
    
    public ProfesorImpleTest() {
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
     * Test of getAll method, of class ProfesorImple.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	ProfesorImple instance = new ProfesorImple();
	Collection<Profesor> expResult = null;
	Collection<Profesor> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarProf method, of class ProfesorImple.
     */
    @Test
    public void testFiltrarProf() {
	System.out.println("filtrarProf");
	String dni = "";
	String nom = "";
	String ape = "";
	String in = "";
	ProfesorImple instance = new ProfesorImple();
	Collection<Profesor> expResult = null;
	Collection<Profesor> result = instance.filtrarProf(dni, nom, ape, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesor method, of class ProfesorImple.
     */
    @Test
    public void testGetProfesor_int() {
	System.out.println("getProfesor");
	int id_profesor = 0;
	ProfesorImple instance = new ProfesorImple();
	Profesor expResult = null;
	Profesor result = instance.getProfesor(id_profesor);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesor method, of class ProfesorImple.
     */
    @Test
    public void testGetProfesor_String_boolean() {
	System.out.println("getProfesor");
	String nombre = "";
	boolean dni = false;
	ProfesorImple instance = new ProfesorImple();
	Profesor expResult = null;
	Profesor result = instance.getProfesor(nombre, dni);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class ProfesorImple.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Profesor a = null;
	ProfesorImple instance = new ProfesorImple();
	instance.insert(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProfesorImple.
     */
    @Test
    public void testDelete() {
	System.out.println("delete");
	Profesor a = null;
	ProfesorImple instance = new ProfesorImple();
	instance.delete(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProfesorImple.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Profesor a = null;
	ProfesorImple instance = new ProfesorImple();
	instance.update(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class ProfesorImple.
     */
    @Test
    public void testSaveOrUpdate() {
	System.out.println("saveOrUpdate");
	Profesor a = null;
	ProfesorImple instance = new ProfesorImple();
	instance.saveOrUpdate(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
