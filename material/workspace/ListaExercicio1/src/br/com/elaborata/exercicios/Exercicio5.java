/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio5 {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Programa que calcula");

		System.out.println("Informe o primeiro valor");
		Double valor1 = teclado.nextDouble();

		System.out.println("Informe o segundo valor");
		Double valor2 = teclado.nextDouble();

		System.out.println("A soma dos valores é : " + (valor1 + valor2));

		System.out.println("A subtração dos valores é : " + (valor1 - valor2));

		System.out.println("A multiplicação dos valores é : " + (valor1 * valor2));

		if (valor2 == 0) {
			System.out.println("Não existe divisão por zero");
		} else {
			System.out.println("A divisão dos valores é : " + (valor1 / valor2));
		}

	}

}
