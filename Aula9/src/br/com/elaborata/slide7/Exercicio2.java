/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Usuario usuario = new Usuario();
		
		System.out.println("digite um nome completo");
		
		usuario.setNomeCompleto(teclado.leLinha());
		
		System.out.println(usuario.getNome());
		
	}

}