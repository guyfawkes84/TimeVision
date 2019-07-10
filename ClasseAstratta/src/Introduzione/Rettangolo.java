package Introduzione;

public class Rettangolo extends Figura{
	private int lato1, lato2;
	
	@Override
	public double area(){
		return lato1*lato2;
	}
}
