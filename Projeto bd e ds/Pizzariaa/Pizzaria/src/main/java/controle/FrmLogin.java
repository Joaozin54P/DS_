/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class FrmLogin extends JFrame 
{
    Conexao con_pizzaria;
    
    JPasswordField tsen;
    JLabel rusu,rsen;
    JTextField tusu;
    JButton blogar;
    
    public FrmLogin()
    {
        con_pizzaria = new Conexao();
        con_pizzaria.conecta();
        
        setTitle(" *** Login de Acesso ***");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        rusu = new JLabel("Usuário: ");
        rsen = new JLabel("Senha: ");
        blogar = new JButton("Logar");
        blogar = new JButton("Cadastrar");
        tusu = new JTextField(10);
        tsen = new JPasswordField(10);
        blogar = new JButton("logar");
        
        rusu.setBounds(115,150,100,20);
        rsen.setBounds(125,195,100,20);
        tusu.setBounds(185,150,120,20);
        tsen.setBounds(185,195,120,20);
        blogar.setBounds(185,270,100,20);
        
        ImageIcon icone= new ImageIcon("R.jfif");
        setIconImage(icone.getImage());
        ImageIcon imagemFundo = new ImageIcon("inicio.jpg"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 450, 350);
        
        rusu.setForeground(new Color(209, 49, 61));
        rsen.setForeground(new Color(209, 49, 61));
        tsen.setForeground(new Color(209, 49, 61));
        tusu.setForeground(new Color(209, 49, 61));
        
         rusu.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
         rsen.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
         
        blogar.setMnemonic(KeyEvent.VK_ENTER);
        
       blogar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            String pesquisa = "select * from tblusuario where usuario = '" + tusu.getText() + "'&& senha = '" + tsen.getText() + "'";
            con_pizzaria.executaSQL(pesquisa);

            if (con_pizzaria.resultset.first()) { // Acesso ao form de cadastro
                FrmTelaCad mostra = new FrmTelaCad();
                mostra.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!!!! (っ＾▿＾)💨", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                con_pizzaria.desconecta();
                System.exit(0);
            }
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados: " + errosql.getMessage(), "Mensagem do programa", JOptionPane.ERROR_MESSAGE);
        }
    }
});

        tela.add(rusu);
        tela.add(rsen);
        tela.add(tusu);
        tela.add(tsen);
        tela.add(blogar);
        tela.add(labelFundo);
        
        setSize(450,350);
        setVisible(true);
        setLocationRelativeTo(null);
    }
     public static void main(String args[])
        {
            FrmLogin app = new FrmLogin();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}