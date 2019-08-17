/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Leo
 *
 */
public class Teclado {
	Scanner scanner = new Scanner(System.in);
	
	public Integer leInt(){
		
		return scanner.nextInt();
		
	}
	
	public Double leNota(String msg) {
		Double nota;
		
		nota = Double.valueOf(JOptionPane.showInputDialog(msg));
		
		return nota;
		
	}
	
	public Integer leIdade(String msg) {
		Integer idade;
		
		idade = Integer.valueOf(JOptionPane.showInputDialog(msg));
		
		return idade;
		
	}
	
	public void mostraMsg(String msg){
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}
