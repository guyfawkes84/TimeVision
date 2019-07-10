package esercizi_interfacce;

public class Rettangolo implements FiguraGeometrica {
	private final String NOME_FIGURA="Rettangolo";
	private double latoMinore, latoMaggiore;
	@Override
	public String stampaInformazioni() {
		// TODO Auto-generated method stub
		double perimetro=(2*latoMinore)+(2*latoMaggiore);
		double area=latoMinore*latoMaggiore;
		return NOME_FIGURA+"-> Perimetro:"+perimetro+", Area:"+area;
	}
	/**
	 * @return the nOME_FIGURA
	 */
	public String getNOME_FIGURA() {
		return NOME_FIGURA;
	}
	/**
	 * @return the latoMinore
	 */
	public double getLatoMinore() {
		return latoMinore;
	}
	/**
	 * @return the latoMaggiore
	 */
	public double getLatoMaggiore() {
		return latoMaggiore;
	}
	public Rettangolo(){}
		public Rettangolo(double latoMinore, double latoMaggiore){
			super();
			this.latoMinore=latoMinore;
			this.latoMaggiore=latoMaggiore;
		}
	}

