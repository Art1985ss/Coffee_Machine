import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] inputArr = new int[rows][columns];
        int[][] resultArr = new int[columns][rows];

        for (int row = 0; row < inputArr.length; row++) {
            for (int col = 0; col < inputArr[0].length; col++) {
                inputArr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < inputArr.length; row++) {
            for (int col = 0; col < inputArr[0].length; col++) {
                resultArr[col][inputArr.length - row - 1] = inputArr[row][col];
            }
        }

        for (int[] arr : resultArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}