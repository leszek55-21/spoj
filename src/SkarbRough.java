
import java.util.Scanner;

public class SkarbRough {

    private static final int LOWEST_NUMBER_OF_DATA_SETS = 1;
    private static final int HIGHEST_NUMBER_OF_DATA_SETS = 50;
    private static final int LOWEST_NUMBER_OF_CLUES = 1;
    private static final int HIGHEST_NUMBER_OF_CLUES = 100000;
    private static final String WRONG_INPUT_FOR_CASES = "Wrong input data sets";
    private static final String WRONG_INPUT_CLUES = "Wrong input clues";
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int EAST = 2;
    public static final int WEST = 3;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numDataSets;


        numDataSets = scanner.nextInt();
        if (!isInDataSetsRange(numDataSets)) {
            System.out.println(WRONG_INPUT_FOR_CASES);

        }


        String[][] dataSets = new String[numDataSets][];
        for (int i = 0; i < numDataSets; i++) {


            int numClues = scanner.nextInt();
            scanner.nextLine();
            if (!isInCluesRange(numClues)) {
                System.exit(0);
            }

            String[] clues = new String[numClues];
            for (int j = 0; j < numClues; j++) {

                clues[j] = scanner.nextLine();
            }
            dataSets[i] = clues;


        }
        int horizontal;
        int vertical;
        for (String[] data : dataSets) {
            horizontal = 0;
            vertical = 0;
            for (String clue : data) {

                int direction = 0;
                int stepsNum = 0;

                String[] nums = clue.split("\\s+");
                if (nums.length != 2) {
                    System.exit(0);
                }
                direction = Integer.parseInt(nums[0]);
                stepsNum = Integer.parseInt(nums[1]);
                if (!isValidDirection(direction) || !isValidStepsNumber(stepsNum)) {
                    System.exit(0);
                }

                if (direction == NORTH) {
                    vertical += stepsNum;
                } else if (direction == SOUTH) {
                    vertical -= stepsNum;
                } else if (direction == EAST) {
                    horizontal += stepsNum;
                } else if (direction == WEST) {
                    horizontal -= stepsNum;
                }
            }

            showShortestWay(vertical, horizontal);

        }
    }

    private static void showShortestWay (int vertical, int horizontal) {
        if (vertical == 0 && horizontal == 0) {
            System.out.println("studnia");
        } else if (vertical == 0 && horizontal < 0) {
            System.out.println(WEST + " " + Math.abs(horizontal));
        } else if (vertical == 0 && horizontal > 0) {
            System.out.println(EAST + " " + Math.abs(horizontal));
        } else if (vertical < 0 && horizontal == 0) {
            System.out.println(SOUTH + " " + Math.abs(vertical));
        } else if (vertical < 0 && horizontal < 0) {
            System.out.println(SOUTH + " " + Math.abs(vertical));
            System.out.println(WEST + " " + Math.abs(horizontal));
        } else if (vertical < 0 && horizontal > 0) {
            System.out.println(SOUTH + " " + Math.abs(vertical));
            System.out.println(EAST + " " + Math.abs(horizontal));
        } else if (vertical > 0 && horizontal == 0) {
            System.out.println(NORTH + " " + Math.abs(vertical));
        } else if (vertical > 0 && horizontal < 0) {
            System.out.println(NORTH + " " + Math.abs(vertical));
            System.out.println(WEST + " " + Math.abs(horizontal));
        } else if (vertical > 0 && horizontal > 0) {
            System.out.println(NORTH + " " + Math.abs(vertical));
            System.out.println(EAST + " " + Math.abs(horizontal));
        }
    }

    private static boolean isInDataSetsRange (int number) {
        return number >= LOWEST_NUMBER_OF_DATA_SETS && number <= HIGHEST_NUMBER_OF_DATA_SETS;
    }

    private static boolean isInCluesRange (int number) {
        return number >= LOWEST_NUMBER_OF_CLUES && number <= HIGHEST_NUMBER_OF_CLUES;
    }

    private static boolean isValidDirection (int direction) {
        return direction == NORTH || direction == SOUTH || direction == EAST || direction == WEST;
    }

    private static boolean isValidStepsNumber (int stepsNumber) {
        return stepsNumber >= 0 && stepsNumber <= 10000;
    }

}

