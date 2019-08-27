/**
 * 
 */
package br.com.elaborata.poo.carro;

/**
 * @author Roque Junior
 *
 */
public class Carro {

	private String marca;
	private String modelo;
	private String cor;
	private Float capacidadeTanqueEmLitros;
	private Float quilometrosPorLitro;

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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Float getCapacidadeTanqueEmLitros() {
		return capacidadeTanqueEmLitros;
	}

	public void setCapacidadeTanqueEmLitros(Float capacidadeTanqueEmLitros) {
		this.capacidadeTanqueEmLitros = capacidadeTanqueEmLitros;
	}

	public Float getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(Float quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
	
	public Float calculaAutonomia() {
		return getCapacidadeTanqueEmLitros()*getQuilometrosPorLitro();
	}

}
