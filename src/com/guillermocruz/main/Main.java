package com.guillermocruz.main;

import java.util.ArrayList;

import com.guillermocruz.clases.Monomios;
import com.guillermocruz.clases.Polinomio;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monomios mono = new Monomios('+', 8, (byte)0);
		Monomios mono2 = new Monomios('-', 10, (byte)3);
		Monomios mono3 = new Monomios('+', 5, (byte)5);
		Monomios monog = new Monomios('-', 16, (byte)3);
		Monomios monoh = new Monomios('+', 12, (byte)4);
		Monomios monoi = new Monomios('+', 1, (byte)2);
		Monomios monoj = new Monomios('+', 7, (byte)1);
		Monomios monok = new Monomios('+', 8, (byte)1);
		
		//System.out.println(mono);
		
		/*Monomios[] ListaPersonas = new Monomios[100];
		ListaPersonas[0] = mono;
		ListaPersonas[1] = mono2;
		String poli = mono.toString() + ' '+ mono2.toString(); 
		*/
		
		System.out.println(mono2);
		System.out.println(monog);
		mono2.multiplicacionMonomios(mono2, monog);
		System.out.println(mono2);
		
		
		Polinomio poli = new Polinomio();
		poli.setPolinomios(mono);
		poli.setPolinomios(mono2);
		poli.setPolinomios(mono3);
		int res = poli.resultado(poli, 2);
		System.out.println(res);
		//String polis = mono.toString() + ' '+ mono2.toString(); 
		System.out.println(poli);
		//System.out.println(mono.escalar(2));
		//
		poli.insertar(poli, monog);
		System.out.println(poli);
		System.out.println(poli.getGrade());
		
		//poli.insertar(poli, monoh);
		//System.out.println(poli);
		
		poli.insertar(poli, monoi);
		System.out.println(poli);
		
		
		poli.insertar(poli, monoj);
		System.out.println(poli);
		
		
		
		poli.insertar(poli, monok);
		System.out.println(poli);
		
		Polinomio poli2 = new Polinomio();
		poli2 = poli;
		System.out.println(poli2);
		
		poli2.insertar(poli, monoh);
		System.out.println(poli2);
		
		Polinomio poli3 = new Polinomio();
		poli3 = poli3.sumaPolinomio(poli2, poli);
		
		System.out.println(poli3 );
	
	}

}
