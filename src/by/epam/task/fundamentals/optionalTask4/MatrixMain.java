package by.epam.task.fundamentals.optionalTask4;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int [][]mat =matrix.outputAnArrayOfRows( 5 );
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int [][]matr =matrix.outputAnArrayOfColumn( 5 );
        for (int i = 0; i <matr.length ; i++) {
            for (int j = 0; j <matr[i].length ; j++) {
                System.out.print("\t"+matr[i][j]);
            }
            System.out.println();
        }
    }
}