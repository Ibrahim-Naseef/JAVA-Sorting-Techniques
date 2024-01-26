/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jav;

/**
 *
 * @author Lenovo
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};
        int size;
        size = arr.length;
        System.out.println("Array elemenst:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 1; i < size; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current< arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("\nInsertion Sort");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
 
       

    

