import java.util.Scanner;


public class day2puzzle21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        String input;
        String[] splitInput;
        int first;
        int second;
        char required;
        int count = 0;
        while (s.hasNextLine()) {
            //TO NE SPROCESIRA ZADNJEGA INPUTA ČE NI NEWLINE ZA NJIM!!! - DODAJ NEW LINE
            count++;
            input = s.nextLine();
            System.out.println(input);
            splitInput = input.split(": | |-");

            first = Integer.parseInt(splitInput[0])-1;
            second = Integer.parseInt(splitInput[1])-1;
            required = splitInput[2].charAt(0);

            char firstChar = splitInput[3].charAt(first);
            char secondChar = splitInput[3].charAt(second);

            if (firstChar == required) {
                if (secondChar != required) {
                    result++;
                    System.out.println(result);
                }
            }
            else {
                if (secondChar == required) {
                    result++;
                    System.out.println(result);
                }
            }
            //System.out.println("Line count: " + count);
        }
        //System.out.println(result);
    }
}
