/**
 * 
 */
package br.com.elaborata.slide7;

import java.util.Scanner;

/**
 * @author Leo
 *
 */
public class Teclado {
	Scanner scanner = new Scanner(System.in);
	
	public String leString() {
		
		return scanner.next();
		
	}
	
	public String leLinha() {
		
		return scanner.nextLine();
		
	}
	

}
