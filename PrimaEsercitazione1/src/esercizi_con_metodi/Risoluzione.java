package esercizi_con_metodi;

import java.text.Format;
import java.util.Scanner;

public class Risoluzione {

	/*
	 * Metodo che legge un intero da tastiera.
	 */


	public int leggIntero(String messaggio){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		String s=input.nextLine();
		int valore=Integer.parseInt(s);
		//input.close();
		return valore;
	}

	//Metodo per leggere le stringhe
	public String leggiStringa(String messaggio){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		//input.close();
		return input.next();
	}

	/*
	 * 1) Metodo che verifica se un numero è pari o dispari.
	 */

	public void pariDispari(){
		System.out.println("Dato un numero, il programma verifica se è pari, dispari.");
		System.out.println();

		int numero=leggIntero("Inserire il numero: ");
		if(numero == 00){
			System.out.println("Carattere di escape selezionato.");
		}
		if(numero%2==0){
			System.out.println("Il numero è pari.");

		}
		else if(numero%2!=0){
			System.out.println("Il numero è dispari.");
		}
		else{
			System.out.println("Numero non valido.");
		}
	}

	/*
	 * 2) Metodo che verifica se un numero è maggiore o minore o uguale.
	 */

	public void maggioreMinore(){
		System.out.println("Dato un numero, il programma verifica se è maggiore, minore o uguale.");
		System.out.println();

		int num1=leggIntero("Inserire il primo numero: ");
		int num2=leggIntero("Inserire il secondo numero:");
		if((num1 == 00) || (num1 == 00)){
			System.out.println("Carattere di escape selezionato.");
		}
		if(num1>num2){
			System.out.println(num1+" è maggiore di "+num2);
		}
		else if(num1<num2){
			System.out.println(num1+" è minore di "+num2);
		}
		else if(num1==num2){
			System.out.println(num1+" è uguale di "+num2);
		}
		else{
			System.out.println("ERRORE.");
		}

	}

	/*
	 * 3) Metodo che conta n numeri, disponendoli in orizzontale
	 */
	public void contaOrizzontale(){

		System.out.println("Il programma conta n volte in modo orizzontale.");
		System.out.println();

		int num1=leggIntero("Inserire la cardinalità: ");

		for(int i=1; i<num1+1; i++){
			if (i != num1){
				System.out.print(i+",");
			}
			else if (i == num1){
				System.out.print(i+".");
			}
		}
	}

	/*
	 * 4) Metodo che conta n numeri, disponendoli in modo verticale.
	 */

	public void contaVerticale(){

		System.out.println("Il programma conta n volte in modo verticale.");
		System.out.println();

		int num1=leggIntero("Inserire la cardinalità: ");

		if(num1 == 00){
			System.out.println("Carattere di escape selezionato.");
		}

		for(int i=1; i<num1+1; i++){
			System.out.println(i);
		}
	}

	/*
	 * 5) Metodo che emula un semaforo. Dato un colore in input restituisce un determinato outcome.
	 *    ROSSO=STOP | GIALLO=RALLENTA | VERDE=VAI.0
	 */

	public void Semaforo(){
		Scanner input = new Scanner(System.in);
		System.out.println("Il programma prevede l'inserimento di un colore corrispondente al semaforo.");
		System.out.println("Ad ogni inserimento, il computer ti indica Rosso=STOP, Giallo=RALLENTA, Verde=VAI.");
		System.out.println("");
		System.out.println("Inserire colore Rosso/Giallo/Verde: ");
		String colore = input.next();
		input.close();

		if(colore.equals("verde")){
			System.out.println("VAI!");
		}
		else if(colore.equals("giallo")){
			System.out.println("RALLENTA!");
		}
		else if(colore.equals("rosso")){
			System.out.println("STOP!");
		}
		else{
			System.out.println("Non sei al semaforo.");
		}

	}

	/*
	 * 6) Metodo che inserisce in un vettore n nomi di n persone.
	 *    Dopo l'inserimento, effettua anche un ricerca.
	 */
	public void Persone(){
		System.out.println("Il programma prevede l'inserimento di 5 nominativi all'interno di un vettore.");
		System.out.println("Dopodiché effettua una ricerca.");
		System.out.println("");


		//		Scanner input = new Scanner(System.in);

		int num1 = leggIntero("Inserire la quantità di nomi: ");
		String [] vettore = new String[num1];

		for(int i=0; i<vettore.length;i++){
			vettore[i]= leggiStringa("Inserire nome: ");

		}
		System.out.println();
		System.out.println("Stampa del vettore:");
		for(int i=0; i<vettore.length;i++){
			System.out.println(vettore[i]);
		}

	}

	/*
	 * 7) Conta n numeri finché l'utente non decide di fermare l'esecuzione.
	 */

	public void contaTutto(){
		System.out.println("");
		System.out.println("Conta e somma n numeri, fino a che l'utente non decida di fermare.");
		System.out.println("Infine, effettua una media.");
		System.out.println("");

		float somma=0, conta=0;
		float media=0;
		String s;

		do{
			int n = leggIntero("Inserire un numero: ");
			somma = somma + n;
			conta++;
			s = leggiStringa("Vuoi continuare? ");
		}while(s.equals("si"));
		media = somma/conta;
		System.out.println("Media: "+media);
		System.out.println("Somma: "+somma);
	}

	/*
	 * 8) Stampare le tabelline da 1 a 10, selezionandole da tastiera.
	 */

	public void tabelline(){
		System.out.println("");
		System.out.println("Selezionare una tabellina dal menu e, stampala a video.");
		System.out.println("");

		int num = leggIntero("Selezionare la tabellina: ");
		System.out.println("");
		System.out.println("Tabellina del "+num);
		System.out.println("");

		//SOLUZIONE 1
		for(int i=0; i<10+1; i++)
			System.out.println(i*num);

		//SOLUZIONE 2
		/*
		switch(num) {
		case 1: //Tabellina 1
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 2: //Tabellina 2
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 3: //Tabellina 3
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 4: //Tabellina 4
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 5: //Tabellina 5
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 6: //Tabellina 6
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 7: //Tabellina 7
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 8: //Tabellina 8
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 9: //Tabellina 9
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		case 10: //Tabellina 10
			for(int i=0; i<10+1;i++) {
				System.out.println(i*num);
			}
		}
		 */

		//SOLUZIONE 3
		/*
		if(num==1){
			for(int i=0; i<10+1; i++){
				System.out.println(i*num);
			}
		}
		if(num==2){
			for(int i=0; i<10+1; i++){
				System.out.println(i*num);
			}
		}
		if(num==3)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==4)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==5)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==6)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==7)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==8)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==9)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}
		if(num==10)
			for(int i=0; i<10+1; i++) {
				System.out.println(i*num);
			}*/



	}


	/*
	 * *******************FINE TABELLINE*******************
	 */


	/*
	 * Carica e stampa una matrice di valori meteorologici.
	 */

	public void Meteo() {
		System.out.println("");
		System.out.println("METEO");
		System.out.println("");


		int m [][]= new int [7][4];
		String v [] = new String[7];


		//		//INPUT VETTORE GIORNI (LETTERE)
		//		
		//		for(int conta=1; conta<=7; conta++){
		//			v[conta]=leggiStringa("Inserire giorno: "+conta);
		//		}

		//INPUT MATRICE
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
					m[i][j]=leggIntero("Inserire temperatura: "+"["+i+"]"+"["+j+"]");
				}
			}



		//OUTPUT MATRICE
		System.out.println("Stampo matrice meteorologica:");
		System.out.println(" ");
		for(int i=0; i<7; i++) {
			double time=0;
			for(int j=0; j<4; j++) {
					if(m[i][j]>1) {
						System.out.print("| ora: "+time+++" "+" Gradi: "+" "+m[i][j]+" ");
					}
					else {
						System.out.print("| ora: "+time+++" "+" Grado: "+" "+m[i][j]+" ");
					}
				}
				System.out.println();
		}


	}

}

