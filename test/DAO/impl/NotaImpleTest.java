/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

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
public class NotaImpleTest {
    
    public NotaImpleTest() {
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
     * Test of getAll method, of class NotaImple.
     */
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	NotaImple instance = new NotaImple();
	Collection<Nota> expResult = null;
	Collection<Nota> result = instance.getAll();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarNota method, of class NotaImple.
     */
    @Test
    public void testFiltrarNota() {
	System.out.println("filtrarNota");
	String asig = "";
	String alum = "";
	int nota = 0;
	int comparador = 0;
	NotaImple instance = new NotaImple();
	Collection<Nota> expResult = null;
	Collection<Nota> result = instance.filtrarNota(asig, alum, nota, comparador);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class NotaImple.
     */
    @Test
    public void testUpdate() {
	System.out.println("update");
	Nota nota = null;
	NotaImple instance = new NotaImple();
	instance.update(nota);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class NotaImple.
     */
    @Test
    public void testInsert() {
	System.out.println("insert");
	Nota nota = null;
	NotaImple instance = new NotaImple();
	instance.insert(nota);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
