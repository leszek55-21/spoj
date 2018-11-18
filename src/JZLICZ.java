import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class JZLICZ {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        Map<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < numTests; i++) {
            char[] chars = br.readLine().toCharArray();
            for(int j = 0; j < chars.length; j++) {
                if(chars[j] >= 'a' && chars[j] <= 'z' || chars[j] >= 'A' && chars[j] <= 'Z') {
                    if(result.containsKey(chars[j])) {
                        result.put(chars[j], result.get(chars[j]) + 1);

                    } else {
                        result.put(chars[j], 1);
                    }
                }
            }
        }

        for(Character c: result.keySet()) {
            if(c >= 'a') {
                System.out.println(c + " " + result.get(c));
            } else {
                continue;
            }
        }
        for(Character c: result.keySet()) {
            if(c >= 'A' && c < 'a') {
                System.out.println(c + " " + result.get(c));
            } else {
                continue;
            }
        }
    }
}
