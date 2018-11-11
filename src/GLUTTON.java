import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class GLUTTON {

    private static final int SECONDS_IN_DAY = 86400;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numTestSets = scanner.nextInt();
        scanner.nextLine();

        if(!isInDataSetsRange(numTestSets)) {
            throw new InputMismatchException();
        }

        String[] testCases = new String[numTestSets];
        for(int i = 0; i < testCases.length; i++){
            testCases[i] = scanner.nextLine();
        }
        

        
        for(String testCase: testCases) {
            double sumBoxes;
            String[] values = testCase.split("\\s+");
            int numGuzzlers = Integer.parseInt(values[0]);
            if(!isGuzzlerRange(numGuzzlers)) {
                throw new InputMismatchException();
            }
            int cakesInBox = Integer.parseInt(values[1]);
            if(!isBoxesRange(cakesInBox)) {
                throw new InputMismatchException();
            }
            int[] times = new int[numGuzzlers];
            for(int i = 0; i < times.length; i++) {
                times[i] = scanner.nextInt();
                scanner.nextLine();
            }
            double cakesPerDay = 0;
            for(int time: times) {
                cakesPerDay += SECONDS_IN_DAY / time;
            }

            sumBoxes = cakesPerDay / cakesInBox;
            if(sumBoxes % 1 != 0) {
                sumBoxes += 1;
                sumBoxes = Math.floor(sumBoxes);
            }
            System.out.println(sumBoxes);
            
        }


    }

    private static boolean isInDataSetsRange (int number) {
        return number > 0;
    }

    private static boolean isGuzzlerRange (int number) {
        return number > 0 && number <= 10000;
    }

    private static boolean isBoxesRange (int number) {
        return number > 0 && number <= 1000000000;
    }


}
