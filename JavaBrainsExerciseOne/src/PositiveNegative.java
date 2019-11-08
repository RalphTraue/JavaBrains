public class PositiveNegative {

    public static double checkNumbers(double number) {

        if(number > 0) {
            System.out.println(Math.round(number) + " is a positive number.");
        } else if(number < 0) {
            System.out.println(Math.round(number) + " is a negative number");
        } else
            System.out.println("Your number is neither positive nor negative.");
        return -1;
    }

}
