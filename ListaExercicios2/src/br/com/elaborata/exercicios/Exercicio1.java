/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Teclado teclado = new Teclado();
		
		System.out.println("digite uma idade");
		
		usuario.verificaIdade(teclado.leInt());
		
		
		
	}

}