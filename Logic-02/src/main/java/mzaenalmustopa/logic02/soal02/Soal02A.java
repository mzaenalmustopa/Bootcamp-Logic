package mzaenalmustopa.logic02.soal02;

import java.util.Scanner;

public class Soal02A {
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
}
