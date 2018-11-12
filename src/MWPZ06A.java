import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MWPZ06A {

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCases = Integer.parseInt(br.readLine());
        String[] cases = new String[numCases];
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < numCases; i++) {
            cases[i] = br.readLine();
        }

        for (int i = 0; i < cases.length; i++) {
            String[] data = cases[i].split("\\s+");
            double older = Integer.parseInt(data[0]);
            double future = Integer.parseInt(data[1]);
            double times = Integer.parseInt(data[2]);
            double resultInYears = (times * future - older - future) / (1 - times);
            double inMonths = Math.abs(12 * resultInYears);

            if(inMonths % 1 > 0.5) {
                results.add((int) Math.ceil(inMonths));
            } else {
                results.add((int) Math.floor(inMonths));
            }
        }

        for (int result: results) {
            System.out.println(result);
        }
    }
}
