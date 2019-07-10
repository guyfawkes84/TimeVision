package view;

import java.util.Scanner;

import Introduzione.Cerchio;
import Introduzione.Rettangolo;
import Introduzione.Gestione;
import Introduzione.Figura;

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
				System.out.println("inserire caratteri numerici!!!!");
				flag=true;}}	
		while(flag);
		return i;
	}

	//Metodo che legge in input un dato di tipo double
	
	@SuppressWarnings("unused")
	private double leggiDouble(String messaggio) {
		double i=-1;
		boolean flag=false;
		do{
			flag=false;
			try {
				System.out.println(messaggio);
				i=Double.parseDouble(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("inserire caratteri numerici!!!!");
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

	//------------------------------------------------------------------------------------------------------------------------------------------

	
	//---------------------------------------------------------------------------------------------------------------------------------------

	/*
	 * ********************************* METODI DI STAMPA *********************************
	 */
	//Metodo stampa menu
	
	public int  stampaMenu() {
		int scelta=-1;
		do {
			System.out.println("1) cercare");
			System.out.println("2) visualizzare");
			System.out.println("3) elimina");
			System.out.println("0)esci");
			scelta=leggIntero("fai la tua scelta:");
		}while(!(scelta==1||scelta==2||scelta==3 || scelta==0));
		return scelta;
	}

	/*
	 * ********************************* FINE METODI DI STAMPA *********************************
	 */

	//---------------------------------------------------------------------------------------------------------------------------------------
}

