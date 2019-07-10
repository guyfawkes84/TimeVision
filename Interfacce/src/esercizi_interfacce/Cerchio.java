package esercizi_interfacce;

public class Cerchio implements FiguraGeometrica {  
	private final String NOME_FIGURA="Cerchio";  
	private double raggio; 

@Override 
public String stampaInformazioni(){ 
	double circonferenza=2*Math.PI*raggio; 
	double area=raggio*raggio*Math.PI; 
	return NOME_FIGURA+"-> Circonferenza:"+circonferenza+", Area:"+area; }

public String getNOME_FIGURA() {return NOME_FIGURA;
}  

public double getRaggio() {
	return raggio;} public Cerchio(double raggio) {  super(); this.raggio = raggio;} 
} 