package mzaenalmustopa.logic02.soal01;

import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal01C {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1){
                    array[i][j] = angka;
                } else {
                    array[i][j] = 0;
                }
                angka++;
            }
        }
        PrintArray2D.printArray(array);
    }
}
