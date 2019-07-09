package model;

import java.util.Date;

public class Manager extends Dipendente {
private int livelloFunzionale;
private double benefit;
public int getLivelloFunzionale() {
	return livelloFunzionale;
}
public void setLivelloFunzionale(int livelloFunzionale) {
	this.livelloFunzionale = livelloFunzionale;
}
public double getBenefit() {
	return benefit;
}
public void setBenefit(double benefit) {
	this.benefit = benefit;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(benefit);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + livelloFunzionale;
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
	Manager other = (Manager) obj;
	if (Double.doubleToLongBits(benefit) != Double.doubleToLongBits(other.benefit))
		return false;
	if (livelloFunzionale != other.livelloFunzionale)
		return false;
	return true;
}
public Manager(String nome, String cognome, String cf, Date dataNascita, boolean sesso, int seriale, int id_ruolo,
		double stipendio, double oreLavorative, String azienda, int livelloFunzionale, double benefit) {
	super(nome, cognome, cf, dataNascita, sesso, seriale, id_ruolo, stipendio, oreLavorative, azienda);
	this.livelloFunzionale = livelloFunzionale;
	this.benefit = benefit;
}
public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public String toString() {
	return super.toString()+","+livelloFunzionale+","+benefit;
}
}
