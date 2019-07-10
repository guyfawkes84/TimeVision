package view;

import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.Persona;

public class Vista {

	private Scanner input=new Scanner(System.in);

	/*
	 *  ********************************* METODI PER L'INSERIMENTO (INTERO/DOUBLE/STRINGA) *********************************
	 */

	//Metodo che legge in input un intero

	public int leggIntero(String messaggio) {

		int i=-1;
		boolean flag=false;
		do{
			flag=false;
			try {
				System.out.println(messaggio);
				i=Integer.parseInt(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Inserire solo caratteri numerici!");
				flag=true;}}	
		while(flag);
		return i;
	}

	//Metodo che legge in input un dato di tipo double

	private double leggiDouble(String messaggio) {
		double i=-1;
		boolean flag=false;
		do{
			flag=false;
			try {
				System.out.println(messaggio);
				i=Double.parseDouble(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Inserire solo caratteri numerici!");
				flag=true;}}	
		while(flag);
		return i;
	}

	//Metodo che legge in input una stringa

	public String leggiStringa(String messaggio) {

		System.out.println(messaggio);
		/*
		 *String s=input .nextLine();
		 *return s;
		 */
		return input.nextLine();
	}

	/*
	 *  ********************************* FINE METODI PER L'INSERIMENTO (INTERO/DOUBLE/STRINGA) *********************************
	 */

	//------------------------------------------------------------------------------------------------------------------------------------------

	/*
	 *  ********************************* MASCHERE DI INSERIMENTO *********************************
	 */
	//Maschera di inserimento Persona

	public void mascheraInserimento(Persona p) {
		// TODO Auto-generated method stub
		p.setNome(leggiStringa("Inserire il nome"));
		p.setCognome(leggiStringa("Inserire il cognome"));
		p.setSeriale(leggIntero("Inserire seriale"));
		boolean flag=false;
		do {
			flag=false;
			if(leggiStringa("Inserire sesso").equals("f")) {
				p.setSesso(true);
			}else {
				p.setSesso(false);
			}

		}while(flag);
	}

	//Maschera di inserimento Dipendenti

	public void mascheraInserimentoDipendenti(Dipendente p) {
		p.setNome(leggiStringa("Inserire il nome"));
		p.setCognome(leggiStringa("Inserire il cognome"));
		p.setSeriale(leggIntero("Inserire il seriale"));
		boolean flag=false;
		String s=leggiStringa("Inserire sesso");
		do {
			flag=false;
			if(s.equalsIgnoreCase("f")) {
				p.setSesso(true);
			}else if(s.equalsIgnoreCase("m")) {
				p.setSesso(false);
			}else {
				flag=true;	

			}}while(flag);
		p.setAzienda(leggiStringa("Inserire azienda"));
		p.setId_ruolo(1);
		p.setOreLavorative(leggiDouble("Inserire ore"));
		p.setStipendio(leggiDouble("Inserire stipendio"));
		if(p instanceof Manager) {
			Manager m=(Manager) p;
			p.setId_ruolo(2);
			m.setBenefit(leggiDouble("Inserire benefit"));
			m.setLivelloFunzionale(leggIntero("Inserire livello funzionale"));
		}
		if(p instanceof Dirigente) {
			Dirigente d=(Dirigente) p;
			p.setId_ruolo(3);
			d.setAreaResponsabilita(leggIntero("Inserire area responsabilita"));
		}
	}
	
	public void mascheraDiModificaDipendenti(Dipendente p) {
		p.setNome(leggiStringa("Inserire il nome"));
		p.setCognome(leggiStringa("Inserire il cognome"));
		p.setSeriale(leggIntero("Inserire il seriale"));
		boolean flag=false;
		String s=leggiStringa("Inserire sesso");
		do {
			flag=false;
			if(s.equalsIgnoreCase("f")) {
				p.setSesso(true);
			}else if(s.equalsIgnoreCase("m")) {
				p.setSesso(false);
			}else {
				flag=true;	

			}}while(flag);
		p.setAzienda(leggiStringa("Inserire azienda"));
		p.setId_ruolo(1);
		p.setOreLavorative(leggiDouble("Inserire ore"));
		p.setStipendio(leggiDouble("Inserire stipendio"));
		if(p instanceof Manager) {
			Manager m=(Manager) p;
			p.setId_ruolo(2);
			m.setBenefit(leggiDouble("Inserire benefit"));
			m.setLivelloFunzionale(leggIntero("Inserire livello funzionale"));
		}
		if(p instanceof Dirigente) {
			Dirigente d=(Dirigente) p;
			p.setId_ruolo(3);
			d.setAreaResponsabilita(leggIntero("Inserire area responsabilita"));
		}
	}

	/*
	 *  ********************************* FINE MASCHERE D'INSERIMENTO *********************************
	 */

	//---------------------------------------------------------------------------------------------------------------------------------------

	/*
	 * ********************************* METODI DI STAMPA *********************************
	 */
	//Metodo stampa menu

	public int  stampaMenu() {
		int scelta=-1;
		do {
			System.out.println("1) Cercare");
			System.out.println("2) Elimina");
			System.out.println("3) Modificare");
			System.out.println("0) Esci");
			scelta=leggIntero("fai la tua scelta:");
		}while(!(scelta==1||scelta==2||scelta==3 || scelta==0));
		return scelta;
	}

	/*
	 * ********************************* FINE METODI DI STAMPA *********************************
	 */

	//---------------------------------------------------------------------------------------------------------------------------------------
}

