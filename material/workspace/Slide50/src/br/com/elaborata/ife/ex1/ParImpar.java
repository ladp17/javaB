/**
 * 
 */
package br.com.elaborata.ife.ex1;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class ParImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		Integer numero = scanner.nextInt();
		
		if(numero%2==0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é impar");
		}

		scanner.close();
	}

}
