package DAO.impl;

import Modelo.Alumno;
import Modelo.Instituto;
import Util.cambioImposibleException;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlumnoImpleTest {
   
    @Test
    public void testGetAll() {
	AlumnoImple instance = new AlumnoImple();
	int exp = 10;
	int result = instance.getAll().size();
	assertEquals(exp, result);
    }

    @Test
    public void testGetAlumno_String_boolean() throws Exception {
	String identificador = "Carlos";
	boolean dni = false;
	AlumnoImple instance = new AlumnoImple();
	String expResult = instance.getAlumno("32083687K",true).getNombre();
	String result = instance.getAlumno(identificador, dni).getNombre();
	assertEquals(expResult, result);
    }
    
    @Test(expected = cambioImposibleException.class)
    public void testGetAlumno_String_boolean2() throws Exception {
	String identificador = "1";
	boolean dni = false;
	AlumnoImple instance = new AlumnoImple();
	Alumno expResult = instance.getAlumno("32083687K",true);
	Alumno result = instance.getAlumno(identificador, dni);
	assertEquals(expResult, result);
    }

    @Test
    public void testGetInstituto() throws Exception {
	String nombre = "Almunia";
	AlumnoImple instance = new AlumnoImple();
	String expResult = new Instituto(1,"Almunia","Jerez de la Frontera").getNombre();
	String result = instance.getInstituto(nombre).getNombre();
	assertEquals(expResult, result);
    }
}
