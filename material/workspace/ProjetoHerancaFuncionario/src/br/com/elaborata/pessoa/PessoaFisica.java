/**
 * 
 */
package br.com.elaborata.pessoa;

/**
 * @author Roque Junior
 *
 */
public class PessoaFisica extends Pessoa {

	private String genero;
	private String cpf;
	private String rg;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String genero, String cpf, String rg) {
		super();
		this.genero = genero;
		this.cpf = cpf;
		this.rg = rg;
	}

	public PessoaFisica(String nome, String dataNasc, String telefone, String email, String genero, String cpf,
			String rg) {
		super(nome, dataNasc, telefone, email);
		this.genero = genero;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
