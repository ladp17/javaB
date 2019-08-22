/**
 * 
 */
package br.com.elaborata;

/**
 * @author Leo
 *
 */
public class Carga extends Veiculo {

	private Integer capacidade;
	
	public Carga(Integer capacidade) {
		
		super();
		this.capacidade = capacidade;
		
	}
	
	public Carga() {
		super();
	}



	public Integer getCapacidade() {
		return capacidade;
	}
	
	public Double calculaValorLocacao(){
		final Double taxaFixa = 333.00;
		final Double taxaKm = 4.25;
		
		return taxaFixa + taxaKm * this.getKmRodado();
		
	}

}
