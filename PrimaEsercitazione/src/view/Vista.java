package view;

import java.util.Scanner;


public class Vista {
	
	private Scanner input = new Scanner(System.in);
	
	//Metodo per leggere gli interi
	public int leggIntero(String messaggio){
		int i=-1;
		boolean flag=false;
		do{
			flag=false;
			try{
				System.out.println(messaggio);
				i=Integer.parseInt(input.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Inserire caratteri numerici!");
				flag=true;
			}
		}
		while(flag);
		return i;
	}
	
	//Metodo per leggere le stringhe
	public String leggiStringa(String messaggio){
		System.out.println(messaggio);
		return input.nextLine();
	}
	
}
