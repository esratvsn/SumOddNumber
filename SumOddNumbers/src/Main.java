import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter a number: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Sum of numbers that are even and multiples of 4: " + sum);

    }
}