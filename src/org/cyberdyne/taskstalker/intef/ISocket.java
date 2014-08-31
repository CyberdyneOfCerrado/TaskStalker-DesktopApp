// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.intef;

import org.java_websocket.handshake.ServerHandshake;

public interface ISocket {
	public void onClose(int arg0, String arg1, boolean arg2); 
	public void onError(Exception arg0) ;
	public void onMessage(String arg0); 
	public void onOpen(ServerHandshake arg0);
	public void OnReady(int arg0);
	public void send(String arg0);
}
