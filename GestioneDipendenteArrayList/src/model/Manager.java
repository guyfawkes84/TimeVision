package model;

public class Manager extends Dipendente {

	private String livello_funzionale;

	public String getLivello_funzionale() {
		
			return livello_funzionale;
	}
	
	public void setLivello_funzionale(String livello_funzionale) {
		this.livello_funzionale = livello_funzionale;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Livello Funzionale: " + livello_funzionale + "\n";
	}

	public Manager(String livello_funzionale) {
		super();
		this.livello_funzionale = livello_funzionale;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String nome, String cognome, String codiceFiscale, String dataNascita, boolean sesso) {
		super(id, nome, cognome, codiceFiscale, dataNascita, sesso);
		// TODO Auto-generated constructor stub
	}

	public Manager(String nomeAzienda, double stipendio, double oreLavorative, int id_ruolo) {
		super(nomeAzienda, stipendio, oreLavorative, id_ruolo);
		// TODO Auto-generated constructor stub
	}

	

	

	
	
	
	
}
