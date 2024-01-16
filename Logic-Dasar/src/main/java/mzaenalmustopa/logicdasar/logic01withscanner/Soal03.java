package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {

        // deret angka genap
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N :");
        int n = scanner.nextInt();
        int angka = 0;

        for (int i = 0; i <= n; i++) {
            System.out.print(angka + "\t");
            angka += 2;
        }
    }
}
