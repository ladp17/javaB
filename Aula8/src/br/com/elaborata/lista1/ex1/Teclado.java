/**
 * 
 */
package br.com.elaborata.lista1.ex1;

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

	public void imprime(Integer saida){
			
			System.out.println(saida);
			
		}
	
	public void imprime(String msg){
		
			System.out.println(msg);
		
	}
	
}
