import java.util.Scanner;

public class day3puzzle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        int line = 0;
        String input;
        int eol = 0;
        boolean firstLine = true;

        char[][] slope = new char[512][32];

        while(s.hasNextLine()) { //s.hasNextLine() je treba rocno koncati s Ctrl+D

            input = s.nextLine();

            if (firstLine) {
                eol = input.length();
                firstLine = false;
            }

            for (int i = 0; i < input.length(); i++) {
                slope[line][i] = input.charAt(i);
            }
            line++;

        }

        s.close();

        int position = 0;

        for (int c = 1; c < line; c++) {
            position += 3;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                result++;
            }
        }

        System.out.println(result);
    }
}
