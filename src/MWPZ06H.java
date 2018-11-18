import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MWPZ06H {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {

            //getting data
            int competitorsNum = Integer.parseInt(br.readLine());
            List<Integer> results = new ArrayList<>(competitorsNum);
            List<Integer> maxResults = new ArrayList<>();
            String[] data = br.readLine().split("\\s+");
            for(int j=0; j < data.length; j++) {
                results.add(j, Integer.parseInt(data[j]));
            }

            //adding max values to maxResults Arraylist
            int position = 0;

            for(int j = 0; j < results.size(); j++) {
                if(maxResults.size() > 0) {
                    if(results.get(j) > maxResults.get(0) && results.get(j) <= 1000) {
                        position = 0;
                        maxResults.clear();
                        maxResults.add(position, results.get(j));
                    } else if (results.get(j) == maxResults.get(0)) {
                        position++;
                        maxResults.add(position, results.get(j));
                    }
                } else {
                    maxResults.add(0, results.get(j));
                }
            }

            //removing max results from results arrayList
            for(int j = 0; j < results.size(); j++) {
                if(results.get(j) == maxResults.get(0) || results.get(j) > 1000) {
                    results.remove(j);
                    j--;
                }
            }

            //sorting remaining results
            Collections.sort(results);

            //printing first max then the rest sorted
            for(int max: maxResults) {
                System.out.print(max + " ");
            }

            for (int result: results) {
                System.out.print(result + " ");
            }
            System.out.println();

        }
    }
}
