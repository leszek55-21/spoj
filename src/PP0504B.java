import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PP0504B {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {
            String[] data = br.readLine().split("\\s+");
            String first = data[0];
            String second = data[1];

            System.out.println(merge(first, second));
        }
    }

    private static String merge(String first, String second) {
        char[] firstCharArr = first.toCharArray();
        char[] secondCharArr = second.toCharArray();
        StringBuilder sb = new StringBuilder();

        if(firstCharArr.length > secondCharArr.length) {
            for(int i = 0; i < secondCharArr.length; i++) {
                sb.append(firstCharArr[i]);
                sb.append(secondCharArr[i]);
            }
        } else {
            for(int i = 0; i < firstCharArr.length; i++) {
                sb.append(firstCharArr[i]);
                sb.append(secondCharArr[i]);
            }
        }
        return sb.toString();
    }
}
