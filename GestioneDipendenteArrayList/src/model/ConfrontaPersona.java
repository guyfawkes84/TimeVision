package model;

import java.util.Comparator;

public class ConfrontaPersona implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		
		int risultato;
		risultato=(p1.compareTo(p2));
		return risultato;
	}

}
