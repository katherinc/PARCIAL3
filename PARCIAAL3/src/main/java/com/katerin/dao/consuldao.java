package com.katerin.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.katerin.model.Consulta;


public class consuldao {
	public void agregarDatosConsulta(Consulta  con) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(con);//insertar
		em.flush();
		em.getTransaction().commit();
			
	}
	public List<Consulta> historialCon(){
		List<Consulta> HISTO = new  ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			HISTO = em.createQuery("From consultas").getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e+"ERROR");
		}
		return HISTO;
	}

}
