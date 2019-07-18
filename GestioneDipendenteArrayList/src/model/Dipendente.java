package model;

public class Dipendente extends Persona{

	private String nomeAzienda;
	private double stipendio;
	private double oreLavorative;
	private int id_ruolo;
	
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public double getOreLavorative() {
		return oreLavorative;
	}
	public void setOreLavorative(double oreLavorative) {
		this.oreLavorative = oreLavorative;
	}
	
	
	
	public int getId_ruolo() {
		return id_ruolo;
	}
	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}
	@Override
	public String toString() {
		
		String ruolo ="";
		
		if(id_ruolo==1) {
			ruolo="Dipendente";
		}
		else if(id_ruolo==2) {
			ruolo="Manager";
		}
		
		else if(id_ruolo==3) {
			ruolo="Dirigente";
		}
		
		return  super.toString() +" Ruolo: " + ruolo + "\n Nome Azienda: " + nomeAzienda +"\n Stipendio:" + stipendio + "\n Ore Lavorative:"
				+ oreLavorative;
	}
	
	public Dipendente(String nomeAzienda, double stipendio, double oreLavorative, int id_ruolo) {
		super();
		this.nomeAzienda = nomeAzienda;
		this.stipendio = stipendio;
		this.oreLavorative = oreLavorative;
		this.id_ruolo=id_ruolo;
	}
	
	public Dipendente() {
		super();
		
	}
	
	public Dipendente(int id, String nome, String cognome, String codiceFiscale, String dataNascita, boolean sesso) {
		super(id, nome, cognome, codiceFiscale, dataNascita, sesso);
		
	}
	
	
}
