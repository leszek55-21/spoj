
import java.util.InputMismatchException;
import java.util.Scanner;

public class PA05_POT {

    private static final int LOWEST_NUMBER_OF_CASES = 1;
    private static final int HIGHEST_NUMBER_OF_CASES = 10;
    private static final int LOWEST_VALUE_OF_BASE_OR_EXPONENT = 1;
    private static final int HIGHEST_VALUE_OF_BASE_OR_EXPONENT = 1000000000;
    private static final String WRONG_INPUT_FOR_CASES = "Wrong input. You should enter " +
            "number between " + LOWEST_NUMBER_OF_CASES + " and " + HIGHEST_NUMBER_OF_CASES;
    private static final String WRONG_INPUT_FOR_BASE_OR_EXPONENT = "Wrong input. You should enter " +
            "2 numbers between " + LOWEST_VALUE_OF_BASE_OR_EXPONENT + " and " +
            HIGHEST_VALUE_OF_BASE_OR_EXPONENT + " separated with empty space";


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cases. Minimum 1, maximum 10");

        int numCases;

        while (true) {
            try {
                numCases = scanner.nextInt();
                if (!isInCasesRange(numCases)) {
                    System.out.println(WRONG_INPUT_FOR_CASES);
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println(WRONG_INPUT_FOR_CASES);
                scanner.nextLine();
            }
        }

        int[] results = new int[numCases];

        long base;
        long exponent;
        System.out.print("Enter " + numCases);
        System.out.println((numCases > LOWEST_NUMBER_OF_CASES) ? " cases.": " case.");

        scanner.nextLine();
        for (int i = 0; i < results.length; i++) {
            try {

                String line = scanner.nextLine();

                String[] readStrings = line.split("\\s+");

                if(readStrings.length > 2) {
                    throw new InputMismatchException("Incorrect input");
                }

                base = Long.parseLong(readStrings[0]);
                exponent = Long.parseLong(readStrings[1]);

                if(!isInBaseAndExponentRange(base) || !isInBaseAndExponentRange(exponent)) {
                    System.out.println(WRONG_INPUT_FOR_BASE_OR_EXPONENT);
                    i--;
                    continue;
                }

            } catch (Exception e) {
                System.out.println(WRONG_INPUT_FOR_BASE_OR_EXPONENT);
                i--;
                continue;
            }
            results[i] = (int) Math.pow(base, exponent) % 10;
        }

        printArray(results);
        scanner.close();
    }

    private static boolean isInCasesRange (int number) {
        return number >= LOWEST_NUMBER_OF_CASES && number <= HIGHEST_NUMBER_OF_CASES;
    }

    private static boolean isInBaseAndExponentRange (long number) {
        return number >= LOWEST_VALUE_OF_BASE_OR_EXPONENT && number <= HIGHEST_VALUE_OF_BASE_OR_EXPONENT;
    }


    private static void printArray(int [] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
