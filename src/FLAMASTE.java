import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FLAMASTE {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        scanner.nextLine();

        List<String> output = new ArrayList<>(numCases);
        for (int i = 0; i < numCases; i++) {
            StringBuilder sb = new StringBuilder();
            int counter = 1;
            char[] input = scanner.nextLine().toCharArray();

            if(input.length == 0) {
                continue;
            } else if (input.length < 2) {
                sb.append(input[0]);
            } else {
                for (int j = 0; j < input.length - 1; j++) {

                    if (input[j] == input[j + 1]) {
                        counter++;
                        if (j == input.length - 2) {
                            sb.append(input[j + 1]);
                        }
                    } else {
                        sb.append(input[j]);
                        if (counter > 2) {
                            sb.append(counter);
                        } else if (counter == 2) {
                            sb.append(input[j]);
                        } else if(input[j] == input[j+1]){
                            sb.append(input[j]);
                        }
                        counter = 1;
                    }
                    if (j == input.length - 2) {
                        if (counter > 2) {
                            sb.append(counter);
                            counter = 1;
                        } else {
                            sb.append(input[input.length - 1]);
                        }
                    }
                }
            }
            output.add(sb.toString());
        }
        for (String element : output) {
            System.out.println(element);
        }
    }
}
