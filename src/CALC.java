import java.util.Scanner;

public class CALC {

    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split("\\s+");
            String operation = data[0];
            int numOne = Integer.parseInt(data[1]);
            int numTwo = Integer.parseInt(data[2]);

            if(operation.equals("+")) {
                System.out.println(numOne + numTwo);
            } else if (operation.equals("-")) {
                System.out.println(numOne - numTwo);
            } else if (operation.equals("*")) {
                System.out.println(numOne * numTwo);
            } else if (operation.equals("/")) {
                System.out.println(numOne / numTwo);
            } else if (operation.equals("%")) {
                System.out.println(numOne % numTwo);
            }
        }
    }
}
