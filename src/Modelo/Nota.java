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
@Table(name="nota")
public class Nota implements Serializable{
       
    @Column(name="nota")
    private int nota;
       
    @ManyToOne
    //name= nombre BD
    @JoinColumn(name="id_alum")
    @Id
    //name = El que quieras
    private Alumno id_alum;
    
    @ManyToOne
    @JoinColumn(name="id_asig")
    @Id
    private Asignatura id_asig;
    
    public Nota() {
    }

    public Nota(Alumno id_alum, Asignatura id_asig, int nota) {
	this.id_alum = id_alum;
	this.id_asig = id_asig;
	this.nota = nota;
    }

    public Alumno getId_alum() {
	return id_alum;
    }

    public void setId_alum(Alumno id_alum) {
	this.id_alum = id_alum;
    }

    public Asignatura getId_asig() {
	return id_asig;
    }

    public void setId_asig(Asignatura id_asig) {
	this.id_asig = id_asig;
    }

    public int getNota() {
	return nota;
    }

    public void setNota(int nota) {
	this.nota = nota;
    } 
}
