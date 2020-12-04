import java.util.Scanner;

public class day1puzzle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] input = new int[200];
        for (int i = 0; i < 200; i++) {
            input[i] = s.nextInt();
        }

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (i != j) {
                    if (input[i] + input[j] == 2020) {
                        System.out.println(input[i] * input[j]);
                    }
                }
            }
        }
    }
}
