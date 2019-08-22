/**
 * 
 */
package br.com.elaborata;

/**
 * @author Leo
 *
 */
public class ExercicioHeranca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Double kmInicial = 0.0;
		final Double kmFinal = 2.0;
		
		Passeio passeio = new Passeio(true, null);
		Carga carga = new Carga(null);
					
		passeio.setKmInicial(kmInicial);
		passeio.setKmFinal(kmFinal);
		
		carga.setKmInicial(kmInicial);
		carga.setKmFinal(kmFinal);
		
		System.out.println("valor passeio: " + passeio.calculaValorLocacao());
		System.out.println("valor carga: " + carga.calculaValorLocacao());
		
	}

}
