/**
 * 
 */
package br.com.elaborata.ex1;

import java.util.Scanner;

/**
 * @author Leo
 *
 */
public class Teclado {
	private Scanner scanner = new Scanner(System.in);
	
	public Integer leInteger(){
		
		return scanner.nextInt();
		
	}
	
public Character leCaracter(){
		
		return scanner.next().charAt(0);
		
	}

}
