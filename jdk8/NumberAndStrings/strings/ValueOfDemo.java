package NumberAndStrings.strings;

public class ValueOfDemo {
    public static void main(String[] args) {

        //----CONVERT STRINGs TO NUMBERs----//
        if (args.length == 2) {
            //convert strings to numbers
            // float a = (Float.valueOf(args[0]).floatValue());
            // float b = (Float.valueOf(args[1]).floatValue());
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);

            //do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program " + "requires two command-line arguments.");
        }

        //----CONVERT NUMBERs TO STRINGs----//
        

    }
}
