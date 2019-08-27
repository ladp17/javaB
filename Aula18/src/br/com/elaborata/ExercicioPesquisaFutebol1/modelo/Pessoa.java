/**
 * 
 */
package br.com.elaborata.ExercicioPesquisaFutebol1.modelo;

import br.com.elaborata.ExercicioPesquisaFutebol1.modelo.enume.Genero;
import br.com.elaborata.ExercicioPesquisaFutebol1.modelo.enume.TimeCoracao;

/**
 * Classe que modela as pessoas que fizeram parte da intrevista
 * 
 * Pessoa (idade, genero, time)
 * 	
 * 
 * @author Leo
 *
 */
public class Pessoa {
	
	private Integer idade;
	private Genero genero;
	private TimeCoracao timeCoracao;
	
	
	
	public Pessoa(Integer idade, Genero genero, TimeCoracao timeCoracao) {
		super();
		this.idade = idade;
		this.genero = genero;
		this.timeCoracao = timeCoracao;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public TimeCoracao getTimeCoracao() {
		return timeCoracao;
	}
	public void setTimeCoracao(TimeCoracao timeCoracao) {
		this.timeCoracao = timeCoracao;
	}
	
	
	

}
