import java.util.Scanner;

public class day1puzzle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] input = new int[200];
        for (int i = 0; i < 200; i++) {
            input[i] = s.nextInt();
        }

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                for (int k = 0; k < 200; k++) {
                    if (i != j && i != k && j != k) {
                        if (input[i] + input[j] + input[k] == 2020) {
                            System.out.println(input[i] * input[j] * input[k]);
                        }
                    }
                }
            }
        }
    }
}
