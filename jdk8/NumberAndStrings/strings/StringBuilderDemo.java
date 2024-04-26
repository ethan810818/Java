package NumberAndStrings.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println(sb);
    }
}
