/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulari;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JLabel rotulo,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
    JButton botao,botao2,botao3;
    JRadioButton mas,fem,outro;
    JCheckBox automoveis,barcos,avioes;
    ButtonGroup grupo;
    JTextField texto,texto2;
    String rela[] = {"Solteiro(a)","Casado(a)","Viúvo(a)","Separado(a)","Divorciado(a)"};
    JComboBox lista;
    
    public Principal()
    {
        super("Atividade"); 
         
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo = new JLabel("Nome:");
        rotulo2 = new JLabel("Idade:");
        rotulo4 = new JLabel("Interesses:");
        rotulo3 = new JLabel("Sexo:");
        rotulo5 = new JLabel("Estado civil:");
        rotulo6 = new JLabel("Programado: João Pedro Da Silva 2°DS");
        lista = new JComboBox(rela);
        automoveis = new JCheckBox("Automóveis");
        barcos = new JCheckBox("Barcos");
        avioes = new JCheckBox("Aviões");
        mas = new JRadioButton("Masculino");
        fem = new JRadioButton("Feminino");
        outro = new JRadioButton("Outros");
        botao = new JButton("Enviar os dados");
        botao2 = new JButton("Limpar os dados");
        botao3 = new JButton("Sair");
        grupo = new ButtonGroup();
        
        texto = new JTextField(45);
       texto2 = new JTextField(3);
        
        lista.setMaximumRowCount(5);
        
        tela.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("R.jpg");
        setIconImage(icone.getImage());
        
        grupo.add(mas);
        grupo.add(fem);
        grupo.add(outro);
        
        
        rotulo.setBounds(10, 30, 110, 20);
        rotulo2.setBounds(10, 60, 110, 20);
        rotulo3.setBounds(10, 100, 110, 20);
        rotulo4.setBounds(10, 150, 110, 20);
        rotulo5.setBounds(10, 275, 110, 20);
        rotulo6.setBounds(25, 369, 260, 20);
        automoveis.setBounds(10, 185, 110, 20);
        barcos.setBounds(10, 210, 110, 20);
        avioes.setBounds(10, 235, 110, 20);
        lista.setBounds(80, 275, 110, 20);
        mas.setBounds(55, 100, 90, 20);
        fem.setBounds(145, 100, 90, 20);
        outro.setBounds(232, 100, 90, 20);
        texto.setBounds(55, 30, 110, 20);
        texto2.setBounds(55, 60, 30, 20);
        botao.setBounds(80,330,129,20);
       botao2.setBounds(210,330,129,20);
       botao3.setBounds(339,330,60,20);
       
       rotulo6.setForeground(new Color(0,128,128));
       rotulo.setForeground(new Color(25,25,112));
       rotulo2.setForeground(new Color(106,90,205));
       rotulo3.setForeground(new Color(25,25,112));
       rotulo4.setForeground(new Color(106,90,205));
       rotulo5.setForeground(new Color(100,149,237));
       mas.setForeground(new Color(0,128,128));
       fem.setForeground(new Color(32,178,170));
       outro.setForeground(new Color(0,139,139));
       automoveis.setForeground(new Color(0,250,154));
       barcos.setForeground(new Color(47,79,79));
       avioes.setForeground(new Color(0,250,154));
       
       mas.setBackground(new Color(135,206,250));
       fem.setBackground(new Color(135,206,250));
       outro.setBackground(new Color(135,206,250));
       barcos.setBackground(new Color(135,206,250));
       avioes.setBackground(new Color(135,206,250));
       automoveis.setBackground(new Color(135,206,250));
       
       botao.setMnemonic(KeyEvent.VK_L);
       botao2.setMnemonic(KeyEvent.VK_R);
       botao3.setMnemonic(KeyEvent.VK_B);
       
       botao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String nome = texto.getText();
        String idade = texto2.getText();
        String sexo = mas.isSelected() ? "Masculino" : (fem.isSelected() ? "Feminino" : (outro.isSelected() ? "Outros" : ""));
        String interesses = "";

        if (automoveis.isSelected()) {
            interesses += "Automóveis";
        }

        if (barcos.isSelected()) {
            interesses += "Barcos ";
        }

        if (avioes.isSelected()) {
            interesses += "Aviões";
        }

        String estado = (String) lista.getSelectedItem();
        String msg = "Nome: "+nome+"\nIdade: "+idade+" Anos"+"\nSexo: "+sexo+"\nInteresses: "+interesses+"\n Estado: "+estado;

        JOptionPane.showMessageDialog(null, msg);}});
       
       botao2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo limpar seus dados?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                        texto.setText("");
                        texto2.setText("");
                        lista.setSelectedIndex(-1);
                        mas.setSelected(false);
                        fem.setSelected(false);
                        outro.setSelected(false);
                        automoveis.setSelected(false);
                        barcos.setSelected(false);
                        avioes.setSelected(false);
                }});
        
        automoveis.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    barcos.setSelected(false);
                    avioes.setSelected(false);}});
        
        barcos.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    automoveis.setSelected(false);
                    avioes.setSelected(false);}});
        
        avioes.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    barcos.setSelected(false);
                    automoveis.setSelected(false);}});
        
        botao3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.exit(0);}});
        
     tela.add(rotulo);
     tela.add(rotulo2); 
     tela.add(rotulo3);
     tela.add(rotulo4);
     tela.add(rotulo5);
     tela.add(avioes);
     tela.add(automoveis);
     tela.add(barcos);
     tela.add(texto); 
     tela.add(texto2);
     tela.add(lista);
     tela.add(mas);
     tela.add(fem); 
     tela.add(outro);
     tela.add(botao);
     tela.add(botao2);
     tela.add(botao3);
     tela.add(rotulo6);
     setSize(500,350);
     setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}