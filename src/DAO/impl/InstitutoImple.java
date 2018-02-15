package DAO.impl;

//@author chillaso

import DAO.InstitutoDAO;
import Modelo.Asignatura;
import Modelo.Instituto;
import Util.HibernateUtil;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class InstitutoImple implements InstitutoDAO{

    @Override
    public Collection<Instituto> getAll() 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Instituto.class);
	Collection<Instituto> list = (Collection<Instituto>) c.list();
	s.close();
	return list;
    }

    @Override
    public Instituto getInstituto(int id_instituto) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Instituto.class);
	c.add(Restrictions.eq("id_instituto", id_instituto));
	Instituto i = (Instituto) c.list().get(0);
	s.close();
	return i;	
    }

    @Override
    public Instituto getInstituto(String nombre) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Instituto.class);
	c.add(Restrictions.eq("nombre", nombre));
	Instituto i = (Instituto) c.list().get(0);
	s.close();
	return i;	
    }

    @Override
    public void insert(Instituto a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.save(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void delete(Instituto a) 
    {
		Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.delete(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void update(Instituto a) {
		Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.update(a);
	s.getTransaction().commit();
	s.close();
    }

    @Override
    public void saveOrUpdate(Instituto a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	s.saveOrUpdate(a);
	s.getTransaction().commit();
	s.close();
    }

}