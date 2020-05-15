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
	
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usu= request.getParameter("usuario");
		String contra= request.getParameter("contra");
String cerrarSec = request.getParameter("btncerrar");
		
		if(cerrarSec!=null) {
			if(cerrarSec.equals("CERRAR")) {
		    HttpSession cerrarS =(HttpSession)request.getSession();
		    cerrarS.invalidate();
		    
		    response.sendRedirect("index.jsp");
			
			}
		
		}
		else	
		{
		
		
		Usu usuario = new Usu();
		UsuariDao usudao = new UsuariDao();
		
		usuario.setNombre(usu);
		usuario.setContrasenia(contra);
		
		
		int validar = usudao.ingresoUsuario(usuario).size();
	   if (validar==1) {
		   Consulta consul = new Consulta();
		   consuldao consuldao = new consuldao();
		   
		   
		   consul.setIdconsulta(usuario.getIdusuario());
		   consul.setNombre(usu);
		   consuldao.agregarDatosConsulta(consul);
		   
		   
		  HttpSession seccion = request.getSession(true);//para observar quien inicia secion
		 seccion.setAttribute("usuario", usu);
		   response.sendRedirect("carga.jsp");
	   }else {
		   System.out.println("ERROR1");
	   }
	}

	}
}




