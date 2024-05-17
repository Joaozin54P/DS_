/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j_r_b;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class Principal extends JFrame
{
     JLabel rotulo,rotulo2,rotulo3,texto;
     JCheckBox negrito,italico,normal,negritoitalico;
     JRadioButton tam1,tam2,tam3,tam4;
     ButtonGroup grupo;
     String cor[] = {"Sem Cor","Vermelho","Azul","Verde","Amarelo","Branco","Preto"};
     JComboBox listas;
     Integer estilo,tamfonte;
     
     public Principal()
     {
         super("Exemplo do 13"); 
         
         Container tela = getContentPane();
        setLayout(null);
        
        rotulo = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");
        listas = new JComboBox(cor);
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();
        
        listas.setMaximumRowCount(7);
        
        tela.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("R.jpg");
        setIconImage(icone.getImage());
        
        
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);
        
        listas.setForeground(new Color(30,144,255));
        
        listas.setFont(new Font("Cascadia Code",Font.BOLD,14));
        rotulo.setFont(new Font("Cascadia Code",Font.BOLD,14));
        rotulo2.setFont(new Font("Cascadia Code",Font.BOLD,14));
        rotulo3.setFont(new Font("Cascadia Code",Font.BOLD,14));
        
        rotulo.setBounds(40, 20, 70, 20);
        rotulo2.setBounds(200, 20, 70, 20);
        rotulo3.setBounds(300, 20, 70, 20);
        texto.setBounds(100, 200, 300, 20);
        listas.setBounds(40, 50, 150, 20);
        negrito.setBounds(200, 50, 100, 20);
        italico.setBounds(200, 70, 100, 20);
        normal.setBounds(200, 90, 100, 20);
        negritoitalico.setBounds(200, 110, 150, 20);
        tam1.setBounds(350, 50, 100, 20);
        tam2.setBounds(350, 70, 100, 20);
        tam3.setBounds(350, 90, 100, 20);
        tam4.setBounds(350, 110, 100, 20);tamfonte=12;
        
        estilo=Font.PLAIN;
        
        //coloca cor na fonte
        
        listas.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(listas.getSelectedItem().toString() == "Sem Cor")
                        texto.setForeground(Color.black);
                    if(listas.getSelectedItem().toString() == "Vermelho")
                        texto.setForeground(Color.red);
                    if(listas.getSelectedItem().toString() == "Azul")
                        texto.setForeground(Color.blue);
                    if(listas.getSelectedItem().toString() == "Verde")
                        texto.setForeground(Color.green);
                    if(listas.getSelectedItem().toString() == "Amarelo")
                        texto.setForeground(Color.yellow);
                    if(listas.getSelectedItem().toString() == "Branco")
                        texto.setForeground(Color.white);
                    if(listas.getSelectedItem().toString() == "Preto")
                        texto.setForeground(Color.black);}});
                
     //coloca a fonte tamanho 12
     tam1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    tamfonte = 12;
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte tamanho 14
     tam2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    tamfonte = 14;
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte tamanho 16
     tam3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    tamfonte = 16;
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte tamanho 18
     tam4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    tamfonte = 18;
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte em negrito
     negrito.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    estilo = Font.BOLD;
                    
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte em itálico
     italico.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    estilo = Font.ITALIC;
                    normal.setSelected(false);
                    negrito.setSelected(false);
                    negritoitalico.setSelected(false);
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte em Normal
     normal.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    estilo = Font.PLAIN;
                    italico.setSelected(false);
                    negrito.setSelected(false);
                    negritoitalico.setSelected(false);
                    texto.setFont(new Font("",estilo,tamfonte));}});
     
     //coloca a fonte em normal e itálico
     negritoitalico.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    estilo=Font.BOLD+Font.ITALIC;
                    normal.setSelected(false);
                    negrito.setSelected(false);
                    italico.setSelected(false);
                    texto.setFont(new Font("",estilo,tamfonte));}});

     tela.add(rotulo);
     tela.add(rotulo2); 
     tela.add(rotulo3);
     tela.add(texto);
     tela.add(negrito); 
     tela.add(italico);
     tela.add(normal); 
     tela.add(negritoitalico);
     tela.add(tam1); 
     tela.add(tam2);
     tela.add(tam3);
     tela.add(tam4);
     tela.add(listas);
     setSize(500,350);
     setVisible(true);
     }
     public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}