package br.com.baytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.baytebank.banco.modelo.Conta;
import br.com.baytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
	
//		Conta cc = new ContaCorrente(22,22);
//		Conta cc2 = new ContaCorrente(22,22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		System.out.println(igual);
	
		
		//Generics
		ArrayList <Conta> lista = new ArrayList <Conta>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("J� Existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		}		
	}

	

