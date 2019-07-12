package crud;

import java.util.ArrayList;

import model.Piatto;

public class Crud implements iCrud {
private ArrayList<Piatto> piatti;

	public ArrayList<Piatto> visualizzaALL() {
	return piatti;
}

public void setPiatti(ArrayList<Piatto> piatti) {
	this.piatti = piatti;
}

	@Override
	public void inserimento(Piatto p) {
		this.piatti.add(p);

	}

	@Override
	public void remove(Piatto p) {
		this.piatti.remove(p);

	}

	@Override
	public Piatto visualizza(int i) {
		// TODO Auto-generated method stub
		return this.piatti.get(i);
	}

	public Crud() {
		this.piatti=new ArrayList<Piatto>();
	}

}
