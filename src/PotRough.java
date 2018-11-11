
import java.util.Scanner;

public class PotRough {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCases = scanner.nextInt();

        // after I read about the pattern...
        for (int i = numCases; i > 0; i--) {
            int base = scanner.nextInt();
            int exponent = scanner.nextInt();
            System.out.println(((int)Math.pow(base % 10, 4 + exponent % 4) % 10));
        }
    }


}
