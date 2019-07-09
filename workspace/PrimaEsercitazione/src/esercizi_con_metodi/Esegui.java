package esercizi_con_metodi;

import java.util.Scanner;

public class Esegui {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*************MENU***************");
		System.out.println("1) Calcolo Pari/Dispari.");
		System.out.println("2) Calcolo Maggiore/Minore.");
		System.out.println("3) Conta orizzontale.");
		System.out.println("4) Conta verticale.");
		System.out.println("5) Colori Sefamoro.");
		System.out.println("6) Vettore Persone.");
		System.out.println("7) Calcolo Somma e Media.");
		System.out.println("8) Tabelline. ");
		System.out.println("9) Meteo.");
		System.out.println("0) Exit.");
		System.out.println("Fai la tua scelta: ");
		int scelta = input.nextInt();
		
		Risoluzione r = new Risoluzione();
		
		
		switch(scelta){
		case 1: //pari dispari
			r.pariDispari();
			break;
		case 2: //maggiore minore
			r.maggioreMinore();
			break;
		case 3: //conta orizzontale
			r.contaOrizzontale();
			break;
		case 4: //conta verticale
			r.contaVerticale();
			break;
		case 5: //Semaforo
			r.Semaforo();
			break;
		case 6: //Persone
			r.Persone();
			break;
		case 7: //Conta tutto
			r.contaTutto();
			break;
		case 8: //Tabelline
			r.tabelline();
			break;
		case 9: //Meteo
			r.Meteo();
			break;
		case 0: //exit
			System.out.println("Uscita dal programma.");
			break;
			
			default:
				System.out.println("Numero non valido.");
			
		}
		input.close();
	
		
		
	}

}
