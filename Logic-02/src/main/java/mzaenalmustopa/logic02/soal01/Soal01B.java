package mzaenalmustopa.logic02.soal01;

import java.util.Scanner;

public class Soal01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scanner.nextInt();
        int[][] arrray = new int[n][n];


        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1){
                    arrray[i][j] = angka;
                }else {
                    arrray[i][j] = 0;
                }
                angka++;
            }
        }
        printArray(arrray);
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }

                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
