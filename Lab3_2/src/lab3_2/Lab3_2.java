/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;

/**
 *
 * @author 1081798
 */
public class Lab3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,a;
// Объявление переменной массива:
int[] data;
// Инициализация массива:
data=new int[101];
// Длина второго массива:
n=data.length;
// Объявление второго массива:
int[] nums=new int[n];
// Заполнение второго массива:
for(i=1;i<n;i++){    
a=i%2;
if(a==1){
nums[i]=i;
System.out.print(" "+nums[i]);
}}
System.out.println();
int j=100;
for(i=1;i<n;i++){ 
j=j-1;    
a=j%2;
if(a==1){
nums[i]=j;
System.out.print(" "+nums[i]);
}}
    }
    
}
