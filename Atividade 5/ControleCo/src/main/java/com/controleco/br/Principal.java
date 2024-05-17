/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controleco.br;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal 
{
    public static void main(String args[])
    {
        Vendedor ved1 = new Vendedor();
        double valor;
  
         valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor vendido: "));
                    
         JOptionPane.showMessageDialog(null, "O seu salario é: "+ved1.calculoComissao(valor)+" e o seu nome é : "+ved1.getNome());
                 
                    
    }
}
