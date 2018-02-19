package DAO;

import Modelo.Nota;
import java.util.Collection;

public interface NotaDAO {

     public Collection<Nota> filtrarNota(String asig, String alum, int nota, int comparador);
     public Collection<Nota> getAll();
    //public Collection<Nota> getNotasAlumnos(Alumno a);
    //public Collection<Nota> getNotasAsignatura(Asignatura a);
    
}
