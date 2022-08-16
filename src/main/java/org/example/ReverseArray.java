package org.example;

public class ReverseArray {
    public static void Reverse(int[] array){
        int[] resArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resArray[i] = array[array.length - 1 - i];
            System.out.print(resArray[i] + " ");
        }
    }
}
