package Modelo;

//@author chillaso

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Nota implements Serializable{
    @Id
    private int id_alum;
    private int id_asig;
    private int nota;

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
    
    
}
