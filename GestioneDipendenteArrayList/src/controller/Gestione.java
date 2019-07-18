package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.dao.Crud;
import view.Vista;

public class Gestione {

	public static void main(String[] args) {

		ArrayList<Dipendente> dipendenti;
		Vista v= new Vista();
		Crud c= Crud.getInstanza();
		int scelta;
		Dipendente dt;
		Dipendente d;
		Dipendente dn;
		Manager man;
		Dirigente dir;
		int posizione;

		do {
			v.menu();
			scelta=v.leggiIntero("Fai una scelta: ");
			switch(scelta) {
			case 1: //Inserisci
				do {
					v.sottoMenu();
					scelta=v.leggiIntero("Chi vuoi inserire?");
					switch(scelta) {

					case 1: //Dipendente
						d=new Dipendente();
						do {
							v.mascheraInserimento(d);
							dt=c.ricerca(d.getCodiceFiscale());
							if(dt==null) {
								c.inserimento(d);
								System.out.println("Inserimento effettuato");
							}else {
								System.out.println("Codice Fiscale gia esistente");
							}
						}while(dt!=null);
						break;


					case 2: //Manager
						man=new Manager();
						do {
							v.mascheraInserimento(man);
							dt=c.ricerca(man.getCodiceFiscale());
							if(dt==null) {
								c.inserimento(man);
								System.out.println("Inserimento effettuato");
							}else {
								System.out.println("Codice Fiscale gia esistente");
							}
						}while(dt!=null);
						break;

					case 3: //Dirigente
						dir=new Dirigente();
						do {
							v.mascheraInserimento(dir);
							dt=c.ricerca(dir.getCodiceFiscale());
							if(dt==null) {
								c.inserimento(dir);
								System.out.println("Inserimento effettuato");
							}else {
								System.out.println("Codice Fiscale gia esistente");
							}
						}while(dt!=null);
						break;
					}
				}
					while(!(scelta==1||scelta==2||scelta==3));

				break;

				case 2: //Visualizza
					
					v.menuVisualizazzione();
					scelta= v.leggiIntero("Scegli il tipo di visualizazzione: ");
					
					switch(scelta) {
					
					case 1: //VISUALIZAZZIONE NORMALE
					
					dipendenti=c.visualizza();
					if(dipendenti.size()!=0) {
						for(int i=0; i<dipendenti.size(); i++) {
							v.visualizza(dipendenti.get(i));
						}
					}else {
						System.out.println("Non Ci sono Dipendenti");
					}
					
					break;
					
				case 2: // VISUALIZAZZIONE ORDINATA
					
					dipendenti=c.ordina();
					if(dipendenti.size()!=0) {
						for(int i=0; i<dipendenti.size(); i++) {
							v.visualizza(dipendenti.get(i));
						}
					}else {
						System.out.println("Non Ci sono Dipendenti");
					}
					
					break;
					
					}
					
					break;
					
				case 3: //Ricerca
					dt=c.ricerca(v.leggiStringa("Inserisci il Codice Fiscale del Dipendente da Trovare: "));
					if(dt!=null) {
						v.visualizza(dt);
					}else {
						System.out.println("Non Ci sono Dipendenti Associati a questo Codice Fiscale");
					}
					break;

				case 4: //Modifica
					
					do {
						dt=c.ricerca(v.leggiStringa("Inserisci il codice fiscale del Dipendente da modificare: "));
						if(dt==null) {
							System.out.println("Non Ci sono Dipendenti Associati con questo Codice Fiscale");
						}
					}while(dt==null);
					posizione=c.getPosizione(dt);
					
					v.sottoMenu();
					scelta=v.leggiIntero("Inserisci il Ruolo: ");
					switch(scelta) {
					
					case 1: //Dipendente
						
						dn=new Dipendente();
						
					do {
						
					d=v.mascheraModifica(dt, dn);
					dt=c.ricerca(d.getCodiceFiscale());
					if(dt==null) {
					c.modifica(posizione, d);
					System.out.println("Modifica avvenuta con successo.");
					}
					else {
						System.out.println("Errore: Codice fiscale già presente");
					}
					}while(dt!=null);
					break;
					
					case 2: //Manager
						man =new Manager();
						do {
							
							d= v.mascheraModifica(dt, man);
							dt=c.ricerca(d.getCodiceFiscale());
							if(dt==null) {
							c.modifica(posizione, d);
							System.out.println("Modifica avvenuta con successo.");
							}
							else {
								System.out.println("Errore: Codice fiscale già presente");
							}
							}while(dt!=null);
							break;
					
					
				case 3: //Dirigente
					
					dir=new Dirigente();
					
					do {
						d= v.mascheraModifica(dt, dir);
						dt=c.ricerca(d.getCodiceFiscale());
						if(dt==null) {
						c.modifica(posizione, d);
						System.out.println("Modifica avvenuta con successo.");
						}
						else {
							System.out.println("Errore: Codice fiscale già presente");
						}
						}while(dt!=null);
						break;
					}
			
			while(!(scelta==1||scelta==2||scelta==3));
						
		break;

				case 5: //Cancella
					do {
						dt=c.ricerca(v.leggiStringa("Inserisci il codice fiscale del Dipendente da cancellare: "));
						if(dt==null) {
							System.out.println("Non Ci sono Dipendenti Associati con questo Codice Fiscale");
						}
					}while(dt==null);
					v.visualizza(dt);
					String s=v.confermaEliminazione("\n Confermi eliminazione di questo Dipendente? (s/n)");
					if(dt!=null&&s.equals("s")) {
						c.eliminadaCF(dt);
						System.out.println("Dipendente Eliminato");
					}

					break;
					
				case 6: //SALVA
					if(v.confermaSalvataggio()) {
						c.salva();
						System.out.println("Dipendenti salvati: " + c.visualizza().size());
					}
					break;
					
				case 7://CARICA
					if(v.confermaCaricamento()) {
						if(c.visualizza().size()>=0) {
							if(c.carica()) {
							System.out.println("Dipendenti caricati: " + c.visualizza().size());
							}else {
								System.out.println("Il File è vuoto");
							}
						}else {
							System.out.println("Dipendenti caricati: 0");
						}
					}
					break;
						
				case 8: //Esci
					System.out.println("Sei Uscito");
					break;
				}
			}while(scelta!=8);
		}
	}
