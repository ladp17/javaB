/**
 * 
 */
package br.com.elaborata.poo.ex2;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio2 {

	public static void main(String[] args) {

		System.out.println("Informe seu nome completo");
		String nome = new Scanner(System.in).nextLine();
		String[] charNome =  nome.split(" ");
//		nome = nome.substring(0, nome.indexOf(' '));
		
		int tam = charNome.length;
		
		System.out.println(charNome[0] + " " + charNome[tam-1]);
		
		char letraAemUnicode = '\u0061';
		if(Character.isLetter(letraAemUnicode)){
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		System.out.println(letraAemUnicode);

	}

}
