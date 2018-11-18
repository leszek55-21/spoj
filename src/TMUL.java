import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TMUL {

    public static void main (String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numTests = Integer.parseInt(br.readLine());
            for(int i = 0; i < numTests; i++) {
                String[] data = br.readLine().split("\\s+");
                long multiplicand = Long.parseLong(data[0]);
                long multiplier = Long.parseLong(data[1]);
                System.out.println(multiplicand * multiplier);
            }
        } catch (Exception e) {

        }
    }
}
