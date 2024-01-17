package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {

        // menampilkan deret angka pangkat 3
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();
        int p = 3;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            double angka = (double) i + 0;
            double hasil = Math.pow(angka , p);
            array[i] = (int) hasil;
        }
        System.out.println(Arrays.toString(array) + "\t");
    }
}
