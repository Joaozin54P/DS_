/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String[] args)
    {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        
        if (RestoPorDia(num) == 0) //retorna com um valor inteiro entre 0 ou 1 e será comparado com om valor zero
            JOptionPane.showMessageDialog(null,"O número é par. \n");
        else
            JOptionPane.showMessageDialog(null,"O número é impar. \n");
    }
    static int RestoPorDia(int a) //Foi passado num parâmetro
    {
        return a % 2;
    }
}
