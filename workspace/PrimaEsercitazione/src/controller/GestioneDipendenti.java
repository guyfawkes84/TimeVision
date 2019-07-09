package controller;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.Persona;
import view.Vista;

public class GestioneDipendenti {

	public static void main(String[] args) {

		//Persona.conta();
		//Persona.contaPersona=3;

		Vista v=new Vista();

		int n=v.leggIntero("quanti dipendenti vuoi inserire?");
		int scelta=-1;
		Dipendente dipendenti[]=new Dipendente[n];
		for(int i=0;i<n;i++) {
			Dipendente d = null;
			do{
				scelta=v.leggIntero("1)Dipendente \n 2)Manager \n 3)Dirigente \n 0)Exit");

			}while(!(scelta==1||scelta==2||scelta==3));
			switch(scelta) {
			case 1://dip
				d=new Dipendente();
				v.mascheraInserimentoDipendenti(d);
				break;
			case 2://manager
				d=new Manager();
				v.mascheraInserimentoDipendenti(d);
				break;
			case 3://dirigente
				d=new Dirigente();
				v.mascheraInserimentoDipendenti(d);
				break;
			case 0: //Exit
				System.out.println("Esco dal programma.");
			}
			dipendenti[i]=d;
		}

		do{
			scelta=v.leggIntero("1)Cerca \n 2)Visualizza \n 3)Modifica \n 4) Cancella \n 0)Esci");

		}while(!(scelta==1||scelta==2||scelta==3));

		switch(scelta){
		case 1: //Cerca
			int id = v.leggIntero("Inserire criterio di ricerca: ");
			for(int i=0;i<n;i++) {
				if(id==dipendenti[i].getId_ruolo()){
					System.out.println("Stampo scheda "+i);
					System.out.println();
					System.out.println("Nome: "+dipendenti[i].getNome()+"\n"+"Cognome: "+dipendenti[i].getCognome()+"\n"+"Ruolo: "+dipendenti[i].getId_ruolo()+"\n"+"Azienda: "+dipendenti[i].getAzienda()+"\n"+"Ore: "+dipendenti[i].getOreLavorative()+"\n"+"Stipendio: "+dipendenti[i].getStipendio());
					System.out.println();
				}		
			}
			break;
		case 2: //Visualizza
			for(int i=0; i<n; i++){
				System.out.println("Stampo scheda "+i);
				System.out.println();
				System.out.println("Nome: "+dipendenti[i].getNome()+"\n"+"Cognome: "+dipendenti[i].getCognome()+"\n"+"Ruolo: "+dipendenti[i].getId_ruolo()+"\n"+"Azienda: "+dipendenti[i].getAzienda()+"\n"+"Ore: "+dipendenti[i].getOreLavorative()+"\n"+"Stipendio: "+dipendenti[i].getStipendio());
				System.out.println();

				//System.out.println(dipendenti[i]);
				//dipendenti[i].toString();
			}
			break;
		case 3: //Modifica
			break;
		case 4: //Cancella
			int var = v.leggIntero("Inserire la posizione del vettore: ");

			break;
		case 0: //Exit
			System.out.println("Esco dal programma.");
			break;

		default:
			System.out.println("Selezionare dal menu");

		}


	}

}
