package model;

import java.util.ArrayList;

public class Tavolo {
	
	private int numero;
	private int coperti;
	private double conto;
	
	private ArrayList<Piatto> piattoscelto;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCoperti() {
		return coperti;
	}
	public void setCoperti(int coperti) {
		this.coperti = coperti;
	}
	public ArrayList<Piatto> getPiattoscelto() {
		return piattoscelto;
	}
		
	public double getConto() {
		return conto;
	}
	public void setConto(int conto) {
		this.conto = conto;
	}
	
	
	@Override
	public String toString() {
		return "Tavolo [numero=" + numero + ", coperti=" + coperti + ", conto=" + conto + ", piattoscelto="
				+ piattoscelto + "]";
	}
	public Tavolo(int numero, int coperti, ArrayList<Piatto> piattoscelto) {
		super();
		this.numero = numero;
		this.coperti = coperti;
		this.piattoscelto = piattoscelto;
	}
	
	
	

}