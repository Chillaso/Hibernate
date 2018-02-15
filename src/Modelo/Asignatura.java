package Modelo;

//@author chillaso

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="asignatura")
public class Asignatura implements Serializable{

    @Id
    @JoinColumn(name="id_asig")
    private int id_asig;
    @Id
    @JoinColumn(name="id_profesor")
    private Profesor profesor;
    @Id
    @JoinColumn(name="id_instituto")
    private Instituto instituto;
    @Column
    private String nombre;            

    public Asignatura() {
    }

    public Asignatura(Profesor profesor, Instituto instituto, String nombre) {
	this.profesor = profesor;
	this.instituto = instituto;
	this.nombre = nombre;
    }

    public Asignatura(int id_asig, Profesor profesor, Instituto instituto, String nombre) {
	this.id_asig = id_asig;
	this.profesor = profesor;
	this.instituto = instituto;
	this.nombre = nombre;
    }

    public int getId_asig() {
	return id_asig;
    }

    public void setId_asig(int id_asig) {
	this.id_asig = id_asig;
    }

    public Profesor getProfesor() {
	return profesor;
    }

    public void setProfesor(Profesor profesor) {
	this.profesor = profesor;
    }

    public Instituto getInstituto() {
	return instituto;
    }

    public void setInstituto(Instituto instituto) {
	this.instituto = instituto;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    
    
}