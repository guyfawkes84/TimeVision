package crud;

import java.util.ArrayList;

import model.Esemplare;

public class Crud implements iCrud {
	private ArrayList<Esemplare> esemplari;

	@Override
	public void inserimento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Esemplare visualizza() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Esemplare> esemplari() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the esemplari
	 */
	public ArrayList<Esemplare> getEsemplari() {
		return esemplari;
	}

	/**
	 * @param esemplari the esemplari to set
	 */
	public void setEsemplari(ArrayList<Esemplare> esemplari) {
		this.esemplari = esemplari;
	}
	
	public Crud(){
		this.esemplari=new ArrayList<Esemplare>();
	}

}
