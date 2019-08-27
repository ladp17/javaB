/**
 * 
 */
package br.com.elaborata.java1.observable;

import java.io.IOException;

/**
 * @author Roque Junior
 *
 */
public class Console {
	
	public static void imprimirMensagem(
			String mensagem, boolean parar) {
		int tecla = 0;
		boolean continuar = false;
		System.out.println(mensagem + " ");
		
		if(!parar) {
			System.out.println();
		} else {
			while (!continuar) {
				try{
					tecla = System.in.read();
					if(tecla<0 || (char)tecla=='\n') {
						continuar = true;
					} 
				} catch (IOException e) {
					continuar = true;
				}
			}
		}
	}

}
