import java.util.Scanner;

public class CALC2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] memory = new int[10];

        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split("\\s+");
            String operation = data[0];
            int numOne = Integer.parseInt(data[1]);
            int numTwo = Integer.parseInt(data[2]);

            if (operation.equals("z")) {
                memory[numOne] = numTwo;
            } else {
                if(operation.equals("+")) {
                    System.out.println(memory[numOne] + memory[numTwo]);
                } else if (operation.equals("-")) {
                    System.out.println(memory[numOne] - memory[numTwo]);
                } else if (operation.equals("*")) {
                    System.out.println(memory[numOne] * memory[numTwo]);
                } else if (operation.equals("/")) {
                    System.out.println(memory[numOne] / memory[numTwo]);
                } else if (operation.equals("%")) {
                    System.out.println(memory[numOne] % memory[numTwo]);
                }
            }
        }
    }
}
