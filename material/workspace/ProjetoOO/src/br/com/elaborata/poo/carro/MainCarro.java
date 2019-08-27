/**
 * 
 */
package br.com.elaborata.poo.carro;

/**
 * @author Roque Junior
 *
 */
public class MainCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setMarca("Ford");
		c1.setModelo("Mustang");
		c1.setCor("Branco");
		c1.setCapacidadeTanqueEmLitros(100f);
		c1.setQuilometrosPorLitro(2.3F);
		
		Float autonomiaEmQuilometros = c1.calculaAutonomia();
		
		System.out.println(" A Autonomia do carro é de " + autonomiaEmQuilometros + " KM");
		
		

	}

}
