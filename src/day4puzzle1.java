import java.util.Scanner;

public class day4puzzle1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        String input;
        String[] splitInput;
        boolean byr = false; //(Birth Year)
        boolean iyr = false; //(Issue Year)
        boolean eyr = false; //Expiration Year)
        boolean hgt = false; //(Height)
        boolean hcl = false; //(Hair Color)
        boolean ecl = false; //(Eye Color)
        boolean pid = false; //(Passport ID)
        boolean cid = false; //(Country ID) - optional

        while (s.hasNextLine()) {

            input = s.nextLine();
            System.out.println(input);

            if (input.isEmpty()) {
                //checkflags
                if (byr && iyr && eyr && hgt && hcl && ecl && pid) {
                    result++;
                    System.out.println("Valid input.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                //if flags ok -> result++
                byr = iyr = eyr = hgt = hcl = ecl = pid = cid = false;
                continue;
            }

            splitInput = input.split(" ");

            //System.out.println(splitInput.length);

            for (int i = 0; i < splitInput.length; i++) {
                splitInput[i] = splitInput[i].substring(0,3);
                if (splitInput[i].equals("byr")) {
                    byr = true;
                }
                else if (splitInput[i].equals("iyr")) {
                    iyr = true;
                }
                else if (splitInput[i].equals("eyr")) {
                    eyr = true;
                }
                else if (splitInput[i].equals("hgt")) {
                    hgt = true;
                }
                else if (splitInput[i].equals("hcl")) {
                    hcl = true;
                }
                else if (splitInput[i].equals("ecl")) {
                    ecl = true;
                }
                else if (splitInput[i].equals("pid")) {
                    pid = true;
                }
                else if (splitInput[i].equals("cid")) {
                    cid = true;
                }
                else {
                    System.out.println("Something weird is going on.");
                }
            }

        }

        s.close();

        System.out.println(result);
    }
}
