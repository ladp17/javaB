/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Matriz matriz;
		
		System.out.println("digite o tamanho da matriz");
		matriz = new Matriz(teclado.leInteger());
		matriz.imprimeMatriz();
	}

}
