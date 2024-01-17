package mzaenalmustopa.logicdasar.logic01withscanner;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {

        // deret angka bilangan prima
        // n = 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n*3-4; i++) {
            if (apakahPrima(i)){
                System.out.print( i + "\t");
            }
        }

        scanner.close();
    }

    public static boolean apakahPrima(int n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if ( n % i == 0 ){
                return false;
            }
        }

        return true;
    }
}
