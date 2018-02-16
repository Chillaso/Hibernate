package Modelo;

//@author chillaso

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="asignatura")
public class Asignatura implements Serializable{
    
    @Id
    @JoinColumn(name="id_asig")
    private int id_asig;    
    
    @Column
    private String nombre;       
    
    @OneToOne
    //@Id
    @JoinColumn(name="id_profesor")
    private Profesor id_profesor;
    
    @OneToOne
    //@Id
    @JoinColumn(name="id_instituto")
    private Instituto id_instituto;        

    public Asignatura() {
    }

    public Asignatura(Profesor profesor, Instituto instituto, String nombre) {
	this.id_profesor = profesor;
	this.id_instituto = instituto;
	this.nombre = nombre;
    }

    public Asignatura(int id_asig, Profesor profesor, Instituto instituto, String nombre) {
	this.id_asig = id_asig;
	this.id_profesor = profesor;
	this.id_instituto = instituto;
	this.nombre = nombre;
    }

    public int getId_asig() {
	return id_asig;
    }

    public void setId_asig(int id_asig) {
	this.id_asig = id_asig;
    }

    public Profesor getProfesor() {
	return id_profesor;
    }

    public void setProfesor(Profesor profesor) {
	this.id_profesor = profesor;
    }

    public Instituto getInstituto() {
	return id_instituto;
    }

    public void setInstituto(Instituto instituto) {
	this.id_instituto = instituto;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
    
    
}