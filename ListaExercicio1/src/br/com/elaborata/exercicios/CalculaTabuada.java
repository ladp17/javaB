/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class CalculaTabuada {
	
	private final Integer fim = 10;
	
	public void calculaTabuada(Integer numero) {
		
		for (int i = 1; i <= fim; i++) {
			Integer resultado;
			
			resultado = numero * i;
			
			System.out.println(numero + " * " + i + " = " + resultado );
			
		}
		
	}
	
	public void calculaTodaTabuada() {
		
		for (int i = 1; i <= fim; i++){
			
			calculaTabuada(i);
			System.out.println();
			
		}
		
	}

}
