import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        for (int[] arr : calculate(inputData())) {
            for (int n : arr) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] inputData() {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (true) {
            String str = sc.nextLine();
            if ("end".equals(str)) {
                break;
            }
            input.append(str).append("s");
        }
        String[] strRows = input.toString().split("s");
        int[][] matrix = new int[strRows.length][strRows[0].split(" ").length];
        for (int row = 0; row < matrix.length; row++) {
            String[] str = strRows[row].split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(str[col]);
            }
        }
        return matrix;
    }

    public static int[][] calculate(int[][] inMatrix) {
        int[][] matrix = new int[inMatrix.length][inMatrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int a = inMatrix[row - 1 < 0 ? matrix.length - 1 : row - 1][col];
                int b = inMatrix[row + 1 > matrix.length - 1 ? 0 : row + 1][col];
                int c = inMatrix[row][col - 1 < 0 ? matrix[0].length - 1 : col - 1];
                int d = inMatrix[row][col + 1 > matrix[0].length - 1 ? 0 : col + 1];
                matrix[row][col] = a + b + c + d;
            }
        }
        return matrix;
    }
}