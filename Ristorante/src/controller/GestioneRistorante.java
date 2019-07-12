package controller;

import java.util.ArrayList;

import crud.Crud;
import model.Piatto;
import model.Tavolo;
import view.Vista;

public class GestioneRistorante {
	
public static void main(String args[]) {
	Crud cMenu=new Crud();
	Crud cPiatti=new Crud();
	Tavolo t=new Tavolo();
	Vista v=new Vista();
	int sceltaPiatto=-1;
	String s="";
	//ArrayList<Piatto> menu=cMenu.visualizzaALL();
	//cMenu.setPiatti(new ArrayList<Piatto>());
	cMenu.inserimento(new Piatto(10,"carbonara"));
	cMenu.inserimento(new Piatto(10,"pasta e patate"));
	cMenu.inserimento(new Piatto(10,"siciliana"));
	cMenu.inserimento(new Piatto(10,"vongole"));

	t.setNumeroCoperti(v.leggIntero("inserire il numero di coperti"));
	t.setNumeroTavolo(v.leggIntero("inserire il numero del tavolo"));
	do{v.stampaMenu(cMenu.visualizzaALL());//v.stampaMenu(menu);
	sceltaPiatto=v.leggIntero("inserire il piatto scelto")-1;
	cPiatti.inserimento(cMenu.visualizza(sceltaPiatto));
	s=v.leggiStringa("vuoi inserire un nuovo piatto?");
	}while(s.equalsIgnoreCase("si"));
	t.setPiattiScelti(cPiatti.visualizzaALL());
	
	for(Piatto p: t.getPiattiScelti()) {
	t.setConto(t.getConto()+p.getPrezzo());	
	}
	t.setConto(t.getConto()*t.getNumeroCoperti());
	System.out.println(t.getConto());
	
	
	
}
}
