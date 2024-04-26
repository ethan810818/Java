package NumberAndStrings.numbers;

import java.util.Calendar;
import java.util.Locale;



public class TestFormat {
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d%n", n); // --> "461012"
        System.out.format("%08d%n", n);// --> "00461012"
        System.out.format("%+8d%n", n);// --> " +461012"
        System.out.format("%,8d%n", n);// --> " 461,012"
        System.out.format("%+,8d%n%n", n);// --> "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);// --> "3.141593"
        System.out.format("%.3f%n", pi);// --> "3.142"
        System.out.format("%10.3f%n", pi);// --> "     3.142"
        System.out.format("%-10.3f%n", pi);// --> "3.412"
        System.out.format(Locale.FRANCE,
                            "%-10.4f%n%n", pi);// --> "3.1416"
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te %tY%n", c, c, c);// --> "April 23 2024"
        System.out.format("%tl:%tM %tp%n", c, c, c);// --> "3:29 pm"
        System.out.format("%tD%n", c);// --> "04/23/24"
    }
}
