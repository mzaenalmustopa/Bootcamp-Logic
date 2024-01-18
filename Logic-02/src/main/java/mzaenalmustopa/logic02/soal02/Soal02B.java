package mzaenalmustopa.logic02.soal02;

import java.util.Scanner;

public class Soal02B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print(angka + "\t");
                } else {
                    System.out.print("\t");
                }
                angka = angka + 2;
            }
            System.out.println();
        }
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
