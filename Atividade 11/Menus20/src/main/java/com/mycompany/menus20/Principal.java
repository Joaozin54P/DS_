/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menus20;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JPopupMenu opcoes;
    JMenuItem recortar,copiar,colar;
    JTextArea texto;
    
    public Principal()
    {
        super("Exemplo de PopupMenu");
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        texto = new JTextArea(10,20);
        texto.setBounds(30,30,250,190);
        
        texto.addMouseListener(new MouseAdapter(){
           public void mouseReleased(MouseEvent e){
            if(e.isPopupTrigger())
        opcoes.show(e.getComponent(),e.getX(),e.getY());}});
     
        Tratador tratmenu = new Tratador();
        opcoes = new JPopupMenu();
        recortar = new JMenuItem("Recortar");
        copiar = new JMenuItem("Copiar");
        colar = new JMenuItem("Colar");
        
        tela.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        recortar.setMnemonic(KeyEvent.VK_R);
        copiar.setMnemonic(KeyEvent.VK_C);
        colar.setMnemonic(KeyEvent.VK_L);
        
        recortar.addActionListener(tratmenu);
        copiar.addActionListener(tratmenu);
        colar.addActionListener(tratmenu);
        
        opcoes.add(recortar);
        opcoes.add(copiar);
        opcoes.addSeparator();
        opcoes.add(colar);
        
        tela.add(texto);
        setSize(320,340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    private class Tratador implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==recortar)
                texto.cut();
            if(e.getSource()==copiar)
                texto.copy();
            if(e.getSource()==colar)
                texto.paste();
            repaint();
        }
    }
}
    

