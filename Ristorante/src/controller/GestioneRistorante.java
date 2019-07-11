package controller;

import java.util.ArrayList;

import model.Piatto;
import model.Tavolo;
import view.Vista;

public class GestioneRistorante {

	public static void main(String[] args) {
		Vista v=new Vista();
		Tavolo t=new Tavolo();
		
		ArrayList<Piatto> menu=new ArrayList<Piatto>();
		
		menu.add(new Piatto("Carbonara.",12));
		menu.add(new Piatto("Lasagnette al radicchio trevisano.",13));
		menu.add(new Piatto("Ravioli al nero di seppia.",15));
		menu.add(new Piatto("Gnocchi alla sorrentina.",11));
		menu.add(new Piatto("Trofie al pesto.",3.50));
		menu.add(new Piatto("Filetto in crosta.",35));
		menu.add(new Piatto("Crespelle ricotta e spinaci.",35));
		menu.add(new Piatto("Cima di filetto con peperoncini verdi.",35));
		menu.add(new Piatto("Involtini con speck provola funghi.",35));
		menu.add(new Piatto("Polpettine con uva passa, pinoli e provola.",35));
		

		
		t.setNumero(v.leggIntero("Inserisci il numero del tavolo"));
		t.setCoperti(v.leggIntero("Inserisci il numero di coperti"));
		double prezzo = v.stampaMenu(menu)*t.getCoperti();
		
		System.out.println("Prezzo totale: "+prezzo);
		
		}

}