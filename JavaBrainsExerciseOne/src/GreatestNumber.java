/*
Take three numbers from the user and print the greatest number.
    Test Data:
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Expected Output :
    The greatest: 87
 */

public class GreatestNumber {

    public static double calculateGreatestNumber(double a, double b, double c) {

        if(a > b && a > c) {
            System.out.println("The greatest number is " + Math.round(a));
        } else if(b > a && b > c) {
            System.out.println("The greatest number is " + Math.round(b));
        } else if(c > a && c > b) {
            System.out.println("The greatest number is " + Math.round(c));
        } else
            System.out.println("There is no greater number here.");
        return -1;
    }

}
