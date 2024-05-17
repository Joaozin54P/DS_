/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.sql.*;

/**
 *
 * @author dti
 */
public class TelaInicial extends JFrame {
    JMenuBar barra;
    JMenu opcoes, Tabelas, sobre, ssair;
    JMenuItem tabe1, sair, ssobre;

    public TelaInicial() {
        Container tela = getContentPane();
        tela.setLayout(null);
        setTitle("-- Acesso A Tabela --");

        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Tabela");
        sair = new JMenuItem("Sair");

        sobre = new JMenu("Sobre");
        ssobre = new JMenuItem("Sobre Mim");

        ssair = new JMenu("Sair");

        Tabelas = new JMenu("Crud");

        tabe1 = new JMenuItem("Pet");

        barra.add(opcoes);
        barra.add(ssair);
        barra.add(sobre);

        opcoes.add(Tabelas);
        ssair.add(sair);
        sobre.add(ssobre);

        Tabelas.add(tabe1);

        ImageIcon imagemFundo = new ImageIcon("tabe.jpg");
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

        JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
        labelFundo.setBounds(0, 0, 500, 350);

        ImageIcon icone = new ImageIcon("icon.jpg");
        setIconImage(icone.getImage());

        opcoes.setMnemonic(KeyEvent.VK_O);
        sair.setMnemonic(KeyEvent.VK_S);
        Tabelas.setMnemonic(KeyEvent.VK_E);

        tabe1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PetShop mostra = new PetShop();
                mostra.setVisible(true);
                dispose();
            }
        });

        ssobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sobremim ver = new sobremim();
                ver.setVisible(true);
                dispose();
            }
        });

        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcao;
                Object[] botoes = {"Sim", "Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja sair mesmo?", "Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

                if (opcao == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        tela.add(labelFundo);

        setSize(500, 410);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        TelaInicial app = new TelaInicial();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

