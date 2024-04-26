package NumberAndStrings.strings;


public class StringDemo {
    public static void main(String[] args) {
        // String palindrome = "Dot saw I was Tod";
        // int len = palindrome.length();
        // char[] tempCharArray = new char[len];
        // char[] charArray = new char[len];

        // // put original string is an array of chars
        // for (int i = 0; i < len; i++) {
        //     tempCharArray[i] = palindrome.charAt(i);
        // }

        // // reserve array of chars
        // for (int j = 0; j < len; j++) {
        //     charArray[j] = tempCharArray[len - 1 - j];
        // }

        // String reversePalindrome = new String(charArray);
        // System.out.println(reversePalindrome);

        // System.err.println("My name is ".concat("toan bui"));
        // String toanBui =    "This ADN structure will become a CTO in fulture soon " +
        //                     "EXACTLY";

        // System.out.println(toanBui);

        // float floatVar = 1f;
        // int intVar = 1;
        // String stringVar = "toanbui";

        // System.out.printf("The value of the float " +
        //     "variable is %f, while " +
        //     "the value of the " + 
        //     "integer variable is %d, " +
        //     "and the string is %s", 
        //     floatVar, intVar, stringVar);

        // String fs;
        // fs = String.format("The value of the float " +
        //     "variable is %f, while " +
        //     "the value of the " + 
        //     "integer variable is %d, " +
        //     "and the string is %s",
        //     floatVar, intVar, stringVar);
        // System.out.println(fs);

        //String[] split(String regex), String[] split(String regex, int limit)
        String texts = "toan bui : java programming";
        String[] result1 = texts.split(" ");
        String[] result2 = texts.split(" ", 2);
        
        for (String test1 : result1 ) {
            System.out.println(test1);
        }

        for (String test2 : result2) {
            System.out.println(test2);
        }

        
        CharSequence subSequence =   texts.subSequence(0,5);
        System.out.println("Subsequence: "+ subSequence);

        String trimTest = texts.trim();
        System.out.println("Trim: " + trimTest);
    }
}
