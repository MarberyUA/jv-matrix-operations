package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            result[matrix.length - 1 - i] = matrix[matrix.length - 1 - i][i];
        }

        return result;
    }

    public int getMin(int[][] matrix) {
        int lowestNum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (lowestNum > matrix[i][j]) {
                    lowestNum = matrix[i][j];
                }
            }
        }
        return lowestNum;
    }

    public int getMax(int[][] matrix) {
        int biggestNum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggestNum < matrix[i][j]) {
                    biggestNum = matrix[i][j];
                }
            }
        }
        return biggestNum;
    }
}
