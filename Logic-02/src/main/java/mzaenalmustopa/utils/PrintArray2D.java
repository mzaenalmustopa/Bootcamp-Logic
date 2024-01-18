package mzaenalmustopa.utils;

public class PrintArray2D {
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }

                System.out.print(array[i][j]+ "\t");
            }

            System.out.print("\n");
        }
    }

    public static void printArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null){
                    System.out.print("\t");
                    continue;
                }

                System.out.print(array[i][j]+ "\t");
            }

            System.out.print("\n");
        }
    }

    public static void printArray(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }

                System.out.print(array[i][j]+ "\t");
            }

            System.out.print("\n");
        }
    }
}
