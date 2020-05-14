package com.katerin.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.katerin.model.Consulta;

public class consuldao {
	public List<Consulta> listaconsul(Consulta conn){
		List<Consulta> connn =new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf=Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			connn = em.createQuery("from consulta").getResultList();
		em.getTransaction().commit();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e+"ERROR");
		}
		
		
		
		
		
		
		return connn;
		
	}

	public void ActualizarDatosUs(Consulta con) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		
	   con.getIdconsulta();
	   con.getNombre();
	   con.getApellido();
	    em.getTransaction().begin();
		em.merge(con);
		////eliminar
		//em.remove(in);
		//em.persist(in);//insertar
		//em.merge(in);//actualizar/
		em.flush();
		em.getTransaction().commit();

		
	}
	public void EliminarUs(Consulta con) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		con = em.getReference(Consulta.class,con.getIdconsulta());
        em.getTransaction().begin();
		////eliminar
		em.remove(con);
		//em.persist(in);//insertar
		//em.merge(in);//actualizar/
		em.flush();
		em.getTransaction().commit();
		
	}

}
