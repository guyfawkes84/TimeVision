package controller;

import java.util.ArrayList;

import crud.Crud;
import model.Vasca;
import view.Vista;

public class GestioneAcquario {

	public static void main(String[] args) {
		Crud ins = new Crud();
		Vista v = new Vista();
		Vasca c = new Vasca();
		v.leggIntero(c.getNome1());
	}

}
