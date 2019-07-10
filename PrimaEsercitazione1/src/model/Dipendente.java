package model;

import java.util.Date;

public class Dipendente extends Persona {
private int id_ruolo;
private double stipendio;
private double oreLavorative;
private String azienda;
public int getId_ruolo() {
	return id_ruolo;
}
public void setId_ruolo(int id_ruolo) {
	this.id_ruolo = id_ruolo;
}
public double getStipendio() {
	return stipendio;
}
public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
}
public double getOreLavorative() {
	return oreLavorative;
}
public void setOreLavorative(double oreLavorative) {
	this.oreLavorative = oreLavorative;
}
public String getAzienda() {
	return azienda;
}
public void setAzienda(String azienda) {
	this.azienda = azienda;
}
public Dipendente() {
	super();
	// TODO Auto-generated constructor stub
}
public Dipendente(String nome, String cognome, String cf, Date dataNascita, boolean sesso, int seriale, int id_ruolo,
		double stipendio, double oreLavorative, String azienda) {
	super(nome, cognome, cf, dataNascita, sesso, seriale);
	this.id_ruolo = id_ruolo;
	this.stipendio = stipendio;
	this.oreLavorative = oreLavorative;
	this.azienda = azienda;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((azienda == null) ? 0 : azienda.hashCode());
	result = prime * result + id_ruolo;
	long temp;
	temp = Double.doubleToLongBits(oreLavorative);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(stipendio);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dipendente other = (Dipendente) obj;
	if (azienda == null) {
		if (other.azienda != null)
			return false;
	} else if (!azienda.equals(other.azienda))
		return false;
	if (id_ruolo != other.id_ruolo)
		return false;
	if (Double.doubleToLongBits(oreLavorative) != Double.doubleToLongBits(other.oreLavorative))
		return false;
	if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
		return false;
	return true;
}

public String toString() {
	
	return super.toString()+","+id_ruolo+","+oreLavorative+","+stipendio+","+azienda;
}

}
