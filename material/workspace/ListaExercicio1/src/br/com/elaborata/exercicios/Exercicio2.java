/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Programa que mostra a tabuada\n");

		System.out.println(" 1 - Tabuada de 1 número");
		System.out.println(" 2 - Tabuada do 1 ao 10");

		switch (teclado.nextInt()) {
		case 1:
			Integer numero;
			System.out.println("Informe o número");
			numero = teclado.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
			break;
		case 2:
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
				System.out.println();
			}
			break;
		default:
//			main(null);
			break;
		}

	}

}
