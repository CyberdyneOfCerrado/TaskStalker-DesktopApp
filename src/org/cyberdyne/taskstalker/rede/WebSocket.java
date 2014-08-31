// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.rede;

import java.net.URI;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

public class WebSocket {
	private HandleSocket hs;
	private WebSocketClient wcc;
	
	public WebSocket( HandleSocket hs){
		this.hs = hs;
	};
	
	public void start(){
		wcc = new WebSocketClient(URI.create(hs.getUri()), new Draft_17()){
			@Override
			public void onClose(int arg0, String arg1, boolean arg2) {
				hs.onClose(arg0, arg1, arg2);
			};

			@Override
			public void onError(Exception arg0) {
				hs.onError(arg0);
			};

			@Override
			public void onMessage(String arg0) {
				hs.onMessage(arg0);
			};

			@Override
			public void onOpen(ServerHandshake arg0) {
				hs.onOpen(arg0);
			};
			
			public void onReady(){
				hs.OnReady(this.getReadyState());
			};
		};
	  wcc.connect();
	}
	
	public void send( String arg0 ){
		if( wcc.getReadyState() != 0  )wcc.send(arg0);
	}
}	
