/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.custoviaagem.br;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static void main(String args[])
     {
         Percurso per = new Percurso();
         Custos cus =new Custos();
         int op;
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastrar a viagem "+"\n2 - Dados da viagem \n3 - Custo da viagem  \n0 - Sair"));
            
            switch (op)
            {
                case 1:
                  per.cadastrarPercurso();
                    break;
                case 2:
                    per.listarPercurso();
                    break;
                case 3:
                    cus.calcularViagem(per);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Obrigado! Tchau! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Comando inválido -_-");
                    break;
            }
        }while (op !=0);
     }
}
