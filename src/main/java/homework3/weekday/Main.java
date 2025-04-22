package homework3.weekday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a day of the week: ");
        String dayInput = scanner.nextLine();

        Weekday day = Weekday.valueOf(dayInput);

        if (day.isWeekDay()) {
            System.out.println(day + " is a work day.");
        } else if (day.isHoliday()) {
            System.out.println(day + " is a holiday.");
        }
    }
}


