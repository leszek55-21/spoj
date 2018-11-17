import java.util.Scanner;

public class KC009 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            StringBuilder sb = new StringBuilder();
            char[] data = scanner.nextLine().toCharArray();
            for(int i = data.length - 1; i >= 0; i--) {
                sb.append(data[i]);
            }
            System.out.println(sb);
        }
    }
}
