/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

final Integer numeroDeNotas = 3;
final Integer numeroDeFinais = 1;
		
		Aluno aluno = new Aluno();
		
		aluno.setMedia(numeroDeNotas, "nota da prova:");
		
		System.out.println("media: " + aluno.getMedia() + " " + aluno.resultadoFinal(aluno.getMedia()));
		
		if (aluno.taDeRecuperacao()) {
			
			aluno.attMedia(numeroDeFinais, "nota da final:");
			
			System.out.println("media :" + aluno.getMedia() + " " + aluno.resultadoRecuperacao(aluno.getMedia()));
			
		}
		
	}

}
