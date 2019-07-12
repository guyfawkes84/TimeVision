package model;

import java.util.ArrayList;

public class Tavolo {
private int numeroCoperti,numeroTavolo;
private ArrayList<Piatto> piattiScelti;
private double conto;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(conto);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + numeroCoperti;
	result = prime * result + numeroTavolo;
	result = prime * result + ((piattiScelti == null) ? 0 : piattiScelti.hashCode());
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
	Tavolo other = (Tavolo) obj;
	if (Double.doubleToLongBits(conto) != Double.doubleToLongBits(other.conto))
		return false;
	if (numeroCoperti != other.numeroCoperti)
		return false;
	if (numeroTavolo != other.numeroTavolo)
		return false;
	if (piattiScelti == null) {
		if (other.piattiScelti != null)
			return false;
	} else if (!piattiScelti.equals(other.piattiScelti))
		return false;
	return true;
}
public Tavolo() {
	this.piattiScelti=new ArrayList<Piatto>();
}
public Tavolo(int numeroCoperti, int numeroTavolo, ArrayList<Piatto> piattiScelti, double conto) {
	super();
	this.numeroCoperti = numeroCoperti;
	this.numeroTavolo = numeroTavolo;
	this.piattiScelti = piattiScelti;
	this.conto = conto;
}
@Override
public String toString() {
	return "Tavolo [numeroCoperti=" + numeroCoperti + ", numeroTavolo=" + numeroTavolo + ", piattiScelti="
			+ piattiScelti + ", conto=" + conto + "]";
}
public double getConto() {
	return conto;
}
public void setConto(double conto) {
	this.conto = conto;
}
public int getNumeroCoperti() {
	return numeroCoperti;
}
public void setNumeroCoperti(int numeroCoperti) {
	this.numeroCoperti = numeroCoperti;
}
public int getNumeroTavolo() {
	return numeroTavolo;
}
public void setNumeroTavolo(int numeroTavolo) {
	this.numeroTavolo = numeroTavolo;
}
public ArrayList<Piatto> getPiattiScelti() {
	return piattiScelti;
}
public void setPiattiScelti(ArrayList<Piatto> piattiScelti) {
	this.piattiScelti = piattiScelti;
}

}
