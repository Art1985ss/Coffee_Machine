import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int n;
        int m;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == m && arr[i] == n || arr[i - 1] == n && arr[i] == m) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}