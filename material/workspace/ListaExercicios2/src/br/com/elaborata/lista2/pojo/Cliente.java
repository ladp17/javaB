/**
 * 
 */
package br.com.elaborata.lista2.pojo;

/**
 * @author Roque Junior
 *
 */
public class Cliente {

	private String nome;
	private Integer codigo;

	public Cliente(String nome, Integer codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	

}
