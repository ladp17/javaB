/**
 * 
 */
package br.com.elaborata.ex2;

import br.com.elaborata.util.Entrada2;

/**
 * @author Roque Junior
 *
 */
public class Exercicio2 {

	private static Double soma = 0.0;
	private static Integer cont = 0;
	private static Double media = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (cont < 3) {

			soma += Double.valueOf(new Entrada2().showInputDialog("Informe a nota"));
			cont++;
		}

		media = calculaMedia(soma);

		verificaMedia();

	}

	private static void verificaMedia() {
		System.out.println("A média é : " + media);

		if (media >= 5.0) {
			if (media >= 7.0) {
				System.out.println("Você foi aprovado");
			} else {
				System.out.println("Você está em recuperação");
			}

		} else if (media < 5.0) {
			System.out.println("Você está em reprovado");
		}
	}

	private static Double calculaMedia(Double soma) {

		return soma / cont;
	}

}
