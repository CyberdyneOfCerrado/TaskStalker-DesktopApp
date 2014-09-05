package org.cyberdyne.taskstalker.componentes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Audio implements Runnable{
	private final  String uri = "src/sounds/in.mp3";
	private Player player; 
	
	public Audio(){
		init();
	};
	
	public void play(){
		new Thread(this,"audio").start();
	};
	
	@Override
	public void run() {
		try {
			player.play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
	
	private void init(){
		 FileInputStream fis;
		try {
		   fis = new FileInputStream(uri);
		   BufferedInputStream bis = new BufferedInputStream(fis);
		   player = new Player(bis);
		} catch (FileNotFoundException | JavaLayerException e) {
			e.printStackTrace();
		}
	};
}
