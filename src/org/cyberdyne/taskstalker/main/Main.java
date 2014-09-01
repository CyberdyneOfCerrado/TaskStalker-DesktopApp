package org.cyberdyne.taskstalker.main;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.cyberdyne.taskstalker.controles.CoreController;
import org.cyberdyne.taskstalker.visao.InfoWindow;


public class Main {
	public static void main(String [] args ) throws InterruptedException{
		CoreController cc = new CoreController();
		cc.startCore();
		
		while(true){
			cc.send("Olá mundo");
			Thread.sleep(1000);
		}
	};
}
