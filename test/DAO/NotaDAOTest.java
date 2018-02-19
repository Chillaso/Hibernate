/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Nota;
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
public class NotaDAOTest {
    
    public NotaDAOTest() {
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
     * Test of filtrarNota method, of class NotaDAO.
     */
    @Test
    public void testFiltrarNota() {
	System.out.println("filtrarNota");
	String asig = "";
	String alum = "";
	int nota = 0;
	int comparador = 0;
	NotaDAO instance = new NotaDAOImpl();
	Collection<Nota> expResult = null;
	Collection<Nota> result = instance.filtrarNota(asig, alum, nota, comparador);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class NotaDAO.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	NotaDAO instance = new NotaDAOImpl();
	Collection<Nota> expResult = null;
	Collection<Nota> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class NotaDAO.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Nota nota = null;
	NotaDAO instance = new NotaDAOImpl();
	instance.update(nota);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class NotaDAO.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Nota nota = null;
	NotaDAO instance = new NotaDAOImpl();
	instance.insert(nota);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    public class NotaDAOImpl implements NotaDAO {

	public Collection<Nota> filtrarNota(String asig, String alum, int nota, int comparador) {
	    return null;
	}

	public Collection<Nota> getAll() {
	    return null;
	}

	public void update(Nota nota) {
	}

	public void insert(Nota nota) {
	}
    }
    
}
