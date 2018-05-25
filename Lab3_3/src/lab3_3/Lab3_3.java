/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

/**
 *
 * @author 1081798
 */
public class Lab3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int i,n,a,j=0;
// Объявление переменной массива:
int[] data;
// Инициализация массива:
data=new int[16];
// Длина второго массива:
n=data.length;
// Объявление второго массива:
int[] nums=new int[n];
// Заполнение второго массива:
for(i=1;i<n;i++){ 
nums[i]=(int)(Math.random()*10);
System.out.print(" "+nums[i]);
a=nums[i]%2;
if((a==0)&(nums[i]!=0)){
    j=j+1;
}
}
System.out.println();
System.out.print(j);
    }
    
}
