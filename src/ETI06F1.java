import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ETI06F1 {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] data = br.readLine().split("\\s+");

        double radius = Double.parseDouble(data[0]);
        double distance = Double.parseDouble(data[1]);

        double arrow = radius - (distance / 2);

        double smallRadius = Math.sqrt((2 * radius - arrow) * arrow);
        double field = Math.PI * smallRadius * smallRadius;

        System.out.println(round(field,2));
    }

    private static double round(double value, int places) {

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
