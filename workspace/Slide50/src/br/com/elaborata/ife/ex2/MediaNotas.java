/**
 * 
 */
package br.com.elaborata.ife.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class MediaNotas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double soma = 0.0;
		Double media = 0.0;
		Integer contador = 1;
		Scanner scanner = new Scanner(System.in);

		while (contador <= 4) {
			System.out.println("Informe a " + contador + "ª nota");
			soma += scanner.nextDouble();
			media = soma / contador++;
		}

		System.out.println("A média do aluno é " + media);

		if (media >= 4.0) {
			if (media >= 7.0) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado");
		}

		scanner.close();
	}
}
