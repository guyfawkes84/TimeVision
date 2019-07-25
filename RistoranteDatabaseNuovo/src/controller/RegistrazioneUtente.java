package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cameriere;


/**
 * Servlet implementation class RegistrazioneUtente
 */
@WebServlet("/RegistrazioneUtente")
public class RegistrazioneUtente extends HttpServlet {
	private static Connection conn;
	Cameriere c = new Cameriere();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrazioneUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sql="INSERT INTO user (username, password) VALUES(?, ?)";
		try{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.executeUpdate();
		}catch(SQLException f) {
			System.out.println("la query è mal formattata");	
		}
	}
}


