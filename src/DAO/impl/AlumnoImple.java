package DAO.impl;

//@author chillaso

import DAO.AlumnoDAO;
import Modelo.Alumno;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class AlumnoImple implements AlumnoDAO{

    public AlumnoImple() {
    }    
    
    @Override
    public Collection<Alumno> getAll() 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Alumno.class);	
	Collection<Alumno> list = (Collection<Alumno>) c.list();
	s.close();
	return list;
    }

    @Override
    public Alumno getAlumno(int id_alum) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Alumno.class);
	c.add(Restrictions.eq("id_alum", id_alum));
	Alumno a = (Alumno) c.list().get(0);
	s.close();
	return a;
    }

    @Override
    public Alumno getAlumno(String identificador, boolean dni) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Alumno.class);
	
	if(dni)
	    c.add(Restrictions.eq("dni", identificador));
	else 
	    c.add(Restrictions.eq("nombre", identificador));
	
	Alumno a = (Alumno) c.list().get(0);
	s.close();
	return a;
    }        
    
    @Override
    public void insert(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.save(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void delete(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.delete(a);
	s.getTransaction().commit();
	s.close();    
    }

    @Override
    public void update(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();    
    }

    @Override
    public void saveOrUpdate(Alumno a) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.saveOrUpdate(a);
	s.getTransaction().commit();
	s.close();
    }   
}
