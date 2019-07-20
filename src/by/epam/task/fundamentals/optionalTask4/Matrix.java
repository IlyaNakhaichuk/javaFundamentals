package by.epam.task.fundamentals.optionalTask4;

import  java.util.*;

public class Matrix {
    private int [][] matrix=null;
    private void setMatrix(int matrixDimension){
        matrix = new int[matrixDimension][matrixDimension];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                int a =(int) Integer.MIN_VALUE;
                int b = (int) Integer.MAX_VALUE;
                matrix[i][j] = new Random().nextInt(214748364 + 247483646) - 247483646;
            }
        }
    }

    private int[] sotrStrings(int [] unsortedString){
        for (int i = unsortedString.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedString[j] > unsortedString[j + 1] ) {
                    int tmp = unsortedString[j];
                    unsortedString[j] = unsortedString[j + 1];
                    unsortedString[j + 1] = tmp;
                }
            }
        }
        return unsortedString;
    }

    public int[][] outputAnArrayOfRows(int matrixSize){
        setMatrix( matrixSize );
        for (int i = 0; i <matrix.length ; i++) {
            sotrStrings( matrix[i] );
        }
        return matrix;
    }

}
