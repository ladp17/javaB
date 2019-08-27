/**
 * 
 */
package br.com.elaborata.banco;

import java.util.Date;

/**
 * @author Roque Junior
 *
 */
public class ContaPoupanca extends ContaBancaria {

	private Date dataAniversario;

	public ContaPoupanca() {
		this.dataAniversario = new Date();
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

}
