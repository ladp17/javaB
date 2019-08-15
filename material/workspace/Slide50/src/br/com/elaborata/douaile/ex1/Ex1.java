/**
 * 
 */
package br.com.elaborata.douaile.ex1;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Informe um número inteiro");

		Integer i = 1;
		Integer numero = new Scanner(System.in).nextInt();

		do{
			System.out.println(numero + " X " + i + " = " + (numero * i));
		} while(i++ < 10);
		
	}
}
