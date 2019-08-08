/**
 * 
 */
package br.com.elaborata.relampago;

/**
 * @author Leo
 *
 */
public class Som {

	/**
	 * @param args
	 */
	
	private final Double velocidadeDoSom = 7.2D; 
	
	private void imprime(String msg){
		System.out.println(msg);
		
	}
	
	public Double calculaDistancia(Double tempoDePropagacao){
		Double distancia;
		distancia = tempoDePropagacao * this.velocidadeDoSom;
		
		imprime("O relampago esta a " + distancia.toString() + " de distancia.");
		return distancia;
	}
	
	public static void main(String[] args) {
		Som som = new Som();
		Teclado teclado = new Teclado();
		
		System.out.println("digite o tempo q levou para ouvir o relampago");
		som.calculaDistancia(teclado.leDouble());
		
	}
	

}