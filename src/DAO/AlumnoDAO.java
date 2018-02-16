package DAO;

import Modelo.Alumno;
import Modelo.Instituto;
import java.util.Collection;

public interface AlumnoDAO {
    
    public Collection<Alumno> getAll();
    public Alumno getAlumno(int id_alum);
    public Alumno getAlumno(String nombre, boolean dni);
    public Instituto getInstituto(String nombre);
    public void insert(Alumno a);
    public void delete(Alumno a);
    public void update(Alumno a);  
    public void saveOrUpdate(Alumno a);
}
