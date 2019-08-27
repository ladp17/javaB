/**
 * 
 */
package br.com.elaborata.heranca.pojo;

/**
 * Classe responsável por armazenar informações e permitir gerar <br>
 * objetos do tipo "VeiculoPasseio" que servirão para calcular <br>
 * o valor da locação<br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class VeiculoPasseio extends Veiculo {

	private Boolean arCondicionado;
	private Integer numeroPortas;

	public VeiculoPasseio() {
		super();
	}

	public VeiculoPasseio(Boolean arCondicionado, Integer numeroPortas) {
		super();
		this.arCondicionado = arCondicionado;
		this.numeroPortas = numeroPortas;
	}

	public VeiculoPasseio(String placa, String marca, String modelo, Integer ano, Double valorKmRodado,
			Integer kmInicial, Integer kmFinal, Boolean arCondicionado, Integer numeroPortas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.arCondicionado = arCondicionado;
		this.numeroPortas = numeroPortas;
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Integer getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(Integer numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	@Override
	public Double calculcaValorLocacao(){
		Double taxa = 150.00;
		Double taxaAr = 235.00;
		Double valorLocacao = 
				taxa+(super.totalKilometros()*super.getValorKmRodado());
		
		return arCondicionado?taxaAr+valorLocacao:valorLocacao;
	}

}
