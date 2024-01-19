package mzaenalmustopa.logic02.soal04;

import mzaenalmustopa.utils.DeretAngka;

import java.util.Scanner;

public class Soal04A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scanner.nextInt();
        int[] fibo = DeretAngka.fibo(n, 2);
        int[][] array = new int[n][n];
        int nTengah = n/2;

        for (int i = 0; i < n; i++) {
            // ke samping
            array[0][i] = fibo[i];
            // ke samping yang ke 2
            array[n-1][i] = fibo[i];
            // atas ke bawah bagian kiri
            array[i][0] = fibo[0];
            // atas ke bawah bagian kanan
            array[i][n-1] = fibo[n-1];
            // ngisi bagian tengah kolom
            array[i][nTengah] = fibo[nTengah];
            // ngisi bagian tengah baris
            array[nTengah][i] = fibo[i];

        }

        PrintArray(array);
    }

    public static void PrintArray(int[][] array){
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
