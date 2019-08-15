/**
 * 
 */
package br.com.elaborata.modelo;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Ex2 {
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pedido = "";
		sair: do {

			System.out.println(" 1 - X - Salada (5,30)");
			System.out.println(" 2 - X - Bacon (6,00)");
			System.out.println(" 3 - X - Egg (6,70)");
			System.out.println(" 4 - Refrigerante (3,20)");
			System.out.println(" 5 - Finalizar pedido");

			Integer opc = scanner.nextInt();

			switch (opc) {
			case 1:
				pedido+="X- Salada\n";
				break;

			case 2:
				pedido+="X- Bacon\n";
				break;

			case 3:
				pedido+="X- Egg\n";
				break;

			case 4:
				pedido+="Refrigerante\n";
				break;

			case 5:
				System.out.println("Pedido finalizado\n\n");
				System.out.println(pedido);
				break sair;

			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (true);
		scanner.close();
	}

}
