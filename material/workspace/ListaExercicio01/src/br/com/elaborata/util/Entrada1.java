/**
 * 
 */
package br.com.elaborata.util;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Entrada1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public String getPalavra() {
		return sc.next();
	}
	
	public Integer getInteiro() {
		return sc.nextInt();
	}
	
	public Double getReal() {
		return sc.nextDouble();
	}

}
