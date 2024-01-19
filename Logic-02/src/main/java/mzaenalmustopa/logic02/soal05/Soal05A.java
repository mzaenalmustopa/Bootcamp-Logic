package mzaenalmustopa.logic02.soal05;

import mzaenalmustopa.utils.DeretAngka;
import mzaenalmustopa.utils.InputData;
import mzaenalmustopa.utils.PrintArray2D;

import java.util.Scanner;

public class Soal05A {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        int[][] array = new int[n][n];
        int[] fibo = DeretAngka.fibo(n,3);

        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {
                if ( i + j <= n - 1 && i >= j){
                    array[i][j] = fibo[index];
                }else if (i + j >= n - 1 &&  i <= j){
                    array[i][j] = fibo[index];
                }
                index++;
            }
        }

        PrintArray2D.printArray(array);
    }
}
