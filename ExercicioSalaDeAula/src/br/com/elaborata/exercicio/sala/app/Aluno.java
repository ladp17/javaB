/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

import java.util.ArrayList;

/**
 * @author Leo
 *
 */
public class Aluno extends Pessoas{

	ArrayList<Pessoas> alunos = new ArrayList<Pessoas>();
	
	public void cadastra() {
		Pessoas aluno = new Pessoas();
		
		aluno.cadastra();
		alunos.add(aluno);
		
	}
	
}
