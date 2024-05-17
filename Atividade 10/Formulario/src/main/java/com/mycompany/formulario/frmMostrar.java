/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */


class frmMostrar extends javax.swing.JFrame {
    private JLabel rotulo, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    private JButton botao,botao2;

    public frmMostrar(String nome, String idade, String matricula, String resultado, String periodo, String curso, String serie) {
        super("Mostrar Dados");
        setLayout(null);

        rotulo = new JLabel("Nome: " + nome);
        rotulo2 = new JLabel("Idade: " + idade);
        rotulo3 = new JLabel("Matrícula: " + matricula);
        rotulo4 = new JLabel("Resultado: " + resultado);
        rotulo5 = new JLabel("Período: " + periodo);
        rotulo6 = new JLabel("Curso: " + curso);
        rotulo7 = new JLabel("Série: " + serie);
        botao = new JButton("voltar");
        botao2 = new JButton("Sair");

        getContentPane().setBackground(new Color(135, 206, 250));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        rotulo.setBounds(20, 20, 400, 20);
        rotulo2.setBounds(20, 50, 400, 20);
        rotulo3.setBounds(20, 80, 400, 20);
        rotulo4.setBounds(20, 110, 400, 20);
        rotulo5.setBounds(20, 140, 400, 20);
        rotulo6.setBounds(20, 170, 400, 20);
        rotulo7.setBounds(20, 200, 400, 20);
        botao.setBounds(20, 230, 80, 25);
        botao2.setBounds(120, 230, 80, 25);
        
        botao.setMnemonic(KeyEvent.VK_L);
        botao2.setMnemonic(KeyEvent.VK_F);
        
        botao.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja voltar?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    dispose();
                    
                    new Principal().setVisible(true);
                }});
        
        botao2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair mesmo?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    dispose();
                }});
        
        add(rotulo);
        add(rotulo2);
        add(rotulo3);
        add(rotulo4);
        add(rotulo5);
        add(rotulo6);
        add(rotulo7);
        add(botao);
        add(botao2);

        setSize(600, 550);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}