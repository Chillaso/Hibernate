package DAO.impl;

import DAO.ProfesorDAO;
import Modelo.Alumno;
import Modelo.Instituto;
import Modelo.Profesor;
import Util.HibernateUtil;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**@author Chillaso*/

public class ProfesorImple implements ProfesorDAO{

    @Override
    public Collection<Profesor> getAll() 
    {		
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Profesor.class);
	Collection<Profesor> list = (Collection<Profesor>) c.list();
	s.close();
	return list;
    }

    @Override
    public Profesor getProfesor(int id_profesor) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Profesor.class);
	c.add(Restrictions.eq("id_profesor", id_profesor));
	Profesor i = (Profesor) c.list().get(0);
	s.close();
	return i;	
    }

    @Override
    public Profesor getProfesor(String nombre, boolean dni) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Profesor.class);
	
	if(dni)
	    c.add(Restrictions.eq("dni", nombre));
	else 
	    c.add(Restrictions.eq("nombre", nombre));
	
	Profesor p = (Profesor) c.list().get(0);
	s.close();
	return p;	
    }

    @Override
    public void insert(Profesor a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.save(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void delete(Profesor a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.delete(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void update(Profesor a) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void saveOrUpdate(Profesor a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.saveOrUpdate(a);
	s.getTransaction().commit();
	s.close();
    }


}
