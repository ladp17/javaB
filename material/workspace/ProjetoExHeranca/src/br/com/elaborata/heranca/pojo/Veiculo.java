/**
 * 
 */
package br.com.elaborata.heranca.pojo;

/**
 * Classe responsável por armazenar informações e permitir gerar <br>
 * objetos do tipo "Veiculo" que servirão para clacular o <br>
 * valor da locação <br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private Integer ano;
	private Double valorKmRodado;
	private Integer kmInicial;
	private Integer kmFinal;

	public Veiculo() {
	}

	public Veiculo(String placa, String marca, String modelo, Integer ano, Double valorKmRodado, Integer kmInicial,
			Integer kmFinal) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

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

	public Double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(Double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public Integer getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(Integer kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Integer getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(Integer kmFinal) {
		this.kmFinal = kmFinal;
	}

	/**
	 * Método responsável por calcular a quantidade de kilometros<br>
	 * que o veículo rodou.<br>
	 * <br>
	 * Será utilizado no calculo do valor da locação.<br>
	 * 
	 * @author Roque Junior
	 * @since Agosto/2019
	 * @return totalKilometros
	 */
	public Integer totalKilometros() {
		return this.kmFinal - this.kmInicial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((kmFinal == null) ? 0 : kmFinal.hashCode());
		result = prime * result + ((kmInicial == null) ? 0 : kmInicial.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((valorKmRodado == null) ? 0 : valorKmRodado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (kmFinal == null) {
			if (other.kmFinal != null)
				return false;
		} else if (!kmFinal.equals(other.kmFinal))
			return false;
		if (kmInicial == null) {
			if (other.kmInicial != null)
				return false;
		} else if (!kmInicial.equals(other.kmInicial))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (valorKmRodado == null) {
			if (other.valorKmRodado != null)
				return false;
		} else if (!valorKmRodado.equals(other.valorKmRodado))
			return false;
		return true;
	}
	
	public Double calculcaValorLocacao(){
		return 888.0;
	}

}
