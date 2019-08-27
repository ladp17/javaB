/**
 * 
 */
package br.com.elaborata.ex1;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio1 {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Informe seu nome : ");
		String nome = teclado.next();

		System.out.println("Informe sua idade : ");
		Integer idade = teclado.nextInt();
		
		Character letra = nome.charAt(0);
		
		verificaInicialNome(letra);

		System.out.println(verificaInicialNome(nome, idade));
		System.out.println(verificaInicialNome(letra, idade));
		
		teclado.close();

	}

	private static void verificaInicialNome(char letra, double d) {
		// TODO Auto-generated method stub
		
	}

	private static void verificaInicialNome(Character letra) {
		if (letra == 'M') {
			System.out.println("Seu nome poderia ser Maria");
		} else if (letra == 'J') {
			System.out.println("Seu nome poderia ser Josefina");
		} else if (letra == 'F') {
			System.out.println("Seu nome poderia ser Francisca");
		} else {
			System.out.println("Seu nome poderia ser qualquer um");
		}
	}
	
	private static String verificaInicialNome(String nome, Integer idade) {
		char letra = nome.charAt(0);
		if (letra == 'M') {
			return "Seu nome poderia ser Maria";
		} else if (letra == 'J') {
			return "Seu nome poderia ser Josefina";
		} else if (letra == 'F') {
			return "Seu nome poderia ser Francisca";
		} else {
			return "Seu nome poderia ser qualquer um";
		}
		
	}

	private static String verificaInicialNome(Character letra, Integer idade) {
		String msg = "Seu nome poderia ser qualquer um";
		if (letra == 'M') {
			msg = "Seu nome poderia ser Maria";
		} else if (letra == 'J') {
			msg = "Seu nome poderia ser Josefina";
		} else if (letra == 'F') {
			msg = "Seu nome poderia ser Francisca";
		} 
		
		return msg;
	}
}
