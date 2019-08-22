/**
 * 
 */
package br.com.elaborata;

/**
 * @author Leo
 *
 */
public class Passeio extends Veiculo {

	private Boolean arCondicionado;
	
	private Integer numeroDePortas;
	
	public Passeio(Boolean arCondicionado, Integer numeroDePortas) {
		
		super();
		
		this.arCondicionado = arCondicionado;
		
		this.numeroDePortas = numeroDePortas;
		
	}
	
	public Passeio() {
		super();
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}

	public Double calculaValorLocacao(){
		final Double taxaFixa = 150.00;
		final Double taxaKm = 3.75;
		final Double taxaAC = 235.00; 
		Double somaSemAc;
		
		somaSemAc = taxaFixa + taxaKm * this.getKmRodado();
		
		return (this.arCondicionado)? somaSemAc + taxaAC : somaSemAc;
		
	}
	
}
