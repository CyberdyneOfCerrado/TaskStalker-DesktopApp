// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.rede;

import org.cyberdyne.taskstalker.intef.ISocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class HandleSocket implements ISocket {
	private String uri;
	private boolean isStarted;
	private WebSocket ws;
	
	public HandleSocket( String uri){
		this.uri = uri;
		isStarted = false;
	};
	
	public String getUri(){
		return uri;
	};
	
	public void start(){
		if( !isStarted ){
			ws = new WebSocket(this);
			ws.start();
		}
		isStarted = true;
	};
	
	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {
		System.out.println("1");
	};

	@Override
	public void onError(Exception arg0) {
		System.out.println("2");
	};

	@Override
	public void onMessage(String arg0) {
		System.out.println("Alguém: "+ arg0);
	};

	@Override
	public void onOpen(ServerHandshake arg0) {
		System.out.println("Conectado: "+ arg0.getHttpStatusMessage());
	};

	@Override
	public void OnReady(int arg0) {
		System.out.println("5");
	};

	@Override
	public void send(String arg0) {
		ws.send(arg0);
	};
}
