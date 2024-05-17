/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soma;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal 
{
    public Scanner machado = new Scanner(System.in);
    
     public static void main(String[] args) {

             int simp = 0, mpar = 1;

             for(int i=0;i<=30;++i){ 

                    if(i%2==0){

                           mpar *= i;

                    } else {

                           simp += i;

                    }

             }

             System.out.println("Os números ímpares de 0 a 30: "+ simp);

             System.out.println("Os números pares entre 0 e 30: "+ mpar);

      }
    

}

