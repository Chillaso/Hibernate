/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import Modelo.Asignatura;
import Modelo.Instituto;
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
public class AsignaturaImpleTest {
    
    public AsignaturaImpleTest() {
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
     * Test of getAll method, of class AsignaturaImple.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	AsignaturaImple instance = new AsignaturaImple();
	Collection<Asignatura> expResult = null;
	Collection<Asignatura> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAsig method, of class AsignaturaImple.
     */
    @Test
    public void testFiltrarAsig() {
	System.out.println("filtrarAsig");
	String nom = "";
	String prof = "";
	String in = "";
	AsignaturaImple instance = new AsignaturaImple();
	Collection<Asignatura> expResult = null;
	Collection<Asignatura> result = instance.filtrarAsig(nom, prof, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAsignatura method, of class AsignaturaImple.
     */
    @Test
    public void testGetAsignatura_int() {
	System.out.println("getAsignatura");
	int id_asig = 0;
	AsignaturaImple instance = new AsignaturaImple();
	Asignatura expResult = null;
	Asignatura result = instance.getAsignatura(id_asig);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAsignatura method, of class AsignaturaImple.
     */
    @Test
    public void testGetAsignatura_String() throws Exception {
	System.out.println("getAsignatura");
	String nombre = "";
	AsignaturaImple instance = new AsignaturaImple();
	Asignatura expResult = null;
	Asignatura result = instance.getAsignatura(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class AsignaturaImple.
     */
    @Test
    public void testGetInstituto() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	AsignaturaImple instance = new AsignaturaImple();
	Instituto expResult = null;
	Instituto result = instance.getInstituto(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesor method, of class AsignaturaImple.
     */
    @Test
    public void testGetProfesor() throws Exception {
	System.out.println("getProfesor");
	String nombre = "";
	AsignaturaImple instance = new AsignaturaImple();
	Profesor expResult = null;
	Profesor result = instance.getProfesor(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AsignaturaImple.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Asignatura a = null;
	AsignaturaImple instance = new AsignaturaImple();
	instance.insert(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AsignaturaImple.
     */
    @Test
    public void testDelete() {
	System.out.println("delete");
	Asignatura a = null;
	AsignaturaImple instance = new AsignaturaImple();
	instance.delete(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AsignaturaImple.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Asignatura a = null;
	AsignaturaImple instance = new AsignaturaImple();
	instance.update(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class AsignaturaImple.
     */
    @Test
    public void testSaveOrUpdate() {
	System.out.println("saveOrUpdate");
	Asignatura a = null;
	AsignaturaImple instance = new AsignaturaImple();
	instance.saveOrUpdate(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
