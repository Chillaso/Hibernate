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
import Vista.Ventana;
import java.util.ArrayList;
import java.util.Collection;
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
    
    public static Alumno obtenerAlumno(String identificador, boolean dni)
    {
	return new AlumnoImple().getAlumno(identificador, dni);
    }
    
    public static boolean insertAlumno(String dni, String nombre, String ape, int edad, String i)
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
    
    public static boolean updateAlumno(int id, String dni, String nombre, String ape, int edad, String i)
    {	
	if(dni.length()==9 && edad > 0 && edad < 120 && !nombre.isEmpty() &&
		!ape.isEmpty())
	{
	    AlumnoImple ai = new AlumnoImple();
	    Instituto ins = ai.getInstituto(i);
	    Alumno a = new Alumno(dni,nombre,ape,edad,ins);	    
	    ai.update(a);
	    return true;
	}	
	else 
	    return false;
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
	
	DefaultTableModel modelo = new DefaultTableModel();
	//3 columnas
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
    
    public static Asignatura obtenerAsignatura(String identificador, boolean profesor)
    {
	return new AsignaturaImple().getAsignatura(identificador, profesor);
    }
    
    public static boolean insertAsignatura(String nombre, String profesor, String instituto)
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
    
    public static boolean updateAsignatura(int id,String nombre, String profesor, String instituto)
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
    
    public static DefaultTableModel notasAlum(Alumno a)
    {
	NotaImple ni = new NotaImple();
	Collection<Nota> notas = ni.getNotasAlumnos(a);
	return crearModeloNotas(notas);
    }
    
    public static DefaultTableModel notasAsig(Asignatura a)
    {
	NotaImple ni = new NotaImple();
	Collection<Nota> notas = ni.getNotasAsignatura(a);
	return crearModeloNotas(notas);
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
    
    //------------------INSTITUTOS----------------
    
    public static DefaultTableModel obtenerInstitutos()
    {
	InstitutoImple ii = new InstitutoImple();
	Collection<Instituto> institutos = ii.getAll();
	
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
}
