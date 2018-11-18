import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PP0604A {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {
            String[] lineData = br.readLine().split("\\s+");
            int dataNum = Integer.parseInt(lineData[0]);

            int sum = 0;
            for (int j = 1; j <= dataNum; j++) {
                sum += Integer.parseInt(lineData[j]);
            }
            double avg = (double)sum / dataNum;

            double minGap = Integer.MAX_VALUE;
            int closestToAvg = Integer.parseInt(lineData[1]);
            for (int j = 1; j <= dataNum; j++) {
                int currentValue = Integer.parseInt(lineData[j]);
                double gap = Math.abs(avg - currentValue);
                if(gap < minGap) {
                    minGap = gap;
                    closestToAvg = currentValue;
                }
            }
            System.out.println(closestToAvg);

        }
    }
}
