package model;

public class Dirigente extends Manager {
private String livelloFunzionale;
private double premio;
public String getLivelloFunzionale() {
	return livelloFunzionale;
}
public void setLivelloFunzionale(String livelloFunzionale) {
	this.livelloFunzionale = livelloFunzionale;
}
public double getPremio() {
	return premio;
}
public void setPremio(double premio) {
	this.premio = premio;
}
public Dirigente() {
	super();
	// TODO Auto-generated constructor stub
}
public Dirigente(String nome, String cognome, String email, String cellulare, String titoloStudio, String codiceFiscale,
		String matricola, String dataNascita, String luogoNascita, double stipendio, boolean sesso,
		String areaResponsabilita, double benefit,String livelloFunzionale,double premio) {
	super(nome, cognome, email, cellulare, titoloStudio, codiceFiscale, matricola, dataNascita, luogoNascita, stipendio,
			sesso, areaResponsabilita, benefit);
	// TODO Auto-generated constructor stub
this.livelloFunzionale=livelloFunzionale;
this.premio=premio;
}
@Override
public String toString() {
	return super.toString()+","+livelloFunzionale+ "," + premio;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((livelloFunzionale == null) ? 0 : livelloFunzionale.hashCode());
	long temp;
	temp = Double.doubleToLongBits(premio);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Dirigente other = (Dirigente) obj;
	if (livelloFunzionale == null) {
		if (other.livelloFunzionale != null)
			return false;
	} else if (!livelloFunzionale.equals(other.livelloFunzionale))
		return false;
	if (Double.doubleToLongBits(premio) != Double.doubleToLongBits(other.premio))
		return false;
	return true;
}

}
