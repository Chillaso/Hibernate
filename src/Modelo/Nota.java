package Modelo;

//@author chillaso

import Modelo.Nota.NotaPK;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="nota")
@IdClass(NotaPK.class)
public class Nota implements Serializable{
    
    @Id
    @Column
    private int id_alum;
    @Id
    @Column
    private int id_asig;
    @Column
    private int nota;

    //Cada nota esta asociada a un solo alumno
    /*@ManyToOne
    @JoinColumn(name="id_alum")
    private Alumno alumno;
    
    @ManyToOne
    @JoinColumn(name="id_asig")
    private Asignatura asignatura;*/
    
    public Nota() {
    }

    public Nota(int id_alum, int id_asig, int nota) {
	this.id_alum = id_alum;
	this.id_asig = id_asig;
	this.nota = nota;
    }

    public int getId_alum() {
	return id_alum;
    }

    public void setId_alum(int id_alum) {
	this.id_alum = id_alum;
    }

    public int getId_asig() {
	return id_asig;
    }

    public void setId_asig(int id_asig) {
	this.id_asig = id_asig;
    }

    public int getNota() {
	return nota;
    }

    public void setNota(int nota) {
	this.nota = nota;
    }

    /*public Alumno getA() {
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
    }*/
    
    public class NotaPK implements Serializable{
	
	@Column
	private int id_alum;
	@Column
	private int id_asig;

	public int getId_alum() {
	    return id_alum;
	}

	public void setId_alum(int id_alum) {
	    this.id_alum = id_alum;
	}

	public int getId_asig() {
	    return id_asig;
	}

	public void setId_asig(int id_asig) {
	    this.id_asig = id_asig;
	}

	@Override
	public int hashCode() {
	    int hash = 3;
	    hash = 97 * hash + this.id_alum;
	    hash = 97 * hash + this.id_asig;
	    return hash;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
		return true;
	    }
	    if (obj == null) {
		return false;
	    }
	    if (getClass() != obj.getClass()) {
		return false;
	    }
	    final NotaPK other = (NotaPK) obj;
	    if (this.id_alum != other.id_alum) {
		return false;
	    }
	    if (this.id_asig != other.id_asig) {
		return false;
	    }
	    return true;
	}		
    }        
}
