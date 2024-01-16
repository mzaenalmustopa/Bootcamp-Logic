package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {

        // deret angka tribonacci
        // n = 9
        int value1 = 1;
        int value2 = 1;
        int value3 = 1;
        int value4;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(value1 + "\t");

            value4 = value1 + value2 + value3;
            value1 = value2;
            value2 = value3;
            value3 = value4;
        }
    }
}
