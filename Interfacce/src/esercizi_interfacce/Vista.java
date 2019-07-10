package esercizi_interfacce;

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
				System.out.println("inserire caratteri numerici!!!!");
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
}