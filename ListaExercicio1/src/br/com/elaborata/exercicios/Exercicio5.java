/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Numero numero;
		Double numero2;
		
		System.out.println("digite um numero");
		numero = new Numero(teclado.leDouble());
		
		System.out.println("digite outro numero");
		numero2 = teclado.leDouble();

		System.out.println(numero.soma(numero2));
		System.out.println(numero.subtracao(numero2));
		System.out.println(numero.produto(numero2));
		System.out.println(numero.divisao(numero2));
		
	}

}
