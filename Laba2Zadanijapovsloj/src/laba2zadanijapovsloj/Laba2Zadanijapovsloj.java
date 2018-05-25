/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2zadanijapovsloj;

import java.util.Scanner;

/**
 *
 * @author 1081798
 */
public class Laba2Zadanijapovsloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new
                Scanner(System.in);
        int a=0; 
        int b=1;
        int c=2;
        int d=3;
        System.out.println ("Введите значения a, b, c и d");
        if(sc.hasNextInt()){
          a = sc.nextInt();  
          b = sc.nextInt();
          c = sc.nextInt();
          d = sc.nextInt();
         System.out.print(Math.min(Math.min(a, b), Math.min(c, d)));
    }
  }  
    
}
