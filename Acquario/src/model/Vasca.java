package model;

public class Vasca {
	private String nome1="Vasca1";
	private String nome2="Vasca2";
	/**
	 * @return the nome1
	 */
	public String getNome1() {
		return nome1;
	}
	/**
	 * @param nome1 the nome1 to set
	 */
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	/**
	 * @return the nome2
	 */
	public String getNome2() {
		return nome2;
	}
	/**
	 * @param nome2 the nome2 to set
	 */
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome1 == null) ? 0 : nome1.hashCode());
		result = prime * result + ((nome2 == null) ? 0 : nome2.hashCode());
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
		Vasca other = (Vasca) obj;
		if (nome1 == null) {
			if (other.nome1 != null)
				return false;
		} else if (!nome1.equals(other.nome1))
			return false;
		if (nome2 == null) {
			if (other.nome2 != null)
				return false;
		} else if (!nome2.equals(other.nome2))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vasca [nome1=" + nome1 + ", nome2=" + nome2 + "]";
	}
	public Vasca(String nome1, String nome2) {
		this.nome1 = nome1;
		this.nome2 = nome2;
	}

	public Vasca(){
		
	}
}
