// Copyright 2014 Allyson Maciel. All rights reserved.
// Use of this source code is governed by a MIT-style
// license that can be found in the LICENSE file.

package org.cyberdyne.taskstalker.controles;

import org.cyberdyne.taskstalker.componentes.Core;
import org.cyberdyne.taskstalker.enums.TypeWindow;
import org.cyberdyne.taskstalker.visao.InfoWindow;
import org.java_websocket.handshake.ServerHandshake;

public class CoreController extends Core  {
	private InfoWindowC iw;
	
	public CoreController(){
		iw = InfoWindowC.getInstance();
	};

	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {

	};

	@Override
	public void onError(Exception arg0) {

	};

	@Override
	public void onMessage(String arg0) {
		//Protocolo de comunicação: 
		//title,@#content,@#tw
		TypeWindow tw = null;
		String[] args = arg0.split(",@#");
		switch(args[2]){
		case "START":
			tw = TypeWindow.START;
			break;
		case "END":
			tw = TypeWindow.END;
			break;
		case "CANCEL":
			tw = TypeWindow.CANCEL;
			break;	
		}
		iw.newInfo(args[0], args[1],tw);
	};

	@Override
	public void onOpen(ServerHandshake arg0) {
		System.out.println("Status do Servidor 'CC' :" +arg0.getHttpStatusMessage());
	};

	@Override
	public void onReady(int arg0) {

	};
}
