// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.rede;

import org.cyberdyne.taskstalker.componentes.Core;
import org.cyberdyne.taskstalker.intef.ISocket;
import org.java_websocket.handshake.ServerHandshake;

public class HandleSocket implements ISocket {
	private String uri;
	private boolean isStarted;
	private WebSocket ws;
	private Core core;
	
	public HandleSocket( String uri, Core core){
		this.uri = uri;
		this.core = core;
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
		core.onClose(arg0, arg1, arg2);
	};

	@Override
	public void onError(Exception arg0) {
		core.onError(arg0);;
	};

	@Override
	public void onMessage(String arg0) {
		core.onMessage(arg0);
	};

	@Override
	public void onOpen(ServerHandshake arg0) {
		core.onOpen(arg0);
	};

	@Override
	public void onReady(int arg0) {
		core.onReady(arg0);
	};

	@Override
	public void send(String arg0) {
		ws.send(arg0);
	};
}
