package model.dao;

import java.util.ArrayList;

import model.Dipendente;

public interface ICrud {

	public void inserimento(Dipendente d);
	public ArrayList<Dipendente> visualizza();
	public ArrayList<Dipendente> ordina();
	public int getPosizione(Dipendente d);
	public Dipendente ricerca(String codF);
	public void modifica(int i, Dipendente d);
	public void eliminadaCF(Dipendente d);
	public boolean esisteAzienda();
	public void salva();
	public boolean carica();
	
}
