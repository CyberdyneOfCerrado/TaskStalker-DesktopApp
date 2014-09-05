package org.cyberdyne.taskstalker.main;

import org.cyberdyne.taskstalker.controles.InfoWindowC;
import org.cyberdyne.taskstalker.enums.TypeWindow;




public class Main {
	public static void main(String [] args ) throws InterruptedException{
		test1();
	};
	
	private static void test1 (){
		InfoWindowC iw =  InfoWindowC.getInstance();	
		iw.newInfo("Erick","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		sleep(4);
		while(true){
		iw.newInfo("Marta","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Márcio","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Allyson Maciel","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		iw.newInfo("Jéssica","Tarefa de alguma coisa","Cancelou uma atividade",TypeWindow.CANCEL);
		iw.newInfo("Lorena","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Luiz","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		iw.newInfo("Calebe","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Robson","Tarefa de alguma coisa","Cancelou uma atividade",TypeWindow.CANCEL);
		iw.newInfo("Lucas","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		sleep(2);
		iw.newInfo("Calebe","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		sleep(4);
		iw.newInfo("Luiz","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Lucas","Tarefa de alguma coisa","Cancelou uma atividade",TypeWindow.CANCEL);
		sleep(2);
		iw.newInfo("Jéssica","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		sleep(4);
		iw.newInfo("Allyson Maciel","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		iw.newInfo("Marta","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		sleep(2);
		iw.newInfo("Allyson Maciel","Tarefa de alguma coisa","Cancelou uma atividade",TypeWindow.CANCEL);
		sleep(4);
		iw.newInfo("Lorena","Tarefa de alguma coisa","Cancelou uma atividade",TypeWindow.CANCEL);
		iw.newInfo("Márcio","Tarefa de alguma coisa","Iniciou uma atividade",TypeWindow.START);
		sleep(2);
		iw.newInfo("Robson","Tarefa de alguma coisa","Finalizou uma atividade",TypeWindow.END);
		sleep(4);
		}
	};
	
	private static void sleep( int latency ){
		try {
			Thread.sleep(latency* 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}

