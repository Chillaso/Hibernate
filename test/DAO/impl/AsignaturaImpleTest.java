package DAO.impl;

import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Profesor;
import Util.cambioImposibleException;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class AsignaturaImpleTest {

    @Test
    public void testGetAll() {
	System.out.println("getAll");
	AsignaturaImple instance = new AsignaturaImple();
	int expResult = 20;
	int result = instance.getAll().size();
	assertEquals(expResult, result);
    }

    @Test
    public void testGetAsignatura_int() {
	System.out.println("getAsignatura");
	int id_asig = 1;
	AsignaturaImple instance = new AsignaturaImple();
	String expResult = "Acceso a Datos";
	String result = instance.getAsignatura(id_asig).getNombre();
	assertEquals(expResult, result);
    }

    @Test
    public void testGetAsignatura_String() throws Exception {
	System.out.println("getAsignatura");
	String nombre = "Acceso a Datos";
	AsignaturaImple instance = new AsignaturaImple();
	String expResult = "Acceso a Datos";
	String result = instance.getAsignatura(nombre).getNombre();
	assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInstituto() throws Exception {
	System.out.println("getInstituto");
	String nombre = "Almunia";
	AsignaturaImple instance = new AsignaturaImple();
	String expResult = "Almunia";
	String result = instance.getInstituto(nombre).getNombre();
	assertEquals(expResult, result);
    }
    
    @Test(expected=cambioImposibleException.class)
    public void testGetInstituto2() throws Exception {
	System.out.println("getInstituto");
	String nombre = "";
	AsignaturaImple instance = new AsignaturaImple();
	String expResult = "Almunia";
	String result = instance.getInstituto(nombre).getNombre();
	assertEquals(expResult, result);
    }

    @Test
    public void testGetProfesor() throws Exception {
	System.out.println("getProfesor");
	String nombre = "Luis";
	AsignaturaImple instance = new AsignaturaImple();
	String expResult = "Luis";
	String result = instance.getProfesor(nombre).getNombre();
	assertEquals(expResult, result);
    }    
}
