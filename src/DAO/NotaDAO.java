package DAO;

import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Nota;
import java.util.ArrayList;

public interface NotaDAO {
    
    public ArrayList<Nota> getNotasAlumnos(Alumno a);
    public ArrayList<Nota> getNotasAsignatura(Asignatura a);
    
}
