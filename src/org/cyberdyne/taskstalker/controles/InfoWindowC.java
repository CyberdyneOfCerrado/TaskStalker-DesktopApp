package org.cyberdyne.taskstalker.controles;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.cyberdyne.taskstalker.enums.TypeWindow;
import org.cyberdyne.taskstalker.visao.InfoWindow;

public class InfoWindowC {
	private static InfoWindowC iw;
	private Dimension d;
	private int countInfo;
	
	public InfoWindowC(){
		d = Toolkit.getDefaultToolkit().getScreenSize();
		countInfo = 0;
	};
	
	public static InfoWindowC getInstance(){
		if( iw == null ) return iw = new InfoWindowC();
		return iw;
	};
	
	public synchronized void decrementCount(){
		countInfo--;
		System.out.println("decremento " + countInfo);
	};
	
	public synchronized void incrementCount(){
		countInfo++;
		System.out.println("incremento " + countInfo);
	}
	
	public synchronized int getCount(){
		return countInfo;
	}
	
	public void newInfo(String title, String content , String action , TypeWindow tw){
		InfoWindow info = new InfoWindow(title,content,action, tw);
		int width  = d.width - info.getWidth();
		int height = getCount() * info.getHeight(); 
		incrementCount();
		info.setLocation(width,height);
		info.start();
	};
}
