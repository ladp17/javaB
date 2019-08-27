/**
 * 
 */
package br.com.elaborata.heranca.app;

import br.com.elaborata.heranca.pojo.VeiculoCarga;
import br.com.elaborata.heranca.pojo.VeiculoPasseio;

/**
 * Classe responsável por iniciar o programa
 * 
 * @author Roque Junior
 *
 */
public class MainVeiculo {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VeiculoPasseio passeio = new VeiculoPasseio(false, 4);
		
		VeiculoCarga carga = new VeiculoCarga(5000);
		
		passeio.setKmInicial(12500);
		passeio.setKmFinal(13500);
		passeio.setValorKmRodado(3.75);
		
		carga.setKmInicial(55350);
		carga.setKmFinal(56350);
		carga.setValorKmRodado(4.25);
		
		System.out.println(
				"O valor da locação do veículo de passeio é: " +
				passeio.calculcaValorLocacao());
		
		System.out.println(
				"O valor da locação do veículo de carga é: " +
				carga.calculcaValorLocacao());

	}

}
