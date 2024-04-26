package File.NumberAndString.Number;

public class Question {

    //1.a
    public static String convertIntToHexadecimal(int number) {
        return Integer.toHexString(number);
    }

    //1.b
    public static int convertStringToInt(String string) {
        return Integer.valueOf(string, 5);
    }

    //1.c
    public static boolean checkNaN(double num) {
        return Double.isNaN(num);
    }

    //2. What is the value of the following expression, and why?
    public static boolean checkIntegerAndLong(int number) {
        return Integer.valueOf(number).equals(Long.valueOf(number));
    }

}
