package view;

import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Manager;

public class Vista {

	Scanner sc= new Scanner(System.in);

	public String leggiStringa(String mess) {
		String s;
		System.out.println(mess);
		s=sc.nextLine();
		return s;
	}

	public int leggiIntero(String mess) {
		int a;
		String s;
		boolean flag;
		do {

			flag=false;
			System.out.println(mess);
			s=sc.nextLine();
			try {
				a=Integer.parseInt(s);
			}catch(NumberFormatException e) {
				System.out.println("Inserisci il numero");
				flag=true;
			}
		}
		while(flag);
		return a=Integer.parseInt(s);
	}

	public Double leggiDouble(String mess) {
		Double a;
		String s;
		boolean flag;
		do {

			flag=false;
			System.out.println(mess);
			s=sc.nextLine();
			try {
				a=Double.parseDouble(s);
			}catch(NumberFormatException e) {
				System.out.println("Inserisci il numero");
				flag=true;
			}
		}
		while(flag);
		return a=Double.parseDouble(s);
	}

	public void menu() {

		System.out.println("**********MENU**********");
		System.out.println("1: INSERISCI ");
		System.out.println("2: VISUALIZZA");
		System.out.println("3: RICERCA");
		System.out.println("4: MODIFICA");
		System.out.println("5: ELIMINA");
		System.out.println("6: SALVA");
		System.out.println("7: CARICA");
		System.out.println("8: ESCI");
		System.out.println("*************************");

	}
	
	public void sottoMenu() {

		System.out.println("**********MENU**********");
		System.out.println("1: DIPENDENTE ");
		System.out.println("2: MANAGER");
		System.out.println("3: DIRIGENTE");
		System.out.println("*************************");

	}
	
	public void menuVisualizazzione() {

		System.out.println("**********MENU**********");
		System.out.println("1: VISUALIZAZZIONE NORMALE ");
		System.out.println("2: VISUALIZAZZIONE ORDINATA ");
		System.out.println("*************************");

	}

	public void mascheraInserimento(Dipendente d) {
		d.setId(leggiIntero("Inserisci ID: "));
		d.setNome(leggiStringa("Inserisci il nome: "));
		d.setCognome(leggiStringa("Inserisci il cognome: "));
		d.setCodiceFiscale(leggiStringa("Inserisci il Codice Fiscale: "));
		d.setDataNascita(leggiStringa("Inserisci la data di nascita: "));

		String s;
		do {
			s=leggiStringa("Inserisci il sesso: (m/f)");
		}
		while(!(s.toLowerCase().equals("m")|| s.toLowerCase().equals("f")));
		if(s.equals("f")) {
			d.setSesso(true);
		}else {
			d.setSesso(false);
		}

		d.setNomeAzienda(leggiStringa("Inserisci il nome dell'Azienda: "));
		d.setStipendio(leggiDouble("Inserisci lo stipendio: "));
		d.setOreLavorative(leggiDouble("Inserisci le ore lavorative"));
		d.setId_ruolo(1);
		
		if(d instanceof Manager) {
			Manager man = (Manager) d;
			man.setLivello_funzionale(leggiStringa("Inserisci Livello Funzionale: "));
			man.setId_ruolo(2);
			
			if (d instanceof Dirigente) {
				Dirigente dir = (Dirigente) d;
				dir.setArea_funzionalita(leggiStringa("Inserisci Area Funzionale: "));
				dir.setId_ruolo(3);
			}
		}

	}

	public void visualizza (Dipendente d) {
		System.out.println(d.toString());
	}

	public Dipendente mascheraModifica (Dipendente d, Dipendente dn) {

		String app;
		int x;
		double y;
		boolean flag;
		do {
			try {
				flag=false;
				app=leggiStringa("ID: ["+d.getId()+"]");
				if(app != "") {
					x=Integer.parseInt(app);
					dn.setId(x);
				}else {dn.setId(dn.getId());}
			}catch(NumberFormatException e) {
				System.out.println("Inserisci il numero");
				flag=true;
			}
		}
		while(flag);

		app=leggiStringa("Nome: ["+d.getNome()+"]");
		if(!app.equals("")) {
			dn.setNome(app);
		}else {dn.setNome(d.getNome());}

		app=leggiStringa("Cognome: ["+d.getCognome()+"]");
		if(!app.equals("")) {
			dn.setCognome(app);
		}else {dn.setCognome(d.getCognome());}

		app=leggiStringa("Codice Fiscale: ["+d.getCodiceFiscale()+"]");
		if(!app.equals("")) {
			dn.setCodiceFiscale(app);
		}else {dn.setCodiceFiscale(d.getCodiceFiscale());}

		app=leggiStringa("Data di Nascita: ["+d.getDataNascita()+"]");
		if(!app.equals("")) {
			dn.setDataNascita(app);
		}else {dn.setDataNascita(d.getDataNascita());}

		do{
			if(d.isSesso()) {
				app=leggiStringa("Sesso (m/f): [Femmina]");
			}else {
				app=leggiStringa("Sesso (m/f): [Maschio]");
			}
			if(!app.equals("")) {
				if(app.toLowerCase().equals("m")) {
					dn.setSesso(false);
				}else if(app.toLowerCase().equals("f")) {
					dn.setSesso(true);
				}
			}else {dn.setSesso(d.isSesso());}
		}while(!(app.toLowerCase().equals("m") || app.toLowerCase().equals("f")));

		app=leggiStringa("Nome Azienda: ["+d.getNomeAzienda()+"]");
		if(!app.equals("")) {
			dn.setNomeAzienda(app);
		}else {dn.setNomeAzienda(dn.getNomeAzienda());}

		do {

			try {
				flag=false;
				app=leggiStringa("Stipendio: ["+d.getStipendio()+"]");
				if(!app.equals("")) {
					y=Double.parseDouble(app);
					dn.setStipendio(y);
				}
					else {dn.setStipendio(dn.getStipendio());}
				}catch(NumberFormatException e) {
					System.out.println("Inserisci il numero");
					flag=true;
				}}
		while(flag);
		do {

			try {
				flag=false;
				app=leggiStringa("Ore Lavorative: ["+d.getOreLavorative()+"]");
				if(!app.equals("")) {
					y=Double.parseDouble(app);
					dn.setOreLavorative(y);
				}
				else {dn.setOreLavorative(d.getOreLavorative());}
			}catch(NumberFormatException e) {

				System.out.println("Inserisci il numero");
				flag=true;
			}}
		while(flag);
		dn.setId_ruolo(1);
		
		if(dn instanceof Manager) {
			Manager man=(Manager) dn;
			if(d instanceof Manager) {
				Manager man1=(Manager) d;
				app=leggiStringa("Livello Funzionale: " + "["+ man1.getLivello_funzionale() +"]");
				if(!app.equals("")) {
					man.setLivello_funzionale(app);
				} 
				else {
					man.setLivello_funzionale(man1.getLivello_funzionale());
				}
			} 
			else {
				do {
				app=leggiStringa("Livello Funzionale: " + "[Vuoto]");
				if(app.equals("")){
					System.out.println("Questo campo non può essere vuoto");
				}else {
				man.setLivello_funzionale(app);
				}
				}while(app.equals(""));
			}
			
			man.setId_ruolo(2);
		}
		
		if(dn instanceof Dirigente) {
			Dirigente dir=(Dirigente) dn;
			if(d instanceof Dirigente) {
				Dirigente dir1=(Dirigente) d;
			app=leggiStringa("Area Funzionale: " + "["+ dir1.getArea_funzionalita() +"]");
			if(!app.equals("")) {
				dir.setArea_funzionalita(app);
			} else {
				dir.setArea_funzionalita(dir1.getArea_funzionalita());
			}
			}
			else {
				do {
				app=leggiStringa("Area Funzionale: " + "[Vuoto]");
				if(app.equals("")){
					System.out.println("Questo campo non può essere vuoto");
				}else {
				dir.setArea_funzionalita(app);
			}
			}while(app.equals(""));
			
		}
			dir.setId_ruolo(3);
		}

		return dn;
	}
	
	public String confermaEliminazione(String mess) {
		
		String s;
		
		do {
			System.out.println(mess);
			s=sc.nextLine();
		}while(!(s.toLowerCase().equals("s")||s.toLowerCase().equals("n")));
		
		if(s.toLowerCase().equals("s")) {
			System.out.println("Eliminazione in corso...");
		} else {
			System.out.println("Eliminazione Annullata");
		}

		return s;
	}
	
public boolean confermaSalvataggio() {
		
		String s;
		boolean flag;
		
		do {
			flag=false;
			System.out.println("Vuoi salvare? (s/n)");
			s=sc.nextLine();
			if(!(s.toLowerCase().equals("s")||s.toLowerCase().equals("n"))) {
				flag=true;
				System.out.println("Errore, inserire s o n");
			}
		}
		while(flag);
		
		if(s.toLowerCase().equals("s")) {
			System.out.println("Salvataggio in corso...");
			return true;
		} else {
			System.out.println("Salvataggio Annullato.");
			return false;
		}

	}

public boolean confermaCaricamento() {
	String s;
	boolean flag;
		
	do {
		flag=false;
		System.out.println("Confermi il caricamento? (s/n)");
		s=sc.nextLine();
		if(!(s.toLowerCase().equals("s")||s.toLowerCase().equals("n"))) {
			flag=true;
			System.out.println("Errore, inserire s o n");
		}
	}
	while(flag);
	
	if(s.toLowerCase().equals("s")) {
		System.out.println("Caricamento in corso...");
		return true;
	} else {
		System.out.println("Caricamento Annullato");
		return false;
	}

}
}
