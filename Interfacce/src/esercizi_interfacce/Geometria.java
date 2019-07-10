package esercizi_interfacce;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista v = new Vista();
		double raggio = v.leggIntero("Leggi intero: ");
		Circonferenza c = new Circonferenza();
		System.out.println("Area cerchio: "+c.areaCerchio(raggio));
		System.out.println("Circonferenza del cerchio: "+c.circonferenzaCerchio(raggio));

	}

}
