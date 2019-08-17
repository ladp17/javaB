/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Leo
 *
 */
public class Teclado {
	Scanner scanner = new Scanner(System.in);
	
	public String leString(){
		
		return scanner.next();
		
	}
	
	public Integer leInteger(){
		
		return scanner.nextInt();
		
	}
	
	public Character leChar() {
		
		try {
			return (char) System.in.read();
		} catch (IOException e) {
			return 'm';
		}
		
	}
	
	public String leLinha(){
		
		return scanner.nextLine();
		
	}
	
}