package DAO;

import Modelo.Asignatura;
import java.util.ArrayList;

public interface AsignaturaDAO {
    
    public ArrayList<Asignatura> getAll();
    public Asignatura getAsignatura(int id_asig);
    public Asignatura getAsignatura(String nombre, boolean profesor);
    public void insert(Asignatura a);
    public void delete(Asignatura a);
    public void update(Asignatura a);  
    public void saveOrUpdate(Asignatura a);
}
