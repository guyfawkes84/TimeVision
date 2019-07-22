package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;
import model.dao.Crud;

/**
 * Servlet implementation class GestioneNominativi
 */
@WebServlet("/GestioneNominativi")
public class GestioneNominativi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestioneNominativi() {
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
		
		Persona p = new Persona();
		String nome = request.getParameter("nome");
		p.setNome(nome);
		String cognome = request.getParameter("cognome");
		p.setCognome(cognome);
		int eta = Integer.parseInt(request.getParameter("eta"));
		p.setEta(eta);
		String username = request.getParameter("username");
		p.setUsername(username);
		String psw = request.getParameter("psw");
		p.setPsw(psw);
		Crud c = new Crud();
		c.registrazione(p);
		response.sendRedirect("success.html");

	}

}
