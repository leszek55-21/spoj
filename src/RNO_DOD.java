import java.util.Scanner;

public class RNO_DOD {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTests; i++) {
            int sum = 0;
            int numbersCount = scanner.nextInt();
            scanner.nextLine();
            String numbersList = scanner.nextLine();
            String[] numbersArray = numbersList.split("\\s+");
            int[] numbersArrInt = new int[numbersCount];

            for (int j = 0; j < numbersCount; j++) {
                numbersArrInt[j] = Integer.parseInt(numbersArray[j]);
            }

            for (int j = 0; j < numbersCount; j++) {
                sum += numbersArrInt[j];
            }
            System.out.println(sum);
        }
    }
}
