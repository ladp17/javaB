/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

/**
 * @author Leo
 *
 */
public class Pessoas {
	private String nome;
	private Integer idade;
	private Character sexo;
	
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String chutaNome() {
		
		char[] nome = this.nome.toLowerCase().toCharArray();
		
		switch (nome[0]) {
		
		case 'm':
			
			return "Maria";
			
			
		case 'j':
			
			return "Josefina";
			
			
		case 'f':
	
			return "Francisca";
			

		default:
			
			return "qualquer um";
			
		}
		
	}
	
	public void mostraMenu() {
		
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("sexo: " + this.sexo);
		
	}
	
	public void cadastra() {
		Teclado teclado = new Teclado();
		
		System.out.println("digite o nome");
		this.nome = teclado.leString();
		
		System.out.println("digite idade");
		this.idade = teclado.leInteger();
		
		System.out.println("digite sexo m/f");
		this.sexo = teclado.leChar();
		
	}
	
}