/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jav;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};
        int size;
        size = arr.length;
        System.out.println("Array elemenst:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                } 
            }
        }
        System.out.println("\nBubble Sort:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
