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
@Table(name="instituto")
public class Instituto implements Serializable{

    @Id
    @JoinColumn(name="id_instituto")
    private int id_instituto;
    
    @Column
    private String nombre;
    @Column
    private String localidad;

    public Instituto() {
    }

    public Instituto(int id_instituto, String nombre, String localidad) {
	this.id_instituto = id_instituto;
	this.nombre = nombre;
	this.localidad = localidad;
    }

    public Instituto(String nombre, String localidad) {
	this.nombre = nombre;
	this.localidad = localidad;
    }

    public int getId_instituto() {
	return id_instituto;
    }

    public void setId_instituto(int id_instituto) {
	this.id_instituto = id_instituto;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getLocalidad() {
	return localidad;
    }

    public void setLocalidad(String localidad) {
	this.localidad = localidad;
    }
    
    
    
}
