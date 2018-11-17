import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MWPZ06D {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());
        List<String> answers = new ArrayList<>(numTests);

        for(int i = 0; i < numTests; i++) {
            String[] data = br.readLine().split("\\s+");
            int kids = Integer.parseInt(data[0]) - 1;
            int candys = Integer.parseInt(data[1]);

            if(candys % kids == 0) {
                answers.add("NIE");
            } else {
                answers.add("TAK");
            }
        }

        for(String answer: answers) {
            System.out.println(answer);
        }
    }
}
