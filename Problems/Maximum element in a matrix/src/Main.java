import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        printResult(inputData());
    }

    public static int[][] inputData() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void printResult(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int rowResult = 0;
        int colResult = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    rowResult = row;
                    colResult = col;
                }
            }
        }
        System.out.println(rowResult + " " + colResult);
    }
}