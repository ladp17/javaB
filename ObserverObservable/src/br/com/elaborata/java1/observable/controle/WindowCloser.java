/**
 * 
 */
package br.com.elaborata.java1.observable.controle;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Leo
 *
 */
public class WindowCloser extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		
		e.getWindow().dispose();
		
	}
	
}
