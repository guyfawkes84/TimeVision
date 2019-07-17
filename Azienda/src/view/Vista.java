package view;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Manager;

public class Vista {
	private Scanner input=new Scanner(System.in);

	public int leggiIntero(String messaggio){
		int valore = -1;
		boolean flag=false;
		do{
			flag=false;
			try{
				System.out.println(messaggio);
				valore=Integer.parseInt(input.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Inserire un numero intero!");
				flag=true;
			}}while(flag);
		return valore;

	}
	public double leggiDouble(String messaggio){
		double valore = 0.0;
		boolean flag=false;
		do{
			flag=false;
			try{
				System.out.println(messaggio);
				valore=Double.parseDouble(input.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Inserire un numero!");
				flag=true;
			}}while(flag);
		return valore;

	}

	public String leggiStringa(String messaggio){
		String stringa="";
		System.out.println(messaggio);
		stringa=input.nextLine();
		return stringa;
	}

	public int menu(){
		int scelta=0;
		System.out.println("*******************");
		System.out.println("* MENU PRINCIPALE *");
		System.out.println("*******************");
		System.out.println("1) Inserisci"); 
		System.out.println("2) Modifica"); 
		System.out.println("3) Cancella");
		System.out.println("4) Trova");
		System.out.println("5) Visualizza");
		System.out.println("6) Carica");
		System.out.println("7) Salva");		
		System.out.println("8) Esci");
		do{
			scelta=leggiIntero("Fai una scelta, inserisci un numero tra 1 e 8!");}
		while(!(scelta>=1 && scelta<=8));
		return scelta;
	}
	public int menuInserimento(){
		int scelta=0;
		System.out.println("*******************");
		System.out.println("* MENU INSERIMENTO *");
		System.out.println("*******************");
		System.out.println("1) Dipendente");
		System.out.println("2) Manager");
		System.out.println("3) Dirigente");
		do{
			scelta=leggiIntero("Scegli il ruolo!");
		}while(!(scelta>=1 && scelta<=3));
		return scelta;
	}
	public void  mascheraInserimento(Dipendente d){
		if(d instanceof Dirigente){
			Dirigente dir=(Dirigente)d;
			dir.setNome(leggiStringa("Nome:"));
			dir.setCognome(leggiStringa("Cognome:"));
			dir.setDataNascita(leggiStringa("Data di nascita:"));
			dir.setCellulare(leggiStringa("Celluare:"));
			dir.setCodiceFiscale(leggiStringa("Codice fiscale:"));
			dir.setEmail(leggiStringa("E-mail:"));
			dir.setAreaResponsabilita(leggiStringa("Area responsabilita:"));
			dir.setBenefit(leggiDouble("Benefit:"));
			dir.setLivelloFunzionale(leggiStringa("Livello funzionale:"));
			dir.setLuogoNascita(leggiStringa("Luogo nascita:"));
			dir.setMatricola(leggiStringa("Matricola:"));
			String sess;
			do{sess=leggiStringa("Sesso: (M/F):");
			if(sess.toUpperCase().equals("M")){
				dir.setSesso(false);
			}else if(sess.toUpperCase().equals("F")){
				dir.setSesso(true);
			}}while(!(sess.toUpperCase().equals("M")||sess.toUpperCase().equals("F")));
			dir.setPremio(leggiDouble("Premio:"));
			dir.setTitoloStudio(leggiStringa("titolo studio:"));
		}else if(d instanceof Manager){
			Manager man=(Manager)d;
			man.setNome(leggiStringa("Nome:"));
			man.setCognome(leggiStringa("Cognome:"));
			man.setDataNascita(leggiStringa("Data di nascita:"));
			man.setCellulare(leggiStringa("Celluare:"));
			man.setCodiceFiscale(leggiStringa("Codice fiscale:"));
			man.setEmail(leggiStringa("E-mail:"));
			man.setAreaResponsabilita(leggiStringa("Area responsabilita:"));
			man.setBenefit(leggiDouble("Benefit:"));
			man.setLuogoNascita(leggiStringa("Luogo nascita:"));
			man.setMatricola(leggiStringa("Matricola:"));
			String sess;
			do{sess=leggiStringa("Sesso: (M/F):");
			if(sess.toUpperCase().equals("M")){
				man.setSesso(false);
			}else if(sess.toUpperCase().equals("F")){
				man.setSesso(true);
			}}while(!(sess.toUpperCase().equals("M")||sess.toUpperCase().equals("F")));
			man.setTitoloStudio(leggiStringa("titolo studio:"));}else{
				d.setNome(leggiStringa("Nome:"));
				d.setCognome(leggiStringa("Cognome:"));
				d.setDataNascita(leggiStringa("Data di nascita:"));
				d.setCellulare(leggiStringa("Celluare:"));
				d.setCodiceFiscale(leggiStringa("Codice fiscale:"));
				d.setEmail(leggiStringa("E-mail:"));
				d.setLuogoNascita(leggiStringa("Luogo nascita:"));
				d.setMatricola(leggiStringa("Matricola:"));
				String sess;
				do{sess=leggiStringa("Sesso: (M/F):");
				if(sess.toUpperCase().equals("M")){
					d.setSesso(false);
				}else if(sess.toUpperCase().equals("F")){
					d.setSesso(true);
				}}while(!(sess.toUpperCase().equals("M")||sess.toUpperCase().equals("F")));
				d.setTitoloStudio(leggiStringa("titolo studio:"));

			}
	}
	public Dipendente mascheraCerca(){
		Dipendente d=new Dipendente();
		System.out.println("*******CERCA*********");
		d.setNome(leggiStringa("Nome:"));
		d.setCognome(leggiStringa("Cognome"));
		return d;
	}	

	public void mascheraVisualizzazione(Dipendente d){
		System.out.println("*******SCHEDA DIPENDENTE**********");
		if(d instanceof Dirigente){
			Dirigente dir=(Dirigente)d;
			System.out.println("Nome:"+dir.getNome());
			System.out.println("Cognome:"+dir.getCognome());
			if(dir.isSesso()){
				System.out.println("sesso: femmina");
			}else{System.out.println("sesso: maschio");}
			System.out.println("Data di nascita:"+dir.getDataNascita());
			System.out.println("Luogo di nascita:"+dir.getLuogoNascita());
			System.out.println("E-mail:"+dir.getEmail());
			System.out.println("Cellulare:"+dir.getCellulare());
			System.out.println("Matricola:"+dir.getMatricola());
			System.out.println("Stipendio:"+dir.getStipendio());
			System.out.println("Titolo di studio:"+dir.getTitoloStudio());
			System.out.println("Area responsabilita:"+dir.getAreaResponsabilita());
			System.out.println("Premio:"+dir.getPremio());
			System.out.println("Benefit:"+ dir.getBenefit());
			System.out.println("Livello funzionale:"+dir.getLivelloFunzionale());
		}else if(d instanceof Manager){
			Manager man=(Manager)d;
			System.out.println("Nome:"+man.getNome());
			System.out.println("Cognome:"+man.getCognome());
			if(man.isSesso()){
				System.out.println("sesso: femmina");
			}else{System.out.println("sesso: maschio");}
			System.out.println("Data di nascita:"+man.getDataNascita());
			System.out.println("Luogo di nascita:"+man.getLuogoNascita());
			System.out.println("E-mail:"+man.getEmail());
			System.out.println("Cellulare:"+man.getCellulare());
			System.out.println("Matricola:"+man.getMatricola());
			System.out.println("Stipendio:"+man.getStipendio());
			System.out.println("Titolo di studio:"+man.getTitoloStudio());
			System.out.println("Area responsabilita:"+man.getAreaResponsabilita());
			System.out.println("Benefit:"+ man.getBenefit());

		}else{
			System.out.println("Nome:"+d.getNome());
			System.out.println("Cognome:"+d.getCognome());
			if(d.isSesso()){
				System.out.println("sesso: femmina");
			}else{System.out.println("sesso: maschio");}
			System.out.println("Data di nascita:"+d.getDataNascita());
			System.out.println("Luogo di nascita:"+d.getLuogoNascita());
			System.out.println("E-mail:"+d.getEmail());
			System.out.println("Cellulare:"+d.getCellulare());
			System.out.println("Matricola:"+d.getMatricola());
			System.out.println("Stipendio:"+d.getStipendio());
			System.out.println("Titolo di studio:"+d.getTitoloStudio());

		}
	}

	public boolean cancella(Dipendente d){
		String conferma;
		mascheraVisualizzazione(d);
		do{
			conferma=leggiStringa("Vuoi confermare la cancellazione?(S/N)").toUpperCase();
		}while(!(conferma.equals("S")||conferma.equals("N")));
		return(conferma.equals("S"));
	}



	public double convertiDouble(String s){
		double valore=0.0;
		try{
			valore=Double.parseDouble(s);
		}catch(NumberFormatException e){
			System.out.println("Inserisci un numero!");	
			valore=-1.0;
		}
		return valore;
	} 	


	public boolean mascheraModifica(Dipendente d){
		String conferma;
		String appString;
		boolean flag=false;
		if(d instanceof Dirigente){
			Dirigente dir=(Dirigente)d;
			appString=leggiStringa("Nome"+"["+dir.getNome()+"]:");
			if(!appString.equals("")){
				dir.setNome(appString);
			}
			appString=leggiStringa("Cognome"+"["+dir.getCognome()+"]:");
			if(!appString.equals("")){
				dir.setCognome(appString);
			}
			do{
				flag=false;
				if(dir.isSesso()){
					appString=leggiStringa("sesso [f]:");
				}else{
					appString=leggiStringa("sesso [m]:");}
				
				if(!appString.equals("")){
					if(appString.toUpperCase().equals("F")){
						dir.setSesso(true);
					}else if(appString.toUpperCase().equals("M")){
						dir.setSesso(false);
					}else{
						flag=true;
					}

				}}while(flag);
				appString=leggiStringa("Data di nascita"+"["+dir.getDataNascita()+"]");
				if(!appString.equals("")){
					dir.setTitoloStudio(appString);
				}
				appString=leggiStringa("Luogo di nascita ["+dir.getLuogoNascita()+"]");
				if(!appString.equals("")){
					dir.setLuogoNascita(appString);
				}
				appString=leggiStringa("E-mail ["+dir.getEmail()+"]");
				if(appString.equals("")){
					dir.setEmail(appString);
				}
				appString=leggiStringa("Cellulare ["+dir.getCellulare()+"]");
				if(!appString.equals("")){
					dir.setCellulare(appString);
				}
				appString=leggiStringa("Matricola ["+dir.getMatricola()+"]");
				if(appString.equals("")){
					dir.setMatricola(appString);
				}
				do{
					flag=false;
					appString=leggiStringa("Stipendio:"+dir.getStipendio()+"]");
					if(!appString.equals("")){
						if(convertiDouble(appString)==-1){flag=true;}
						else{dir.setStipendio(convertiDouble(appString));}
					}}while(flag);
				appString=leggiStringa("Titolo di studio ["+dir.getTitoloStudio()+"]");
				if(!appString.equals("")){
					dir.setTitoloStudio(appString);
				}
				appString=leggiStringa("Area responsabilita ["+dir.getAreaResponsabilita()+"]");
				if(!appString.equals("")){
					dir.setAreaResponsabilita(appString);
				}
				do{
					flag=false;
					appString=leggiStringa("Premio:"+dir.getPremio()+"]");
					if(!appString.equals("")){
						if(convertiDouble(appString)==-1){flag=true;}
						else{dir.setPremio(convertiDouble(appString));}
					}}while(flag);
				do{
					flag=false;
					appString=leggiStringa("Benefit:"+dir.getBenefit()+"]");
					if(!appString.equals("")){
						if(convertiDouble(appString)==-1){flag=true;}
						else{dir.setBenefit(convertiDouble(appString));}
					}}while(flag);

				appString=leggiStringa("Livello funzionale["+dir.getLivelloFunzionale()+"]");
				if(!appString.equals("")){
					dir.setLivelloFunzionale(appString);
				}}

			else if(d instanceof Manager){
				Manager man=(Manager)d;
				appString=leggiStringa("Nome"+"["+man.getNome()+"]:");
				if(!appString.equals("")){
					man.setNome(appString);
				}
				appString=leggiStringa("Cognome"+"["+man.getCognome()+"]:");
				if(!appString.equals("")){
					man.setCognome(appString);
				}
				do{
					flag=false;
					if(man.isSesso()){
						appString=leggiStringa("sesso [f]:");
					}else{
						appString=leggiStringa("sesso [m]:");}
					
					if(!appString.equals("")){
						if(appString.toUpperCase().equals("F")){
							man.setSesso(true);
						}else if(appString.toUpperCase().equals("M")){
							man.setSesso(false);
						}else{
							flag=true;
						}

					}}while(flag);
					appString=leggiStringa("Data di nascita"+"["+man.getDataNascita()+"]");
					if(!appString.equals("")){
						man.setTitoloStudio(appString);
					}
					appString=leggiStringa("Luogo di nascita ["+man.getLuogoNascita()+"]");
					if(!appString.equals("")){
						man.setLuogoNascita(appString);
					}
					appString=leggiStringa("E-mail ["+man.getEmail()+"]");
					if(appString.equals("")){
						man.setEmail(appString);
					}
					appString=leggiStringa("Cellulare ["+man.getCellulare()+"]");
					if(!appString.equals("")){
						man.setCellulare(appString);
					}
					appString=leggiStringa("Matricola ["+man.getMatricola()+"]");
					if(appString.equals("")){
						man.setMatricola(appString);
					}
					do{
						flag=false;
						appString=leggiStringa("Stipendio: ["+man.getStipendio()+"]");
						if(!appString.equals("")){
							if(convertiDouble(appString)==-1){flag=true;}
							else{man.setStipendio(convertiDouble(appString));}
						}}while(flag);
					appString=leggiStringa("Titolo di studio ["+man.getTitoloStudio()+"]");
					if(!appString.equals("")){
						man.setTitoloStudio(appString);
					}
					appString=leggiStringa("Area responsabilita ["+man.getAreaResponsabilita()+"]");
					if(!appString.equals("")){
						man.setAreaResponsabilita(appString);
					}

					do{
						flag=false;
						appString=leggiStringa("Benefit: ["+man.getBenefit()+"]");
						if(!appString.equals("")){
							if(convertiDouble(appString)==-1){flag=true;}
							else{man.setBenefit(convertiDouble(appString));}
						}}while(flag);
					
				}else{
				appString=leggiStringa("Nome"+"["+d.getNome()+"]:");
				if(!appString.equals("")){
					d.setNome(appString);
				}
				appString=leggiStringa("Cognome"+"["+d.getCognome()+"]:");
				if(!appString.equals("")){
					d.setCognome(appString);
				}
				do{
					flag=false;
					if(d.isSesso()){
						appString=leggiStringa("sesso [f]:");
					}else{
						appString=leggiStringa("sesso [m]:");}
					
					if(!appString.equals("")){
						if(appString.toUpperCase().equals("F")){
							d.setSesso(true);
						}else if(appString.toUpperCase().equals("M")){
							d.setSesso(false);
						}else{
							flag=true;
						}

					}}while(flag);
				appString=leggiStringa("Data di nascita"+"["+d.getDataNascita()+"]");
				if(!appString.equals("")){
					d.setTitoloStudio(appString);
				}
				appString=leggiStringa("Luogo di nascita ["+d.getLuogoNascita()+"]");
				if(!appString.equals("")){
					d.setLuogoNascita(appString);
				}
				appString=leggiStringa("E-mail ["+d.getEmail()+"]");
				if(appString.equals("")){
					d.setEmail(appString);
				}
				appString=leggiStringa("Cellulare ["+d.getCellulare()+"]");
				if(!appString.equals("")){
					d.setCellulare(appString);
				}
				appString=leggiStringa("Matricola ["+d.getMatricola()+"]");
				if(appString.equals("")){
					d.setMatricola(appString);
				}
				do{
					flag=false;
					appString=leggiStringa("Stipendio:"+d.getStipendio()+"]");
					if(!appString.equals("")){
						if(convertiDouble(appString)==-1){flag=true;}
						else{d.setStipendio(convertiDouble(appString));}
					}}while(flag);
				appString=leggiStringa("Titolo di studio ["+d.getTitoloStudio()+"]");
				if(!appString.equals("")){
					d.setTitoloStudio(appString);
				}
			}
			do{
				conferma=leggiStringa("Vuoi confermare la modifica?(S/N)").toUpperCase();
			}while(!(conferma.equals("S")||conferma.equals("N")));
			return(conferma.equals("S"));
		}
			
		public Dipendente visualizzaDipendentiTrovati(ArrayList<Dipendente> trovati){

			int i=0;
			int s;

			if(trovati.size()==0){
				System.out.println("Il dipendente non è stato trovato!");

				return null;}
			else if(trovati.size()==1){
				System.out.println(trovati.get(0));

				return trovati.get(0);

			}
			else{
				for(Dipendente d:trovati){
					System.out.println((++i)+")"+d);
				}
				s=leggiIntero("Scegli:");	
			}
			return trovati.get(s-1);
		}


		public void visualizzaAzienda(ArrayList<Dipendente> azienda){

			if(!azienda.isEmpty()){
				int i=0;
				for(Dipendente d:azienda){
					System.out.println((++i)+")"+d);
				}}else{
					System.out.println("L'azienda è vuota");
				}	
		}
		public void attesa(){

			System.out.println("Premi invio per continuare ...");
			String a=input.nextLine();

		}
		public boolean gestioneCarica(ArrayList<Dipendente> azienda) {

			String risposta;
			boolean flag;
			System.out.println("*****************");
			System.out.println("*  C A R I C A  *");
			System.out.println("*****************");
			if(!azienda.isEmpty()) {
				System.out.println("Attenzione! L'array non è vuoto!");
				do{
					flag=false;
					risposta = leggiStringa("Confermi comunque il caricamento(s/n)? ");
					if(!risposta.toUpperCase().equals("S") && !risposta.toUpperCase().equals("N")){
						flag=true;
						System.out.println("Errore! Inserire s oppure n.");
					}
				}while(flag);
				if(risposta.toUpperCase().equals("S")){
					return true;
				} else {return false;}
			}
			return true;
		}
		public boolean gestioneSalvataggio(){
			String risposta;
			boolean flag;
			do{
				flag=false;
				risposta = leggiStringa("Vuoi salvare (s/n)? ");
				if(!risposta.toUpperCase().equals("S") && !risposta.toUpperCase().equals("N")){
					flag=true;
					System.out.println("Errore! Inserire s oppure n.");
				}
			}while(flag);
			if(risposta.toUpperCase().equals("S")){
				return true;
			} else {return false;}
		}
	}
