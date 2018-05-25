/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_3;

/**
 *
 * @author 1081798
 */
public class Lab4_3 {

     public static int[] bubbleSort(int[]a) {
        System.out.println("После сортировки: ");
        for (int i = a.length-1; i>1; i--)
            for (int j = 0; j < i; j++)
                if (a[j] > a[j+1]) {
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        return null;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int[] arr = new int[10];
        System.out.println("Первоначальный вид");
        for(int i = 0; i < arr.length; i++){
            arr[i]=(int)(Math.random()*9);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);    
    }
    }
    

