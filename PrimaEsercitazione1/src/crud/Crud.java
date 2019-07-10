package crud;

import model.Dipendente;
import view.Vista;

public class Crud implements iCrud {

	private int n;
	Vista v = new Vista();

	private Dipendente[] dipendenti;


	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}



	public void creaVettore(int n) {
		this.dipendenti=new Dipendente[n];
	}

	@Override
	public void inserimento(Dipendente d,int posizione) {
		this.dipendenti[posizione]=d;	

	}

	@Override
	public void modifica(Dipendente d, int posizione) {
		for(int i=0; i<dipendenti.length; i++){
			if(dipendenti[i].getSeriale()==d.getSeriale()){
				//Continuare con maschera modifica
				v.mascheraDiModificaDipendenti(d);


			}
		}


	}

	@Override
	public void elimina(Dipendente d) {
		for(int i=0; i<dipendenti.length; i++){
			if(dipendenti[i].getSeriale()==d.getSeriale()){
				dipendenti[i]=null;
			}
		}


	}

	@Override
	public Dipendente visualizza(int pos) {

		return dipendenti[pos];
	}

}
