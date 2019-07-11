package crud;

import java.util.ArrayList;

import model.Dipendente;

public class CrudArrayList implements iCrud {

	private ArrayList<Dipendente> dipendenti; //dichiarato ma no instanziato!
	
	public void creaArrayList(){
		this.dipendenti=new ArrayList<Dipendente>();
	}
	
	@Override
	public void inserimento(Dipendente d, int posizione) {
		dipendenti.add(d);
	}

	@Override
	public void modifica(Dipendente d, int posizione) {
		dipendenti.set(posizione, d);

	}

	@Override
	public void elimina(Dipendente d) {
		dipendenti.remove(d);

	}

	@Override
	public Dipendente visualizza(int pos) {
		// TODO Auto-generated method stub
		return dipendenti.get(pos);
	}
	
	public int ricerca (Dipendente d){
		return dipendenti.indexOf(d); //return -1 se non presente in lista
	}
	
	public ArrayList<Dipendente> getDipendenti(){
		return dipendenti;
	}
	
	public CrudArrayList(){
		this.dipendenti=new ArrayList<Dipendente>();
	}

	/**
	 * @param dipendenti the dipendenti to set
	 */
	public void setDipendenti(ArrayList<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

}
