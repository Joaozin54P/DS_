/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JLabel rotulo,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
    JComboBox lista;
    JButton botao,botao2,botao3;
    JTextField texto,texto2,texto3;
    JPanel painel;
    String periodo[] = {"Selecione...","Matutino","Vespertino","Noturno"};
    ButtonGroup grupo,G,GG;
    JScrollPane painelrolagem;
    JRadioButton mas, fem, outro, serie1, serie2, serie3, etim, mtec, tecnico;
    JTextArea text;
    JScrollPane PainelRolagem;
    
    public Principal()
    {
        super("Atividade"); 
         
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo = new JLabel("Nome:");
        rotulo2 = new JLabel("Idade:");
        rotulo3 = new JLabel("Matricula:");
        rotulo4 = new JLabel("Informe os dados do seu curso:");
        rotulo5 = new JLabel("Restrições Médicas:");
        rotulo6 = new JLabel("Desenvolvido por: João Pedro 2°DS");
        botao = new JButton("Apresentar os dados");
        botao2 = new JButton("Limpar os dados");
        botao3 = new JButton("Sair");
        mas = new JRadioButton("Masculino");
        fem = new JRadioButton("Feminino");
        outro = new JRadioButton("Outros");
        serie1 = new JRadioButton("1° Serie");
        serie2 = new JRadioButton("2° Serie");
        serie3 = new JRadioButton("3° Serie");
        etim = new JRadioButton("Etim");
        mtec = new JRadioButton("Mtec");
        tecnico = new JRadioButton("Técnico");
        grupo = new ButtonGroup();
        G = new ButtonGroup();
        GG = new ButtonGroup();
        text = new JTextArea(10, 20);
        painelrolagem = new JScrollPane(lista);
        lista = new JComboBox(periodo);
        lista.setMaximumRowCount(4);
        
        texto = new JTextField(45);
        texto2 = new JTextField(3);
        texto3 = new JTextField(5);
       
       tela.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        grupo.add(mas);
        grupo.add(fem);
        grupo.add(outro);
        G.add(etim);
        G.add(mtec);
        G.add(tecnico);
        GG.add(serie1);
        GG.add(serie2);
        GG.add(serie3);
        
       rotulo.setBounds(10, 30, 110, 20);
       rotulo2.setBounds(10, 60, 110, 20);
       rotulo3.setBounds(10, 90, 110, 20);
       texto.setBounds(55, 30, 110, 20);
       texto2.setBounds(55, 60, 30, 20);
       texto3.setBounds(75, 90, 45, 20);
       mas.setBounds(10, 130, 110, 20);
       fem.setBounds(10, 150, 110, 20);
       outro.setBounds(10, 170, 110, 20);
       rotulo4.setBounds(10, 195, 200, 20);
       etim.setBounds(10, 225, 110, 20);
       mtec.setBounds(10, 245, 110, 20);
       tecnico.setBounds(10, 265, 110, 20);
       serie1.setBounds(120, 225, 110, 20);
       serie2.setBounds(120, 245, 110, 20);
       serie3.setBounds(120, 265, 110, 20);
       rotulo5.setBounds(10, 305, 190, 20);
       botao.setBounds(55, 550, 175, 30);
       botao2.setBounds(245, 550, 175, 30);
       botao3.setBounds(435, 550, 100, 30);

       JScrollPane painelRolagem = new JScrollPane(lista);
       
       painelRolagem.setBounds(250, 245, 110, 35);
       
       PainelRolagem = new JScrollPane(text);
       PainelRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       PainelRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       painel = new JPanel();
       painel.add(PainelRolagem);
       painel.setBounds(190, 305, 250, 189);
       
       mas.setBackground(new Color(135,206,250));
       fem.setBackground(new Color(135,206,250));
       outro.setBackground(new Color(135,206,250));
       etim.setBackground(new Color(135,206,250));
       mtec.setBackground(new Color(135,206,250));
       tecnico.setBackground(new Color(135,206,250));
       serie1.setBackground(new Color(135,206,250));
       serie2.setBackground(new Color(135,206,250));
       serie3.setBackground(new Color(135,206,250));
       
       rotulo.setForeground(Color.WHITE);
       rotulo2.setForeground(Color.WHITE);
       rotulo3.setForeground(Color.WHITE);
       rotulo4.setForeground(Color.WHITE);
       rotulo5.setForeground(Color.WHITE);
       rotulo6.setForeground(Color.WHITE);
       
       botao.setMnemonic(KeyEvent.VK_L);
       botao2.setMnemonic(KeyEvent.VK_F);
       botao3.setMnemonic(KeyEvent.VK_G);
       
       botao.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String cursoe="",seriee="";
                    
                    String nomee=texto.getText();
                    String idadee=texto2.getText();
                    String matrice=texto3.getText();
                    String restre=text.getText();
                    
                    String perioe = lista.getSelectedItem().toString();
                    
                    if(serie1.isSelected())
                        seriee=serie1.getName();
                    else
                        if(serie2.isSelected())
                            seriee=serie2.getText();
                    else
                            seriee=serie3.getText();
                    
                    if(etim.isSelected())
                        cursoe= etim.getText();
                    else
                        if(mtec.isSelected())
                            cursoe= mtec.getText();
                    else
                            cursoe= tecnico.getText();
                    
                    frmMostrar mostra = new frmMostrar(nomee,idadee,matrice,restre,perioe,cursoe,seriee);
                    
                    mostra.setVisible(true);
                    dispose();
                }});
       
       botao2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo limpar seus dados?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                        texto.setText("");
                        texto2.setText("");
                        texto3.setText("");
                        text.setText("");
                        lista.setSelectedIndex(0);
                        grupo.clearSelection();
                        G.clearSelection();
                        GG.clearSelection();
                }});
       
       botao3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    int opcao;
                    Object[] botoes = {"Sim","Não"};
                    opcao = JOptionPane.showOptionDialog(null,"Deseja sair mesmo?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                    
                    if (opcao==JOptionPane.YES_OPTION)
                    System.exit(0);}});
        
        tela.add(rotulo);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(mas);
        tela.add(fem);
        tela.add(outro);
        tela.add(rotulo4);
        tela.add(etim);
        tela.add(mtec);
        tela.add(tecnico);
        tela.add(serie1);
        tela.add(serie2);
        tela.add(serie3);
        tela.add(painelRolagem);
        tela.add(painel);
        tela.add(rotulo5);
        tela.add(botao);
        tela.add(botao2);
        tela.add(botao3);
        setSize(900, 680);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}