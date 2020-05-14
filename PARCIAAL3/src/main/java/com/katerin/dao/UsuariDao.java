package com.katerin.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.katerin.model.Consulta;
import com.katerin.model.Usu;

public class UsuariDao {
	public List<Usu> ingresoUsuario(Usu us){
		List<Usu> Usuario=new ArrayList();
		EntityManager em;
		EntityManagerFactory emf;
		emf=Persistence.createEntityManagerFactory("PARCIAAL3");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			Usuario = em.createQuery("from Usu as u where u.nombre='"+us.getNombre()+"'and u.contrasenia='"+us.getContrasenia()+"'").getResultList();
		em.getTransaction().commit();
		for(	Usu  datosid:Usuario) {
			
			
			us.setIdusuario(datosid.getIdusuario());
			
			///usu.setIdUsuarios(idUsuarios);
			
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e+"ERROR");
		}
		
		
		
		
		
		
		return Usuario;
		
	}
	

}
