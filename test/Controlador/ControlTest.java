/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Profesor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
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
public class ControlTest {
    
    public ControlTest() {
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
     * Test of run method, of class Control.
     */
    @Test
    public void testRun() {
	System.out.println("run");
	Control instance = null;
	instance.run();
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAlumnos method, of class Control.
     */
    @Test
    public void testObtenerAlumnos() {
	System.out.println("obtenerAlumnos");
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.obtenerAlumnos();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAlumnos method, of class Control.
     */
    @Test
    public void testFiltrarAlumnos() {
	System.out.println("filtrarAlumnos");
	String dni = "";
	String nom = "";
	String ape = "";
	int edad = 0;
	String in = "";
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.filtrarAlumnos(dni, nom, ape, edad, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAlumno method, of class Control.
     */
    @Test
    public void testObtenerAlumno_int() {
	System.out.println("obtenerAlumno");
	int id = 0;
	Alumno expResult = null;
	Alumno result = Control.obtenerAlumno(id);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAlumno method, of class Control.
     */
    @Test
    public void testObtenerAlumno_String_boolean() throws Exception {
	System.out.println("obtenerAlumno");
	String identificador = "";
	boolean dni = false;
	Alumno expResult = null;
	Alumno result = Control.obtenerAlumno(identificador, dni);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insertAlumno method, of class Control.
     */
    @Test
    public void testInsertAlumno() throws Exception {
	System.out.println("insertAlumno");
	String dni = "";
	String nombre = "";
	String ape = "";
	int edad = 0;
	String i = "";
	boolean expResult = false;
	boolean result = Control.insertAlumno(dni, nombre, ape, edad, i);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateAlumno method, of class Control.
     */
    @Test
    public void testUpdateAlumno_6args() throws Exception {
	System.out.println("updateAlumno");
	int id = 0;
	String dni = "";
	String nombre = "";
	String ape = "";
	int edad = 0;
	String i = "";
	boolean expResult = false;
	boolean result = Control.updateAlumno(id, dni, nombre, ape, edad, i);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateAlumno method, of class Control.
     */
    @Test
    public void testUpdateAlumno_Alumno() {
	System.out.println("updateAlumno");
	Alumno a = null;
	Control.updateAlumno(a);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAlumno method, of class Control.
     */
    @Test
    public void testEliminarAlumno() {
	System.out.println("eliminarAlumno");
	Alumno a = null;
	boolean expResult = false;
	boolean result = Control.eliminarAlumno(a);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAsignaturas method, of class Control.
     */
    @Test
    public void testObtenerAsignaturas() {
	System.out.println("obtenerAsignaturas");
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.obtenerAsignaturas();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAsig method, of class Control.
     */
    @Test
    public void testFiltrarAsig() {
	System.out.println("filtrarAsig");
	String nombre = "";
	String prof = "";
	String in = "";
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.filtrarAsig(nombre, prof, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAsignatura method, of class Control.
     */
    @Test
    public void testObtenerAsignatura() {
	System.out.println("obtenerAsignatura");
	int id = 0;
	Asignatura expResult = null;
	Asignatura result = Control.obtenerAsignatura(id);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insertAsignatura method, of class Control.
     */
    @Test
    public void testInsertAsignatura() throws Exception {
	System.out.println("insertAsignatura");
	String nombre = "";
	String profesor = "";
	String instituto = "";
	boolean expResult = false;
	boolean result = Control.insertAsignatura(nombre, profesor, instituto);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateAsignatura method, of class Control.
     */
    @Test
    public void testUpdateAsignatura() throws Exception {
	System.out.println("updateAsignatura");
	int id = 0;
	String nombre = "";
	String profesor = "";
	String instituto = "";
	boolean expResult = false;
	boolean result = Control.updateAsignatura(id, nombre, profesor, instituto);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAsignatura method, of class Control.
     */
    @Test
    public void testEliminarAsignatura() {
	System.out.println("eliminarAsignatura");
	Asignatura a = null;
	boolean expResult = false;
	boolean result = Control.eliminarAsignatura(a);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNotas method, of class Control.
     */
    @Test
    public void testObtenerNotas() {
	System.out.println("obtenerNotas");
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.obtenerNotas();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarNotas method, of class Control.
     */
    @Test
    public void testFiltrarNotas() {
	System.out.println("filtrarNotas");
	String asig = "";
	String alum = "";
	int nota = 0;
	int comparador = 0;
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.filtrarNotas(asig, alum, nota, comparador);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateNotas method, of class Control.
     */
    @Test
    public void testUpdateNotas() throws Exception {
	System.out.println("updateNotas");
	String al = "";
	String as = "";
	int n = 0;
	Control.updateNotas(al, as, n);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insertNotas method, of class Control.
     */
    @Test
    public void testInsertNotas() throws Exception {
	System.out.println("insertNotas");
	String al = "";
	String as = "";
	int n = 0;
	Control.insertNotas(al, as, n);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProfesores method, of class Control.
     */
    @Test
    public void testObtenerProfesores() {
	System.out.println("obtenerProfesores");
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.obtenerProfesores();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarProfs method, of class Control.
     */
    @Test
    public void testFiltrarProfs() {
	System.out.println("filtrarProfs");
	String dni = "";
	String nom = "";
	String ape = "";
	String in = "";
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.filtrarProfs(dni, nom, ape, in);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProfesor method, of class Control.
     */
    @Test
    public void testObtenerProfesor() {
	System.out.println("obtenerProfesor");
	int id = 0;
	Profesor expResult = null;
	Profesor result = Control.obtenerProfesor(id);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProfesor method, of class Control.
     */
    @Test
    public void testEliminarProfesor() {
	System.out.println("eliminarProfesor");
	Profesor p = null;
	Control.eliminarProfesor(p);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfesor method, of class Control.
     */
    @Test
    public void testUpdateProfesor() throws Exception {
	System.out.println("updateProfesor");
	int id = 0;
	String dni = "";
	String nombre = "";
	String apellido = "";
	String i = "";
	Control.updateProfesor(id, dni, nombre, apellido, i);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerInstitutos method, of class Control.
     */
    @Test
    public void testObtenerInstitutos() {
	System.out.println("obtenerInstitutos");
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.obtenerInstitutos();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarCombo method, of class Control.
     */
    @Test
    public void testRellenarCombo() {
	System.out.println("rellenarCombo");
	DefaultComboBoxModel expResult = null;
	DefaultComboBoxModel result = Control.rellenarCombo();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerInstituto method, of class Control.
     */
    @Test
    public void testObtenerInstituto() throws Exception {
	System.out.println("obtenerInstituto");
	String nombre = "";
	Instituto expResult = null;
	Instituto result = Control.obtenerInstituto(nombre);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarInstitutos method, of class Control.
     */
    @Test
    public void testFiltrarInstitutos() {
	System.out.println("filtrarInstitutos");
	String nom = "";
	String loc = "";
	DefaultTableModel expResult = null;
	DefaultTableModel result = Control.filtrarInstitutos(nom, loc);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of updateInstituto method, of class Control.
     */
    @Test
    public void testUpdateInstituto() {
	System.out.println("updateInstituto");
	int id = 0;
	String nombre = "";
	String localidad = "";
	Control.updateInstituto(id, nombre, localidad);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarInstituto method, of class Control.
     */
    @Test
    public void testEliminarInstituto() {
	System.out.println("eliminarInstituto");
	Instituto i = null;
	Control.eliminarInstituto(i);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of insertInstituto method, of class Control.
     */
    @Test
    public void testInsertInstituto() {
	System.out.println("insertInstituto");
	String nombre = "";
	String localidad = "";
	Control.insertInstituto(nombre, localidad);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
