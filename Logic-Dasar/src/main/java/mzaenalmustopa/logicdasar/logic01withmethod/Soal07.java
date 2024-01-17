package mzaenalmustopa.logicdasar.logic01withmethod;

import mzaenalmustopa.logicdasar.utils.DeretAngka;
import mzaenalmustopa.logicdasar.utils.InputData;
import mzaenalmustopa.logicdasar.utils.PrintArray;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        char[] array = DeretAngka.huruf(n);

        PrintArray.printArray(array);
    }
}
