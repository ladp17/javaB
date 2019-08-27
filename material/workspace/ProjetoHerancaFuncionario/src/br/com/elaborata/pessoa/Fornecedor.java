/**
 * 
 */
package br.com.elaborata.pessoa;

/**
 * @author Roque Junior
 *
 */
public class Fornecedor extends Pessoa {

	private String nomeFantasia;
	private String CNPJ;
	private String IE;
	
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Fornecedor(String nomeFantasia, String cNPJ, String iE) {
		super();
		this.nomeFantasia = nomeFantasia;
		CNPJ = cNPJ;
		IE = iE;
	}
	
	public Fornecedor(String nome, String dataNasc, String telefone, String email, String nomeFantasia, String cNPJ,
			String iE) {
		super(nome, dataNasc, telefone, email);
		this.nomeFantasia = nomeFantasia;
		CNPJ = cNPJ;
		IE = iE;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

}
