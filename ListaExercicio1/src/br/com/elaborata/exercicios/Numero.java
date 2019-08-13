/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Numero {
	
	private Double numero;
	
	public Numero (Double numero){
		
		this.numero = numero;
		
	}
	
	public Double soma(Double numero) {
		
		return this.numero + numero;
		
	}
	
	public Double subtracao(Double numero) {
		
		return this.numero - numero;
		
	}
	
	public Double produto(Double numero) {
		
		return this.numero * numero;
		
	}
	
	public Double divisao(Double numero) {
		
		return this.numero / numero;
		
	}
	
}
