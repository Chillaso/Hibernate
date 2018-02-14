package DAO;

import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Nota;
import java.util.ArrayList;
import java.util.Collection;

public interface NotaDAO {

    public Collection<Nota> getNotasAlumnos(Alumno a);
    public Collection<Nota> getNotasAsignatura(Asignatura a);
    
}
