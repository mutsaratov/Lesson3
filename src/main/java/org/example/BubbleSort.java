package org.example;

public class BubbleSort {
    public static void Sort(int[] array){
        int num1 = array[0];
        int num2;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    num2 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
