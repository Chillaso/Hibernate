package Controlador;

import DAO.impl.AlumnoImple;
import DAO.impl.AsignaturaImple;
import DAO.impl.NotaImple;
import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Nota;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

//@author chillaso

public class Control {
    
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
	
	for(Alumno a : alumnos)
	{
	    Object[] fila = new Object[]{a.getId_alum(),a.getDni(),a.getNombre(),a.getApellido1(),a.getEdad()};
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
    
    public static boolean insertAlumno(String dni, String nombre, String ape, int edad)
    {	
	if(dni.length()==9 && edad > 0 && edad < 120 && !nombre.isEmpty() &&
		!ape.isEmpty())
	{
	    Alumno a = new Alumno(dni,nombre,ape,edad);
	    AlumnoImple ai = new AlumnoImple();
	    ai.insert(a);
	    return true;
	}	
	else 
	    return false;
    }    
    
    public static boolean updateAlumno(int id, String dni, String nombre, String ape, int edad)
    {	
	if(dni.length()==9 && edad > 0 && edad < 120 && !nombre.isEmpty() &&
		!ape.isEmpty())
	{
	    Alumno a = new Alumno(id,dni,nombre,ape,edad);
	    AlumnoImple ai = new AlumnoImple();
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
	    Object[] fila = new Object[]{a.getId_asig(),a.getNombre(),a.getProfesor()};
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
	    Object[] fila = new Object[]{n.getA().getNombre(),n.getAs().getNombre(),n.getNota()};
	    modelo.addRow(fila);
	}
	return modelo;
    }
}
