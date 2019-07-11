package view;

import java.util.Scanner;

public class Vista {
	private Scanner input=new Scanner(System.in);


	/*
	 *  ********************************* METODI PER L'INSERIMENTO (INTERO/DOUBLE/STRINGA) *********************************
	 */

	//Metodo che legge in input un intero

	public int leggIntero(String messaggio) {

		int i=-1;
		boolean flag=false;
		do{
			flag=false;
			try {
				System.out.println(messaggio);
				i=Integer.parseInt(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Inserire solo caratteri numerici!");
				flag=true;}}	
		while(flag);
		return i;
	}

	//Metodo che legge in input un dato di tipo double

	private double leggiDouble(String messaggio) {
		double i=-1;
		boolean flag=false;
		do{
			flag=false;
			try {
				System.out.println(messaggio);
				i=Double.parseDouble(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Inserire solo caratteri numerici!");
				flag=true;}}	
		while(flag);
		return i;
	}

	//Metodo che legge in input una stringa

	public String leggiStringa(String messaggio) {

		System.out.println(messaggio);
		/*
		 *String s=input .nextLine();
		 *return s;
		 */
		return input.nextLine();
	}

	/*
	 *  ********************************* FINE METODI PER L'INSERIMENTO (INTERO/DOUBLE/STRINGA) *********************************
	 */

	/*
	 *  ********************************* MENU PIATTI ************************************
	 */

	public int stampaMenu() {
		int scelta=-1;

		do {
			System.out.println("************************");
			System.out.println("*  Menu del ristorante *");
			System.out.println("************************");
			System.out.println("");
			System.out.println("Primi piatti:");
			System.out.println("");
			System.out.println("1) Carbonara. ");
			System.out.println("2) Lasagnette al radicchio trevisano.");
			System.out.println("3) Ravioli al nero di seppia.");
			System.out.println("4) Gnocchi alla sorrentina.");
			System.out.println("5) Trofie al pesto.");
			System.out.println("");
			System.out.println("Secondi piatti:");
			System.out.println("");
			System.out.println("6) Filetto in crosta.");
			System.out.println("7) Crespelle ricotta e spinaci.");
			System.out.println("8) Cima di filetto con peperoncini verdi.");
			System.out.println("9) Involtini con speck provola funghi.");
			System.out.println("10) Polpettine con uva passa, pinoli e provola.");
			System.out.println("");
			System.out.println("0) USCITA DAL MENU.");
			System.out.println("");
			scelta=leggIntero("Selezionare un piatto del menu.:");
		}while(scelta==0);
		return scelta;
	}
}
