package DAO.impl;

import Modelo.Instituto;
import Util.cambioImposibleException;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
public class InstitutoImpleTest {
    
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	InstitutoImple instance = new InstitutoImple();
	int expResult = 4;
	int result = instance.getAll().size();
	assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInstituto_int() {
	System.out.println("getInstituto");
	int id_instituto = 4;
	InstitutoImple instance = new InstitutoImple();
	String expResult = "SAFA";
	String result = instance.getInstituto(id_instituto).getNombre();
	assertEquals(expResult, result);
    }

    @Test(expected=cambioImposibleException.class)
    public void testGetInstituto_String() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	InstitutoImple instance = new InstitutoImple();
	String expResult = "SAFA";
	String result = instance.getInstituto(nombre).getNombre();
	assertEquals(expResult, result);
    }
}
