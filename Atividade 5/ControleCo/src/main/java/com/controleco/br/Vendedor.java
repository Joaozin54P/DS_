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
public class Vendedor 
{
    private String nome;
    
    private double sala;
   
    public String getNome() 
    {
        return nome;
    }

   
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getSala() 
    {
        return sala;
    }

    public void setSala(double sala) 
    {
        this.sala = sala;
    }
    
    public double calculoComissao(double valorVendido)
    {
        double comi;
        
        setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
        setSala(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario: ")));
       
        comi = 0.1*valorVendido;
       
        return getSala()+comi;
    }
}
