//Write a program to print numbers from 1 to 10 (use loops).


public class PrintNumbers {

    public static void loopNumbers(int number) {
        for(int i=1; i<=number; i++) {
            System.out.println(i);
            if(i >= 30) {
                System.out.println("Not more than 30 numbers allowed. Sorry^^");
                break;
            }
        }
    }

}
