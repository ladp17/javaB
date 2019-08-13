/**
 * 
 */
package br.com.elaborata.exercicios;

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
	
	public Double leDouble() {
		
		return scanner.nextDouble();
		
	}
	
	public String leString(){
		
		return scanner.next();
		
	}

	public void imprime(Integer saida){
			
			System.out.println(saida);
			
		}
	
	public void imprime(String msg){
		
			System.out.println(msg);
		
	}
	
}
