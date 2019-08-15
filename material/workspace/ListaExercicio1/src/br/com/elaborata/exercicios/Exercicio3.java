/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio3 {

	private static Scanner teclado = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programa que mostra os números entre dois valores informados");
		
		System.out.println("Informe o primeiro valor");
		Integer valor1 = teclado.nextInt();
		
		System.out.println("informe o segundo valor");
		Integer valor2 = teclado.nextInt();
		
		if(valor1 > valor2) {
			if(valor1==(valor2-1)) {
				System.out.println("Não existem números entre " + valor1 + " e " + valor2);
			}
			
			for (int i = valor1-1; i > valor2; i--) {
				System.out.println(i + ",");
			}
		} else if(valor1 < valor2) {
			if(valor2-valor1==1) {
				System.out.println("Não existem números entre " + valor1 + " e " + valor2);
			}
			
			for (int i = valor1+1; i < valor2; i++) {
				System.out.println(i + ",");
			}
		} else {
			System.out.println("Os números são iguais");
		}

	}

}
