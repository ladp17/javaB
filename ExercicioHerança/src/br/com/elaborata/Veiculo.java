/**
 * 
 */
package br.com.elaborata;

/**
 * @author Leo
 *
 */
public class Veiculo {

	private String placa;
	
	private String marca;
	
	private String modelo;

	private Integer ano;

	private Double kmRodado;

	private Double kmInicial;

	private Double kmFinal;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getKmRodado() {
		return this.kmFinal - this. kmInicial;
	}

	public void setKmRodado(Double kmRodado) {
		this.kmRodado = kmRodado;
	}

	public Double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(Double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(Double kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	public Double calculaValorLocacao(){
		return 0.0;
	}
	
}
