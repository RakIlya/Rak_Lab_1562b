/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_5;

/**
 *
 * @author 1081798
 */
public class Lab3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Индексные переменные и размерность массива:
int i,j,n=8,k=5,a;
// Создание двухмерного массива:
int[][] nums=new int[n][k];
// Вложенные инструкции цикла:
for(i=0;i<n;i++){
for(j=0;j<k;j++){
// Заполнение элементов массива:
nums[i][j]=((int)(Math.random()*11-5)); 
// Вывод значений в одну строку:
System.out.print(nums[i][j]+" ");
}
// Переход на новую строку
System.out.println();
}
    }
    
}
