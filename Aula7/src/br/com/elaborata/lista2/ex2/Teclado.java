/**
 * 
 */
package br.com.elaborata.lista2.ex2;

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

public void imprimeInt(Integer saida){
		
		System.out.println(saida);
		
	}
	
}
