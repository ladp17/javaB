/**
 * 
 */
package br.com.elaborata.lista2.ex2;


/**
 * @author Leo
 *
 */
public class Media {
	Teclado teclado = new Teclado();

	private Integer numeroElementos;	
	
	public Media(Integer numeroElementos){
		
		this.numeroElementos = new Integer(numeroElementos);
	
	}
	
	public Integer calculaMedia(){
		Integer soma = new Integer(0);
		Integer media;
		
		for (int i = 0; i < this.numeroElementos; i++) {
			
			System.out.println("digite um inteiro");
			soma += this.teclado.leInteger();
			
		}
		
		media = soma / this.numeroElementos;
		return media;
	}
	
	
	public static void main(String[] args) {
		final Integer numeroElementos = new Integer(4);
		
		Media media = new Media(numeroElementos);
		media.teclado.imprimeInt(media.calculaMedia());
		
		
		
	}

}
