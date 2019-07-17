package model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Dipendente;

public class Crud implements iCrud {
private ArrayList<Dipendente> azienda;

public Crud(){
	azienda=new ArrayList<Dipendente>();
	carica();
}
	@Override
	public boolean inserimento(Dipendente d) {
	azienda.add(d);	
	return true;
	}

	@Override
	public ArrayList<Dipendente> visualizza() {
		// TODO Auto-generated method stub
		return azienda;
	}

	@Override
	public ArrayList<Dipendente> visualizzaOrdinato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Dipendente> cerca(Dipendente d) {
		ArrayList<Dipendente> trovati=new ArrayList<Dipendente>();
		for(int i=0;i<azienda.size();i++){
			if((azienda.get(i).getNome().equals(d.getNome()))&&(azienda.get(i).getCognome().equals(d.getCognome()))){
				trovati.add(azienda.get(i));
			}
		}
		return trovati;
	}

	@Override
	public boolean cancella(Dipendente d) {
		int i=azienda.indexOf(d);
		if(i==-1){
			return false;
		}else{
			azienda.remove(i);
			return true;
		}
	}
	@Override
public int cercaDip(Dipendente d){
	return azienda.indexOf(d);
}	
	@Override
	public boolean modifica(int i,Dipendente d) {
		// TODO Auto-generated method stub
		if(i==-1){
			return false;
		}else{
		azienda.set(i,d);
		return true;}
	}
	public void carica() {
		if(esisteAzienda()) {
			
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream("azienda.dat")));
		azienda= (ArrayList<Dipendente>) ois.readObject();
			ois.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}else{
			System.out.println("il file è vuoto!");
		}
		
	}
	   public boolean esisteAzienda(){
	   File file = new File("azienda.dat");
	   return file.exists();   
	   }
	   
	   public void salva() {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("azienda.dat")));
				oos.writeObject(azienda);
				oos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	   
	  /* public void finalize() throws Throwable{
		  try{ 
			  System.out.println("stampa");
			  salva();}finally {
				super.finalize();
			}*/
	 
	   
}
