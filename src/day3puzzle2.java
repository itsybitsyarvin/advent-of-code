import java.util.Scanner;

public class day3puzzle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long result = 0;
        int slopeResult = 0;
        int line = 0;
        String input;
        int eol = 0;
        int position = 0;
        int down = 0;
        int right = 0;
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


        position = 0;
        right = 1;
        down = 1;

        for (int c = down; c < line; c+=down) {
            position += right;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                result++;
            }
        }
        System.out.println(result);

        position = 0;
        right = 3;
        down = 1;

        for (int c = down; c < line; c+=down) {
            position += right;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                slopeResult++;
            }
        }
        System.out.println(slopeResult);
        result = result * slopeResult;
        slopeResult = 0;

        position = 0;
        right = 5;
        down = 1;

        for (int c = down; c < line; c+=down) {
            position += right;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                slopeResult++;
            }
        }
        System.out.println(slopeResult);
        result = result * slopeResult;
        slopeResult = 0;


        position = 0;
        right = 7;
        down = 1;

        for (int c = down; c < line; c+=down) {
            position += right;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                slopeResult++;
            }
        }
        System.out.println(slopeResult);
        result = result * slopeResult;
        slopeResult = 0;


        position = 0;
        right = 1;
        down = 2;

        for (int c = down; c < line; c+=down) {
            position += right;
            if (position >= eol) {
                position -= eol;
            }

            if (slope[c][position] == '#') {
                slopeResult++;
            }
        }
        System.out.println(slopeResult);
        result = result * slopeResult;
        slopeResult = 0;


        System.out.println(result);
    }
}
