package org.cyberdyne.taskstalker.visao;

import javax.swing.*;
import java.awt.*;


public class TaskStalkerJanela extends JFrame{
 
	public TaskStalkerJanela(){
        super("Task Stalker");

        getContentPane().add(new TaskStalkerTelaPrincipal());
        this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        setVisible(true);
        //setResizable(false);

    }

}