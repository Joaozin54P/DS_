/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maiornumero.com;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner input = new Scanner(System.in);
    
 public static void main(String[] args)
 {
     int m1,mn;
     
     System.out.println("Escreva um número aqui:");
     m1 = input.nextInt();
     System.out.println("Escreva outro n´mero aqui:");
     mn = input.nextInt();
     
     if (m1 > mn)
     {
         System.out.println("o número maior é: "+ m1);
         System.out.println("o número menor é: "+ mn);
     }
     else
     {
         if (mn > m1)
         {
             System.out.println("o número maior é: "+ mn);
             System.out.println("o número menor é: "+ m1);
         }
     }
 }
}
