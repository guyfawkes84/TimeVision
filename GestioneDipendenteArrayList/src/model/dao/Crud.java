package model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import model.ConfrontaPersona;
import model.Dipendente;

public class Crud implements ICrud{
	private ArrayList<Dipendente> dipendenti;
	private ArrayList<Dipendente> listaordinata;
	private static Crud instanza = null;
	private static Connection conn = null;
	private static Statement s = null;
	private static PreparedStatement ps = null;

	/*
	 * Connessione al dabatase
	 */
	static{
		final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver"; //Driver jdbc
		final String DB_URL = "jdbc:mysql://127.0.0.1:3306/azienda"; //Indirizzo per la connessione al database
		final String DB_USERNAME = "root";
		final String DB_PASSWORD = "";
		try{
			Class.forName(DB_DRIVER_CLASS);
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
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

	/*
	 * -----------------------------------------------------------------------------------------------------
	 */

	public static Crud getInstanza() {

		if(instanza==null) {
			instanza=new Crud();
		}
		return instanza;
	}

	public Crud() {
		this.dipendenti = new ArrayList<Dipendente>();
		this.listaordinata = new ArrayList<Dipendente>();
	}

	public ArrayList<Dipendente> ordina(){
		listaordinata.addAll(dipendenti);
		ConfrontaPersona comparatore = new ConfrontaPersona();
		listaordinata.sort(comparatore);
		return listaordinata;
	}

	/*
	 * Inserimento dati in Database
	 */
	public void inserimento(Dipendente d) {

		String sql = "INSERT INTO dipendenti (nome, cognome, codice_fiscale, data_nascita, sesso, nome_azienda, stipendio, ore_lavorative) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		String nome= d.getNome();
		String cognome= d.getCognome();
		String codice_fiscale= d.getCodiceFiscale();
		String data_nascita= d.getDataNascita();
		boolean sesso= d.isSesso();
		String nome_azienda = d.getNomeAzienda();
		double stipendio = d.getStipendio();
		double ore_lavorative = d.getOreLavorative();
		try{
			ps = (PreparedStatement) conn.prepareStatement(sql);

			
			ps.setString(1, nome);
			ps.setString(2, cognome);
			ps.setString(3, codice_fiscale);
			ps.setString(4, data_nascita);
			ps.setBoolean(5, sesso);
			ps.setString(6, nome_azienda);
			ps.setDouble(7, stipendio);
			ps.setDouble(8, ore_lavorative);
			ps.executeUpdate();
			System.out.println("Inserimento avvenuto con successo!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Inserimento fallito!");
		}
	}
	
	public void rollback(){
		String sql = "ROLLBACK";
		
		try{
			
			s=(Statement) conn.createStatement();
			s.executeUpdate(sql);
			System.out.println("Rollback eseguita!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Rollback fallita!");
		}
	}

	/*
	 * Svuota la tabella
	 */

	public void truncate_database(){
		String sql = "TRUNCATE dipendenti";

		try{
			s = (Statement) conn.createStatement();
			s.executeUpdate(sql);
			System.out.println("Truncate avvenuta con successo!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Truncate fallita!");
		}
	}
	/*
	 * Elimina tabella
	 */

	public void drop_database(){

		String sql = "DROP TABLE dipendenti";
		try{
			s = (Statement) conn.createStatement();
			s.executeUpdate(sql);
			System.out.println("Tabella eliminata con successo!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Eliminazione tabella fallita!");
		}
	}

	/*
	 * Creazione tabella
	 */

	public void create_table_Database(){
		String sql = "CREATE TABLE azienda.dipendenti ( ID INT(10) NOT NULL AUTO_INCREMENT , nome VARCHAR(20) NOT NULL , cognome VARCHAR(30) NOT NULL , codice_fiscale VARCHAR(16) NOT NULL , data_nascita DATE NOT NULL , sesso CHAR(1) NOT NULL , stipendio DOUBLE(10) NOT NULL , ore_lavorative DOUBLE(5) NOT NULL , PRIMARY KEY (ID)) ENGINE = InnoDB";
		try{
			s = (Statement) conn.createStatement();
			s.executeUpdate(sql);
			System.out.println("Creazione tabella avvenuta con successo!");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Creazione fallita!");
		}
	}

	public ArrayList<Dipendente> visualizza() {
		return dipendenti;
	}

	public int getPosizione(Dipendente d) {
		return dipendenti.indexOf(d);
	}

	public Dipendente ricerca(String codF) {

		for (int i = 0; i < dipendenti.size(); i++) {
			if (dipendenti.get(i).getCodiceFiscale().equals(codF)) {
				return dipendenti.get(i);
			}
		}
		return null;
	}

	public void modifica(int i, Dipendente d) {

		dipendenti.set(i, d);

	}


	public void eliminadaCF(Dipendente d) {
		dipendenti.remove(d);
	}

	@Override
	public boolean esisteAzienda() {

		File file = new File("Azienda.dat");

		return file.exists();
	}

	@Override
	public void salva() {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Azienda.dat")));
			oos.writeObject(dipendenti);
			oos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public boolean carica() {

		if(esisteAzienda()) {

			try {
				ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Azienda.dat")));
				dipendenti=(ArrayList<Dipendente>) ois.readObject();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;	
		}

		else {
			return false;
		}

	}
}

