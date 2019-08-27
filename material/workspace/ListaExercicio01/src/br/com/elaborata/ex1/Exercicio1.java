/**
 * 
 */
package br.com.elaborata.ex1;

import br.com.elaborata.util.Entrada1;

/**
 * @author Roque Junior
 *
 */
public class Exercicio1 {

	private static Entrada1 teclado;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		teclado = new Entrada1();
		System.out.println("Informe sua idade");
		
		Integer idade = teclado.getInteiro();
		
		verificaIdade(idade);

	}
	private static void verificaIdade(Integer idade) {
		
		if(idade >= 18) {
			imprimeMensagem("Você é maior de idade");
		} else {
			imprimeMensagem("Você é menor de idade");
		}
		
	}
	private static void imprimeMensagem(String string) {
		
		System.out.println(string);
		
	}

}
