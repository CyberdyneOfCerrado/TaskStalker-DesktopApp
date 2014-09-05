// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.controles;

import org.cyberdyne.taskstalker.componentes.Core;
import org.cyberdyne.taskstalker.visao.InfoWindow;
import org.java_websocket.handshake.ServerHandshake;

public class CoreController extends Core  {
	
	public CoreController(){
		
	};

	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {

	};

	@Override
	public void onError(Exception arg0) {

	};

	@Override
	public void onMessage(String arg0) {
		System.out.println("Olá");
	};

	@Override
	public void onOpen(ServerHandshake arg0) {
		System.out.println("Status do Servidor 'CC' :" +arg0.getHttpStatusMessage());
	};

	@Override
	public void onReady(int arg0) {

	};
}
