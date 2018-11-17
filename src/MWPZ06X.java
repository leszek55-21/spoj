import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MWPZ06X {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for(int i = 0; i < numTests; i++) {
            int steps = Integer.parseInt(br.readLine());
            System.out.println(steps * steps);
        }
    }
}
