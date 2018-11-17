import java.util.Scanner;

public class POTSAM {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split("\\s+");
            int n1 = Integer.parseInt(data[0]);
            int k1 = Integer.parseInt(data[1]);
            int n2 = Integer.parseInt(data[2]);
            int k2 = Integer.parseInt(data[3]);

            System.out.println(n1 * k1 + n2 * k2);
        }
    }
}
