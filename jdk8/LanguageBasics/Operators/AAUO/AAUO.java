package LanguageBasics.Operators.AAUO;

public class AAUO {
    private int result;

    public void arithmeticDemo() {
        result = result + 7;
        System.out.println("result with +: " + result);

        result = result - 1;
        System.out.println("result with -: " + result);

        result = result * 2;
        System.out.println("result with *: " + result);

        result = result / 2;
        System.out.println("result with / :" + result);
        
        result = result % 5;
        System.out.println("result with % :" + result);
        
    }

    public void concatDemo() {
        String firstString = "This is";
        String secondString = " a concatenated string";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }

    public void unaryDemo() {
        result = result +1;
        System.out.println(result);

        result = result--;
        System.out.println(result);

        result = result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println("success is: " + success);
        System.out.println("! success is :" + !success);
    }

    public void prePostDemo() {
        result = 3;
        System.out.println("result is :" + result);

        result++;
        System.out.println("result++ is: " + result);

        ++result;
        System.out.println("++result is :" + result);

        System.out.println("++instanceVariable: " + ++result);

        System.out.println("instanceVariable: " + result++);

        System.out.println(result);

    }
}
