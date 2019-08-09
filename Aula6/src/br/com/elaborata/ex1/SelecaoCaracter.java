/**
 * 
 */
package br.com.elaborata.ex1;

import java.io.IOException;

/**
 * @author Leo<br>
 * 
 * Progtama que verifica se a letra informada está correta
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
		
		System.out.println("informe uma letra");
		while (true) {
			
			
			letra = (char) System.in.read();
		
			if (letra != '\n') {
				
				if (letra == letraPergunta) {
					
					System.out.println("acertou a letra");
					break;
				
				} else {

					System.out.println("errado. Tente novamente.");
					System.out.println("informe uma letra");
					
				}
		
			
			}
		
		}
		
	}
}
