package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		

		
		String nome = request.getParameter("nome");
		if (nome != null) {
			request.setAttribute("nome", nome);
		}
		else{
			request.setAttribute("nome", "");
		}
		String cognome = request.getParameter("cognome");
		if (cognome != null) {
			request.setAttribute("cognome", cognome);
		}
		else{
			request.setAttribute("cognome", "");
		}
		int eta = Integer.parseInt(request.getParameter("eta"));
		if (eta <= 0){
			request.setAttribute("eta", eta);
		}
		else{
			request.setAttribute("eta", "");
		}
		String username = request.getParameter("username");
		if (username != null) {
			request.setAttribute("username", username);
		}
		else{
			request.setAttribute("username", "");
		}
		String password = request.getParameter("password");
		if (password != null) {
			request.setAttribute("password", password);
		}
		else{
			request.setAttribute("password", "");
		}
		
		RequestDispatcher view;
		
		view = request.getRequestDispatcher("registrazione.jsp");
		
		view.forward(request, response);
	}

}
