package LanguageBasics.Operators.ERCO;

public class ERCO {
    private int value1;
    private int value2;


    public void comparisonDemo(int value1, int value2) {

        if (value1 == value2) {
            System.out.println("value1 == value2");
        }

        if (value1 != value2) {
            System.out.println("value1 != value2");
        }

        if (value1 > value2) {
            System.out.println("value1 > value2");
        }

        if (value1 < value2) {
            System.out.println("value1 < value2");
        }

        if (value1 >= value2) {
            System.out.println("value1 >= value2");
        }

        if (value1 <= value2) {
            System.out.println("value1 <= value2");
        }


    }

    public void ConditionalDemo1(int value1, int value2) {
        if ((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }

        if ((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }
    }

    public void ConditionalDemo2(int value1, int value2) {
        String resultAND = ((value1 == 1) && (value2 == 2)) ?  "value1 is 1 AND value2 is 2" : "Not true";
        System.out.println(resultAND);

        String resultOR = ((value1 == 1) || (value2 == 1)) ? "value1 is 1 OR value2 is 1" : "Not true";
        System.out.println(resultOR);

        String result = ((resultAND != "Not true") && (resultOR != "Not true")) ? "resultAND and resultOR are both TRUE" : "resultAND is Not true OR resultOR Not true";
        System.out.println(result);

    }
}
