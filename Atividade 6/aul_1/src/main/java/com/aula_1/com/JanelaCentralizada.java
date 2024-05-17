/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula_1.com;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dti
 */
public class JanelaCentralizada extends JFrame
{
    public JanelaCentralizada()
    {
        super("Janela Centralizada");
        Container tela = getContentPane();
        tela.setBackground(Color.blue);
        ImageIcon icone = new ImageIcon("JJ.jpg");
        setIconImage(icone.getImage());
        setSize(500,100);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[])
    {
        JanelaCentralizada app = new JanelaCentralizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}