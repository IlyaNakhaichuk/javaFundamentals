package by.epam.task.fundamentals.optionalTask4;

import  java.util.*;

public class Matrix {
    private int [][] matrix=null;
    private void setMatrix(int matrixDimension){
        matrix = new int[matrixDimension][matrixDimension];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                //matrix[i][j] = new Random().nextInt();
                matrix[i][j] = new Random().nextInt(100+100)-100;
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

    public int[][] outputAnArrayOfColumn(int matrixSize){
        if(matrix==null || matrixSize!=matrix.length) {
            setMatrix(matrixSize);
        }
        for (int j=0; j <matrix[0].length ;j++) {
            sotrStrings(matrix[j]);
        }
        return matrix;
    }

}
