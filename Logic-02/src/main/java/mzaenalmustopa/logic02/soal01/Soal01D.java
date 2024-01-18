package mzaenalmustopa.logic02.soal01;

import mzaenalmustopa.utils.DeretAngka;
import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal01D {
    public static void main(String[] args) {
        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];
        int[] bilanganAsli = DeretAngka.bilanganAsli(n);

        for (int i = 0; i < n; i++) {
            array[i][i] = bilanganAsli[i];
            array[n-i-1][i] = bilanganAsli[i];
        }

        PrintArray2D.printArray(array);
    }
}
