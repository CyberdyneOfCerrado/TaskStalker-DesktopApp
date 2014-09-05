package org.cyberdyne.taskstalker.controles;

import java.awt.Dimension;
import java.awt.Toolkit;

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
	};
	
	public synchronized void newInfo(String title, String content , String action){
		countInfo++;
		InfoWindow info = new InfoWindow(title,content,action);
		int width  = d.width - info.getWidth();
		int height = countInfo * info.getHeight() - 150; 
		info.setLocation(width,height);
		info.start();
	}
}
