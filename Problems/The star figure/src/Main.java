import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i == j || i == n / 2 || j == n / 2 || n - 1 == i + j ? '*' : '.';
            }
        }

        for (char[] c: arr) {
            for (char ch: c) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}