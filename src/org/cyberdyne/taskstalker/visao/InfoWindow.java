package org.cyberdyne.taskstalker.visao;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

import org.cyberdyne.taskstalker.componentes.Audio;
import org.cyberdyne.taskstalker.controles.InfoWindowC;
import org.cyberdyne.taskstalker.enums.TypeWindow;


public class InfoWindow extends JWindow implements Runnable {
	private static final long serialVersionUID = 1L;
	private Audio au;
	private TypeWindow tw;
	
	private final int width  =  240;
    private final int height =  75;
    private final int fadeLatency = 20;
    private final int timePopup = 2 * 1000;
	
	public InfoWindow(String title , String content , String action, TypeWindow tw ){
		this.tw = tw;
		Container c = super.getContentPane();
		c.setLayout(null);
		
		c.add(init(title,content,action));
		super.setSize(width,height);
		super.setOpacity(0.0f);
		au = new Audio();
	};
	
	private JPanel init( String title , String content, String action ){
		JPanel p = new JPanel();
		p.setBackground( new Color(32,32,32) );
		p.setLayout(null);
		p.setSize(width,height);
		
		 
		JLabel icon = new JLabel( new ImageIcon(getClass().getResource("/img/da.jpg")));
		JLabel name = new JLabel(title);
		JLabel act = new JLabel(action);
		JLabel describe = new JLabel(content);
		
		name.setForeground(Color.white);
		describe.setForeground(Color.white);
	
		switch(tw.toString()){
		case "START" :
			act.setForeground(Color.RED);
			break;
		case "END" :
			act.setForeground(new Color(72,255,72));
			break;
		case "CANCEL" :
			act.setForeground(Color.YELLOW);
			break;
		}
		
		icon.setBounds(1, 1,40,40);
		name.setBounds(45,1,195,20);
		act.setBounds(45,20,195,20);
		describe.setBounds(1,40,195,20);
		
		p.add(icon);
		p.add(name);
		p.add(act);
		p.add(describe);
		return p;
	}
	public void setLocation(int x, int y){
		super.setLocation(x, y);
	};
	
	public void start(){
		new Thread(this,"InfoJanela").start();
	};

	@Override
	public void run() {
		float opacity = 0.0f;
		super.setVisible(true);
		au.play();
		
		do{
			sleep(fadeLatency);
			this.setOpacity(opacity);
			opacity += 0.025f;
		}while(opacity < 1.000f);
		
		sleep(timePopup);
		opacity = 1.0f;
		
		do{
			sleep(10);
			this.setOpacity(opacity);
			opacity -= 0.025f;
		}while(opacity > 0.0f);
		
		super.dispose();
		InfoWindowC.getInstance().decrementCount();
	};
	
	private void sleep( int latency ){
		try {
			Thread.sleep(latency);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
