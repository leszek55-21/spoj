import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PP0502B {

    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {
            String [] dataArray = br.readLine().split("\\s+");
            StringBuilder sb = new StringBuilder();

            for(int j = dataArray.length - 1; j > 0; j--) {
                sb.append(dataArray[j]);
                sb.append(" ");
            }

            System.out.println(sb);
        }
    }
}
