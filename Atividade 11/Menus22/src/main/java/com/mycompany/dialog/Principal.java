/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal extends JFrame {
    JMenuBar barra;
    JMenu opcoes;
    JMenuItem somar, sair;
    JButton btnSair, abrir;
    Inicial segundajanela;

    public Principal() {
        super("Abrir um novo formulário");
        Container tela = getContentPane();
        tela.setLayout(null);

        // criando o menu de opções
        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);
        somar = new JMenuItem("Somar");
        sair = new JMenuItem("Sair");

        somar.setMnemonic(KeyEvent.VK_O);
        sair.setMnemonic(KeyEvent.VK_S);

        tela.setBackground(new Color(135, 206, 250));
        ImageIcon icone = new ImageIcon("J.jpg");
        setIconImage(icone.getImage());

        opcoes.add(somar);
        opcoes.add(sair);

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new Inicial(null, "Segunda Janela", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });

        btnSair = new JButton("Sair");
        btnSair.setBounds(400, 450, 80, 20);

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
                if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        abrir = new JButton("Abrir");
        abrir.setBounds(500, 450, 80, 20);

        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundajanela = new Inicial(null, "Segunda Janela", true);
                segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                segundajanela.setVisible(true);
            }
        });

        tela.add(btnSair);
        tela.add(abrir);
        setSize(500, 550);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        Principal app = new Principal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Inicial extends JDialog {
        JButton sair;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton somar2n;

        public Inicial(Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            Container tela1 = getContentPane();
            tela1.setLayout(null);

            // layout do formulário
            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            somar2n = new JButton("Somar");

            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            somar2n.setBounds(150, 100, 80, 20);

            somar2n.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1, num2, soma;
                    soma = 0;
                    num1 = Integer.parseInt(texto1.getText());
                    num2 = Integer.parseInt(texto2.getText());
                    soma = num1 + num2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é: " + soma);
                }
            });
            exibir.setVisible(false);

            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(somar2n);

            sair = new JButton("Sair");
            sair.setBounds(50, 250, 100, 20);
            TBsair tsair = new TBsair();
            sair.addActionListener(tsair);
            tela1.add(sair);
            setSize(400, 400);
            setLocationRelativeTo(null);
        }
    }

    private class TBsair implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_NO_OPTION) {
                segundajanela.setVisible(false);
                segundajanela.dispose();
            }
        }
    }
}