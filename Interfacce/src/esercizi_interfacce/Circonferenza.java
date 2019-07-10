package esercizi_interfacce;

public class Circonferenza implements iCirconferenza{
	public double areaCerchio(double raggio){
		return raggio*raggio*PIGRECO;
	}
	public double circonferenzaCerchio(double raggio){
		return 2*raggio*PIGRECO;
	}
}

