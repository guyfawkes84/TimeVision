package model.dao;

import java.sql.*;

import model.Persona;


public class Crud implements iCrud {
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	/*
	 * Connessione al dabatase
	 */
	static{
		final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver"; //Driver jdbc
		final String DB_URL = "jdbc:mysql://127.0.0.1:3306/login"; //Indirizzo per la connessione al database
		final String DB_USERNAME = "root";
		final String DB_PASSWORD = "";
		try{
			Class.forName(DB_DRIVER_CLASS);
			Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("");
			System.out.println("Connessione al database avvenuta con successo!");
			System.out.println("");
		}catch(ClassNotFoundException e){
			System.out.println("");
			e.printStackTrace();
			System.out.println("");
			System.out.println("Classe non trovata!");
			System.out.println();
		}catch(SQLException ex){
			System.out.println("");
			ex.printStackTrace();
			System.out.println("");
			System.out.println("Connessione al database non riuscita!");
			System.out.println("");
		}
	}

	public void registrazione(Persona p){
		try{
			String sql = "INSERT INTO user (nome, cognome, eta, username, password) VALUES (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCognome());
			ps.setInt(3, p.getEta());
			ps.setString(4, p.getUsername());
			ps.setString(5, p.getPsw());
			ps.executeUpdate();
			System.out.println("Inserimento avvenuto con successo!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Inserimento fallito!");
		}
	}
}
