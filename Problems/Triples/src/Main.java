import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            count = arr[i - 1] + 1 == arr[i] ? count + 1 : 1;
            if (count == 3) {
                count--;
                result++;
            }
        }
        System.out.println(result);
    }
}