package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        // deret angka ganjil
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();
        int angka = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(angka + "\t");
            angka += 2;
        }
    }
}
