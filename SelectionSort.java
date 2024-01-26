/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jav;

/**
 *
 * @author Lenovo
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int size;
        size = arr.length;
        System.out.println("Array elemenst:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < size-1; i++) {
            int smallest=i;
            for (int j = i+1; j < size; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest=j;
                }}
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
            
        }
        System.out.println("\nSelection Sort");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
