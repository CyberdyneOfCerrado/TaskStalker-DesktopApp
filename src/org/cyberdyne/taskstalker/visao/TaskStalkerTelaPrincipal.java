package org.cyberdyne.taskstalker.visao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TaskStalkerTelaPrincipal extends JPanel {

    private JButton	botaoFarei;
    private JButton	botaoFeito;
    private JTextField	textAtividade;

//    private JTextArea  textArea;

    public TaskStalkerTelaPrincipal (){

        setLayout(new BorderLayout());
        montarLayout();
    }


    public void montarLayout()  {



        //REGIÕES
        JPanel norte = new JPanel();
        norte.setLayout(new BorderLayout());

        JPanel centro = new JPanel();
        centro.setLayout(new BorderLayout());

        JPanel contenerOutrosUsuarios = new JPanel();
        contenerOutrosUsuarios.setLayout(new BorderLayout());
        
        JPanel contenerUsuario = new JPanel();
        contenerUsuario.setLayout(new BorderLayout());
                
        JPanel botoes = new JPanel();
        botoes.setLayout(new FlowLayout(FlowLayout.CENTER));

        //NORTE

        Font f = new Font("SansSerif", Font.BOLD, 30);

        JLabel tituloPrograma = new JLabel("TaskStalker");
        tituloPrograma.setFont(f);
        norte.add(tituloPrograma);


        //CENTRO

        //bordas dos paneis

        contenerOutrosUsuarios.setBorder(BorderFactory.createTitledBorder("O que os anti-procrastinadores estão fazendo."));
        contenerUsuario.setBorder(BorderFactory.createTitledBorder("E você?"));


        //botoes

        botaoFarei   = new JButton("Farei");
        botaoFeito   = new JButton("Feito");
        
        botoes.add(botaoFarei);
        botoes.add(botaoFeito);;

        
        //textAtividade
        
        textAtividade = new JTextField(18);
     //   centroSulCentro.add(textAtividade);
        


        // PAINÉIS NAS REGIÕES
        add(norte, BorderLayout.NORTH);
        add(centro, BorderLayout.CENTER);

        centro.add(contenerOutrosUsuarios, BorderLayout.CENTER);
        centro.add(contenerUsuario, BorderLayout.SOUTH);
        contenerUsuario.add(botoes, BorderLayout.EAST);
        contenerUsuario.add(textAtividade, BorderLayout.CENTER);
        
    }
}
