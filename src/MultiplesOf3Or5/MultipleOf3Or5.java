package MultiplesOf3Or5;

import java.util.Scanner;

public class MultipleOf3Or5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limit: ");
        int limit = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
