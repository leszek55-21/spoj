import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KC001 {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int counter = 0;
        while (counter < 3) {
            sum += Integer.parseInt(br.readLine());
            counter++;
        }
        System.out.println(sum);
    }
}
