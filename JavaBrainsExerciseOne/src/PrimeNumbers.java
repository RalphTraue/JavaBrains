public class PrimeNumbers {

    public static int printPrimeNumbers(int maxNumber) {
        int count = 0;
        for(int i=2; i<500; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if(count == maxNumber) {
                    System.out.println("Counting " + maxNumber + " prime numbers.");
                    break;
                } else if (count > 49) {
                    System.out.println("Counting " + count + " prime numbers.");
                    System.out.println("Not more than 50 prime numbers allowed. Sry^^");
                    break;

                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
