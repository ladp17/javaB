/**
 * 
 */
package br.com.elaborata.ex2;

import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class Exercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		menuPrincipal();

	}
	
	
	private static void menuPrincipal() {
		System.out.println("*************************************************");
		System.out.println("*\t 1 - Cadastro de Alunos\t\t\t*");
		System.out.println("*\t 2 - Cadastro de Professores\t\t*");
		System.out.println("*\t 3 - Cadastro de Cursos\t\t\t*");
		System.out.println("*************************************************");
		
		switch (teclado.nextInt()) {
		case 1:
			menuAluno();
			break;
			
		case 2:
			menuProfessor();
			break;
			
		case 3:
			menuCurso();
			break;

		default:
			break;
		}
		
	}

	private static void menuCurso() {
		System.out.println("Em construção......");
		
	}

	private static void menuProfessor() {
		System.out.println("*************************************************");
		System.out.println("*\t 1 - Nome do Professor\t\t\t*");
		System.out.println("*\t 2 - Idade do Professor\t\t\t*");
		System.out.println("*\t 3 - Sexo do Professor\t\t\t*");
		System.out.println("*************************************************");
		
		
	}

	private static void menuAluno() {
		
		System.out.println("*************************************************");
		System.out.println("*\t 1 - Nome do Aluno\t\t\t*");
		System.out.println("*\t 2 - Idade do Aluno\t\t\t*");
		System.out.println("*\t 3 - Sexo do Aluno\t\t\t*");
		System.out.println("*************************************************");
		
		
	}

	
}
