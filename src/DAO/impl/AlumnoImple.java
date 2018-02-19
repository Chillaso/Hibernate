package DAO.impl;

//@author chillaso

import DAO.AlumnoDAO;
import Modelo.Alumno;
import Modelo.Instituto;
import Util.HibernateUtil;
import java.util.Collection;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
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
    
    public Collection<Alumno> filtrarAlum(String dni, String nom, String ape, int edad, String in)
    {
	
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c;
	
	if(dni.isEmpty()) dni="%";
	if(nom.isEmpty()) nom="%";
	if(ape.isEmpty()) ape="%";
	if(in.isEmpty()) in="%";
	
	if(edad==-1)
	{	
	    //ilike no case sensitive
	    c = s.createCriteria(Alumno.class, "alum")
			.createAlias("alum.id_instituto", "in")
			.setFetchMode("id_instituto",FetchMode.JOIN)
			.add(Restrictions.ilike("dni","%"+dni+"%"))
			.add(Restrictions.ilike("nombre","%"+nom+"%"))
			.add(Restrictions.ilike("apellido","%"+ape+"%"))
			.add(Restrictions.gt("edad",edad))		    
			.add(Restrictions.ilike("in.nombre","%"+in+"%"));	    
	}
	else
	{
	    c = s.createCriteria(Alumno.class, "alum")
			.createAlias("alum.id_instituto", "in")
			.setFetchMode("id_instituto",FetchMode.JOIN)
			.add(Restrictions.ilike("dni","%"+dni+"%"))
			.add(Restrictions.ilike("nombre","%"+nom+"%"))
			.add(Restrictions.ilike("apellido","%"+ape+"%"))
			.add(Restrictions.eq("edad",edad))
			.add(Restrictions.ilike("in.nombre","%"+in+"%"));	    
	}
	Collection<Alumno> alumnos = (Collection<Alumno>) c.list();
	s.close();
	return alumnos;
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
	    c.add(Restrictions.ilike("dni", "%"+identificador+"%"));
	else 
	    c.add(Restrictions.ilike("nombre", "%"+identificador+"%"));
	
	Alumno a = (Alumno) c.list().get(0);
	s.close();
	return a;
    }
    
    @Override
    public Instituto getInstituto(String nombre) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Instituto.class)
		.add(Restrictions.ilike("nombre","%"+nombre+"%"));
	Instituto i = (Instituto) c.list().get(0);
	s.close();	
	return i;
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
