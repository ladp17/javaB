/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

/**
 * @author Leo
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoas pessoas = new Pessoas();
		Teclado teclado = new Teclado();		
		
		System.out.println("digite um nome");
		
		pessoas.setNome(teclado.leString());
		
		System.out.println("o seu nome poderia ser " + pessoas.chutaNome());
		
		
	}

}
