package model;

public class Manager extends Dipendente {
private String areaResponsabilita;
private double benefit;
public String getAreaResponsabilita() {
	return areaResponsabilita;
}
public void setAreaResponsabilita(String areaResponsabilita) {
	this.areaResponsabilita = areaResponsabilita;
}
public double getBenefit() {
	return benefit;
}
public void setBenefit(double benefit) {
	this.benefit = benefit;
}
public Manager() {
	super();
	// TODO Auto-generated constructor stub
}
public Manager(String nome, String cognome, String email, String cellulare, String titoloStudio, String codiceFiscale,
		String matricola, String dataNascita, String luogoNascita, double stipendio, boolean sesso,String areaResponsabilita,double benefit) {
	super(nome, cognome, email, cellulare, titoloStudio, codiceFiscale, matricola, dataNascita, luogoNascita, stipendio,
			sesso);
	this.areaResponsabilita=areaResponsabilita;
	this.benefit=benefit;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return super.toString()+ ","+areaResponsabilita + "," + benefit;
}

}
