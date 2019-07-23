package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;
import model.dao.Crud;

/**
 * Servlet implementation class ServletDispatcher
 */
@WebServlet("/ServletDispatcher")
public class ServletDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("error.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Crud c = new Crud();
		Persona p = new Persona();
		p.setNome(request.getParameter("nome"));
		p.setCognome(request.getParameter("cognome"));
		p.setEta(Integer.parseInt(request.getParameter("eta")));
		p.setUsername(request.getParameter("username"));
		p.setPsw(request.getParameter("psw"));
		c.registrazione(p);
		response.sendRedirect("success.html");
	}

}
