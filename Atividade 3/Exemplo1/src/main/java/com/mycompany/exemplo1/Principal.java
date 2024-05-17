/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String[] args)
    {
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); //A variável a é a declaração de tipo int
        dobro(a);
    }
    static void digite() //vai executar as instruções do Digite um número
    {
        JOptionPane.showMessageDialog(null,"Digite um número");
    }
    static void dobro(int n) //foi criado para receber um numero inteiro,que vai calcular o dobro do número que o usuario digitou
    {
        int d = n*2;
        JOptionPane.showMessageDialog(null,"Dobro de "+n+" é "+d); //aqui vai mostrar o resultado 
    }
}
