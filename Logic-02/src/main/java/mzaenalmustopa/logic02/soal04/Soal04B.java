package mzaenalmustopa.logic02.soal04;

import mzaenalmustopa.utils.DeretAngka;
import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal04B {
    public static void main(String[] args) {
        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];
        int[] fibo = DeretAngka.fibo(n, 2);
        int nTengah = n/2;

        for (int i = 0; i < n; i++) {
            // baris pertama di atas
            array[0][i] = fibo[i];
            // baris ke dua bawah
            array[n-1][i] = fibo[i];
            // baris ke tiga di tengah
            array[nTengah][i] = fibo[i];
            // kolom pertama atas ke bawah
            array[i][0] = fibo[0];
            // ngisi kolom tengah
            array[i][nTengah] = fibo[nTengah];
            // kolom  samping kanan
            array[i][n-1] = fibo[n-1];
        }

        PrintArray2D.printArray(array);
    }
}
