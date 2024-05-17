/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String[] args)
    {
        int idade1,idade2;
        String nome1,nome2;
        
        nome1= JOptionPane.showInputDialog("Digite o nome da 1² pessoa: "); 
        idade1= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1²pessoa: "));
        //NOME1 E IDADE1 foram armazenadas as variáveis da primeira pessoa
        
        nome2= JOptionPane.showInputDialog("Digite o nome da 2² pessoa: ");
        idade2= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2²pessoa: "));
        //NOME2 E IDADE2 foram armazenadas as variáveis da primeira pessoa também
        
        String texto = PessoaMaisVelho(nome1,idade1,nome2,idade2); //É para saber quem é a pessoa mais velha,então a string informara o resultado
        
        JOptionPane.showMessageDialog(null,texto);
    } 
    static String PessoaMaisVelho(String n1,int id1,String n2,int id2)
    {
        if (id1> id2)
            return n1 + "é a pessoa mais velho";
        else
            if (id2 > id1)
                return n2 + "é a pessoa mais velha";
        else
                return n1 + "e" + n2 + "tem a mesma idade";
    }        
}
