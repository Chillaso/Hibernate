package DAO.impl;

//@author chillaso

import DAO.NotaDAO;
import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Nota;
import Util.HibernateUtil;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class NotaImple implements NotaDAO{

    @Override
    public Collection<Nota> getAll()
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Nota.class);
	Collection<Nota> notas = (Collection<Nota>) c.list();
	return notas;
    }
    @Override
    public Collection<Nota> filtrarNota(String asig, String alum, int nota, int comparador)
    {
	
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c=null;
	
	if(asig.isEmpty()) asig="%";
	if(alum.isEmpty()) alum="%";
	
	if(nota==-1)
	{	
	    //ilike no case sensitive
	    c = s.createCriteria(Nota.class, "n")
		    .createAlias("n.id_alum", "al") //El de java
		    .createAlias("n.id_asig", "as")
		    .setFetchMode("id_asig", FetchMode.JOIN)
		    .setFetchMode("id_alum", FetchMode.JOIN)
		    .add(Restrictions.ilike("al.nombre", alum))
		    .add(Restrictions.ilike("as.nombre", asig))
		    .add(Restrictions.gt("nota", nota));
	}
	else
	{
	    switch (comparador) {
	    	//MENOR QUE
		case -2:
		    c = s.createCriteria(Nota.class, "n")
		    .createAlias("n.id_alum", "al")
		    .createAlias("n.id_asig", "as")
		    .setFetchMode("id_asig", FetchMode.JOIN)
		    .setFetchMode("id_alum", FetchMode.JOIN)
		    .add(Restrictions.ilike("al.nombre", alum))
		    .add(Restrictions.ilike("as.nombre", asig))
		    .add(Restrictions.lt("nota", nota));
		    break;
		//MENOR IGUAL QUE
	    	case -1:
		    c = s.createCriteria(Nota.class, "n")
			.createAlias("n.id_alum", "al")
			.createAlias("n.id_asig", "as")
			.setFetchMode("id_asig", FetchMode.JOIN)
			.setFetchMode("id_alum", FetchMode.JOIN)
			.add(Restrictions.ilike("al.nombre", alum))
			.add(Restrictions.ilike("as.nombre", asig))
			.add(Restrictions.le("nota", nota));
		    break;
	    	//IGUAL
		case 0:
		    c = s.createCriteria(Nota.class, "n")
			.createAlias("n.id_alum", "al")
			.createAlias("n.id_asig", "as")
			.setFetchMode("id_asig", FetchMode.JOIN)
			.setFetchMode("id_alum", FetchMode.JOIN)
			.add(Restrictions.ilike("al.nombre", alum))
			.add(Restrictions.ilike("as.nombre", asig))
			.add(Restrictions.eq("nota", nota));
		    break;
	    	//MAYOR IGUAL QUE
		case 1:
		    c = s.createCriteria(Nota.class, "n")
			.createAlias("n.id_alum", "al")
			.createAlias("n.id_asig", "as")
			.setFetchMode("id_asig", FetchMode.JOIN)
			.setFetchMode("id_alum", FetchMode.JOIN)
			.add(Restrictions.ilike("al.nombre", alum))
			.add(Restrictions.ilike("as.nombre", asig))
			.add(Restrictions.ge("nota", nota));
		    break;
	    	//MAYOR QUE
		case 2:
		    c = s.createCriteria(Nota.class, "n")
			.createAlias("n.id_alum", "al")
			.createAlias("n.id_asig", "as")
			.setFetchMode("id_asig", FetchMode.JOIN)
			.setFetchMode("id_alum", FetchMode.JOIN)
			.add(Restrictions.ilike("al.nombre", alum))
			.add(Restrictions.ilike("as.nombre", asig))
			.add(Restrictions.gt("nota", nota));
		    break;
	    }
	}
	    
	Collection<Nota> notas = (Collection<Nota>) c.list();
	s.close();
	return notas;
    }        
}
