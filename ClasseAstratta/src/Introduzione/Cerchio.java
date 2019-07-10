package Introduzione;

public class Cerchio extends Figura{
	private double raggio;
	@Override
	public double area(){
		return raggio*raggio*3.14;
	}
}
