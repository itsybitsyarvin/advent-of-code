import java.util.Objects;
import java.util.Scanner;


public class day2puzzle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        String input;
        String[] splitInput;
        int min;
        int max;
        int n;
        char required;
        while (s.hasNextLine()) {
        //for (int i = 0; i < 3; i++) {
            input = s.nextLine();
            //System.out.println(input);
            splitInput = input.split(": | |-");
            n = 0;
            min = Integer.parseInt(splitInput[0]);
            max = Integer.parseInt(splitInput[1]);
            required = splitInput[2].charAt(0);
            for (int j = 0; j < splitInput[3].length(); j++){
                char c = splitInput[3].charAt(j);
                if (c == required) {
                    n++;
                }
            }
            if (min <= n) {
                if (n > max) {
                    continue;
                }
                result++;
                //System.out.println(input);
                //System.out.println("n = "+n+"\n");
                System.out.println(result);
            }
        }
        //System.out.println(result);
    }
}
