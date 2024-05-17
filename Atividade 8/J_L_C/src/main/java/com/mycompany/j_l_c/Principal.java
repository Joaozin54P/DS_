/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j_l_c;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JComboBox listas,lista3;
    JList lista;
    String cidades[] = {"Rio de Janeiro","São Paulo","Minas Gerais","Espírito Santo","Bahia","Pernabuco","Rio Gande do Sul","Acre"};
    JButton exibir,e2,e3;
    JLabel rotulo,rotulo2,rotulo3;
    
    public Principal()
    {
        super("Exemplos"); 
        
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        e2 = new JButton("Exibir");
        e3 = new JButton("Exibir");
        rotulo = new JLabel("");
        rotulo2 = new JLabel("");
        rotulo3 = new JLabel("");
        lista = new JList(cidades);
        listas = new JComboBox(cidades);
        lista3 = new JComboBox(cidades);
        lista3.setEditable(true);
        
        listas.setMaximumRowCount(5);
        lista.setVisibleRowCount(5);
        lista3.setMaximumRowCount(5);
        
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        painelRolagem.setBounds(40, 50, 150, 100);
        exibir.setBounds(50, 195, 100, 30);
        e2.setBounds(240, 195, 100, 30);
        rotulo.setBounds(40, 150, 200, 30);
        lista.setBounds(50,50,150,30);
        listas.setBounds(240,50,150,30);
        rotulo2.setBounds(240, 150, 200, 30);
        lista3.setBounds(450,50,150,30);
        rotulo3.setBounds(440, 150, 200, 30);
        e3.setBounds(450, 195, 100, 30);
        
        
        lista.setForeground(Color.red);
        rotulo.setForeground(Color.blue);
        lista.setBackground(Color.black);
        listas.setForeground(Color.red);
        listas.setBackground(Color.black);
         rotulo2.setForeground(Color.blue);
         lista3.setForeground(Color.red);
        lista3.setBackground(Color.black);
         rotulo3.setForeground(Color.blue);

        lista.setFont(new Font("Broadway",Font.BOLD,14));
        listas.setFont(new Font("Broadway",Font.BOLD,14));
        rotulo2.setFont(new Font("Algerian",Font.BOLD,14));
        rotulo.setFont(new Font("Algerian",Font.BOLD,14));
        lista3.setFont(new Font("Broadway",Font.BOLD,14));
        rotulo3.setFont(new Font("Algerian",Font.BOLD,14));
        
        ImageIcon icone= new ImageIcon("g.jpg");
        setIconImage(icone.getImage());
        
        tela.setBackground(new Color(135,206,235));
        
        exibir.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Object selecionados[] = lista.getSelectedValues();
                    String resultados = "Valores selecionados:\n";
                    for(int i=0;i<selecionados.length;i++)
                        resultados += selecionados[i].toString()+"\n";
                    JOptionPane.showMessageDialog(null,resultados);
                   rotulo.setText("O estado é: "+lista.getSelectedValue().toString());
                }
            }
            );
        e2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   rotulo2.setText("O estado é: "+listas.getSelectedItem().toString());
                }
            }
            );
        e3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   rotulo3.setText("O estado é: "+lista3.getSelectedItem().toString());
                }
            }
            );
        
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        tela.add(listas);
        tela.add(rotulo2);
        tela.add(e2);
        tela.add(lista3);
        tela.add(rotulo3);
        tela.add(e3);
        setSize(500,350);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
