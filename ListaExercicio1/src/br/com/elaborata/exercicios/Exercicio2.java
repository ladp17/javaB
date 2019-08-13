/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculaTabuada calculaTabuada = new CalculaTabuada();
		Teclado teclado = new Teclado();
		
		System.out.println("1-tabuada de um numero, 2- toda a tabuada");
		
		if (teclado.leInteger() == 1){
			
			System.out.println("digite um inteiro");
			calculaTabuada.calculaTabuada(teclado.leInteger());
			
		}else{
			
			calculaTabuada.calculaTodaTabuada();
			
		}

	}

}
