package DAO;

import Modelo.Alumno;
import Modelo.Instituto;
import Util.cambioImposibleException;
import java.util.Collection;

public interface AlumnoDAO {
    
    public Collection<Alumno> getAll();
    public Alumno getAlumno(int id_alum);
    public Alumno getAlumno(String nombre, boolean dni) throws cambioImposibleException;
    public Instituto getInstituto(String nombre) throws cambioImposibleException;
    public Collection<Alumno> filtrarAlum(String dni, String nom, String ape, int edad, String in);
    public void insert(Alumno a);
    public void delete(Alumno a);
    public void update(Alumno a);  
    public void saveOrUpdate(Alumno a);
}
