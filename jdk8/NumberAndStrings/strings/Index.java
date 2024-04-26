package NumberAndStrings.strings;

public class Index {
    public static void main(String[] args) {
        String texts = "a b c d e f g h i k l m o";
        char ch = 'a';

        //int indexOf(int ch)
        int fromFirst = texts.indexOf(ch);
        System.out.printf("First index of is: %d\n", + fromFirst);

        //int lastIndexOf(int ch)
        int fromLast = texts.lastIndexOf(ch);
        System.out.printf("Last index of is: %d", + fromLast);

        //
    }
}
