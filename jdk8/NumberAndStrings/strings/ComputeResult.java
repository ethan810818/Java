package NumberAndStrings.strings;

public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

// /*1*/   result.setCharAt(0, original.charAt(0));// h --> s => now is 'si'
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));// i --> r => now is 'sr'
// /*3*/   result.insert(1, original.charAt(4));// add w into 'sr' => now is 'srw'
// /*4*/   result.append(original.substring(1,4));// => now is 'srwoft'
// /*5*/   result.insert(3, (original.substring(index, index+2) + " ")); // now is 'srware oft'

        System.out.println("result is: " + result);
    }
}