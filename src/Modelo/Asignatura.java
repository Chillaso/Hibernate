package Modelo;

//@author chillaso

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="asignatura")
public class Asignatura implements Serializable{

    @Id
    private int id_asig;
    @Column
    private String nombre;
    @Column
    private String profesor;
    
    /*@OneToMany(mappedBy="asignatura")
    private ArrayList<Nota> notas;*/

    public Asignatura() {
    }

    public Asignatura(int id_asig, String nombre, String profesor) {
	this.id_asig = id_asig;
	this.nombre = nombre;
	this.profesor = profesor;
    }

    public Asignatura(String nombre, String profesor) {
	this.nombre = nombre;
	this.profesor = profesor;
    }        

    public int getId_asig() {
	return id_asig;
    }

    public void setId_asig(int id_asig) {
	this.id_asig = id_asig;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getProfesor() {
	return profesor;
    }

    public void setProfesor(String profesor) {
	this.profesor = profesor;
    }            

    /*public ArrayList<Nota> getNotas() {
	return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
	this.notas = notas;
    }*/
}
