/**
 * 
 */
package br.com.elaborata.futebol.modelo;

import br.com.elaborata.futebol.modelo.enume.Genero;
import br.com.elaborata.futebol.modelo.enume.TimeCoracao;

/**
 * @author Roque Junior
 *
 */
public class Entrevistado {

	private Integer idade;
	private Genero genero;
	private TimeCoracao timeCoracao;

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
