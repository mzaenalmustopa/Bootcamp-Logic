package mzaenalmustopa.utils;

public class DeretAngka {
    public static int[] bilanganAsli(int n){
        int[] bilanganAsli = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganAsli[i] = i + 1;
        }

        return bilanganAsli;
    }
    
    public static int[] bilanganGanjil(int n){
        int[] bilanganGanjil = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganGanjil[i] =  i * 2 + 1;
        }

        return bilanganGanjil;
    }

    public static int[] bilanganGenap(int n){
        int[] bilanganGenap = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganGenap[i] = i * 2;
        }

        return bilanganGenap;
    }

    public static int[] fibo(int n, int o){
        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < o){
                fibo[i] = 1;
                continue;
            }

            int result = 0;
            for (int j = 1; j <= o; j++) {
                result = result + fibo[i - j];
            }
            fibo[i] = result;
        }

        return fibo;
    }

    public static int[] bilanganPrima(int n){
        int [] prima = new int[n];
        int index = 0;
        int angka = 2;

        // while akan melakukan perulangan selama kondisinya true
        while (index < n ){
            if (isiPrima(angka)){
                prima[index] = angka;
                index++;
            }
            angka++;
        }

        return prima;
    }

    public static boolean isiPrima(int angka){
        if (angka < 2 ){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka) ; i++) {
            if (angka % i == 0){
                return false;
            }
        }

        return true;
    }

    public static char[] huruf(int n){
        char karakter = 'A';
        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = karakter;
            karakter++;
        }

        return array;
    }

    public static String[] hurufDanAngka(int n){
        String[] array = new String[n];
        int angka = 2;
        char huruf = 'A';
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(huruf);
                huruf += 2;
            }else {
                array[i] = String.valueOf(angka);
                angka += 2;
            }
        }

        return array;
    }

    public static int[] kaliTiga(int n, int a){
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            if (i ==0){
                array[i] = 1;
            }else {
                array[i] = array[i-1] * a;
            }
        }

        return array;
    }

    public static int[] pangkat(int n, int p){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            double angka =(double) i + 0;
            double hasil = Math.pow(angka,(double) p);
            array[i] = (int) hasil;
        }

        return array;
    }
}
