package org.example;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

public class BinarySearch {
    public static void Search(int num,int[] array){

        int leftBorder = 0;
        int rightBorder = array.length - 1;
        int middle;

        do {
            middle = leftBorder + (rightBorder - leftBorder)/2;
            if (array[middle] == num){
                System.out.println("Chislo est' v massive");
                break;
            } else if (middle > num) {
                rightBorder = middle - 1;
            } else if (middle < num){
                leftBorder = middle + 1;
            } else {
                System.out.println("Chisla net v massive");
                break;
            }
        } while (array[middle] != num);

    }
}
