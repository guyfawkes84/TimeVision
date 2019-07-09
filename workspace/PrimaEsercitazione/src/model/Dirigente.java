package model;

import java.util.Date;

public class Dirigente extends Manager {
private int areaResponsabilita;

public int getAreaResponsabilita() {
	return areaResponsabilita;
}

public void setAreaResponsabilita(int areaResponsabilita) {
	this.areaResponsabilita = areaResponsabilita;
}

public Dirigente(String nome, String cognome, String cf, Date dataNascita, boolean sesso, int seriale, int id_ruolo,
		double stipendio, double oreLavorative, String azienda, int livelloFunzionale, double benefit,
		int areaResponsabilita) {
	super(nome, cognome, cf, dataNascita, sesso, seriale, id_ruolo, stipendio, oreLavorative, azienda,
			livelloFunzionale, benefit);
	this.areaResponsabilita = areaResponsabilita;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + areaResponsabilita;
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
	Dirigente other = (Dirigente) obj;
	if (areaResponsabilita != other.areaResponsabilita)
		return false;
	return true;
}

public Dirigente() {
	super();
	// TODO Auto-generated constructor stub
}
public String toString() {

	return super.toString()+","+areaResponsabilita;
}

}
