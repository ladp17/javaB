/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class ComparandoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto1 = new String("Linguagem Java");
		
		if(texto1=="Linguagem Java") {
			System.out.println("Contem o texto");
		} else {
			System.out.println("Não contem o texto");
		}
		
		if(texto1.equals("Linguagem Java")) {
			System.out.println("Contem o texto");
		} else {
			System.out.println("Não contem o texto");
		}
		
		if(texto1.equals(new String("Linguagem Java"))) {
			System.out.println("Contem o texto");
		} else {
			System.out.println("Não contem o texto");
		}


	}

}
