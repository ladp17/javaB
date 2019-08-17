/**
 * 
 */
package br.com.elaborata.exercicios;


/**
 * @author Leo
 *
 */
public class Usuario {
	
	private Integer idade;
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
			
	public void verificaIdade(Integer idade){
		final Integer idadeLimite = 18;
		
		if (idade < idadeLimite) {
			
			System.out.println("usuario eh menor de idade");
			
		}else {
			
			System.out.println("usuario eh maior de idade");
			
		}
		
	}	

	public String getIdadeMaisVelha (Integer numeroDeIdades) {
		Teclado teclado = new Teclado();
		Integer maiorIdade;
		Integer maisVelho;
		
		maiorIdade = teclado.leIdade("digite a idade da pessoa " + 1);
		maisVelho = 1;
		
		for (int i = 2; i <= numeroDeIdades; i++){
			Integer idade;
			
			idade = teclado.leIdade("digite a idade da pessoa " + i);
			
			maiorIdade = (idade > maiorIdade)? idade : maiorIdade;
			
			maisVelho = (idade > maiorIdade)? i : maisVelho;
			
		}
		
		return "o mais velho eh: pessoa " + maisVelho;
		
	}
	
}