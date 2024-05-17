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
public class Login extends JFrame 
{
    Conexao con_petshop;
    
    JPasswordField tsen;
    JLabel rusu,rsen,rtit;
    JTextField tusu;
    JButton blogar;
    
    public Login()
    {
        con_petshop = new Conexao();
        con_petshop.conecta();
        
        setTitle(" *** Login de Acesso ***");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        rtit = new JLabel("Acesso ao Sistema ");
        rusu = new JLabel("Usuário: ");
        rsen = new JLabel("Senha: ");
        blogar = new JButton("Logar");
        blogar = new JButton("Cadastrar");
        tusu = new JTextField(10);
        tsen = new JPasswordField(10);
        blogar = new JButton("logar");
        
        rtit.setBounds(150,35,180,35);
        rusu.setBounds(125,150,100,20);
        rsen.setBounds(125,195,100,20);
        tusu.setBounds(185,150,120,20);
        tsen.setBounds(185,195,120,20);
        blogar.setBounds(185,270,100,20);
        
        ImageIcon imagemFundo = new ImageIcon("home.jpg"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(450, 350, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 450, 350);
        
        ImageIcon icone= new ImageIcon("icon.jpg");
        setIconImage(icone.getImage());
        
        Color corLabels = new Color(0, 0, 0);
        rusu.setForeground(corLabels);
        rsen.setForeground(corLabels);
        rtit.setForeground(corLabels);
        tsen.setForeground(corLabels);
        tusu.setForeground(corLabels);
        
        Font fonteLabels = new Font("Bernard MT Condensed",Font.PLAIN,14);
        rusu.setFont(fonteLabels);
        rsen.setFont(fonteLabels);
        rtit.setFont(fonteLabels);
        tsen.setFont(fonteLabels);
        tusu.setFont(fonteLabels);
        
        blogar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            String pesquisa = "select * from llogin where usuario = '" + tusu.getText() + "' AND senha = '" + tsen.getText() + "'";
            con_petshop.executaSQL(pesquisa);

            if (con_petshop.resultset.first()) { // Acesso ao form de cadastro
                TelaInicial mostra = new TelaInicial();
                mostra.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado!!!! (っ＾▿＾)💨", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                con_petshop.desconecta();
                System.exit(0);
            }
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Erro ao consultar o banco de dados: " + errosql.getMessage(), "Mensagem do programa", JOptionPane.ERROR_MESSAGE);
        }
    }
});

        tela.add(rtit);
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
            Login app = new Login();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
