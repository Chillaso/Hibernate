package DAO;

import Modelo.Profesor;
import java.util.Collection;

public interface ProfesorDAO {
    
    public Collection<Profesor> getAll();
    public Profesor getProfesor(int id_profesor);
    public Profesor getProfesor(String nombre, boolean dni);
    public void insert(Profesor a);
    public void delete(Profesor a);
    public void update(Profesor a);  
    public void saveOrUpdate(Profesor a);
}
