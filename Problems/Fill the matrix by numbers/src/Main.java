import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = Math.abs(row - col);
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}