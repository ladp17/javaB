/**
 * 
 */
package br.com.elaborata.aula6;

import java.io.IOException;

/**
 * @author Roque Junior<br>
 * 
 *         Programa que verifica se a letra informa está correta
 *
 */
public class SelecaoCaracter {

	/**
	 * Adivinhar qual a letra informada
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		char letra;
		char letraPergunta = 'J';
		char[] frase; 

		System.out.println("Informe uma letra a-z A-Z");
		while (true) {
			//int duvida = System.in.read();
			letra = (char) System.in.read();

			if (letra == letraPergunta) {
				System.out.println("Você acertou a letra");
				break;
			} else if(letra=='\n') {
				System.out.println("Informe uma letra a-z A-Z");
			} else {
				System.out.println("Você não acertou a letra, tente novamente\n\n\n");
			}
		}
	}
}
