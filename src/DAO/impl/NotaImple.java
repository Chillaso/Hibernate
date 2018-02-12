package DAO.impl;

//@author chillaso

import DAO.NotaDAO;
import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Nota;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class NotaImple implements NotaDAO{

    @Override
    public ArrayList<Nota> getNotasAlumnos(Alumno a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Nota.class);
	c.add(Restrictions.eq("id_alum", a.getId_alum()));
	ArrayList<Nota> notas = (ArrayList<Nota>) c.list();
	s.close();
	return notas;
    }

    @Override
    public ArrayList<Nota> getNotasAsignatura(Asignatura a) 
    {
	Session s = HibernateUtil.getSessionFactory().openSession();
	s.beginTransaction();
	Criteria c = s.createCriteria(Nota.class);
	c.add(Restrictions.eq("id_asig", a.getId_asig()));
	ArrayList<Nota> notas = (ArrayList<Nota>) c.list();
	s.close();
	return notas;
    }

}
