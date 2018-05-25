/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 1081798
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new
                Scanner(System.in);
        int m=0; 
        int n=1;
        System.out.println ("Введите значения m и n");
        if(sc.hasNextInt()){
          m = sc.nextInt();  
          n = sc.nextInt();
        for(int i=1; i<=m; i++){
          for(int j=1; j<=n; j++){
              System.out.print("8");
          }
          System.out.println();
        }
        }
    }
    
}
