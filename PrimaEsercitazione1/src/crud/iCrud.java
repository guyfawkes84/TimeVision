package crud;

import model.Dipendente;

public interface iCrud {

	public void inserimento(Dipendente d, int posizione );

	public void modifica(Dipendente d,int posizione);

	public void elimina(Dipendente d);

    public Dipendente visualizza(int pos);
}
