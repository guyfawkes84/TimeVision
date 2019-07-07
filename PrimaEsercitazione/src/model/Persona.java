package model;

import java.util.Date;

public class Persona {
	
	//PARAMETRI
	private String nome;
	private String cognome;
	private String cf;
	private String seriale;
	private boolean sesso;
	private Date data_nascita;
	
	//Costruttore
	public Persona(){

	}
	
	//Metodi Set e Get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getSeriale() {
		return seriale;
	}

	public void setSeriale(String seriale) {
		this.seriale = seriale;
	}

	public boolean isSesso() {
		return sesso;
	}

	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}

	public Date getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	
	

}
