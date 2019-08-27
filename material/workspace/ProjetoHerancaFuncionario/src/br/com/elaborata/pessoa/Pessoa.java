/**
 * 
 */
package br.com.elaborata.pessoa;

/**
 * @author Roque Junior
 *
 */
public class Pessoa {

	private String nome;
	private String dataNasc;
	private String telefone;
	private String email;

	public Pessoa() {

	}

	public Pessoa(String nome, String dataNasc, String telefone, String email) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
