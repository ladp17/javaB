/**
 * 
 */
package br.com.elaborata.slide8;

/**
 * @author Leo
 *
 */
public class Funcionario {
	private String nome;
	private String cargo;
	private Double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double calculaSalario(Integer horasDeTrabalho) {
		
		return this.salario * horasDeTrabalho;		
		
	}
	
	public static void main(String[] args) {
		final String nome = "nome";
		final String cargo = "cargo";
		final Double salario = 14.50;
		final Integer horasDeTrabalho = 40;
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCargo(cargo);
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
		
		System.out.println(funcionario.calculaSalario(horasDeTrabalho) + " horas de trabalho");;
		
	}
	
	
}
