import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length == 1) {
            System.out.println(1);
            return;
        }
        int count = 1;
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            count = arr[i - 1] < arr[i] ? count + 1 : 1;
            result = Math.max(count, result);
        }
        System.out.println(result);
    }
}