/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Aluno {
	private Double media;

	public void setMedia(Integer numeroDeNotas, String nomeDaNotaAtual) {
		Teclado teclado = new Teclado();
		Double soma = 0.0;
		
		for (int i = 0; i < numeroDeNotas; i++) {
			
			soma += teclado.leNota(nomeDaNotaAtual);
			
		}
		
		this.media = soma / numeroDeNotas;
		
	}
	
	public void attMedia(Integer numeroDeNotas, String nomeDaNotaAtual){
		Teclado teclado = new Teclado();
		Double soma = this.media;
		
for (int i = 0; i < numeroDeNotas; i++) {
			
			soma += teclado.leNota(nomeDaNotaAtual);
			
		}
		
		this.media = soma / (numeroDeNotas + 1);
		
	}
	
	public Double getMedia() {
		
		return this.media;
		
	}
	
	public String resultadoFinal(Double media) {	
		String msg;
		
		if (media >= 70) {
			
			msg = "aprovado";
			
		}else if (media < 50) {

			msg = "reprovado";
			
		}else {
			
			msg = "recuperacao";
			
		}
		
		return msg;
		
	}
	
	public Boolean taDeRecuperacao() {
		
		if (this.resultadoFinal(this.media).equals("recuperacao")) {
			
			return true;
			
		}
			
		return false;
			
	}
	
	public String resultadoRecuperacao(Double media) {
		
		if (media >= 50) {
			
			return "aprovado";
			
		}
		
		return "reprovado";
		
	}
	
}
