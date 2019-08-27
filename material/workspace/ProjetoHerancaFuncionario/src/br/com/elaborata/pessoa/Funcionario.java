/**
 * 
 */
package br.com.elaborata.pessoa;

/**
 * @author Roque Junior
 *
 */
public class Funcionario extends PessoaFisica {

	private Double salario;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Double salario) {
		super();
		this.salario = salario;
	}

	public Funcionario(String genero, String cpf, String rg, Double salario) {
		super(genero, cpf, rg);
		this.salario = salario;
	}

	public Funcionario(String nome, String dataNasc, String telefone, String email, String genero, String cpf,
			String rg, Double salario) {
		super(nome, dataNasc, telefone, email, genero, cpf, rg);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
