/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class CalculaTabuada {
	
	private final Integer fimTabuada = 10;
	
	public void calculaTabuada(Integer numero) {
		
		for (int i = 1; i <= fimTabuada; i++) {
			Integer resultado;
			
			resultado = numero * i;
			
			System.out.println(numero + " * " + i + " = " + resultado );
			
		}
		
	}
	
	public void calculaTodaTabuada() {
		
		for (int i = 1; i <= fimTabuada; i++){
			
			calculaTabuada(i);
			System.out.println();
			
		}
		
	}

}
