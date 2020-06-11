import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int col1 = 0;
        int col2 = 0;
        int[][] matrix = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        col1 = sc.nextInt();
        col2 = sc.nextInt();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col == col1) {
                    resultMatrix[row][col2] = matrix[row][col];
                } else if (col == col2) {
                    resultMatrix[row][col1] = matrix[row][col];
                } else {
                    resultMatrix[row][col] = matrix[row][col];
                }
            }
        }

        for (int[] arr : resultMatrix) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}