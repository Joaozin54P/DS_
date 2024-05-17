/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicio3.br;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner machado = new Scanner(System.in);
    
    public static double h,peso;
    
    public static void main(String[] args)
    {
        System.out.println("Olá! Usuario");
        
        System.out.println("Qual é a sua altura?");
        
        h = machado.nextFloat();
        
        System.out.println("Qual é o seu peso?");
        
        peso = machado.nextFloat();
    }
    static String calcularPesoIdeal(double ho,double mu)
    {
        double s = (72.7*h)-58 + (62.1*h)-44.7;
                
        
        if(s==s)
            return s + "Você é Homem e a sua altura é:"+h;
        else
        {
            if(s==s)
            return s + "Você é Mulher e a sua altura é:"+h;
        }
        
        return null;
        
    }
}
