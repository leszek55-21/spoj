import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JHTMLLET {

    public static void main (String[] args) throws Exception {

        //not finished yet

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            String newS = data.replaceAll("</?[A-Za-z]+>", "<TAG>");
            System.out.println(newS);
            char[] content = data.toCharArray();

            for (int j = 0; j < content.length; j++) {
                if (content[j] == '<' && content[j] < content.length) {

                }
            }
        }
    }
}
