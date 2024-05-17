/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.item_5;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author dti
 */
public class I5 extends JFrame
{
    JLabel rotulo;
    JTextArea texto;
    JScrollPane painelrolagem;
    JPanel painel;

    
    public I5()
    {
        super("Exemplo com JTextArea");
        
        Container tela = getContentPane();
        
        tela.setLayout(null);
        rotulo = new JLabel("Endereço");
        texto = new JTextArea(10,30);
        painelrolagem = new JScrollPane(texto);
        
        
        painel = new JPanel();
        painel.add(painelrolagem);
        
        rotulo.setBounds(50,20,100,20);
        texto.setBounds(50,50,300,250);
        painel.setBounds(40,40,250,250);
        
        painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        
        tela.add(rotulo);
        tela.add(texto);
        tela.add(painel);
        
        setSize(300,280);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[])
    {
        I5 app = new I5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
