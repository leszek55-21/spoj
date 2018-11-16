import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PP0501A {

    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        List<Integer> results = new ArrayList<>(numTests);

        for (int i = 0; i < numTests; i++) {
            String [] numbersArray = br.readLine().split("\\s+");
            int first = Integer.parseInt(numbersArray[0]);
            int second = Integer.parseInt(numbersArray[1]);

            //Euclidean algorithm for calculating the GCD
            int gcd = 1;
            if (first == 0) {
                gcd = second;
            } else {
                while (second != 0) {
                    if (first > second)
                        first = first - second;
                    else
                        second = second - first;
                }
                gcd = first;
                results.add(gcd);
            }
        }
        for(Integer result: results) {
            System.out.println(result);
        }
    }
}
