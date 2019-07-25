package model;

public class Ordine {
	private int quantita;
	private int id_tavolo;
	private int id_piatto;
	/**
	 * @return the quantita
	 */
	public int getQuantita() {
		return quantita;
	}
	/**
	 * @param quantita the quantita to set
	 */
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	/**
	 * @return the id_tavolo
	 */
	public int getId_tavolo() {
		return id_tavolo;
	}
	/**
	 * @param id_tavolo the id_tavolo to set
	 */
	public void setId_tavolo(int id_tavolo) {
		this.id_tavolo = id_tavolo;
	}
	/**
	 * @return the id_piatto
	 */
	public int getId_piatto() {
		return id_piatto;
	}
	/**
	 * @param id_piatto the id_piatto to set
	 */
	public void setId_piatto(int id_piatto) {
		this.id_piatto = id_piatto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ordine [quantita=" + quantita + ", id_tavolo=" + id_tavolo + ", id_piatto=" + id_piatto + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_piatto;
		result = prime * result + id_tavolo;
		result = prime * result + quantita;
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
		Ordine other = (Ordine) obj;
		if (id_piatto != other.id_piatto)
			return false;
		if (id_tavolo != other.id_tavolo)
			return false;
		if (quantita != other.quantita)
			return false;
		return true;
	}
	public Ordine(int quantita, int id_tavolo, int id_piatto) {
		super();
		this.quantita = quantita;
		this.id_tavolo = id_tavolo;
		this.id_piatto = id_piatto;
	}
	public Ordine() {
		super();
		// TODO Auto-generated constructor stub
	}


}
