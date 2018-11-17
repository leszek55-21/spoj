import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JPESEL {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());

        for (int i = 0; i < numTests; i++) {
            String pesel = br.readLine();
            List<Integer> digits = getDigits(pesel);
            int sum = digits.get(0) * 1 + digits.get(1) * 3 + digits.get(2) * 7 + digits.get(3) * 9 +
                    digits.get(4) * 1 + digits.get(5) * 3 + digits.get(6) * 7 + digits.get(7) * 9 +
                    digits.get(8) * 1 + digits.get(9) * 3 + digits.get(10) * 1;
            if(sum > 0) {
                if(sum % 10 == 0) {
                    System.out.println("D");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        }
    }

    private static List<Integer> getDigits(String number) {
        List<Integer> separateNumbers = new ArrayList<>();
        char[] numbers = number.toCharArray();
        for(int i = 0; i < numbers.length; i++) {
            separateNumbers.add(Character.getNumericValue(numbers[i]));
        }
        return separateNumbers;
    }
}
