package com.katerin.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usu database table.
 * 
 */
@Entity
@NamedQuery(name="Usu.findAll", query="SELECT u FROM Usu u")
public class Usu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idusuario;

	private String contrasenia;

	private String nombre;

	public Usu() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}