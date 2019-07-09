package controller;

import model.Persona;
import view.Vista;

public class Gestione {

	public static void main(String[] args) {
		Vista v=new Vista();
	int n=v.leggIntero("quante persone vuoi inserire?");
	Persona persone[]=new Persona[n];
	for(int i=0;i<n;i++) {
		Persona p=new Persona();
		v.mascheraInserimento(p);
		persone[i]=p;	
	}
	int scelta;
	do{
		scelta=v.stampaMenu();
		switch (scelta) {
	case 1://cerca
		
		break;
	case 2://visualizzazione
		for(int i=0;i<n;i++) {
		System.out.println(persone[i]);
		}
		break;
	default:
		break;
	}
	}while(scelta!=3);
	}

}
