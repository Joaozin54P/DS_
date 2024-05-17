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
public class Caixa 
{
    //Atributo
    private double saldo;
    
    //Construtores
    //Inicializando o atributo zerado
    public Caixa()
    {
        this(0);
    }
    
    //Inicializando o atributo com o parâmetro
    public Caixa(double saldo)
    {
        this.saldo = saldo;
    }
    
    //Getter e setter
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    //Métodos especificos da classe
    public void entrar()
    {
        //Lê um valor, converte de String para double e atribui a variável valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
        /* Somma o conteúdo do atributo saldo com o a variável valor e passa o resultado por parametro para o método setSaldo() */
        this.setSaldo(this.saldo + valor);
    }
    public void retirar()
    {
        // LÊ um valor,converte de String para double e atribui a variável valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: "));
        /* Subtrai op conteúdo do atribui saldo com o a variável valor e passa o resultado por parametro para o método setSaldo() */
        this.setSaldo(this.saldo - valor);
    }
}
