package model;

public class Piatto {
private double prezzo;
private String nome;
public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Piatto(double prezzo, String nome) {
	super();
	this.prezzo = prezzo;
	this.nome = nome;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	long temp;
	temp = Double.doubleToLongBits(prezzo);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Piatto other = (Piatto) obj;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
		return false;
	return true;
}
@Override
public String toString() {
	return "Piatto [prezzo=" + prezzo + ", nome=" + nome + "]";
}


}
