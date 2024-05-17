/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner machado = new Scanner(System.in);
    
    public static double base,altu,hipo;
    
    public static void main(String[] args)
    {
       
        System.out.println("Digite o número da base ^_^ ");
	
        base = machado.nextDouble();
	
        System.out.println("Digite o tamanho da altura: ");
	
        altu = machado.nextDouble();
	
        System.out.println("A hipotenusa é: "+ hipo);
    }
    public static double hipotenusa(double ci,double ba)
    {
        double hipo; 
        hipo= Math.sqrt(ci*ci + ba*ba);
        
        return hipo;
    }
}
