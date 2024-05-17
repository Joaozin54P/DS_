/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menus19_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JMenuBar barra;
    JMenu opcoes,fonte,cor,estilo;
    JMenuItem limpar,sair,azul,verde,vermelho,amarelo,normal,arial,italico,broadway,Algerian;
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    
    public Principal()
    {
        super("Exemplo de Menus executando acoes");
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opcoes");
        barra.add(opcoes);
        limpar = new JMenuItem("Limpar");
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        normal = new JMenuItem("normal");
        estilo = new JMenu("Estilo");
        arial = new JMenuItem("Padrão");
        italico = new JMenuItem("italico");
        broadway = new JMenuItem("Broadway");
        Algerian = new JMenuItem("Algerian ");
        sair = new JMenuItem("Sair");
        texto = new JTextArea(10,20);
        painel = new JPanel();
        
        tela.setBackground(new Color(135,206,250));
        barra.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        opcoes.setMnemonic(KeyEvent.VK_O);
        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        cor.setMnemonic(KeyEvent.VK_C);
        estilo.setMnemonic(KeyEvent.VK_E);
        
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);
        
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(normal);
        
        estilo.add(arial);
        estilo.add(italico);
        estilo.add(broadway);
        estilo.add(Algerian);
        
        fonte.add(cor);
        fonte.add(estilo);
        
        rolagem = new JScrollPane(texto);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel.add(rolagem);
        painel.setBounds(30,30,250,190);
        tela.add(painel);
        
        limpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setText("");
                texto.requestFocus();}});
        
        azul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setForeground(Color.blue);
                repaint();}});
        
        verde.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setForeground(Color.green);
                repaint();}});
        
        vermelho.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setForeground(Color.red);
                repaint();}});
        
        amarelo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setForeground(Color.yellow);
                repaint();}});
        
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setForeground(Color.black);
                repaint();}});
        
        arial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Arial", Font.BOLD,11));
                texto.repaint();
            }
        });
        
        italico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("italico", Font.ITALIC,11));
                texto.repaint();
            }
        });
        
        broadway.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Broadway", Font.PLAIN,11));
                texto.repaint();
            }
        });
        
        Algerian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Algerian", Font.PLAIN,11));
                texto.repaint();
            }
        });
        
        sair.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair mesmo?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                    System.exit(0);}});
        
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
