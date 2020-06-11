import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(checkSymmetry(inputData()) ? "YES" : "NO");

    }

    public static int[][] inputData() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static boolean checkSymmetry(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] != matrix[col][row]) {
                    return false;
                }
            }
        }
        return true;
    }
}