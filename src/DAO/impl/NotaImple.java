package DAO.impl;

//@author chillaso

import DAO.NotaDAO;
import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Nota;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;


public class NotaImple implements NotaDAO{

    /*@Override
    public ArrayList<Nota> getNotasAlumnos(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Nota.class);
	c.add(Restrictions.eq("id_alum", a.getId_alum()));
	ArrayList<Nota> notas = (ArrayList<Nota>) c.list();
	s.close();
	return notas;
    }*/
    
    @Override
    public Collection<Nota> getNotasAlumnos(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	
	Criteria nota = s.createCriteria(Nota.class);
	Criteria join = nota.createCriteria("id_alum",JoinType.INNER_JOIN);
	
	ProjectionList select = Projections.projectionList();
	select.add(Projections.property("nombre"));
	
	nota.setProjection(select);
	
	Collection<Nota> notas = (Collection<Nota>) nota.list();
	s.close();
	return notas;
    }
    
    @Override
    public Collection<Nota> getNotasAsignatura(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	
	Criteria nota = s.createCriteria(Nota.class).createCriteria("asignatura",JoinType.INNER_JOIN);
	nota.add(Restrictions.eq("id_asig",a.getId_asig()));
	
	nota.setProjection(Projections.projectionList().add(Projections.property("nombre")));
	
	Collection<Nota> notas = (Collection<Nota>) nota.list();
	s.close();
	return notas;
    }

    
    
}
