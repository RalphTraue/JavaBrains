public class SumNaturalNumbers {

    public static int sumNumbers(int num) {
        int sum = 0;

        for(int i=1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The result of " + num + " natural numbers is " + sum);
        return -1;
    }

}
