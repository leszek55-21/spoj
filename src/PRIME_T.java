
import java.util.Scanner;

public class PRIME_T {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();

        for (int i=0; i < numTests; i++) {
            int number = scanner.nextInt();
            if(number < 2) {
                System.out.println("NIE");
            } else if(number <= 3) {
                System.out.println("TAK");
            } else {
                boolean isPrime = true;
                for(int j = 2; j <= number / 2; j++) {

                    if(number % j == 0) {
                        isPrime =false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if(isPrime) {
                    System.out.println("TAK");
                } else {
                    System.out.println("NIE");
                }
            }
        }
    }
}
