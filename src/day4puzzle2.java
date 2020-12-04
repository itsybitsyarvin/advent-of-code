import java.util.Scanner;

public class day4puzzle2 {

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
                //splitInput[i] = splitInput[i].substring(0,3);
                if (splitInput[i].matches("(byr:)((19[2-9]\\d)|(200[0-2]))")) {
                    byr = true;
                }
                else if (splitInput[i].matches("(iyr:)((20)((1\\d)|(20)))")) {
                    iyr = true;
                }
                else if (splitInput[i].matches("(eyr:)((20)((2\\d)|(30)))")) {
                    eyr = true;
                }
                else if (splitInput[i].matches("(hgt:)(((1(([5-8]\\d)|(9[0-3])))(cm))|(((59)|(6\\d)|(7[0-6]))(in)))")) {
                    hgt = true;
                }
                else if (splitInput[i].matches("(hcl:#)([0-9a-f]{6})")) {
                    hcl = true;
                }
                else if (splitInput[i].matches("(ecl:)(amb|blu|brn|gry|grn|hzl|oth)")) {
                    ecl = true;
                }
                else if (splitInput[i].matches("(pid:)([0-9]{9})")) {
                    pid = true;
                }
                else {
                    //System.out.println("Wrong value.");
                }
            }

        }

        s.close();

        System.out.println(result);
    }
}
