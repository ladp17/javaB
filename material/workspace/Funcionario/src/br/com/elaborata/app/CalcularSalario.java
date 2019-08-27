/**
 * 
 */
package br.com.elaborata.app;

import br.com.elaborata.pojo.Funcionario;

/**
 * @author Roque Junior
 *
 */
public class CalcularSalario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Astrogildo");
		funcionario.setCargo("Desenvolvedor");
		funcionario.setSalario(14.50*40);
		
		System.out.println("O Salário do " +
		funcionario.getNome() + " é = " +
				funcionario.getSalario());
		
		
	}

}
