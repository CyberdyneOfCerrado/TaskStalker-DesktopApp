package org.cyberdyne.taskstalker.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JTextArea;


public class InfoWindow extends JDialog {
	private static final long serialVersionUID = 1L;
	
	public InfoWindow(String title , String content ){
		JTextArea temp = new JTextArea(content);
		
		temp.setBounds(1,1,260,110);
		temp.setFont( new Font(Font.SERIF, Font.PLAIN, 20));
		temp.setLineWrap(true);
		
		super.add(temp);
		
		super.setTitle(title);
		super.setSize(260,110);
		super.setResizable(false);
		super.setModal(true);
	};
	
	public void setLocation(int x, int y){
		super.setLocation(x, y);
	};
	
	public void show(){
		super.setVisible(true);
	};
	
	public void dispose(){
		super.setVisible(false);
	};
}
