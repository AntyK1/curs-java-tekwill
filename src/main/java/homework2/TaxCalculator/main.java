package homework2.TaxCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double price = 99.9;
        double tax = 1.33;
        int quantity;
        double total = 0;
        String message = "I want to buy X shirt!";

        System.out.println(message);

        // Scan quantity which we want to buy
        Scanner in = new Scanner(System.in);
        quantity = in.nextInt();

        // Total cost formula
        total = price * quantity * tax;

        System.out.println("Total cost with tax is: " + total);
    }
}
