import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative (use if, else if and else).

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number:");
        double number = scanner.nextDouble();

        if(number > 0) {
            System.out.println(Math.round(number) + " is a positive number.");
        } else if(number < 0) {
            System.out.println(Math.round(number) + " is a negative number");
        } else
            System.out.println("Your number is neither positive nor negative.");

        scanner.close();
    }
}
