/**
 * 
 */
package br.com.elaborata.poo.ex1;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio1 {
	
	private static final String LOGIN = "roquejr";
	
	public static void main(String[] args) {
		Boolean condicao = Boolean.TRUE;
		while (condicao) {
			System.out.println("Informe o login");
			String login = new Scanner(System.in).next();
			
			if(LOGIN.equals(login)) {
				System.out.println("O login é válido");
				condicao = Boolean.FALSE;
			} else {
				System.out.println("O login é inválido, tente novamente!");
			}
		}
	}

}
