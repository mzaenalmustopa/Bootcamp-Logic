package mzaenalmustopa.logic02.soal01;

import java.util.Scanner;

public class Soal01A {
    public static void main(String[] args) {

        // tidak memakai array dua dimensi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1){
                    System.out.print(angka + "\t");
                }else {
                    System.out.print("\t");
                }
                // angka += 2;
                angka = angka + 1;
            }

            System.out.println();
        }
    }
}
