package mzaenalmustopa.logic02.soal05;

import java.util.Scanner;

public class Soal05B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int[] fibo = Soal05B.Fibonacci(n , 2);

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
        Soal05B.cetakArray(array);
    }

    public static int[] Fibonacci(int n, int t){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < t){
                array[i] = 1;
                continue;
            }

            int result = 0;
            for (int j = 0; j <= t; j++) {
                result = result + array[i - j];
            }
            array[i] = result;
        }

        return array;
    }

    public static void cetakArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
