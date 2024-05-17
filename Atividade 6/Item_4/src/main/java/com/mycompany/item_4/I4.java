/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.item_4;

import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
public class I4 extends JFrame
{
    JLabel rotulocep,rotulotel,rotulocpf,rotulodata;
    JFormattedTextField cep,tel,cpf,data;
    MaskFormatter mascaracep,mascaratel,mascaracpf,mascaradata;
    
    public I4()
    {
        super(" Exemplo com JFormattedTextField");
        
        Container tela = getContentPane();
        
        setLayout(null);
        rotulocep = new JLabel("CEP");
        rotulotel = new JLabel("Telefone");
        rotulocpf = new JLabel("CPF");
        rotulodata = new JLabel("Data");
        
        rotulocep.setBounds(50,40,100,20);
        rotulotel.setBounds(50,80,100,20);
        rotulocpf.setBounds(50,120,100,20);
        rotulodata.setBounds(50,160,100,20);
        
        try
        {
            mascaracep = new MaskFormatter("######-###");
            mascaratel = new MaskFormatter("(##)####-####");
            mascaracpf = new MaskFormatter("#########-##");
            mascaradata = new MaskFormatter("##/##/####");
            
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        cep.setBounds(150, 40, 100, 20);
        tel.setBounds(150, 80, 100, 20);
        cpf.setBounds(150, 120, 100, 20);
        data.setBounds(150, 160, 100, 20);
        
        cep.setForeground(Color.blue);
        tel.setForeground(Color.red);
        cpf.setForeground(Color.green);
        data.setForeground(new Color(255,128,128));
        
        cep.setBackground(Color.yellow);
        tel.setBackground(Color.yellow);
        cpf.setBackground(new Color(255,255,204));
        data.setBackground(new Color(255,255,204));
        
        cep.setFont(new Font("Times New Roman",Font.BOLD,14));
        tel.setFont(new Font("Comic Sans MS",Font.PLAIN,14));
        cpf.setFont(new Font("Arial",Font.BOLD,14));
        data.setFont(new Font("Tahoma",Font.BOLD,14));
        
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
     public static void main(String args[])
    {
        I4 app = new I4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
