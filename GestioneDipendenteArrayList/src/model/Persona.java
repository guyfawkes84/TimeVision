package model;

import java.io.Serializable;

public class Persona implements Serializable, Comparable <Persona> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String dataNascita;
	private boolean sesso;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean isSesso() {
		return sesso;
	}

	public void setSesso(boolean sesso) {
		this.sesso = sesso;
	}
	
	public Persona() {
		
	}
	
	public Persona(int id, String nome, String cognome, String codiceFiscale, String dataNascita, boolean sesso) {
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
		this.codiceFiscale=codiceFiscale;
		this.dataNascita=dataNascita;
		this.sesso=sesso;
	}
	
	public String toString() {
		String sesso2;
		if(isSesso()) {
			sesso2="Femmina";
		}
		else {
			sesso2="Maschio";
		}
		return "\n Id: " + id + "\n Nome: " + nome + "\n Cognome: " + cognome + "\n Codice Fiscale: " + codiceFiscale + 
				"\n Data di Nascita: " + dataNascita + "\n Sesso: " + sesso2 + "\n";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		if (codiceFiscale == null) {
			if (other.codiceFiscale != null)
				return false;
		} else if (!codiceFiscale.equals(other.codiceFiscale))
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
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sesso != other.sesso)
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona p) {
		int risultato;
		String nominativo1, nominativo2;
		nominativo1= cognome + nome;
		nominativo2= p.getCognome() + p.getNome();
		risultato=nominativo1.compareTo(nominativo2);
		return risultato;
	}
}

