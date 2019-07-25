package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cameriere;


public class DaoGen {

	private static Connection conn;
	private final static String URL="jdbc:mysql://localhost:3306/ristorante";
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


}
