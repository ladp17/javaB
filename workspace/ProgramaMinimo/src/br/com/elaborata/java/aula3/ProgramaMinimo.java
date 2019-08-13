/**
 * 
 */
package br.com.elaborata.java.aula3;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class ProgramaMinimo {

	public static void main(String[] args) {
		System.out.print("Digite uma palavra-->");
		
		Scanner teclado = new Scanner(System.in);
		
		String linhaDigitada = teclado.nextLine();
		
		System.out.println(linhaDigitada);
		
		teclado.close();
		
	}

}
