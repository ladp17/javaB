/**
 * 
 */
package br.com.elaborata.tabelaverdade;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class TabelaVerdade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programa que monta a tabela verdade de dois elementos");
		System.out.println("Informe o primeiro elemento\n\t1-verdadeiro 2-falso");
		
		Boolean a;
		Boolean b;
		
		Integer elemento1 = new Scanner(System.in).nextInt();
		
		if(elemento1==1) {
			a = true;
		} else {
			a = false;
		}
		
		System.out.println("Informe o segundo elemento\n\t1-verdadeiro 2-falso");
		
		Integer elemento2 = new Scanner(System.in).nextInt();
		
		if(elemento2==1) {
			b = true;
		} else {
			b = false;
		}
		
		System.out.println("a\tb\ta&b\ta|b\ta^b\t!a\t!b");
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+!a+"\t"+!b);
		System.out.println();
		
		a = true;
		b = true;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+!a+"\t"+!b);
		
		a = true;
		b = false;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+!a+"\t"+!b);

		a = false;
		b = true;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+!a+"\t"+!b);

		a = false;
		b = false;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+!a+"\t"+!b);

	}

}
