/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Integer numeroDeNotas = 3;
		
		Aluno aluno = new Aluno();
		
		aluno.setMedia(numeroDeNotas, "nota:");
		
		System.out.println("media: " + aluno.getMedia() + " " + aluno.resultadoFinal(aluno.getMedia()));
		
	}

}
