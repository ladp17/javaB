/**
 * 
 */
package br.com.elaborata.aula4.pojo;

/**
 * @author Roque Junior
 *
 */
public class MainPOJO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExemploPOJO exemploPOJO1 = new ExemploPOJO();
		ExemploPOJO exemploPOJO2 = new ExemploPOJO();

		exemploPOJO1.setIdade(16);
		exemploPOJO1.setNome("Janicreide");

		exemploPOJO2.setIdade(16);
		exemploPOJO2.setNome("Janicreide");
		
		exemploPOJO1 = exemploPOJO2;
		
		if(exemploPOJO1.equals(exemploPOJO2)) {
			System.out.println("São objetos iguais");
		} else {
			System.out.println("São objetos diferentes");
		}
		
		if(exemploPOJO1 == exemploPOJO2) {
			System.out.println("São objetos iguais");
		} else {
			System.out.println("São objetos em posições de memória diferente");
		}


	}

}
