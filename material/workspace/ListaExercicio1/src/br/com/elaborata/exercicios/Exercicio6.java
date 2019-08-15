/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Informe um número inteiro");
		
		Integer numero = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
