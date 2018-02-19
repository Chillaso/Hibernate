package DAO;

import Modelo.Instituto;
import Util.cambioImposibleException;
import java.util.Collection;

public interface InstitutoDAO {
    
    public Collection<Instituto> getAll();
    public Instituto getInstituto(int id_instituto);
    public Instituto getInstituto(String nombre) throws cambioImposibleException;
    public Collection<Instituto> filtrarInstis(String nom, String localidad);    
    public void insert(Instituto a);
    public void delete(Instituto a);
    public void update(Instituto a);  
    public void saveOrUpdate(Instituto a);
}
