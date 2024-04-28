package NumberAndStrings.strings;

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "Bui Minh Toan and Bui Minh Duc";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
    }
}
