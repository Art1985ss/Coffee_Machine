import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextLine();
        }
        boolean pretty = true;
        for (int i = 1; i < 4 && pretty; i++) {
            for (int j = 1; j < 4 && pretty; j++) {
                pretty = !(arr[i].charAt(j) == arr[i - 1].charAt(j) &&
                        arr[i].charAt(j) == arr[i].charAt(j - 1) &&
                        arr[i].charAt(j) == arr[i - 1].charAt(j - 1));
            }
        }
        System.out.println(pretty ? "YES" : "NO");
    }
}