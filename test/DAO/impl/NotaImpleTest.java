package DAO.impl;

import Modelo.Nota;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class NotaImpleTest {
    
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	NotaImple instance = new NotaImple();
	int expResult = 10;
	int result = instance.getAll().size();
	assertEquals(expResult, result);
    }
}
