/**
 * 
 */
package br.com.elaborata.livraria;

/**
 * @author Roque Junior
 *
 */
public class Livraria {

	private String titulo;
	private String anoLancamento;

	public Livraria() {

	}

	public Livraria(String titulo, String anoLancamento) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
