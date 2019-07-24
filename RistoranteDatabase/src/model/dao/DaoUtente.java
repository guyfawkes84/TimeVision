package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Utente;

public class DaoUtente {
	
	private static Connection conn;
	private final static String URL="jdbc:mysql://localhost:3306/login";
	private final static String USER="root";
	private final static String PASSWORD="";
	private final static String DRIVER="com.mysql.jdbc.Driver";
	
	static {
		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(ClassNotFoundException w) {
			System.out.println("Driver mancante!");
		}catch(SQLException f) {
			System.out.println("Stringa di connessione sbagliata!");
		}
	}
	
	public void inserimento(Utente u) {
		String sql="insert into Utenti(nome,cognome,username,pass) values(?,?,?,?)";
		try{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCognome());
			ps.setString(3, u.getUsername());
			ps.setString(4, u.getPassword());
			ps.executeUpdate();
		}catch(SQLException f) {
		System.out.println("la query è mal formattata");	
		}
		}
		
	}

