package controller;

import crud.CrudArrayList;
import crud.iCrud;
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
		CrudArrayList c=new CrudArrayList();
		int scelta;
		int id;
		int n=v.leggIntero("Quanti dipendenti vuoi inserire? ");

		for(int i=0;i<n;i++) {
			Dipendente d = null;
			do{
				scelta=v.leggIntero("1)Dipendente \n 2)Manager \n 3)Dirigente");

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
			}
			c.inserimento(d, i);
		}

		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println(c.visualizza(i));
			System.out.println();
		}
		scelta = v.stampaMenu();

		switch (scelta){
		case 1: //Cerca

			break;

		case 2: //Elimina
			Dipendente dElimina = new Dipendente();
			dElimina.setSeriale(v.leggIntero("Inserire seriale: "));
			c.elimina(dElimina);
			System.out.println();
			System.out.println("Cella eliminata!");
			System.out.println();
			scelta = v.stampaMenu();
			break;

		case 3: //Modifica
			Dipendente dModifica = new Dipendente();
			dModifica.setId_ruolo(v.leggIntero("Inserire ID Ruolo: "));
			c.modifica(dModifica, n);
			v.stampaMenu();
			break;

		case 0: //Exit

			System.out.println("Uscita dal programma.");

		default:
			System.out.println("Errore!");
		}

	}

}
