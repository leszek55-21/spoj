import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TRN {

    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] data = br.readLine().split("\\s+");

        int rows = Integer.parseInt(data[0]);
        int columns = Integer.parseInt(data[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] line = br.readLine().split("\\s+");

            for(int j=0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < columns; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j < rows; j++) {
                sb.append(matrix[j][i]);
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
