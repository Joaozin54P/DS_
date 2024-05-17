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
public class Custos 
{
    private double totalPercurso;

    /**
     * @return the totalPercurso
     */
    public double getTotalPercurso() {
        return totalPercurso;
    }

    /**
     * @param totalPercurso the totalPercurso to set
     */
    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    public void calcularViagem(Percurso p)
    {
        double cv;
        cv=(p.getKmPercorrida()*p.getValorCombus())+p.getValorPedagio();
        
        JOptionPane.showMessageDialog(null,"O custo da viagem foi: "+cv);
    }
}
