/**
 * 
 */
package br.com.elaborata.abstrata;

/**
 * @author Roque Junior
 *
 */
public class Operacoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		mostrarCalculo(new Adicao(), 5, 5);
		
		mostrarCalculo(new Subtracao(), 5, 5);

	}

	private static void mostrarCalculo(
			OperacaoMatematica operacaoMatematica, double x, double y) {
		
		System.out.println("O resultado é: " +
				operacaoMatematica.calcular(x, y));
		
	}

}
