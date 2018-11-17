import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PP0506A {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numTests = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>(numTests);

        for (int i = 0; i < numTests; i++) {
            Map<Double, String> pointsSorted = new TreeMap<>();
            int numPoints = Integer.parseInt(br.readLine());

            for (int j = 0; j < numPoints; j++) {
                String point = br.readLine();
                String[] pointDetails = point.split("\\s+");
                int x = Integer.parseInt(pointDetails[1]);
                int y = Integer.parseInt(pointDetails[2]);
                double distance = Math.sqrt(x*x + y*y);

                pointsSorted.put(distance, point);

            }
            addToList(pointsSorted, result);
            result.add("");
            System.out.println();
        }
        printList(result);
    }

    private static List<String> addToList (Map<Double, String> map, List<String> list) {
        for(String point: map.values()) {
            list.add(point);
        }
        return list;
    }

    private static void printList(List<String> list) {
        for(String item: list) {
            System.out.println(item);
        }
    }
}
