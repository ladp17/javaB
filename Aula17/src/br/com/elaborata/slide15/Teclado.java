/**
 * 
 */
package br.com.elaborata.slide15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que contrala entrada de dados pela std in.
 * 
 * Integer leInteger();
 * 
 * @author Leo
 *
 */
public class Teclado {
	
	/**
	 * 
	 * le Inteiro e repete se o input for invalido
	 * 
	 * @return Integer
	 */
	public Integer leInteger() {
		Scanner scanner = new Scanner(System.in);

		try {
			
			return scanner.nextInt();
			
			
		} catch (InputMismatchException e) {
			
			System.out.println("numero invalido, tente novamente");
			
			return this.leInteger();
			
		}
		
		finally {
			
			scanner.close();
			
		}	
	}
	
	
}
