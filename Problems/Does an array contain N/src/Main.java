import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();

        for (int value : arr) {
            if (value == n) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}