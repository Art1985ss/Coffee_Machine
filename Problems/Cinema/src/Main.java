import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int tickets;
        int rowAvailable = 0;
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        tickets = sc.nextInt();

        for (int row = 0; row < rows && rowAvailable == 0; row++) {
            int emptySeats = 0;
            for (int col = 0; col < columns && rowAvailable == 0; col++) {
                emptySeats = matrix[row][col] == 0 ? emptySeats + 1 : 0;
                rowAvailable = emptySeats >= tickets ? row + 1 : rowAvailable;
            }
        }

        System.out.println(rowAvailable);

    }
}