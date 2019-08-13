/**
 * 
 */
package br.com.elaborata.exercicios;


/**
 * @author Leo
 *
 */
public class Exercicio1 {

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
		Exercicio1 exercicio1 = new Exercicio1();
		Teclado teclado = new Teclado();
		
		teclado.imprime("digte um inteiro");
		teclado.imprime(exercicio1.calculaQuadradado(teclado.leInteger()));
		
	}

}