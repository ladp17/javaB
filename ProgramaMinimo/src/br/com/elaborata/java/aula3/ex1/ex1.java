package br.com.elaborata.java.aula3.ex1;

import java.util.Scanner;

/**
 * 
 * @author Leo
 *
 */

public class ex1 {
	
	public static void main(String[] args) {
		Double pesoLua;
		Double peso;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu peso");
		
		peso = scanner.nextDouble();
		
		pesoLua = peso * 0.17;
		
		System.out.printf("seu peso na lua eh: %.2f", pesoLua);
		
		scanner.close();
		
	}

}



