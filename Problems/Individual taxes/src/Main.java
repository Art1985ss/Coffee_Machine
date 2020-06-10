import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] companies = new int[numberOfCompanies];
        int[] taxes = new int[numberOfCompanies];
        for (int i = 0; i < companies.length; i++) {
            companies[i] = scanner.nextInt();
        }
        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = scanner.nextInt();
        }

        double max = Double.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < numberOfCompanies; i++) {
            double payment = companies[i] * (taxes[i] * 0.01);
            if (max < payment) {
                max = payment;
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}