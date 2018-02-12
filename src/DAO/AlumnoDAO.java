package DAO;

import Modelo.Alumno;
import java.util.ArrayList;

public interface AlumnoDAO {
    
    public ArrayList<Alumno> getAll();
    public Alumno getAlumno(int id_alum);
    public Alumno getAlumno(String nombre, boolean dni);
    public void insert(Alumno a);
    public void delete(Alumno a);
    public void update(Alumno a);  
    public void saveOrUpdate(Alumno a);
}
