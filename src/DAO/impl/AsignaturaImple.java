package DAO.impl;

//@author chillaso

import DAO.AsignaturaDAO;
import Modelo.Asignatura;
import Modelo.Instituto;
import Modelo.Nota;
import Modelo.Profesor;
import Util.HibernateUtil;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class AsignaturaImple implements AsignaturaDAO{

    public AsignaturaImple() {
    }    
    
    @Override
    public Collection<Asignatura> getAll() 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Asignatura.class);
	Collection<Asignatura> list = (Collection<Asignatura>) c.list();
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
    public Instituto getInstituto(String nombre) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria consulta = s.createCriteria(Asignatura.class,"asig")
		.createAlias("asig.instituto", "i")
		.setFetchMode("profesor", FetchMode.JOIN)
		.setFetchMode("instituto", FetchMode.JOIN)
		.add(Restrictions.eq("i.nombre",nombre));
	Instituto instituto = (Instituto) consulta.list().get(0);
	s.close();	
	return instituto;
    }

    @Override
    public Profesor getProfesor(String nombre) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria consulta = s.createCriteria(Asignatura.class,"asig")
		.createAlias("asig.profesor", "p")
		.setFetchMode("profesor", FetchMode.JOIN)
		.setFetchMode("instituto", FetchMode.JOIN)
		.add(Restrictions.eq("p.nombre",nombre));
	Profesor profesor = (Profesor) consulta.list().get(0);
	s.close();	
	return profesor;
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
