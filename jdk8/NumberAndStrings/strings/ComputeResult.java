package NumberAndStrings.strings;

public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));// h --> s => now is 'si'
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));// i --> e => now is 'se'
/*3*/   result.insert(1, original.charAt(4));//se + "w" --> swe => now is 'swe'
/*4*/   result.append(original.substring(1,4));// swe + "oft" --> now is "sweoft"
/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); // sweoft  + "ar " --> swear oft => now is "swear oft"

        System.out.println("result is: " + result);
    }
}