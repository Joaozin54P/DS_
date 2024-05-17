/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dicas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JButton botao,botao2,botao3,botao4,botao5,erro,informacao,exclamacao,pergunta,nenhum,copiar,limpar;
    String nome;
    int ds,dia,mes,ano;
    Calendar data;
    JLabel rotulo,rotulo2,rotulo3,rotulo4,rotulo5;
    JTextField texto1,texto2;
    String diasemana[]={"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado"};
    String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    
    public Principal()
    {
       super("Dicas");
       
       Container tela = getContentPane();
       tela.setLayout(null);


       botao = new JButton("Olá");
       botao2 = new JButton("Sair");
       botao3 = new JButton("Escolhe");
       botao4 = new JButton("ocultar");
       botao5 = new JButton("Aparecer");
       erro = new JButton("Erro");
       informacao = new JButton("Informação");
       exclamacao = new JButton("Exclamação");
       pergunta = new JButton("Pergunta");
       nenhum = new JButton("Nenhum");
       copiar = new JButton("Copiar");
       limpar = new JButton("Limpar");
       rotulo = new JLabel("");
       rotulo2 = new JLabel("Nome: ");
       rotulo3 = new JLabel("nome: ");
       rotulo4 = new JLabel("");
       rotulo5 = new JLabel("");
       
       texto1 = new JTextField(20);
       texto2 = new JTextField(20);

       
       tela.setBackground(new Color(224,255,255));
       botao.setForeground(new Color(30,144,255));
       botao2.setForeground(new Color(207,14,14));
       botao3.setForeground(new Color(100,149,237));
       rotulo.setForeground(new Color(46,139,87));
       
        ImageIcon icone= new ImageIcon("R.jpg");
        setIconImage(icone.getImage());
       
       rotulo.setFont(new Font("Cascadia Code",Font.BOLD,14));
       rotulo2.setFont(new Font("Cascadia Code",Font.BOLD,14));
       rotulo3.setFont(new Font("Cascadia Code",Font.BOLD,14));
       rotulo4.setFont(new Font("Cascadia Code",Font.BOLD,14));
       rotulo5.setFont(new Font("Cascadia Code",Font.BOLD,14));
       
       botao.setBounds(80,110,100,20);
       botao3.setBounds(80,150,100,20);
       botao2.setBounds(80,190,100,20);
       botao4.setBounds(80,280,100,20);
       botao5.setBounds(80,310,100,20);
       copiar.setBounds(80,110,100,20);
       limpar.setBounds(80,150,100,20);
       erro.setBounds(250,20,100,20);
       exclamacao.setBounds(250,50,100,20);
       pergunta.setBounds(250,80,100,20);
       nenhum.setBounds(250,110,100,20);
       rotulo4.setBounds(250,190,350,20);
       rotulo5.setBounds(250,220,350,20);
       
       data = Calendar.getInstance();
       ds = data.get(Calendar.DAY_OF_WEEK);
       dia = data.get(Calendar.DAY_OF_MONTH);
       mes = data.get(Calendar.MONTH);
       ano = data.get(Calendar.YEAR);
       
       botao.setToolTipText("Botão usado para abrir algo");
       botao2.setToolTipText("Botão que será usado para sair");
       botao3.setToolTipText("Botão escolhe sua linguagem favorita");
       botao4.setToolTipText("Botão escode tudo");
       botao5.setToolTipText("Botão reaparece tudo");
       
       rotulo4.setText("Data:"+ds+" "+dia+"/"+(mes+1)+"/"+ano);
       rotulo5.setText("Data:"+diasemana[ds-1]+","+dia+" de "+meses[mes]+"de"+ano);
       
       UIManager.put("ToolTip.background",new Color(30,144,255));
       
       
       botao.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    nome = JOptionPane.showInputDialog("Entre com seu nome: ");
                    
                    rotulo.setBounds(10,70,350,20);
                    
                    rotulo.setText("Olá: "+nome.toUpperCase());
                }});
       
       botao2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                        System.exit(0);
                }});
       
       botao3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Object linguagens [] = {"Java","Delphi","C++","Visual Basic"};
                    Object opcao = JOptionPane.showInputDialog(null,"Qual sua linguagem favorita?","Enquete",JOptionPane.QUESTION_MESSAGE,null,linguagens,linguagens[0]);
                    JOptionPane.showMessageDialog(null,"Você escolheu: "+opcao);
                }});
       
       erro.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"ESTÁ DANDO ERRO!! ☠️","Mensagem de Erro",JOptionPane.ERROR_MESSAGE,null);
                }});
       
       informacao.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"Aqui tem algumas informações!! 🤐️","Mensagem de Erro",JOptionPane.INFORMATION_MESSAGE,null);
                }});
       
       exclamacao.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"Cadê a exclamação!! 😞️","Mensagem de Erro",JOptionPane.WARNING_MESSAGE,null);
                }});
       
       pergunta.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"Tem alguma pergunta? 😰️","Mensagem de Erro",JOptionPane.QUESTION_MESSAGE,null);
                }});
       
       nenhum.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"Ta bom! 😕️","Mensagem de Erro",JOptionPane.PLAIN_MESSAGE,null);
                }});
       
       botao4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    rotulo.setVisible(false);
                    rotulo2.setVisible(false);
                    botao.setVisible(false);
                    botao2.setVisible(false);
                    botao3.setVisible(false);
                    erro.setVisible(false);
                    informacao.setVisible(false);
                    exclamacao.setVisible(false);
                    pergunta.setVisible(false);
                    nenhum.setVisible(false);
                    limpar.setVisible(true);
                    copiar.setVisible(true);
                    texto1.setVisible(true);
                    texto2.setVisible(true);
                    rotulo2.setVisible(true);
                    rotulo3.setVisible(true);
                    
                    texto1.setBounds(300,80,100,20);
       texto2.setBounds(300,110,100,20);
       rotulo2.setBounds(250,80,100,20);
       rotulo3.setBounds(250,110,100,20);
                }});
       
       botao5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    rotulo.setVisible(true);
                    rotulo2.setVisible(true);
                    botao.setVisible(true);
                    botao2.setVisible(true);
                    botao3.setVisible(true);
                    erro.setVisible(true);
                    informacao.setVisible(true);
                    exclamacao.setVisible(true);
                    pergunta.setVisible(true);
                    nenhum.setVisible(true);
                    limpar.setVisible(false);
                    copiar.setVisible(false);
                    texto1.setVisible(false);
                    texto2.setVisible(false);
                    rotulo2.setVisible(false);
                    rotulo3.setVisible(false);
                    
                    texto1.setBounds(300,110,100,20);
       texto2.setBounds(340,110,100,20);
       rotulo2.setBounds(288,80,100,20);
       rotulo3.setBounds(250,110,100,20);
                }});
       
       copiar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String texto;
                    texto = texto1.getText().toUpperCase();
                    texto1.setText(texto);
                    texto2.setText(texto1.getText().toLowerCase());               
                }});
       
       limpar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String texto;
                    texto1.setText("");
                    texto2.setText("");
                    texto1.requestFocus();               
                }});
       
       tela.add(botao);
       tela.add(botao2);
       tela.add(botao3);
       tela.add(botao5);
       tela.add(copiar);
       tela.add(limpar);
       tela.add(texto1);
       tela.add(texto2);
       tela.add(rotulo2);
       tela.add(rotulo3);
       tela.add(rotulo);
       tela.add(erro);
       tela.add(botao4);
       tela.add(informacao);
       tela.add(exclamacao);
       tela.add(pergunta);
       tela.add(nenhum);
       tela.add(rotulo4);
       tela.add(rotulo5);
       setSize(500,350);
       setVisible(true);
       setLocationRelativeTo(null); 
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
};