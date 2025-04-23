package homework5.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers: ");

        int positive = 0;
        int negative = 0;
        int sum = 0;
        int num;

        while (true) {
            num = scanner.nextInt();

            if (num == 0) {
                break;          //break number insertion if number is equal with 0
            }
                sum+= num;      //sum inserted in console numbers

            if (num > 0) {
                positive++;     //increment positive numbers
            } else {
                negative++;     //increment negative numbers
            }
        }
        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Sum of numbers is equal with: " + sum);

        scanner.close();
    }
}

