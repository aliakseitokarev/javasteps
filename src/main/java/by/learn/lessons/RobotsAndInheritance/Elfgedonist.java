package by.learn.lessons.RobotsAndInheritance;

import java.util.Arrays;

/**
 * Created by user on 27.03.2018.
 */
public class Elfgedonist {
    public static void main(String[] args) {
        int[] array = {8, 215, 12, 17, 13, 200};
        /*
        sortBarrels(array);
        findMinMax(array);
        */
        int[][] matrix = new int[5][5];
        fillDiags(matrix);
        int[][] matrix2 = new int[7][7];
        fillDiags2(matrix2);

    }
    public static void sortBarrels(int[] array) {
        int wineCount = 0;
        for (int i : array) {
            if (i % 2 == 0) wineCount++;
        }
        int[] wineArray = new int[wineCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                wineArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray));
    }

    public static void findMinMax(int[] array){
        int min = array[0], max = array[0];
        for (int i : array) {
            if (i < min) min =i;
            if (i > max) max=i;
        }
        System.out.println("Difference: " + (max - min));
    }

    public static void fillDiags(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) array[i][j] = 1;
                if (i + j == array.length -1) array[i][j] = 1;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void fillDiags2(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length -1 - i] = 1;
        }
        printArray(array);
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void snakeMatrix(int[][] array){
        int count = 1;
        int d = array.length;
        int m;
        if (d%2 == 0) m = d/2;
        else m = (d+1)/2;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < d-i; j++) {
                array[i][j] = count;
                count++;
            }
            for (int j = i+1; j <d-i ; j++) {
                array[j][d-i-1] = count;
                count++;
            }
            for (int j = 0; j < ; j++) {
                
            }
        }

    }
}
