/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicio1.br;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Principal 
{
    public static void main(String args[])
    {
        Calculadora cal = new Calculadora();
        double a,b;
        int op;
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - soma "+"\n2 - Subtrair \n3 - Dividir \n4 - Multiplicação \n0 - Sair"));
            
            switch (op)
            {
                case 1:
                    cal.soma();
                    break;
                case 2:
                   a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número:"));
                   b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número:"));
                   cal.subtra(a,b);
                    break;
                case 3:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número:"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número:"));
                    JOptionPane.showMessageDialog(null,"O valor da divisão é: "+cal.dividir(a,b));
                    break;
                case 4:
                    
                    JOptionPane.showMessageDialog(null,"O valor da multiplicação é: "+cal.multipli());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Obrigado por usar a caculadora ^_^ ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Tchau!! Usuário :(");
            }
        }while (op !=0);
    }
}
