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
@Table(name="alumno")
public class Alumno implements Serializable{

    @Id
    @JoinColumn(name="id_alum")
    private int id_alum;
    @Column
    private String dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    
    @ManyToOne
    @JoinColumn(name="id_instituto")
    private Instituto id_instituto;
    
    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellido, int edad, Instituto i) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.id_instituto = i;
    }

    public Alumno(int id_alum, String dni, String nombre, String apellido, int edad, Instituto i) {
	this.id_alum = id_alum;
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.id_instituto = i;
    }

    public int getId_alum() {
	return id_alum;
    }

    public void setId_alum(int id_alum) {
	this.id_alum = id_alum;
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

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public Instituto getI() {
	return id_instituto;
    }

    public void setI(Instituto i) {
	this.id_instituto = i;
    }
    
    
}
