/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicio1.com;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner machado = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        
        double no1,no2;
        digite();
        no1 = lerNota();
        digite();
        no2 = lerNota();
        System.out.println(calcularMedia(no1,no2));
        
    }
    
    static void digite()
    {
        System.out.println("Digite a sua nota ^_^");
    }
    static double lerNota()
    {
        double no; 
        
        no = machado.nextDouble();
        
        System.out.println("A sua nota está sendo lida,aguade...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");

        
        return no;
    }
    static String calcularMedia(double no1,double no2)
    {
        double c = (no1+no2)/2;
        
      if (c>=7)
          return c + "Você está aprovado";
      else
          if (c<7)
              return c + "Você está reprovado";
      else
        return null;
    }
}
