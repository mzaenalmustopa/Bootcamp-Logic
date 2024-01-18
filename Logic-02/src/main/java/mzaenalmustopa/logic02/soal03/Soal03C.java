package mzaenalmustopa.logic02.soal03;

import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal03C {
    public static void main(String[] args) {
        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int angka = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n -1 || i == j || i + j == n - 1){
                    System.out.print(angka + "\t");
                } else {
                    System.out.print("\t");
                }
                angka += 2;
                // angka = angka + 2;
            }
            System.out.println();
        }
        PrintArray2D.printArray(array);
    }

}
