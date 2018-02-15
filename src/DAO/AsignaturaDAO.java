package DAO;

import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.Collection;

public interface AsignaturaDAO {
    
    public Collection<Asignatura> getAll();
    public Asignatura getAsignatura(int id_asig);
    public Asignatura getAsignatura(String nombre, boolean profesor);
    public Instituto getInstituto(String nombre);
    public Profesor getProfesor(String nombre);
    public void insert(Asignatura a);
    public void delete(Asignatura a);
    public void update(Asignatura a);  
    public void saveOrUpdate(Asignatura a);
}
