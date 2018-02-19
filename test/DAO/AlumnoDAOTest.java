/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Alumno;
import Modelo.Instituto;
import Util.cambioImposibleException;
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
public class AlumnoDAOTest {
    
    public AlumnoDAOTest() {
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
     * Test of getAll method, of class AlumnoDAO.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	AlumnoDAO instance = new AlumnoDAOImpl();
	Collection<Alumno> expResult = null;
	Collection<Alumno> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAlumno method, of class AlumnoDAO.
     */
    @Test
    public void testGetAlumno_int() {
	System.out.println("getAlumno");
	int id_alum = 0;
	AlumnoDAO instance = new AlumnoDAOImpl();
	Alumno expResult = null;
	Alumno result = instance.getAlumno(id_alum);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAlumno method, of class AlumnoDAO.
     */
    @Test
    public void testGetAlumno_String_boolean() throws Exception {
	System.out.println("getAlumno");
	String nombre = "";
	boolean dni = false;
	AlumnoDAO instance = new AlumnoDAOImpl();
	Alumno expResult = null;
	Alumno result = instance.getAlumno(nombre, dni);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class AlumnoDAO.
     */
    @Test
    public void testGetInstituto() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	AlumnoDAO instance = new AlumnoDAOImpl();
	Instituto expResult = null;
	Instituto result = instance.getInstituto(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAlum method, of class AlumnoDAO.
     */
    @Test
    public void testFiltrarAlum() {
	System.out.println("filtrarAlum");
	String dni = "";
	String nom = "";
	String ape = "";
	int edad = 0;
	String in = "";
	AlumnoDAO instance = new AlumnoDAOImpl();
	Collection<Alumno> expResult = null;
	Collection<Alumno> result = instance.filtrarAlum(dni, nom, ape, edad, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AlumnoDAO.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Alumno a = null;
	AlumnoDAO instance = new AlumnoDAOImpl();
	instance.insert(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AlumnoDAO.
     */
    @Test
    public void testDelete() {
	System.out.println("delete");
	Alumno a = null;
	AlumnoDAO instance = new AlumnoDAOImpl();
	instance.delete(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AlumnoDAO.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Alumno a = null;
	AlumnoDAO instance = new AlumnoDAOImpl();
	instance.update(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class AlumnoDAO.
     */
    @Test
    public void testSaveOrUpdate() {
	System.out.println("saveOrUpdate");
	Alumno a = null;
	AlumnoDAO instance = new AlumnoDAOImpl();
	instance.saveOrUpdate(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    public class AlumnoDAOImpl implements AlumnoDAO {

	public Collection<Alumno> getAll() {
	    return null;
	}

	public Alumno getAlumno(int id_alum) {
	    return null;
	}

	public Alumno getAlumno(String nombre, boolean dni) throws cambioImposibleException {
	    return null;
	}

	public Instituto getInstituto(String nombre) throws cambioImposibleException {
	    return null;
	}

	public Collection<Alumno> filtrarAlum(String dni, String nom, String ape, int edad, String in) {
	    return null;
	}

	public void insert(Alumno a) {
	}

	public void delete(Alumno a) {
	}

	public void update(Alumno a) {
	}

	public void saveOrUpdate(Alumno a) {
	}
    }
    
}
