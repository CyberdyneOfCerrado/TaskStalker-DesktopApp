// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.componentes;


import org.cyberdyne.taskstalker.enums.TypeWindow;
import org.cyberdyne.taskstalker.rede.HandleSocket;
import org.java_websocket.handshake.ServerHandshake;

public abstract class Core{
	private final String webSocket = "ws://echo.websocket.org";
	private final String server    = "";
	private HandleSocket hs;
	
	public Core(){
		
	};
	
	public void startActivity(String title, String content ){
		String temp = title+",@#"+content+",@#"+TypeWindow.START.toString();
		this.send(temp);
	};
	
	public void endActivity (String title, String content){
		String temp = title+",@#"+content+",@#"+TypeWindow.END.toString();
		this.send(temp);
	};
	
	public void cancelActivity(String title, String content){
		String temp = title+",@#"+content+",@#"+TypeWindow.CANCEL.toString();
		this.send(temp);
	};
	
	//Descobrir como vai ser o tipo de retorno deste método depois;
	public void feedFriends(){
		
	};

	public void startCore(){
		hs = new HandleSocket(this.webSocket, this);
		hs.start();
	};
	
	public abstract void onClose(int arg0, String arg1, boolean arg2);
	public abstract void onError(Exception arg0);
	public abstract void onMessage(String arg0);
	public abstract void onOpen(ServerHandshake arg0);
	public abstract void onReady(int arg0);
	
	public void send(String arg0){
		hs.send(arg0);
	};
}
