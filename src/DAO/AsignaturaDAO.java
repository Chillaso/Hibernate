package DAO;

import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Profesor;
import Util.cambioImposibleException;
import java.util.Collection;

public interface AsignaturaDAO {
    
    public Collection<Asignatura> getAll();
    public Asignatura getAsignatura(int id_asig);
    public Instituto getInstituto(String nombre) throws cambioImposibleException;
    public Profesor getProfesor(String nombre) throws cambioImposibleException;
    public Collection<Asignatura> filtrarAsig(String nom, String prof, String in);
    public Asignatura getAsignatura(String nombre) throws cambioImposibleException;
    public void insert(Asignatura a);
    public void delete(Asignatura a);
    public void update(Asignatura a);  
    public void saveOrUpdate(Asignatura a);
}
