package model;

public class Dirigente extends Manager{

	private String area_funzionalita;

	public String getArea_funzionalita() {
		return area_funzionalita;
	}

	public void setArea_funzionalita(String area_funzionalita) {
		this.area_funzionalita = area_funzionalita;
	}

	@Override
	public String toString() {
		return super.toString() + " Area Funzionalità: " + area_funzionalita;
	}

	public Dirigente(String area_funzionalita) {
		super();
		this.area_funzionalita = area_funzionalita;
	}

	public Dirigente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dirigente(int id, String nome, String cognome, String codiceFiscale, String dataNascita, boolean sesso) {
		super(id, nome, cognome, codiceFiscale, dataNascita, sesso);
		// TODO Auto-generated constructor stub
	}

	public Dirigente(String nomeAzienda, double stipendio, double oreLavorative, int id_ruolo) {
		super(nomeAzienda, stipendio, oreLavorative, id_ruolo);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
