package crud;

import java.util.ArrayList;

import model.Piatto;

public interface iCrud {
public void inserimento(Piatto p);
public void remove(Piatto p);
public Piatto visualizza(int i);
public ArrayList<Piatto> visualizzaALL();


}
