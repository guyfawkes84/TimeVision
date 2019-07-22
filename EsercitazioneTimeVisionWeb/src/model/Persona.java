package model;

public class Persona {
private String nome;
private String cognome;
private String username;
private String psw;
private int eta;
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
 * @return the cognome
 */
public String getCognome() {
	return cognome;
}
/**
 * @param cognome the cognome to set
 */
public void setCognome(String cognome) {
	this.cognome = cognome;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the psw
 */
public String getPsw() {
	return psw;
}
/**
 * @param psw the psw to set
 */
public void setPsw(String psw) {
	this.psw = psw;
}
/**
 * @return the eta
 */
public int getEta() {
	return eta;
}
/**
 * @param eta the eta to set
 */
public void setEta(int eta) {
	this.eta = eta;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
	result = prime * result + eta;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + ((psw == null) ? 0 : psw.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
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
	Persona other = (Persona) obj;
	if (cognome == null) {
		if (other.cognome != null)
			return false;
	} else if (!cognome.equals(other.cognome))
		return false;
	if (eta != other.eta)
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (psw == null) {
		if (other.psw != null)
			return false;
	} else if (!psw.equals(other.psw))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Persona [nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", psw=" + psw + ", eta=" + eta
			+ "]";
}
public Persona(String nome, String cognome, String username, String psw, int eta) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.username = username;
	this.psw = psw;
	this.eta = eta;
}
public Persona() {
	super();
	// TODO Auto-generated constructor stub
}

}
