package Modelo;

//@author chillaso

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    private String apellido1;
    @Column
    private String apellido2;
    @Column
    private int edad;
    
    public Alumno() {
    }
    
    
    public Alumno(int id_alum, String dni, String nombre, String apellido1, String apellido2, int edad) {
	this.id_alum = id_alum;
	this.dni = dni;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.edad = edad;
    }    
    
    public Alumno(String dni, String nombre, String apellido1, String apellido2, int edad) 
    {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.edad = edad;
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

    public String getApellido1() {
	return apellido1;
    }

    public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
    }

    public String getApellido2() {
	return apellido2;
    }

    public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }            
}
