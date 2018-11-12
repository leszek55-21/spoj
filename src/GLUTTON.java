import java.io.BufferedReader;
import java.io.InputStreamReader;


public class GLUTTON {

    public static void main (String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numTestSets = Integer.parseInt(reader.readLine());

        String[] testCases = new String[numTestSets];
        for(int i = 0; i < testCases.length; i++){
            testCases[i] = reader.readLine();

            String[] values = testCases[i].split("\\s+");

            int numGuzzlers = Integer.parseInt(values[0]);

            int cakesInBox = Integer.parseInt(values[1]);

            int[] times = new int[numGuzzlers];
            for(int j = 0; j < times.length; j++) {
                times[j] = Integer.parseInt(reader.readLine());

            }
            double cakesPerDay = 0;
            for(int time: times) {
                cakesPerDay += 86400 / time;
            }

            double sumBoxes = cakesPerDay / cakesInBox;

            System.out.println((int)Math.ceil(sumBoxes));

        }
        reader.close();
    }
}
