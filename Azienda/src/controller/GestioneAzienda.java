package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.dao.Crud;
import view.Vista;

public class GestioneAzienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vista vista=new Vista();
		Crud crud=new Crud();
		int scelta;
		Dipendente dTrovato;
		ArrayList<Dipendente> trovati;
		try{
		do{
			scelta=vista.menu();
			switch(scelta){
			case 1://inserimento
				switch(vista.menuInserimento()){
				case 1://dipendente
					Dipendente d=new Dipendente();
				
					vista.mascheraInserimento(d);
					crud.inserimento(d);
					vista.attesa();
					break;
				case 2://manager
					Manager man=new Manager();
					vista.mascheraInserimento(man);
					crud.inserimento(man);
					vista.attesa();
					break;
				case 3://dirigente
					Dirigente dir=new Dirigente();
					vista.mascheraInserimento(dir);
					crud.inserimento(dir);
					vista.attesa();
					break;
				}

				break;
			case 2://Modifica

				trovati=crud.cerca(vista.mascheraCerca());
				dTrovato=vista.visualizzaDipendentiTrovati(trovati);
				vista.attesa();
				if(dTrovato!=null){
					int i=crud.cercaDip(dTrovato);
					if(vista.mascheraModifica(dTrovato)){
						crud.modifica(i,dTrovato);
					}
				}

				break;
			case 3://cancella
				trovati=crud.cerca(vista.mascheraCerca());
				dTrovato=vista.visualizzaDipendentiTrovati(trovati);
				if(dTrovato!=null&&vista.cancella(dTrovato)){
					crud.cancella(dTrovato);}
				break;
			case 4://trova
				trovati=crud.cerca(vista.mascheraCerca());
				vista.visualizzaAzienda(trovati);
				vista.attesa();
				break;
			case 5://visualizza
				vista.visualizzaAzienda(crud.visualizza());
				vista.attesa();
				break;
			case 6://carica
				
				if(vista.gestioneCarica(crud.visualizza())) {
					crud.carica();
					if(crud.visualizza().size()>0){ 
						
						System.out.println("Dipendenti caricati: "+crud.visualizza().size());
						vista.attesa();
					} else {System.out.println("Dipendenti caricati: 0");
					vista.attesa();
					}
				} else{System.out.println("Operazione di caricamento annullata!");
				vista.attesa();			
				}
				break;
			case 7:
			
					if(vista.gestioneSalvataggio()){
						crud.salva();
					    System.out.println("Dipendenti salvati: "+crud.visualizza().size());
					}
				 

				break;
			}
		}while(scelta!=8);
		}finally{
			System.out.println("esci");
			crud.salva();
		}

	}
	/*@Override
	 public void finalize() throws Throwable{
		  try{ 
			  System.out.println("stampa");
			  //salva(azienda);}
		  }finally {
				super.finalize();
			}
	   }*/
}
