/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class Veiculo extends Object {
	private String nome;
	private String modelo;
	private String marca;
	private Integer ano;

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(String nome, String modelo, String marca, Integer ano) {
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [nome=" + nome + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
	}

}
