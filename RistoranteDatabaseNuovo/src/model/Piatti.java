package model;

public class Piatti {
	private String nome;
	private double prezzo;
	private int id_piatto;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
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
		return "Piatti [nome=" + nome + ", prezzo=" + prezzo + ", id_piatto=" + id_piatto + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_piatto;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Piatti other = (Piatti) obj;
		if (id_piatto != other.id_piatto)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		return true;
	}
	public Piatti(String nome, double prezzo, int id_piatto) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.id_piatto = id_piatto;
	}
	public Piatti() {
		super();
		// TODO Auto-generated constructor stub
	}

}
