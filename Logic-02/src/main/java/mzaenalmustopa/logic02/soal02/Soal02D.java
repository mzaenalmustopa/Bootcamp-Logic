package mzaenalmustopa.logic02.soal02;

import mzaenalmustopa.utils.DeretAngka;
import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal02D {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];
        int[] bilanganGanjil = DeretAngka.bilanganGanjil(n);

        for (int i = 0; i < n; i++) {
            array[0][i] = bilanganGanjil[i];
            array[n-1][i] = bilanganGanjil[i];
            array[i][0] = bilanganGanjil[0];
            array[i][n-1] = bilanganGanjil[n-1];
        }

        PrintArray2D.printArray(array);
    }
}
