import java.util.Scanner;

public class JSPACE {

    public static void main (String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().split("\\s+");

                for (int i = 0; i < words.length; i++) {
                    if (i == 0) {
                        System.out.print(words[0]);
                    } else {
                        String zero = Character.toString(words[i].charAt(0));
                        String upperZero = zero.toUpperCase();
                        String rest = words[i].substring(1);
                        words[i] = upperZero + rest;
                        System.out.print(words[i]);
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {

        }
    }
}
