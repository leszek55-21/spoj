import java.util.Scanner;

public class TABLICA {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split("\\s+");
            for(int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
