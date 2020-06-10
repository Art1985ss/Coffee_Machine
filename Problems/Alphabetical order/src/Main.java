import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] strings = new Scanner(System.in).nextLine().split(" ");
        boolean alphabetical = true;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].compareTo(strings[i]) > 0) {
                alphabetical = false;
                break;
            }
        }
        System.out.println(alphabetical);
    }
}