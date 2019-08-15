/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Exercicio1 {
	private static final String login = "leo";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setLogin(login);
		
		while (!usuario.verificaLogin()) {
			
			System.out.println("login invalido. Tente novamente");
			
		}
		
		System.out.println("login aceito");
		
	}

}