package org.example;

import java.util.Random;

public class Spiral {
    public static void Build(int size){

        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

            }
        }
        System.out.println();

        int line = 0;
        int column = 0;
        int c = 0;
        int k = 1;
        int a = 1;

        while (a <= size*size) {
            for (int j = c; j < size - c; j++) {
                if (k > size){
                    k = 1;
                }
                matrix[c][j] = a;
                k++;
                a++;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            for (int j = c + 1; j < size - c; j++) {
                if (k > size) {
                    k = 1;
                }
                matrix[j][size - 1 - c] = a;
                a++;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            for (int j = size - 2 - c; j >= c; j--) {
                if (k > size){
                    k = 1;
                }
                matrix[size - 1 - c][j] = a;
                a++;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            for (int j = size - 2 - c; j > c ; j--) {
                if (k > size){
                    k = 1;
                }
                matrix[j][c] = a;
                a++;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            c++;
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
