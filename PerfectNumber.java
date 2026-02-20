import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println(number + " is a Perfect Number.");
            } else {
                System.out.println(number + " is NOT a Perfect Number.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}