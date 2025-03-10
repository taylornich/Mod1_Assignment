import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        //Objective 1 task 1
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Objective 1 Task 2
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Objective 1 Task 3
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("\nMaximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        //Objective 1 Task 4
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of Array: " + sum);

        //Objective 1 Task 5
        boolean hasEven = false;
        for (int num : numbers) {
            if (num % 2 == 0) {
                hasEven = true;
                break;
            }
        }
        if (hasEven) {
            System.out.println("\nThe array contains at least one even number.");
        } else {
            System.out.println("\nThe array does not contain any even numbers.");
        }

        scanner.close();
    }
}