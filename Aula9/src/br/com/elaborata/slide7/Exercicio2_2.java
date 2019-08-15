/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Exercicio2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Usuario usuario = new Usuario();
		
		System.out.println("digite um nome");
		
		usuario.setNomeCompleto(teclado.leLinha());
		
		String msg = (usuario.ehValido())? "nome eh valido" : "nome nao eh valido";
		
		System.out.println(msg);
		
	}

}
