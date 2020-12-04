import java.util.Scanner;


public class day2puzzle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        String input;
        String[] splitInput;
        int first;
        int second;
        //boolean hasChar;
        char required;
        while (s.hasNextLine()) {
        //for (int i = 0; i < 3; i++) {
            input = s.nextLine();
            System.out.println(input);
            splitInput = input.split(": | |-");

            first = Integer.parseInt(splitInput[0])-1;
            second = Integer.parseInt(splitInput[1])-1;
            required = splitInput[2].charAt(0);
            //boolean lenCheck1 = false;
            //boolean lenCheck2 = false;

            char firstAt = splitInput[3].charAt(first);
            char secondAt = splitInput[3].charAt(second);

            /*
            if (first <= splitInput[3].length()) {
                firstAt = splitInput[3].charAt(first);
                lenCheck1 = true;
            }
            if (second <= splitInput[3].length()) {
                secondAt = splitInput[3].charAt(second);
                lenCheck2 = true;
            }
            if (!lenCheck1 || !lenCheck2) {
                System.out.println(input +" "+ lenCheck1 +" "+ lenCheck2);
            }
            */

            if (firstAt == required) {
                if (secondAt != required) {
                    result++;
                    System.out.println(result);
                }
            }
            else {
                if (secondAt == required) {
                    result++;
                    System.out.println(result);
                }
            }
            //System.out.println();
        }
        //System.out.println(result);
    }
}
