package DAO.impl;

//@author chillaso

import DAO.AsignaturaDAO;
import Modelo.Alumno;
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
    
    public Collection<Asignatura> filtrarAsig(String nom, String prof, String in)
    {
	
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c;
	
	if(nom.isEmpty()) nom="%";
	if(prof.isEmpty()) prof="%";
	if(in.isEmpty()) in="%";

	c = s.createCriteria(Asignatura.class, "asig")
		.createAlias("asig.id_profesor", "prof")
		.createAlias("asig.id_instituto", "in")
		.setFetchMode("id_instituto",FetchMode.JOIN)
		.setFetchMode("id_profesor", FetchMode.JOIN)
		.add(Restrictions.ilike("nombre",nom))
		.add(Restrictions.ilike("prof.nombre",prof))
		.add(Restrictions.ilike("in.nombre",in));	    
	
	Collection<Asignatura> asignaturas = (Collection<Asignatura>) c.list();
	s.close();
	return asignaturas;
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
	    c.add(Restrictions.ilike("profesor", identificador));
	else 
	    c.add(Restrictions.ilike("nombre", identificador));
	
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
		.add(Restrictions.ilike("i.nombre",nombre));
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
		.add(Restrictions.ilike("p.nombre",nombre));
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
