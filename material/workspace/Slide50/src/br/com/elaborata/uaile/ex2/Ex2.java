/**
 * 
 */
package br.com.elaborata.uaile.ex2;

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
		Double soma = 0.0;
		Double media = 0.0;
		Integer cont = 1;
		
		while (cont<=4) {
			System.out.println("Informe a " + cont + "ª nota");
			soma+=new Scanner(System.in).nextDouble();
			media=soma/cont++;
		}
		System.out.println("A média das notas é :" + media);
	}
}
