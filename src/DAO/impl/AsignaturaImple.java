package DAO.impl;

//@author chillaso

import DAO.AsignaturaDAO;
import Modelo.Asignatura;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class AsignaturaImple implements AsignaturaDAO{

    public AsignaturaImple() {
    }    
    
    @Override
    public ArrayList<Asignatura> getAll() 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Asignatura.class);
	ArrayList<Asignatura> list = (ArrayList<Asignatura>) c.list();
	s.close();
	return list;
    }

    @Override
    public Asignatura getAsignatura(int id_asig) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Asignatura.class);
	c.add(Restrictions.eq("id_asig", id_asig));
	Asignatura a = (Asignatura) c.list().get(0);
	s.close();
	return a;
    }

    @Override
    public Asignatura getAsignatura(String identificador, boolean profesor) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Asignatura.class);
	
	if(profesor)
	    c.add(Restrictions.eq("profesor", identificador));
	else 
	    c.add(Restrictions.eq("nombre", identificador));
	
	Asignatura a = (Asignatura) c.list().get(0);
	s.close();
	return a;
    }        
    
    @Override
    public void insert(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.save(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void delete(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.delete(a);
	s.getTransaction().commit();
	s.close();    
    }

    @Override
    public void update(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();    
    }

    @Override
    public void saveOrUpdate(Asignatura a) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.saveOrUpdate(a);
	s.getTransaction().commit();
	s.close();
    }   
}
