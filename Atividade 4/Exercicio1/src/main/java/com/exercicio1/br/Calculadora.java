/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicio1.br;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Calculadora
{
    private double n1,n2,r;
    
   
    public double getN1()
    {
        return n1;
    }
    
    public double getN2()
    {
        return n2;
    }
    
    public double getR()
    {
        return r;
    }
    
    public void setN1(double n1)
    {
        this.n1 = n1;
    }
    
    public void setN2(double n2)
    {
        this.n2 = n2;
    }
    
    public void setR(double r)
    {
        this.r = r;
    }
    
    public void soma()
    {
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o número: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: ")));
        this.setR(n1 + n2);
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+getR());
    }
    public void subtra(double a,double b)
    {
        this.setR(a-b);
        JOptionPane.showMessageDialog(null,"O valor da subtração é: "+getR());
    }
    public double dividir(double a,double b)
    {
        this.setR(a / b);
        return r;
    }
    public double multipli()
    {
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o número: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: ")));
        this.setR(n1 * n2);
        return r;
    }
}
