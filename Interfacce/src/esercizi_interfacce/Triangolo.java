package esercizi_interfacce;

public class Triangolo implements FiguraGeometrica{
	private final String NOME_FIGURA="Triangolo";
	private double lato1, lato2, lato3;
	public String getNOME_FIGURA(){
		return NOME_FIGURA;
	}
	/**
	 * @return the lato1
	 */
	public double getLato1() {
		return lato1;
	}
	/**
	 * @return the lato2
	 */
	public double getLato2() {
		return lato2;
	}
	/**
	 * @return the lato3
	 */
	public double getLato3() {
		return lato3;
	}
	@Override
	public String stampaInformazioni() {
		// TODO Auto-generated method stub
		double perimetro=lato1+lato2+lato3;
		double semiperimetro=perimetro/2;
		double area=Math.sqrt((semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3))); //Formula di Erone
		return NOME_FIGURA+"-> Perimetro: "+perimetro+", Area: "+area;
	}
	
	public Triangolo(){}
	public Triangolo(double lato1, double lato2, double lato3){
		super();
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}
	
}
