package NumberAndStrings.characters;

public class Learn {
    public static void main(String[] args) {
        // int value = 1;
        // char charValue = 'a';
        // boolean isLetterValue = Character.isLetter(value);
        // System.out.println("is letter: " + isLetterValue);

        // boolean isDigitValue = Character.isDigit(value);
        // System.out.println("is digit: " + isDigitValue);

        // boolean isWhitespaceValue = Character.isWhitespace(value);
        // System.out.println("is white space: " + isWhitespaceValue);

        // boolean isUpperCaseValue = Character.isUpperCase(value);
        // System.out.println("is upper case: " + isUpperCaseValue);

        // boolean isLowerCaseValue = Character.isLowerCase(value);
        // System.out.println("is lower case: " + isLowerCaseValue);

        // char toUpperCaseValue = Character.toUpperCase(charValue);
        // System.out.println("to upper case: " +  toUpperCaseValue);

        // char toLowerCaseValue = Character.toLowerCase(charValue);
        // System.out.println("to lower case: " + toLowerCaseValue);

        // String toStringValue = Character.toString(value);
        // System.out.println("to string value: " +toStringValue);


        String text = "Hello\tworld!\nThis is a\bbackspace example.\rCarriage return\fand form feed.";
        String quotes = "She said, \"Hello!\"";
        String backslash = "This is a backslash: \\";
        
        System.out.println("text: " + text);//
        System.out.println("quotes: " + quotes);//clear
        System.out.println("backslash: " + backslash);//clear

        System.out.println("Hello\bWorld!"); 

        String test = "I want to become a CTO";
        System.out.println("test length: " + test.length());

    }
}
