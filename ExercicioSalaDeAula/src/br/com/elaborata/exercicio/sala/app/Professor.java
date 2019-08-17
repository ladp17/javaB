package br.com.elaborata.exercicio.sala.app;

import java.util.ArrayList;

public class Professor extends Pessoas{

	ArrayList<Pessoas> alunos = new ArrayList<Pessoas>();
	
	public void cadastra() {
		Pessoas professor = new Pessoas();
		
		professor.cadastra();
		alunos.add(professor);
		
	}
	
}
