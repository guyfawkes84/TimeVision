package crud;

import java.util.ArrayList;

import model.Esemplare;

public interface iCrud {
	public void inserimento();
	public void remove();
	public Esemplare visualizza();
	public ArrayList<Esemplare> esemplari();
}
