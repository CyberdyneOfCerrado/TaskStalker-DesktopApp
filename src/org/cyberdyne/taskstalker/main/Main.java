package org.cyberdyne.taskstalker.main;

import org.cyberdyne.taskstalker.rede.HandleSocket;

public class Main {
	public static void main(String [] args ) throws InterruptedException{
		HandleSocket hs = new HandleSocket("ws://echo.websocket.org");
		hs.start();
		
		while(true){
			hs.send("Olá mundo");
			Thread.sleep(1000);
		}
	};
}
