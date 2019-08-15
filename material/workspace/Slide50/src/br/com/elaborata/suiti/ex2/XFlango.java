/**
 * 
 */
package br.com.elaborata.suiti.ex2;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class XFlango {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(" 1 - X - Salada");
		System.out.println(" 2 - X - Bacon");
		System.out.println(" 3 - X - Egg");
		System.out.println(" 4 - Refrigerante");
		System.out.println(" 5 - Finalizar pedido");

		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Você selecionou X- Salada");
			break;

		case 2:
			System.out.println("Você selecionou X- Bacon");
			break;

		case 3:
			System.out.println("Você selecionou X- Egg");
			break;

		case 4:
			System.out.println("Você selecionou Refrigerante");
			break;

		case 5:
			System.out.println("Pedido finalizado");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		scanner.close();
	}

}
