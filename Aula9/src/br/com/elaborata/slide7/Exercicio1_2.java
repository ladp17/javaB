/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Exercicio1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Str str;
		
		System.out.println("digite uma string");
		
		str = new Str(teclado.leLinha());
		
		System.out.println("a string tem " + str.contaCaracteresIgnoraEscpaco() + " caracteres, sem contar com espacos");
		
		
	}

}
