package br.com.elaborata.relampago;

import java.util.Scanner;

/**
 * Programa que calcula a distância da queda de um <br>
 * raio cujo som leva x segundos para alcançá-lo<br>
 * 
 * @author Roque Junior
 *
 */
public class Som {

	private static Double distancia;
	private static Scanner teclado = new Scanner(System.in);
	private static final Integer SOM = 1100;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Programa para calcular a " 
				+ "distância do relâmpago");
		
		System.out.println("Informe quanto tempo demorou " 
				+ "para ouvir o som");

		distancia = teclado.nextDouble();
		System.out.println("O relâmpago está a " 
				+ (distancia * SOM) + " pés de distância");
		
		teclado.close();
	}
}
