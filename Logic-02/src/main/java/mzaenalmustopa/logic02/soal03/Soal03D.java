package mzaenalmustopa.logic02.soal03;

import mzaenalmustopa.utils.DeretAngka;
import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal03D {
    public static void main(String[] args) {
        int n = InputData.scanner(new Scanner(System.in));
        int[] genap = DeretAngka.bilanganGenap(n);
        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            // atas kesamping
            array[0][i] = String.valueOf(genap[i]);
            // bawah kesamping
            array[n-1][i] = String.valueOf(genap[i]);
            //atas ke bawah
            array[i][0] = String.valueOf(genap[0]);
            // kanan ke bawah
            array[i][n - 1] = String.valueOf(genap[n - 1]);
            array[i][i] = String.valueOf(genap[i]);
            array[n - i - 1][i] = String.valueOf(genap[i]);
        }

        PrintArray2D.printArray(array);
    }
}
