/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class AppVeiculo extends Object {
	
	
public static void main(String[] args) {
	
	
	Veiculo veiculo = new Veiculo();
	
	Carro carro = new Carro();
	
	carro.setNome("Idea");
	
	System.out.println(carro.getNome());
	
	
	
	System.out.println(veiculo);
	
}
}
