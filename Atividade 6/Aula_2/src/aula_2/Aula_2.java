/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Aula_2 extends JFrame
{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    JLabel imagem;
    
    JTextField texto1,texto2,texto3,texto4;
    
    public Aula_2()
            {
    
    super("Exemplo com label");
        
        Container tela = getContentPane();
        
        setLayout(null);
        rotulo1 = new JLabel("Nome ");
        rotulo2 = new JLabel("Idade ");
        rotulo3 = new JLabel("Telefone ");
        rotulo4 = new JLabel("Celular ");
        
        texto1 = new JTextField(50);//Caixa de texto
        texto2 = new JTextField(3);//Caixa de texto
        texto3 = new JTextField(10);//Caixa de texto
        texto4 = new JTextField(10);//Caixa de texto
        
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,100,20);
        rotulo4.setBounds(50,140,80,20);
        
        texto1.setBounds(110,20,200,20);//Tamanho da linha
        texto2.setBounds(110,60,30,20);//Tamanho da linha
        texto3.setBounds(150,100,80,20);//Tamanho da linha
        texto4.setBounds(110,140,80,20);//Tamanho da linha
        
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
        rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        texto1.setFont(new Font("Arial",Font.BOLD,16));
        texto2.setFont(new Font("Arial",Font.BOLD,16));
        texto3.setFont(new Font("Arial",Font.BOLD,16));
        texto4.setFont(new Font("Arial",Font.BOLD,16));
        
         texto1. setHorizontalAlignment(JTextField.LEFT);
         texto2. setHorizontalAlignment(JTextField.LEFT);
         texto3. setHorizontalAlignment(JTextField.LEFT);
         texto4. setHorizontalAlignment(JTextField.LEFT);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        ImageIcon icone = new ImageIcon("I.jpg");//imagens
        imagem = new JLabel(icone);//imagens
        imagem.setBounds(0,0,259,194);//imagens
        tela.add(imagem); //imagens
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
}
     public static void main(String args[])
    {
        Aula_2 app = new Aula_2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
