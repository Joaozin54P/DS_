/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
class sobrenos extends JFrame{
    JButton voltar;
    
    public sobrenos(){
    
        Container tela = getContentPane();
        tela.setLayout(null);
        setTitle("-- Sobre nós --");
        
        voltar = new JButton("Voltar");
        voltar.setBounds(240, 450, 80, 30);
        
    ImageIcon imagemFundo = new ImageIcon("sobre.png"); // Substitua pelo caminho da sua imagem
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(650, 550, Image.SCALE_SMOOTH);
        ImageIcon imagemFundoRedimensionada = new ImageIcon(imagemRedimensionada);

    JLabel labelFundo = new JLabel(imagemFundoRedimensionada);
    labelFundo.setBounds(0, 0, 650, 550);
    
    ImageIcon icone= new ImageIcon("R.jfif");
        setIconImage(icone.getImage());
    
    voltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
            int opcao;
            Object[] botoes = {"Sim", "Não"};
            opcao = JOptionPane.showOptionDialog(null, "Deseja sair?", "Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

            if (opcao == JOptionPane.YES_OPTION) {
            FrmTelaCad telaAnterior = new FrmTelaCad();
            telaAnterior.setVisible(true);
            dispose();
        }
    }
});
    
     tela.add(labelFundo);
     tela.add(voltar);
        
        setSize(650,550);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            sobrenos app = new sobrenos();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
