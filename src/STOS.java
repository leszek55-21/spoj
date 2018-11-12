import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class STOS {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer [] stack = new Integer[10];

        List<Object> output = new ArrayList<>();

        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            if(input.equals("+")) {
                try {
                    for(int i = 0; i < stack.length + 1; i++) {
                        if(stack[i] == null) {
                            stack[i] = scanner.nextInt();
                            scanner.nextLine();
                            output.add(":)");
                            break;
                        }
                    }
                } catch (Exception e){
                    output.add(":(");
                    scanner.nextLine();
                }
            } else if (input.equals("-")) {
                try {
                    for(int i = stack.length-1; i >= -1; i--) {
                        if(stack[i] != null) {
                            int value = stack[i];
                            output.add(value);
                            stack[i] = null;
                            break;
                        }
                    }
                } catch (Exception e) {
                    output.add(":(");
                }
            } else {
                break;
            }
        }

        for(Object elem: output) {
            System.out.println(elem);
        }
    }
}
