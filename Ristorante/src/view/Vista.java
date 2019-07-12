package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Piatto;

public class Vista {
	private Scanner input=new Scanner(System.in);

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


public String leggiStringa(String messaggio) {
	
	System.out.println(messaggio);/*
	
	*String s=input .nextLine();
	*return s;
	*/
	return input.nextLine();
}
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


public void stampaMenu(ArrayList<Piatto> visualizzaALL) {
	for(int i=0;i<visualizzaALL.size();i++) {
		System.out.println((i+1)+")"+visualizzaALL.get(i));
	}
	
}


}
