/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2zadanijapacsloj3;

import java.util.Scanner;

/**
 *
 * @author 1081798
 */
public class Laba2Zadanijapacsloj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new
                Scanner(System.in);
        int x=0; 
        int y=1;
        System.out.println ("Введите значения x и y");
        if(sc.hasNextInt()){
          x = sc.nextInt();  
          y = sc.nextInt();
         if ((x>0)&(y>0)){
             System.out.print("Точка лежит во 2 четверти");
         }
         else{
            if ((x<0)&(y>0)){
             System.out.print("Точка лежит в 1 четверти");
         }
            else{
                if ((x>0)&(y<0)){
             System.out.print("Точка лежит в 3 четверти");
         }
                else{
                    if ((x<0)&(y<0)){
             System.out.print("Точка лежит в 4 четверти");
         }
                }
                    
            }
         }
    }
  }  
    
}
