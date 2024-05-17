/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String[] args)
    {
        int t;
        String p; //a String é a declaração da vari´vel t e p
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t=tamanho(p);
        JOptionPane.showMessageDialog(null,p+ " possui "+t+ " caracteres");
    }
    static void digite()
    {
        JOptionPane.showMessageDialog(null,"Digite uma pálavra");
    }
    static int tamanho(String x) //É responsável para calcular a quantidade de caracteres tem uma palavr 
    {
        return x.length(); //quando chega no RETURN ele encerra imediatamente,e o valor que foi informado retorna o valor
    }
}
