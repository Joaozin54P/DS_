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
public class Percurso 
{
    private double kmPercorrida;
    
    private double valorCombus;
    
    private double valorPedagio;

    /**
     * @return the kmPercorrida
     */
    public double getKmPercorrida() {
        return kmPercorrida;
    }

    /**
     * @param kmPercorrida the kmPercorrida to set
     */
    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    /**
     * @return the valorCombus
     */
    public double getValorCombus() {
        return valorCombus;
    }

    /**
     * @param valorCombus the valorCombus to set
     */
    public void setValorCombus(double valorCombus) {
        this.valorCombus = valorCombus;
    }

    /**
     * @return the valorPedagio
     */
    public double getValorPedagio() {
        return valorPedagio;
    }

    /**
     * @param valorPedagio the valorPedagio to set
     */
    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    public void cadastrarPercurso()
    {
        setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite o Km que você percorreu: ")));
        setValorCombus(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustível: ")));
        setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedágio: ")));
    }
    
    public void listarPercurso()
    {
         JOptionPane.showMessageDialog(null,"O KM percorrido é: "+getKmPercorrida()+" o valor do combustível é: "+getValorCombus()+" o valor do pedágio é: "+getValorPedagio());
    }
}
