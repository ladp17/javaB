/**
 * 
 */
package br.com.elaborata.ife;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class ExemploEstruturaIF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		Integer idade = scanner.nextInt();
		
		if(idade>=18) {
			System.out.println("Você é de maior");
		}
		
		scanner.close();

	}

}
