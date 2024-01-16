package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {

        // deret angka fibonacci
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();
        int value = 1;
        int value2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(value + "\t");

            int valueTotal = value + value2;
            value = value2;
            value2 = valueTotal;
        }
    }
}
