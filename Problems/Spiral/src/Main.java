import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int[][] matrix = new int[num][num];

        for (int[] arr : fill(matrix)) {
            for (int n : arr) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fill(int[][] matrix) {
        int size = matrix.length;
        int rowMax = size - 1;
        int rowMin = 0;
        int colMax = size - 1;
        int colMin = 0;
        int counter = 1;
        while (counter <= size * size) {
            for (int i = colMin; i <= colMax; i++) {
                matrix[rowMin][i] = counter++;
            }
            for (int i = rowMin + 1; i <= rowMax; i++) {
                matrix[i][colMax] = counter++;
            }
            for (int i = colMax - 1; i >= colMin; i--) {
                matrix[rowMax][i] = counter++;
            }
            for (int i = rowMax - 1; i >= rowMin + 1; i--) {
                matrix[i][colMin] = counter++;
            }
            colMin++;
            rowMin++;
            colMax--;
            rowMax--;
        }
        return matrix;
    }
}