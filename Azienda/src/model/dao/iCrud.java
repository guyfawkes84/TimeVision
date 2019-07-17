package model.dao;

import java.util.ArrayList;

import model.Dipendente;

public interface iCrud {

public boolean inserimento(Dipendente d);
public ArrayList<Dipendente> visualizza();
public ArrayList<Dipendente> visualizzaOrdinato();
public ArrayList<Dipendente> cerca(Dipendente d);
public boolean cancella(Dipendente d);
public boolean modifica(int i,Dipendente d);
public int cercaDip(Dipendente d);
}
