/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo1.br;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String args[])
    {
        Caixa cx1 = new Caixa(); //Instanciação do objeto cx1
        int op; //Declaração da variável de opções
        do
        {
            //Inicio do looping do-while
            //Apresentação eleitura do menu de opções
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " + "\n2 - Retirada \n3 - Consultar saldo \n0 - Sair "));
            
            switch (op) // Abertura da método entrar do objeto cx1
            {
                case 1:
                    cx1.entrar(); // Chamada ao método entrar do objeto cx1
                    break;
                case 2:
                    cx1.retirar(); //Chamada ao método retirar do objeto cx1
                    break;
                case 3:
                    //Apresentação do conteúdo do atributo saldo
                    JOptionPane.showMessageDialog(null,"Saldo atual: " + cx1.getSaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Finalizando o Programa! *_*");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida! :(");
            }
        }while(op != 0); //Repetirá as operações enquanto a opção for diferente de zero
    }
}
