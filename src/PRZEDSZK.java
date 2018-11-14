import java.util.Scanner;

public class PRZEDSZK {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDataSets = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numDataSets; i++) {

            String data = scanner.nextLine();
            String [] groupsArray = data.split("\\s+");
            int groupOne = Integer.parseInt(groupsArray[0]);
            int groupTwo = Integer.parseInt(groupsArray[1]);

            int result = 0;

            for(int j = groupOne; j > 0; j += groupOne) {
                if(j % groupTwo == 0) {
                    result = j;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
