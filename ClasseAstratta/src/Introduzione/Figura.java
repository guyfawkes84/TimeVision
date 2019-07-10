package Introduzione;

public abstract class Figura {
	
	public abstract double area();
	
	public double somma(Figura f1){
		return this.area()+f1.area();
		
	}
}
