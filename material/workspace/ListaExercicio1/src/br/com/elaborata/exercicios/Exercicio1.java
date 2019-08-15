/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe um número");
		
		System.out.print("O quadrado do numero é : " + 
				Math.pow(new Scanner(System.in).nextDouble(), 2));
	}

}
