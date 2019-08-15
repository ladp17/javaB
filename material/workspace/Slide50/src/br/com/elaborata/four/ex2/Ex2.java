/**
 * 
 */
package br.com.elaborata.four.ex2;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Informe um número inteiro");

		Integer numero = new Scanner(System.in).nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}
}
