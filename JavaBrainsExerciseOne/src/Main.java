import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("Please enter the number you want to check:");
        PositiveNegative.checkNumbers(scanner.nextDouble());

        System.out.println(" ");

        //Exercise 2
        System.out.println("Please enter three numbers you want to check for their largest value:");
        GreatestNumber.calculateGreatestNumber(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble());

        System.out.println(" ");

        // Exercise 3
        System.out.println("Please enter the quantity of numbers to be enumerated");
        PrintNumbers.loopNumbers(scanner.nextInt());

        System.out.println(" ");

        //Exercise 4
        System.out.println("Please enter the amount of natural numbers you want to sum:");
        SumNaturalNumbers.sumNumbers(scanner.nextInt());

        System.out.println(" ");

        //Exercise 5
        System.out.println("Please enter the amount of prime numbers you want see see below:");
        PrimeNumbers.printPrimeNumbers(scanner.nextInt());

        scanner.close();
    }
}
