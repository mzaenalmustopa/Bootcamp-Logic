package mzaenalmustopa.logicdasar.logic01withmethod;

import mzaenalmustopa.logicdasar.utils.DeretAngka;
import mzaenalmustopa.logicdasar.utils.InputData;
import mzaenalmustopa.logicdasar.utils.PrintArray;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        int[] array = DeretAngka.bilanganGenap(n);

        PrintArray.printArray(array);
    }
}
