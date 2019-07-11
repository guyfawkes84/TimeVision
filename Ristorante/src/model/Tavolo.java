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
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(conto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + coperti;
		result = prime * result + numero;
		result = prime * result + ((piattoscelto == null) ? 0 : piattoscelto.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (coperti != other.coperti)
			return false;
		if (numero != other.numero)
			return false;
		if (piattoscelto == null) {
			if (other.piattoscelto != null)
				return false;
		} else if (!piattoscelto.equals(other.piattoscelto))
			return false;
		return true;
	}
	public Tavolo(int numero, int coperti, ArrayList<Piatto> piattoscelto) {
		this.numero = numero;
		this.coperti = coperti;
		this.piattoscelto = piattoscelto;
	}
	
	public Tavolo(){
	}
	
	
	

}