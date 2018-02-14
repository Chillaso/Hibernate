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
    
    //Cada nota esta asociada a un solo alumno    
    @ManyToOne
    @JoinColumn(name="id_alum")
    @Id
    private Alumno alumno;
    
    @ManyToOne
    @JoinColumn(name="id_asig")
    @Id
    private Asignatura asignatura;
    
    @Column
    private int nota;

    
    public Nota() {
    }

    public int getNota() {
	return nota;
    }

    public void setNota(int nota) {
	this.nota = nota;
    }

    public Alumno getA() {
	return alumno;
    }

    public void setA(Alumno a) {
	this.alumno = a;
    }

    public Asignatura getAs() {
	return asignatura;
    }

    public void setAs(Asignatura as) {
	this.asignatura = as;
    }       
}
