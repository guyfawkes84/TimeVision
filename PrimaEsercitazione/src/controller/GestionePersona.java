package controller;

import java.util.Scanner;

import model.Persona;
import view.Vista;

public class GestionePersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Vista v = new Vista();
		int n=0;
		System.out.println("Inserire cardinalità del vettore: ");
		n=input.nextInt();
		Persona [] vettore = new Persona[n];

		for(int i=0; i<n; i++){
			Persona p = new Persona();
			//Prelevo i dati da tastiera
			p.setNome(v.leggiStringa("Inserire nome: "));
			p.setCognome(v.leggiStringa("Inseire cognome: "));
			p.setCf(v.leggiStringa("Inserire il Codice Fiscale: "));
			p.setSeriale(v.leggiStringa("Inserire seriale: "));

			String s=v.leggiStringa("Maschio o femmina?");

			if(s.equalsIgnoreCase("f")){
				p.setSesso(true);
			}else if(s.equalsIgnoreCase("m")){
				p.setSesso(false);
			}
			vettore[i]=p;
		}

		for(int i=0;i<n;i++){
			//Stampo i dati a video
			System.out.println();
			System.out.println("Informazione della persona"+i+":");
			System.out.println("Nome: "+vettore[i].getNome());
			System.out.println("Cognome: "+vettore[i].getCognome());
			System.out.println("Codice Fiscale: "+vettore[i].getCf());
			System.out.println("Seriale: "+vettore[i].getSeriale());
			System.out.println("Data di nascita: "+vettore[i].getData_nascita());
			System.out.println("Sesso: "+vettore[i].isSesso());
		}
		input.close();
	}
	
}
