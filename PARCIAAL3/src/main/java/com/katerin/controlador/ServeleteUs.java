package com.katerin.controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import com.katerin.dao.UsuariDao;
import com.katerin.dao.consuldao;

import com.katerin.model.Consulta;

import com.katerin.model.Usu;

/**
 * Servlet implementation class ServeleteUs
 */
public class ServeleteUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteUs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Consulta con = new Consulta();
		Usu us = new Usu();
		UsuariDao usudao = new UsuariDao();
		String id= null;
		String nombreus= null ;
		String apellidous = null;

        try {
		id= request.getParameter("Id");
		nombreus= request.getParameter("usuario");
		apellidous= request.getParameter("contra");
		
		con.setIdconsulta(Integer.parseInt(id));
		con.setNombre(nombreus);
		con.setApellido(apellidous);
		
		int validar=usudao.ingresoUsuario(us).size();
		if (validar==1) {
			   response.sendRedirect("index.jsp");
		   }else {
			   System.out.println("ERROR1");
		   }
		}

		
        
		catch(Exception e) {
			
		}
		
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		consuldao conn = new consuldao();
		Gson json = new Gson();
		
		try {
			//response.getWriter().append(json.toJson(conn.listaconsul()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
