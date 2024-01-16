package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {

        // menampilkan deret angka genap dan huruf abjad
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();
        String[] array = new String[n];

        int angka = 2;
        char huruf = 'A';

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(huruf);
                huruf += 2;
            } else {
                array[i] = String.valueOf(angka);
                angka += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
