/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicio2.com;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner machado = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double va1,va2;
        System.out.println("Digite o número ^_^");
       diferencia(va1,va2);
        
    }
    static String diferencia(double nu1, double nu2)
    {
        if (nu1>=nu2)
            return " O maior número é: " + nu1 +" , é o menor número é: "+ nu2;
        else
            if (nu2>nu1)
                return " O maior número é: " + nu2 +" , é o menor número é: "+ nu1;
        else
                return null;
                    
    }
}
