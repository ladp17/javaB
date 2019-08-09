package br.com.elaborata.java.aula3.ex1;

import java.util.Scanner;

/**
 * 
 * @author Roque Junior
 *
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe seu peso");
		
		Double pesoTerra = 112.00;
		
		Double pesoLua = pesoTerra * 0.17;
				
		System.out.println("Seu peso na lua é " + pesoLua);
		System.out.printf("Seu peso na lua é %.4f" , pesoLua);
		
	}

}
