package mzaenalmustopa.logicdasar.logic01withmethod;

import mzaenalmustopa.logicdasar.utils.DeretAngka;
import mzaenalmustopa.logicdasar.utils.InputData;
import mzaenalmustopa.logicdasar.utils.PrintArray;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {

        int n = InputData.scanner(new Scanner(System.in));
        String[] array = DeretAngka.hurufDanAngka(n);

        PrintArray.printArray(array);
    }
}
