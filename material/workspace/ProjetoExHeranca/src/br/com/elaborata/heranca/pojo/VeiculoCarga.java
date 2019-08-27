/**
 * 
 */
package br.com.elaborata.heranca.pojo;

/**
 * Classe responsável por armazenar informações e permitir gerar <br>
 * objetos do tipo "VeiculoCarga" que servirão para calcular <br>
 * o valor da locação<br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class VeiculoCarga extends Veiculo {

	private Integer capacidade;

	public VeiculoCarga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VeiculoCarga(Integer capacidade) {
		super();
		this.capacidade = capacidade;
	}

	public VeiculoCarga(String placa, String marca, String modelo, Integer ano, Double valorKmRodado, Integer kmInicial,
			Integer kmFinal, Integer capacidade) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.capacidade = capacidade;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public Double calculcaValorLocacao(){
		
		return 333.00+(super.totalKilometros()*super.getValorKmRodado());
	}

}
