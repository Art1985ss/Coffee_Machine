import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n * n;
        int[][] sudoku = new int[n2][n2];
        for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku.length; col++) {
                sudoku[row][col] = sc.nextInt();
            }
        }
        if (n == 1) {
            System.out.println(sudoku[0][0] == 1 ? "YES" : "NO");
        } else {
            System.out.println(checkRowColumns(sudoku) && squareCheck(sudoku, n) ? "YES" : "NO");
        }
    }

    public static boolean checkRowColumns(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int col = 0; col < arr.length; col++) {
                sumRow += arr[row][col];
                sumColumn += arr[col][row];
            }
            if (sumColumn != sumRow) {
                return false;
            }
        }
        return true;
    }

    public static boolean squareCheck(int[][] arr, int square) {
        for (int row = 0; row < arr.length; row += square) {
            for (int col = 0; col < arr.length; col += square) {
                for (int pos = 0; pos < arr.length - 1; pos++) {
                    for (int pos2 = pos + 1; pos2 < arr.length; pos2++) {
                        if (arr[row + pos % square][col + pos / square] ==
                                arr[row + pos2 % square][col + pos2 / square]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}