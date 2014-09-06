package org.cyberdyne.taskstalker.main;

import org.cyberdyne.taskstalker.controles.CoreController;
import org.cyberdyne.taskstalker.controles.InfoWindowC;
import org.cyberdyne.taskstalker.enums.TypeWindow;




public class Main {
	public static void main(String [] args ) throws InterruptedException{
		
	};
	
	@SuppressWarnings("unused")
	private static void test1 (){
		InfoWindowC iw =  InfoWindowC.getInstance();	
		sleep(4);
		while(true){
		iw.newInfo("Lucas","Tarefa de alguma coisagfg fdgsdfg  fgsdfgs sfgsfg sfgsdfg sdfgsdfg",TypeWindow.CANCEL);
		sleep(2);
		}
	};
	
	private static void test2(){
		CoreController cc = new CoreController();
		cc.startCore();
		while(true){
			cc.startActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.endActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.cancelActivity("Allysom Maciel","Atividade de programação");
			cc.startActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.endActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.cancelActivity("Allysom Maciel","Atividade de programação");
			cc.startActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.endActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.cancelActivity("Allysom Maciel","Atividade de programação");
			cc.startActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.endActivity("Allysom Maciel","Atividade de programação");
			sleep(1);
			cc.cancelActivity("Allysom Maciel","Atividade de programação");
			sleep(4);
		}
	}
	
	private static void sleep( int latency ){
		try {
			Thread.sleep(latency* 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}

