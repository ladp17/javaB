/**
 * 
 */
package br.com.elaborata.slide15;

/**
 * @author Leo
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Numero numero = new Numero();
		Teclado teclado = new Teclado();
		
		String msg;
		
		do {
			
			System.out.println("digite um inteiro");
			
			numero.setNumero(teclado.leInteger());
			
			msg = numero.ehPar() ? "par" : "impar";
			
			System.out.println("o numero " + numero.getNumero() + " eh " + msg);	
			
			System.out.println("0 - encerrar");
			
		} while (teclado.leInteger() != 0);
		
		System.out.println("concluido");
		
	}

}
