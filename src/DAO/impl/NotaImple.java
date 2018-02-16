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

    public Collection<Nota> getAll()
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Nota.class);
	Collection<Nota> notas = (Collection<Nota>) c.list();
	return notas;
    }
    
    @Override
    public Collection<Nota> getNotasAlumnos(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria consulta = s.createCriteria(Nota.class,"nota")
		.createAlias("nota.alumno", "alum")
		.setFetchMode("asignatura", FetchMode.JOIN)
		.setFetchMode("alumno", FetchMode.JOIN)
		.add(Restrictions.ilike("alum.nombre",a.getNombre()));
	Collection<Nota> notas = (Collection<Nota>) consulta.list();
	s.close();
	return notas;
    }
    
    @Override
    public Collection<Nota> getNotasAsignatura(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	
	Criteria consulta = s.createCriteria(Nota.class,"nota")
		.createAlias("nota.asignatura", "asig")
		.setFetchMode("asignatura", FetchMode.JOIN)
		.setFetchMode("alumno", FetchMode.JOIN)
		.add(Restrictions.ilike("asig.nombre",a.getNombre()));
	Collection<Nota> notas = (Collection<Nota>) consulta.list();
	s.close();
	return notas;
    }

    
    
}
