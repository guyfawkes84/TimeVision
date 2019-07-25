package model;

public class Tavoli {
	private int num_tavolo;
	private int id_tavolo;
	/**
	 * @return the num_tavolo
	 */
	public int getNum_tavolo() {
		return num_tavolo;
	}
	/**
	 * @param num_tavolo the num_tavolo to set
	 */
	public void setNum_tavolo(int num_tavolo) {
		this.num_tavolo = num_tavolo;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tavoli [num_tavolo=" + num_tavolo + ", id_tavolo=" + id_tavolo + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_tavolo;
		result = prime * result + num_tavolo;
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
		Tavoli other = (Tavoli) obj;
		if (id_tavolo != other.id_tavolo)
			return false;
		if (num_tavolo != other.num_tavolo)
			return false;
		return true;
	}
	public Tavoli(int num_tavolo, int id_tavolo) {
		super();
		this.num_tavolo = num_tavolo;
		this.id_tavolo = id_tavolo;
	}
	public Tavoli() {
		super();
		// TODO Auto-generated constructor stub
	}


}
