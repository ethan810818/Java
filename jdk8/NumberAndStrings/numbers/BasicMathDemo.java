package NumberAndStrings.numbers;

public class BasicMathDemo {
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        //return absolute value
        System.out.printf("The absolute value " + " of %.3f is %.3f%n", a, Math.abs(a));

        //return smallest double >= argument
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));

        //return biggest double <= argument
        System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));

        //return nearest double to argument
        System.out.printf("The rint of %.2f " + "is %.0f%n", b, Math.rint(b));

        //return max
        System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));

        //return min
        System.out.printf("The min of %d " + "and %d is %d%n", c, d, Math.min(c, d));
    }
}
