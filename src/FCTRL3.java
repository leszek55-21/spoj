import java.util.Scanner;

public class FCTRL3 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        for(int i = 0; i < numCases; i++) {
            int number = scanner.nextInt();
            if(number > 9) {
                System.out.println("0 0");

            } else {
                int ones = factorial(number) % 10;
                int tens = (factorial(number) % 100) / 10;
                System.out.println(tens + " " + ones);
            }
        }
    }

    private static int factorial(int number) {
        if(number < 2) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
