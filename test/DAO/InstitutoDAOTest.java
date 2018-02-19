/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class InstitutoDAOTest {
    
    public InstitutoDAOTest() {
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
     * Test of getAll method, of class InstitutoDAO.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	InstitutoDAO instance = new InstitutoDAOImpl();
	Collection<Instituto> expResult = null;
	Collection<Instituto> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class InstitutoDAO.
     */
    @Test
    public void testGetInstituto_int() {
	System.out.println("getInstituto");
	int id_instituto = 0;
	InstitutoDAO instance = new InstitutoDAOImpl();
	Instituto expResult = null;
	Instituto result = instance.getInstituto(id_instituto);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituto method, of class InstitutoDAO.
     */
    @Test
    public void testGetInstituto_String() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	InstitutoDAO instance = new InstitutoDAOImpl();
	Instituto expResult = null;
	Instituto result = instance.getInstituto(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarInstis method, of class InstitutoDAO.
     */
    @Test
    public void testFiltrarInstis() {
	System.out.println("filtrarInstis");
	String nom = "";
	String localidad = "";
	InstitutoDAO instance = new InstitutoDAOImpl();
	Collection<Instituto> expResult = null;
	Collection<Instituto> result = instance.filtrarInstis(nom, localidad);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class InstitutoDAO.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Instituto a = null;
	InstitutoDAO instance = new InstitutoDAOImpl();
	instance.insert(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class InstitutoDAO.
     */
    @Test
    public void testDelete() {
	System.out.println("delete");
	Instituto a = null;
	InstitutoDAO instance = new InstitutoDAOImpl();
	instance.delete(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class InstitutoDAO.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Instituto a = null;
	InstitutoDAO instance = new InstitutoDAOImpl();
	instance.update(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class InstitutoDAO.
     */
    @Test
    public void testSaveOrUpdate() {
	System.out.println("saveOrUpdate");
	Instituto a = null;
	InstitutoDAO instance = new InstitutoDAOImpl();
	instance.saveOrUpdate(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    public class InstitutoDAOImpl implements InstitutoDAO {

	public Collection<Instituto> getAll() {
	    return null;
	}

	public Instituto getInstituto(int id_instituto) {
	    return null;
	}

	public Instituto getInstituto(String nombre) throws cambioImposibleException {
	    return null;
	}

	public Collection<Instituto> filtrarInstis(String nom, String localidad) {
	    return null;
	}

	public void insert(Instituto a) {
	}

	public void delete(Instituto a) {
	}

	public void update(Instituto a) {
	}

	public void saveOrUpdate(Instituto a) {
	}
    }
    
}
