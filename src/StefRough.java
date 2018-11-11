
import java.util.InputMismatchException;
        import java.util.Scanner;

public class StefRough {

    public static final int MIN_NUMBER_OF_CITIES = 1;
    public static final int MAX_NUMBER_OF_CITIES = 100000;
    public static final int MIN_INCOME = -100000;
    public static final int MAX_INCOME = 100000;
    public static final String INCORRECT_DATA = "Incorrect data, try again.";

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCities = scanner.nextInt();

        if(!isValidCitiesNumber(numCities)) {
            throw new InputMismatchException();
        }
        scanner.nextLine();

        int[] incomes = new int[numCities];

        for (int i = 0; i < incomes.length; i++) {

            int income = scanner.nextInt();
            if(!isValidIncome(income)) {
                throw new InputMismatchException("Incorrect data");
            }
            incomes[i] = income;
            scanner.nextLine();
        }

        int sum = 0;
        int max = 0;
        for (int element : incomes) {
            sum += element;
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

    private static boolean isValidCitiesNumber (int number) {
        return number >= MIN_NUMBER_OF_CITIES && number <= MAX_NUMBER_OF_CITIES;
    }

    private static boolean isValidIncome (int number) {
        return number >= MIN_INCOME && number <= MAX_INCOME;
    }

}
