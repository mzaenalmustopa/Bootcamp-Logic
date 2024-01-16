package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {

        // menampilkan deret angka perkalian 3
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();

        int angka = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(angka + "\t");
            angka *= 3;
        }
    }
}
