import java.util.Scanner;

public class BFN1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numTests; i++) {
            int number = scanner.nextInt();
            int counter = 0;
            if(number < 10) {
                System.out.println(number + " " + 0);
            } else {
                if(number == flipInt(number)) {
                    System.out.println(number + " " + 0);
                } else {
                    while (number != flipInt(number)) {
                        number = number + flipInt(number);
                        counter++;
                    }
                    System.out.println(number + " " + counter);
                }
            }
        }
    }

    private static int flipInt(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
