/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio4 {

	private static Scanner teclado = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Informe seu nome :");
		
		String nome = teclado.next();
		
		System.out.println("Informe sua idade :");
		
		Integer idade = teclado.nextInt();
		
		if(idade >= 18) {
			System.out.println(nome + " você já pode tirar a CNH");
		} else {
			System.out.println(nome + " você ainda não pode tirar a CNH, "
					+ "você ainda tem "+ idade + " anos");
		}
		

	}

}
