package model;

import java.io.Serializable;

public class Dipendente implements Serializable {

private String nome,cognome,email,cellulare,titoloStudio,codiceFiscale,matricola,dataNascita,luogoNascita;
private double stipendio;
private boolean sesso;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCellulare() {
	return cellulare;
}
public void setCellulare(String cellulare) {
	this.cellulare = cellulare;
}
public String getTitoloStudio() {
	return titoloStudio;
}
public void setTitoloStudio(String titoloStudio) {
	this.titoloStudio = titoloStudio;
}
public String getCodiceFiscale() {
	return codiceFiscale;
}
public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
}
public String getMatricola() {
	return matricola;
}
public void setMatricola(String matricola) {
	this.matricola = matricola;
}
public String getDataNascita() {
	return dataNascita;
}
public void setDataNascita(String dataNascita) {
	this.dataNascita = dataNascita;
}
public String getLuogoNascita() {
	return luogoNascita;
}
public void setLuogoNascita(String luogoNascita) {
	this.luogoNascita = luogoNascita;
}
public double getStipendio() {
	return stipendio;
}
public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
}
public boolean isSesso() {
	return sesso;
}
public void setSesso(boolean sesso) {
	this.sesso = sesso;
}
public Dipendente(String nome, String cognome, String email, String cellulare, String titoloStudio,
		String codiceFiscale, String matricola, String dataNascita, String luogoNascita, double stipendio,
		boolean sesso) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.cellulare = cellulare;
	this.titoloStudio = titoloStudio;
	this.codiceFiscale = codiceFiscale;
	this.matricola = matricola;
	this.dataNascita = dataNascita;
	this.luogoNascita = luogoNascita;
	this.stipendio = stipendio;
	this.sesso = sesso;
}
public Dipendente() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cellulare == null) ? 0 : cellulare.hashCode());
	result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
	result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
	result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((luogoNascita == null) ? 0 : luogoNascita.hashCode());
	result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + (sesso ? 1231 : 1237);
	long temp;
	temp = Double.doubleToLongBits(stipendio);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((titoloStudio == null) ? 0 : titoloStudio.hashCode());
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
	Dipendente other = (Dipendente) obj;
	if (cellulare == null) {
		if (other.cellulare != null)
			return false;
	} else if (!cellulare.equals(other.cellulare))
		return false;
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
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (luogoNascita == null) {
		if (other.luogoNascita != null)
			return false;
	} else if (!luogoNascita.equals(other.luogoNascita))
		return false;
	if (matricola == null) {
		if (other.matricola != null)
			return false;
	} else if (!matricola.equals(other.matricola))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (sesso != other.sesso)
		return false;
	if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
		return false;
	if (titoloStudio == null) {
		if (other.titoloStudio != null)
			return false;
	} else if (!titoloStudio.equals(other.titoloStudio))
		return false;
	return true;
}
@Override
public String toString() {
	return  nome + "," + cognome + "," + email + "," + cellulare
			+ "," + titoloStudio + "," + codiceFiscale + "," + matricola
			+ "," + dataNascita + "," + luogoNascita + "," + stipendio;
}

}