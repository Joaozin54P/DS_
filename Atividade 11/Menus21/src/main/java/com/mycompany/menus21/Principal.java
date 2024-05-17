/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menus21;

import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author dti
 */
public class Principal extends JFrame
{
    JToolBar barra;
    JButton direita,esquerda,centralizar,recortar,copiar,colar;
    ImageIcon imagens[];
    
    public Principal()
    {
        super("Exemplo de Barra de Ferramentas");
        
        Container tela = getContentPane();
        tela.setLayout(null);
        
        tela.setBackground(new Color(135,206,250));
        ImageIcon icone= new ImageIcon("J.jpg");
        setIconImage(icone.getImage());
        
        String icones[]={"ima/direita.png","ima/esquerda.png",
            "ima/centro.png","ima/recortar.png",
            "ima/copiar.png","ima/colar.png"};
        
        imagens = new ImageIcon[6];
        
        for(int i=0;i<6;i++)
        {
            imagens[i] = new ImageIcon(icones[i]);
        }
        direita = new JButton(imagens[0]);
        esquerda = new JButton(imagens[1]);
        centralizar = new JButton(imagens[2]);
        recortar = new JButton(imagens[3]);
        copiar = new JButton(imagens[4]);
        colar = new JButton(imagens[5]);
        
        direita.setToolTipText("Direita(Ctrl+d)");
        esquerda.setToolTipText("Esquerda(Ctrl+e)");
        centralizar.setToolTipText("Centralizar(Ctrl+z)");
        recortar.setToolTipText("Recortar(Ctrl+x)");
        copiar.setToolTipText("Copiar(Ctrl+c)");
        colar.setToolTipText("Colar(Ctrl+v)");
        barra = new JToolBar("Barra de Ferramentas");
        
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);
        
        barra.setRollover(true);
        barra.add(direita);
        barra.add(esquerda);
        barra.add(centralizar);
        barra.addSeparator();
        barra.add(recortar);
        barra.add(copiar);
        barra.add(colar);
        barra.setBounds(1,1,260,50);
        
        tela.add(barra);
        setSize(320,340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[])
        {
            Principal app = new Principal();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
