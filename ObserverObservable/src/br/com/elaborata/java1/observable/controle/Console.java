package br.com.elaborata.java1.observable.controle;

import java.io.IOException;

public class Console {

	public static void imprimirMensagem(String mensagem, Boolean parar) {
		
		int tecla = 0;
		boolean continuar = false;
		System.out.println(mensagem + " ");
		
		if (!parar) {
			
			System.out.println();
			
		} else {
			
			while (!continuar) {
				
				try {
					tecla = System.in.read();
					
					if (tecla < 0 || (char)tecla == '\n') {
						
						continuar = true;
						
					}
					
				} catch (IOException e) {
					
					continuar = true;
					
				}
				
			}
			
		}
		
	}
	
}
