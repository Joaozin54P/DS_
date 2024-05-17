/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.br;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JLabel rotulo1,rotulo2,resul,nome,valo,atalho,ins,ins2,ins3;
    JTextField texto1,texto2;
    JButton  somar,multiplicar,dividir,subtrair,limpar,Habilitar,Desabilitar,Ocultar,exibir,Sair;
    
    public Principal()
    {
     super("Calculadora");   
     
     Container tela = getContentPane();
     
     setLayout(null);
     rotulo1 = new JLabel("1° Número: ");
     rotulo2 = new JLabel("2°Número: ");
     resul = new JLabel("Resultado: ");
     atalho = new JLabel("Atalhos");
     ins = new JLabel("Alt+x: Sai da calculadora");
     ins2 = new JLabel("Alt+s: Oculta a calculadora");
     ins3 = new JLabel("Alt+e: Habilita a calculadora");
     valo = new JLabel("");
     nome = new JLabel("Densenvolvido por: João Pedro 2°DS");
     texto1 = new JTextField(5);
     texto2 = new JTextField(5);
     exibir = new JButton("exibir");
     somar = new JButton("+");
     subtrair = new JButton("-");
     multiplicar = new JButton("*");
     dividir = new JButton("/");
     limpar = new JButton("Limpar");
     Habilitar = new JButton("Habilitar");
     Desabilitar = new JButton("Desabilitar");
     Ocultar = new JButton("Ocultar");
     Sair = new JButton("Sair");
     
     rotulo1.setBounds(50, 20, 100, 20);
     rotulo2.setBounds(50, 60, 200, 20);
     resul.setBounds(50,95,120,20);
     valo.setBounds(115,95,200,20);
     texto1.setBounds(120, 20, 200, 20);
     texto2.setBounds(120, 60, 200, 20);
     exibir.setBounds(320, 140, 80, 20);
     somar.setBounds(330, 10, 80, 20);
     subtrair.setBounds(330, 28, 80, 20);
     multiplicar.setBounds(330, 48, 80, 20);
     dividir.setBounds(330, 68, 80, 20);
     limpar.setBounds(330, 88, 80, 20);
     nome.setBounds(50, 400, 400, 20);
     atalho.setBounds(50, 250, 80, 20);
     ins.setBounds(50, 266, 230, 20);
     ins2.setBounds(50, 299, 230, 20);
     ins3.setBounds(50, 340, 230, 20);
     limpar.setBounds(330, 88, 80, 20);
     Habilitar.setBounds(70, 140, 90, 20);
     Desabilitar.setBounds(150, 140, 100, 20);
     Ocultar.setBounds(250, 140, 80, 20);
     Sair.setBounds(150, 180, 80, 20);
     Sair.setMnemonic(KeyEvent.VK_X);
     Ocultar.setMnemonic(KeyEvent.VK_S);
     exibir.setMnemonic(KeyEvent.VK_E);
     
     rotulo1.setForeground(Color.red);
     rotulo2.setForeground(Color.red);
     atalho.setForeground(Color.blue);
     nome.setForeground(Color.red);
     
     somar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int numero1,numero2,soma;
                    soma=0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    valo.setText("A soma é: "+soma);
                }
            }
            );
     subtrair.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int numero1,numero2,subtracao;
                    subtracao=0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    subtracao = numero1 - numero2;
                    exibir.setVisible(true);
                    valo.setText("A subtração é: "+subtracao);
                }
            }
            );
     multiplicar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int numero1,numero2,multiplicao;
                    multiplicao=0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    multiplicao = numero1 * numero2;
                    exibir.setVisible(true);
                    valo.setText("A multiplicação   é: "+multiplicao);
                }
            }
            );
      dividir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int numero1,numero2,divisao;
                    divisao=0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    divisao = numero1 / numero2;
                    exibir.setVisible(true);
                    valo.setText("A divisão é: "+divisao);
                }
            }
            );
      limpar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    texto1.setText(null);
                    texto2.setText(null);
                    texto1.requestFocus();
                }
            }
            );
      Desabilitar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    rotulo1.setEnabled(false);
                    rotulo2.setEnabled(false);
                    texto1.setEnabled(false);
                    texto2.setEnabled(false);
                }
            }
            );
      Habilitar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    rotulo1.setEnabled(true);
                    rotulo2.setEnabled(true);
                    texto1.setEnabled(true);
                    texto2.setEnabled(true);
                }
            }
            );
      Ocultar.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   rotulo1.setVisible(false);
                   rotulo2.setVisible(false);
                   texto1.setVisible(false);
                   texto2.setVisible(false);
                   resul.setVisible(false);
                   valo.setVisible(false);
                }
            }
            );
      exibir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   rotulo1.setVisible(true);
                   rotulo2.setVisible(true);
                   texto1.setVisible(true);
                   texto2.setVisible(true);
                   resul.setVisible(true);
                   valo.setVisible(true);
                }
            }
            );
      Sair.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   System.exit(0);
                }
            }
            );

     
     tela.add(rotulo1);
     tela.add(rotulo2);
     tela.add(resul);
     tela.add(valo);
     tela.add(texto1);
     tela.add(texto2);
     tela.add(somar);
     tela.add(subtrair);
     tela.add(multiplicar);
     tela.add(dividir);
     tela.add(limpar);
     tela.add(Desabilitar);
     tela.add(Habilitar);
     tela.add(exibir);
     tela.add(Ocultar);
     tela.add(Sair);
     tela.add(ins);
     tela.add(ins2);
     tela.add(ins3);
     tela.add(atalho);
     tela.add(nome);
     
     setSize(400,250);
     setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
