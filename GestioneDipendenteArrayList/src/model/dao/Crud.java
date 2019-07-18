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


	static{
		final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/azienda";
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

	public void inserimento(Dipendente d) {
		//DATABASE
		dipendenti.add(d);
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

