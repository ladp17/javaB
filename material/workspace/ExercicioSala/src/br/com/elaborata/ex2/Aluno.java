package br.com.elaborata.ex2;

public class Aluno extends Object{

	private String nome;
	private Integer idade;
	private String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	

	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	

}
