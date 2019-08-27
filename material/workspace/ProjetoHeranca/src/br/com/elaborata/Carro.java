/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class Carro extends Veiculo {
	private Boolean arCondicionado;
	private Integer portas;
	
	

	public Carro() {
		// TODO Auto-generated constructor stub
	}



	public Carro(Boolean arCondicionado, Integer portas) {
		super();
		this.arCondicionado = arCondicionado;
		this.portas = portas;
	}



	public Carro(String nome, String modelo, String marca, Integer ano, Boolean arCondicionado, Integer portas) {
		super(nome, modelo, marca, ano);
		this.arCondicionado = arCondicionado;
		this.portas = portas;
	}



	public Boolean getArCondicionado() {
		return arCondicionado;
	}



	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}



	public Integer getPortas() {
		return portas;
	}



	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	
	


	

}
