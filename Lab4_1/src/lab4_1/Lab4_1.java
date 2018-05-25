/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

import java.util.Scanner;

/**
 *
 * @author 1081798
 */
public class Lab4_1 {


 public static int method(int a, int b){
        int c, temp;
        if (a>b) {
            temp = b;
            b = a;
            a = temp;
        }
        c = (int)(Math.random()*((b+1)-a)+a);
        return c;
    } 

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
  int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а: ");
        a = sc.nextInt();
        System.out.println("Введите b: ");
        b = sc.nextInt();
        int arr[] = new int[20];
        for(int i=0; i<arr.length; i++) {
            arr[i]=(int)(method(a,b)); 
            System.out.print(arr[i]+" ");
        }     
    }
}


