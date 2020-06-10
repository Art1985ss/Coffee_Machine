import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] box1 = createBox();
        int[] box2 = createBox();

        Arrays.sort(box1);
        Arrays.sort(box2);
        int[] sides = {10, 10, 10};
        for (int i = 0; i < 3; i++) {
            if (box1[i] == box2[i]) {
                sides[i] = 0;
            } else if (box1[i] > box2[i]) {
                sides[i] = 1;
            } else {
                sides[i] = -1;
            }
        }
        check(sides);
    }

    public static int[] createBox() {
        int[] box = new int[3];
        for (int i = 0; i < box.length; i++) {
            box[i] = scanner.nextInt();
        }
        return box;
    }

    public static void check(int[] sides) {
        if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
            System.out.println("Box 1 = Box 2");
        } else if (sides[0] >= 0 && sides[1] >= 0 && sides[2] >= 0) {
            System.out.println("Box 1 > Box 2");
        } else if (sides[0] <= 0 && sides[1] <= 0 && sides[2] <= 0) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}