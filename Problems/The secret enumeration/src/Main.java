public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret secret: Secret.values()) {
            count += secret.toString().contains("STAR") ? 1 : 0;
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/