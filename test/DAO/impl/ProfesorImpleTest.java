package DAO.impl;

import Modelo.Profesor;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorImpleTest {
    
    @Test
    public void testGetAll() {
	System.out.println("getAll");
	ProfesorImple instance = new ProfesorImple();
	int expResult = 10;
	int result = instance.getAll().size();
	assertEquals(expResult, result);
    }

    @Test
    public void testGetProfesor_int() {
	System.out.println("getProfesor");
	int id_profesor = 1;
	ProfesorImple instance = new ProfesorImple();
	String expResult = "00112233A";
	String result = instance.getProfesor(id_profesor).getDni();
	assertEquals(expResult, result);
    }
    
    @Test
    public void testGetProfesor_String_boolean() {
	System.out.println("getProfesor");
	String nombre = "Luis";
	boolean dni = false;
	ProfesorImple instance = new ProfesorImple();
	String expResult = "Luis";
	String result = instance.getProfesor(nombre, dni).getNombre();
	assertEquals(expResult, result);
    }
}
