package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {

        // menampilkan huruf A - I
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nilai N : ");
        int n = scanner.nextInt();
        char huruf = 'A';
        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = huruf;
            huruf++;
        }

        System.out.print(Arrays.toString(array) + "\t");
    }
}
