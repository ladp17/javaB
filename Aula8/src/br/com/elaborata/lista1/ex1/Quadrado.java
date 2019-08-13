/**
 * 
 */
package br.com.elaborata.lista1.ex1;


/**
 * @author Leo
 *
 */
public class Quadrado {

	private final Integer expoente = 2;
	
	public Integer calculaQuadradado(Integer numero){
		Double resultado;
		
		resultado = Math.pow(numero, expoente);		
		
		return resultado.intValue();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		Teclado teclado = new Teclado();
		
		teclado.imprime("digte um inteiro");
		teclado.imprime(quadrado.calculaQuadradado(teclado.leInteger()));
		
	}

}