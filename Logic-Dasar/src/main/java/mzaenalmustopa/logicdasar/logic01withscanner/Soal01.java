package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        // deret angka 1 - 9
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }
}
