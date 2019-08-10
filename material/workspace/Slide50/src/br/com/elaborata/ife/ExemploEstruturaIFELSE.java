/**
 * 
 */
package br.com.elaborata.ife;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class ExemploEstruturaIFELSE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		Integer idade = scanner.nextInt();
		
		if(idade>=18) {
			System.out.println("Você é de maior");
		} else {
			System.out.println("Você é de menor");
		}
		
		scanner.close();

	}

}
