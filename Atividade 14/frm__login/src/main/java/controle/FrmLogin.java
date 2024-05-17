/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Container;
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
public class FrmLogin extends JFrame 
{
    Conexao con_cliente;
    
    JPasswordField tsen;
    JLabel rusu,rsen,rtit;
    JTextField tusu;
    JButton blogar;
    
    public FrmLogin()
    {
        con_cliente = new Conexao();
        con_cliente.conecta();
        
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
        
        tela.setBackground(new Color(16, 68, 135));
        ImageIcon icone= new ImageIcon("R.jpg");
        setIconImage(icone.getImage());
        
        rusu.setForeground(new Color(165, 200, 202));
        rsen.setForeground(new Color(165, 200, 202));
        rtit.setForeground(new Color(165, 200, 202));
        tsen.setForeground(new Color(25, 39, 78));
        tusu.setForeground(new Color(25, 39, 78));
        
        blogar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            String pesquisa = "select * from tblusuario where usuario = '" + tusu.getText() + "' AND senha = '" + tsen.getText() + "'";
            con_cliente.executaSQL(pesquisa);

            if (con_cliente.resultset.first()) { // Acesso ao form de cadastro
                FrmTelaCad mostra = new FrmTelaCad();
                mostra.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado!!!! (っ＾▿＾)💨", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                con_cliente.desconecta();
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
