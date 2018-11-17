import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VSR {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for(int i = 0; i < numTests; i++) {
            String[] speeds = br.readLine().split("\\s+");
            int first = Integer.parseInt(speeds[0]);
            int second = Integer.parseInt(speeds[1]);
            System.out.println((2 * first * second) / (first + second));
        }
    }
}
