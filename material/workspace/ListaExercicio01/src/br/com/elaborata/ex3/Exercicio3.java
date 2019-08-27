/**
 * 
 */
package br.com.elaborata.ex3;

import javax.swing.JOptionPane;

/**
 * @author Roque Junior
 *
 */
public class Exercicio3 {

	private static Double soma = 0.0;
	private static Integer cont = 0;
	private static Double media = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (cont < 3) {

			soma += Double.valueOf(JOptionPane.showInputDialog("Informe a nota"));
			cont++;
		}

		media = calculaMedia(soma);

		System.out.println("A média é : " + media);

		if (media >= 5.0) {
			if (media >= 7.0) {
				System.out.println("Você foi aprovado");
			} else {
				System.out.println("Você está em recuperação");

				System.out.println("Informe a nova nota!!!!");

				verificarRecuperarcao(Double.valueOf(JOptionPane.showInputDialog("Informe a nova nota")));
			}

		} else if (media < 5.0) {
			System.out.println("Você está em reprovado");
		}

	}

	private static void verificarRecuperarcao(Double valueOf) {
		if (valueOf >= 5.0) {
			System.out.println("Você foi aprovado");
		} else {
			System.out.println("Você está em reprovado");
		}
	}

	private static Double calculaMedia(Double soma) {

		return soma / cont;
	}

}
