/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		ImprimeEntre entre = new ImprimeEntre();
		Integer numero1, numero2;
		
		
		System.out.println("digite um inteiro");
		numero1 = teclado.leInteger();
		
		System.out.println("digite outro inteiro");
		numero2 = teclado.leInteger();
		
		entre.imprimeOrdenado(numero1, numero2);
		
		
	}

}