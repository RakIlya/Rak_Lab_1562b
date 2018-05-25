/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

import java.util.Scanner;

/**
 *
 * @author 1081798
 */
public class Lab4_2 {

     public static int[][] enter(int[][] arr) {
            for (int[] arr1 : arr) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr1[j] + " ");
                }
                System.out.println();
            }
        return arr;
    }
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
                System.out.print("Введите a: ");
                a = sc.nextInt();
                System.out.print("Введите b: ");
                b = sc.nextInt();   
        System.out.print("Отрезок: [" + a + ";" + b + "]");
        System.out.println();
        int arr[][] = new int[5][10];
         for (int[] arr1 : arr) {
             for (int j = 0; j < arr1.length; j++) {
                 arr1[j] = (int)(method(a,b));
             }
         }
            enter(arr);
    }
    
}
