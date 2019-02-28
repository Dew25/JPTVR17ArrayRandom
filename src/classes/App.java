/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;

/**
 *
 * @author Melnikov
 */
public class App {

    public void run() {
        Random r = new Random();
        int[] myArray = new int[20];
        System.out.println("Созданный массив:");
        int n;
        for(int i = 0; i < myArray.length; i++){
            do{
                n = r.nextInt(100);
                if(n%2==0){
                   break; 
                }
            }while(true);
            myArray[i] = n;
            System.out.printf("%-4d",n);
            
        }
        System.out.println("");
        int max=myArray[0];
        int min=myArray[0];
        int sum=myArray[0];
        for(int i=1;i<myArray.length;i++){
            
           if(myArray[i] > max){
               max = myArray[i];
           }
           if(myArray[i] < min){
               min = myArray[i];
           }
           sum += myArray[i];
        }
        sum = sum - min - max;
        int result = sum/18;
        System.out.println("Среденее арифметическое элементов массива ");
        System.out.println("без учета минимального и максимального элемента равна "+result);
    }
    
}
