/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

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
public class cambioImposibleExceptionTest {
    
    public cambioImposibleExceptionTest() {
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
     * Test of toString method, of class cambioImposibleException.
     */
    @Test
    public void testToString() {
	System.out.println("toString");
	cambioImposibleException instance = null;
	String expResult = "";
	String result = instance.toString();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class cambioImposibleException.
     */
    @Test
    public void testGetMessage() {
	System.out.println("getMessage");
	cambioImposibleException instance = null;
	String expResult = "";
	String result = instance.getMessage();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
