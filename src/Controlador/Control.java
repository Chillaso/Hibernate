package Controlador;

import DAO.impl.AlumnoImple;
import DAO.impl.AsignaturaImple;
import DAO.impl.InstitutoImple;
import DAO.impl.NotaImple;
import DAO.impl.ProfesorImple;
import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Nota;
import Modelo.Profesor;
import Util.cambioImposibleException;
import Vista.Ventana;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

//@author chillaso

public class Control extends Thread{
    
    public static int carga=0;
    public static ArrayList<DefaultTableModel> tablas = new ArrayList<DefaultTableModel>();
    private Ventana v;
    
    public Control(Ventana v){this.v=v;}
    
    private void cargaInicial()
    {
	tablas.add(obtenerAlumnos());
	actualizar();
	tablas.add(obtenerAsignaturas());
	actualizar();	
	tablas.add(obtenerNotas());
	actualizar();	
	tablas.add(obtenerProfesores());
	actualizar();
	tablas.add(obtenerInstitutos());	
	actualizar();
    }

    private void actualizar()
    {
	carga+=20;
	v.repaint();
	v.revalidate();
    }
    
    @Override
    public void run() 
    {
	cargaInicial();
    }        
    
    //------------------ALUMNOS------------------
   
    public static DefaultTableModel obtenerAlumnos()
    {	
	AlumnoImple ai = new AlumnoImple();
	Collection<Alumno> alumnos = ai.getAll();	
	return cargarModeloAlum(alumnos);
    }
    
    public static DefaultTableModel filtrarAlumnos(String dni, String nom, String ape, int edad, String in)
    {
	AlumnoImple ai = new AlumnoImple();
	Collection<Alumno> alumnos = ai.filtrarAlum(dni, nom, ape, edad, in);
	return cargarModeloAlum(alumnos);
    }
    
    private static DefaultTableModel cargarModeloAlum(Collection<Alumno> alumnos)
    {
	DefaultTableModel modelo = new DefaultTableModel();
	//6 columnas
	modelo.addColumn("id_alum");
	modelo.addColumn("DNI");
	modelo.addColumn("Nombre");
	modelo.addColumn("Apellido");
	modelo.addColumn("Edad");
	modelo.addColumn("Instituto");
	
	for(Alumno a : alumnos)
	{
	    Object[] fila = new Object[]{a.getId_alum(),a.getDni(),a.getNombre(),a.getApellido(),a.getEdad(),a.getI().getNombre()};
	    modelo.addRow(fila);
	}	
	return modelo;
    }
    
    public static Alumno obtenerAlumno(int id)
    {
	AlumnoImple a = new AlumnoImple();
	return a.getAlumno(id);	
    }
    
    public static Alumno obtenerAlumno(String identificador, boolean dni) throws cambioImposibleException
    {
	return new AlumnoImple().getAlumno(identificador, dni);
    }
    
    public static boolean insertAlumno(String dni, String nombre, String ape, int edad, String i) throws cambioImposibleException
    {	
	if(dni.length()==9 && edad > 0 && edad < 120 && !nombre.isEmpty() &&
		!ape.isEmpty())
	{
	    AlumnoImple ai = new AlumnoImple();
	    Instituto ins = ai.getInstituto(i);
	    Alumno a = new Alumno(dni,nombre,ape,edad,ins);
	    ai.insert(a);
	    return true;
	}	
	else 
	    return false;
    }    
    
    public static boolean updateAlumno(int id, String dni, String nombre, String ape, int edad, String i) throws cambioImposibleException
    {	
	if(dni.length()==9 && edad > 0 && edad < 120 && !nombre.isEmpty() &&
		!ape.isEmpty())
	{
	    AlumnoImple ai = new AlumnoImple();
	    Instituto ins = ai.getInstituto(i);
	    Alumno a = new Alumno(id,dni,nombre,ape,edad,ins);	    
	    ai.update(a);
	    return true;
	}	
	else 
	    return false;
    }        
    
    public static void updateAlumno(Alumno a)
    {
	AlumnoImple ai = new AlumnoImple();
	ai.update(a);
    }
    
    public static boolean eliminarAlumno(Alumno a)
    {
	try
	{
	    AlumnoImple ai = new AlumnoImple();
	    ai.delete(a);
	    return true;
	}
	catch(Exception e)
	{
	    return false;
	}	
    }
    
    //------------------ASIGNATURAS------------------
        
    public static DefaultTableModel obtenerAsignaturas()
    {	
	AsignaturaImple ai = new AsignaturaImple();
	Collection<Asignatura> asignaturas = ai.getAll();
	return cargarModeloAsig(asignaturas);

    }
    
    public static DefaultTableModel filtrarAsig(String nombre, String prof, String in)
    {
	AsignaturaImple ai = new AsignaturaImple();
	Collection<Asignatura> asigs = ai.filtrarAsig(nombre, prof, in);
	return cargarModeloAsig(asigs);
    }
    
    private static DefaultTableModel cargarModeloAsig(Collection<Asignatura> asignaturas)
    {
	DefaultTableModel modelo = new DefaultTableModel();
	modelo.addColumn("id_asig");
	modelo.addColumn("Nombre");
	modelo.addColumn("Profesor");
	modelo.addColumn("Instituto");
	
	for(Asignatura a : asignaturas)
	{
	    Object[] fila = new Object[]{a.getId_asig(),a.getNombre(),a.getProfesor().getNombre()+" "+a.getProfesor().getApellido()
		    ,a.getInstituto().getNombre()};
	    modelo.addRow(fila);
	}
	
	return modelo;
    }    
    
    public static Asignatura obtenerAsignatura(int id)
    {
	AsignaturaImple a = new AsignaturaImple();
	return a.getAsignatura(id);	
    }
        
    public static boolean insertAsignatura(String nombre, String profesor, String instituto) throws cambioImposibleException
    {	
	if(!nombre.isEmpty() && !profesor.isEmpty() && !instituto.isEmpty())
	{
	    AsignaturaImple ai = new AsignaturaImple();
	    Profesor p = ai.getProfesor(profesor);
	    Instituto i = ai.getInstituto(instituto);
    	    Asignatura a = new Asignatura(p,i,nombre);
	    ai.insert(a);
	    return true;
	}	
	else 
	    return false;
    }    
    
    public static boolean updateAsignatura(int id,String nombre, String profesor, String instituto) throws cambioImposibleException
    {	
	if(!nombre.isEmpty() && !profesor.isEmpty() && !instituto.isEmpty())
	{	 
	    AsignaturaImple ai = new AsignaturaImple();
	    Profesor p = ai.getProfesor(profesor);
	    Instituto i = ai.getInstituto(instituto);
    	    Asignatura a = new Asignatura(id,p,i,nombre);
	    ai.update(a);
	    return true;
	}	
	else 
	    return false;
    }        
    
    public static boolean eliminarAsignatura(Asignatura a)
    {
	try
	{
	    AsignaturaImple ai = new AsignaturaImple();
	    ai.delete(a);
	    return true;
	}
	catch(Exception e)
	{
	    return false;
	}	
    }

    //------------------NOTAS------------------
    
    public static DefaultTableModel obtenerNotas()
    {
	NotaImple ni = new NotaImple();
	Collection<Nota> notas = ni.getAll();
	return cargarModeloNotas(notas);
    }
    
    public static DefaultTableModel filtrarNotas(String asig, String alum, int nota, int comparador)
    {
	NotaImple ni = new NotaImple();
	Collection<Nota> notas = ni.filtrarNota(asig, alum, nota, comparador);
	return cargarModeloNotas(notas);	
    }
    
    private static DefaultTableModel cargarModeloNotas(Collection<Nota> notas)
    {	
	DefaultTableModel modelo = new DefaultTableModel();
	modelo.addColumn("Alumno");
	modelo.addColumn("Asignatura");
	modelo.addColumn("Nota");
	
	for(Nota n : notas)
	{
	    Object[] fila = new Object[]{n.getId_alum().getNombre(),n.getId_asig().getNombre(),n.getNota()};
	    modelo.addRow(fila);
	}
	
	return modelo;	
    }
    
    public static void updateNotas(String al, String as, int n) throws cambioImposibleException
    {
	AlumnoImple ai = new AlumnoImple();
	Alumno a = ai.getAlumno(al, false);
	
	AsignaturaImple asi = new AsignaturaImple();
	Asignatura asig = asi.getAsignatura(as);
	
	NotaImple ni = new NotaImple();
	Nota nota = new Nota(a,asig,n);
	ni.update(nota);
    }
    
    public static void insertNotas(String al, String as, int n) throws cambioImposibleException
    {
	AlumnoImple ai = new AlumnoImple();
	Alumno a = ai.getAlumno(al, false);
	AsignaturaImple asi = new AsignaturaImple();
	Asignatura asig = asi.getAsignatura(as);
	NotaImple ni = new NotaImple();
	Nota nota = new Nota(a,asig,n);
	ni.insert(nota);	
    }
    
    private static DefaultTableModel crearModeloNotas(Collection<Nota> notas)
    {
	DefaultTableModel modelo = new DefaultTableModel();
	//3 columnas
	modelo.addColumn("Alumno");
	modelo.addColumn("Asignatura");
	modelo.addColumn("Nota");
	
	for(Nota n : notas)
	{
	    Object[] fila = new Object[]{n.getId_alum(),n.getId_asig(),n.getNota()};
	    modelo.addRow(fila);
	}
	return modelo;
    }
    
    //-----------------PROFESORES---------------
    
    public static DefaultTableModel obtenerProfesores()
    {
	ProfesorImple pi = new ProfesorImple();
	Collection<Profesor> profesores = pi.getAll();
	return cargarModeloProf(profesores);
    }
    
    public static DefaultTableModel filtrarProfs(String dni, String nom, String ape, String in)
    {
	ProfesorImple pi = new ProfesorImple();
	Collection<Profesor> profs = pi.filtrarProf(dni, nom, ape, in);
	return cargarModeloProf(profs);
    }
    
    private static DefaultTableModel cargarModeloProf(Collection<Profesor> profesores)
    {
	DefaultTableModel modelo = new DefaultTableModel();
	modelo.addColumn("id_profesor");
	modelo.addColumn("DNI");
	modelo.addColumn("Nombre");
	modelo.addColumn("Apellido");
	modelo.addColumn("Instituto");
	
	for(Profesor p : profesores)
	{
	    Object[] fila = new Object[]{p.getId_profesor(),p.getDni(),p.getNombre(),p.getApellido(),p.getI().getNombre()};
	    modelo.addRow(fila);
	}	
	return modelo;
    }
    
    public static Profesor obtenerProfesor(int id)
    {
	ProfesorImple pi = new ProfesorImple();
	return pi.getProfesor(id);
    }
    
    public static void eliminarProfesor(Profesor p)
    {
	new ProfesorImple().delete(p);
    }
    
    public static void updateProfesor(int id, String dni, String nombre, String apellido, String i) throws cambioImposibleException
    {
	InstitutoImple ii = new InstitutoImple();
	Instituto instituto = ii.getInstituto(i);
	new ProfesorImple().update(new Profesor(id,dni,nombre,apellido,instituto));
    }
    
    public static void insertProfesor(String dni, String nombre, String ape, String insti) throws cambioImposibleException
    {
	InstitutoImple ii = new InstitutoImple();
	Instituto instituto = ii.getInstituto(insti);
	new ProfesorImple().insert(new Profesor(dni,nombre,ape,instituto));
    }
    
    //------------------INSTITUTOS----------------
    
    public static DefaultTableModel obtenerInstitutos()
    {
	InstitutoImple ii = new InstitutoImple();
	Collection<Instituto> institutos = ii.getAll();
	return cargarModeloInsti(institutos);
    }

    public static DefaultComboBoxModel rellenarCombo()
    {
	InstitutoImple ii = new InstitutoImple();
	Collection<Instituto> institutos = ii.getAll();
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	for (Instituto i : institutos)
	{
	    modelo.addElement(i.getNombre());
	}
	return modelo;
    }
    
    public static Instituto obtenerInstituto(String nombre) throws cambioImposibleException
    {
	InstitutoImple ii = new InstitutoImple();
	Instituto i = ii.getInstituto(nombre);
	return i;
    }
    
    public static DefaultTableModel filtrarInstitutos(String nom, String loc)
    {
	InstitutoImple ii = new InstitutoImple();
	Collection<Instituto> institutos = ii.filtrarInstis(nom, loc);
	return cargarModeloInsti(institutos);	
    }
    
    private static DefaultTableModel cargarModeloInsti(Collection<Instituto>institutos)
    {
	DefaultTableModel modelo = new DefaultTableModel();
	modelo.addColumn("id_instituto");
	modelo.addColumn("Nombre");
	modelo.addColumn("Localidad");
	
	for(Instituto i : institutos)
	{
	    Object[] fila = new Object[]{i.getId_instituto(),i.getNombre(),i.getLocalidad()};
	    modelo.addRow(fila);
	}
	
	return modelo;
    }
    
    public static void updateInstituto(int id, String nombre, String localidad)
    {
	InstitutoImple ii = new InstitutoImple();
	Instituto i = new Instituto(id,nombre,localidad);
	ii.update(i);
    }
    
    public static void eliminarInstituto(Instituto i)
    {
	new InstitutoImple().delete(i);
    }
    
    public static void insertInstituto(String nombre, String localidad)
    {
	new InstitutoImple().insert(new Instituto(nombre,localidad));
    }
}
