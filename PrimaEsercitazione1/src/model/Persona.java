package model;

import java.util.Date;

public class Persona {

	//attributi privati
	public static int contaPersona;
	private String nome,cognome, cf;
	private Date dataNascita;
	private boolean sesso;
	private int seriale;

	public static void conta() {
		System.out.println("ciao");
	}
	// get e set
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
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public boolean isSesso() {
		return sesso;
	}
	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}
	public int getSeriale() {
		return seriale;
	}
	public void setSeriale(int seriale) {
		this.seriale = seriale;
	}


	public Persona() {

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cf == null) ? 0 : cf.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + seriale;
		result = prime * result + (sesso ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cf == null) {
			if (other.cf != null)
				return false;
		} else if (!cf.equals(other.cf))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataNascita == null) {
			if (other.dataNascita != null)
				return false;
		} else if (!dataNascita.equals(other.dataNascita))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (seriale != other.seriale)
			return false;
		if (sesso != other.sesso)
			return false;
		return true;
	}

	public String toString() {
		if(sesso) {
			return nome+","+cognome+", femmina";
			}else {
			return nome+","+cognome+", maschio";
		}
	}
	public Persona(String nome, String cognome, String cf, Date dataNascita, boolean sesso, int seriale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.seriale = seriale;
	}	



}
