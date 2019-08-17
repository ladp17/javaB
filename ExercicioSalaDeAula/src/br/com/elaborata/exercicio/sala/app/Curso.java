/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

import java.util.ArrayList;

/**
 * @author Leo
 *
 */
public class Curso {
	private String descricao;
	
public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public void cadastra() {
		Curso curso = new Curso();
		
		Teclado teclado = new Teclado();
		
		System.out.println("digite uma descricao");
		curso.descricao = teclado.leLinha();
		
		
		cursos.add(curso);
		
	}
	
}
