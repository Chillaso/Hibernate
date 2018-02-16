package Modelo;

//@author chillaso

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor implements Serializable{

    @Id
    @JoinColumn(name="id_profesor")
    private int id_profesor;
    @Column
    private String dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    
    @ManyToOne
    @JoinColumn(name="id_instituto")
    private Instituto i;

    public Profesor() {
    }

    public Profesor(int id_profesor, String dni, String nombre, String apellido, Instituto i) {
	this.id_profesor = id_profesor;
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.i = i;
    }

    public Profesor(String dni, String nombre, String apellido, Instituto i) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.i = i;
    }

    public int getId_profesor() {
	return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
	this.id_profesor = id_profesor;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public Instituto getI() {
	return i;
    }

    public void setI(Instituto i) {
	this.i = i;
    }
    
    
    
}
