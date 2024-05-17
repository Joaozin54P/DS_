/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.decresente.com;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal 
{
    public Scanner machado = new Scanner(System.in);
    
    public static int decre,con;
    
    public void main (String[] args)
    {
        System.out.println("Escreva um número para fazer em forma decresente");
        decre = machado.nextInt();
        System.out.println("");
        
        for (con = decre; decre >=0; decre--)
        {
            System.out.println("" + decre);
        }
    }
}
