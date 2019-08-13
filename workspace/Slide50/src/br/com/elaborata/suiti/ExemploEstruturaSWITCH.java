/**
 * 
 */
package br.com.elaborata.suiti;

/**
 * @author Roque Junior
 *
 */
public class ExemploEstruturaSWITCH {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer opcaoMenu = 1;
		
		switch (opcaoMenu) {
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2");
			break;
		case 3:
			System.out.println("Você escolheu a opção 3");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
}
