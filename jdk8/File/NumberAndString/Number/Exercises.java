package File.NumberAndString.Number;

import java.util.Locale;

public class Exercises {
    //1.
    public void convertMaxToMin() {
        //integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        //real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        //Display them all.
        System.out.println("The smallest byte value is " + smallestByte + ".");
        System.out.println("The smallest short value is " + smallestShort + ".");
        System.out.println("The smallest integer value is " + smallestInteger + ".");
        System.out.println("The smallest long value is " + smallestLong + ".");
        System.out.println("The smallest float value is " + smallestFloat + ".");
        System.out.println("The smallest double value is " + smallestDouble + ".");
    }

    //2.
    public void valueOfDemo(String[] values) {
        if (values.length >= 2) {
            int sum = 0;
            for(String value : values) {
                try {
                    int num = Integer.parseInt(value);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid argument: " + value + ". Skipping...");
                }
            }
            System.out.println("Sum is: " + sum);

        } else {
            System.out.println("This program requires at least two command-line arguments.");
        }
    }

    //3.
    public void valueOfDemoDinamic(String[] values) {
        Locale.setDefault(Locale.ENGLISH);
        double sum = 0.0;

        for (String value : values) {
            try {
                double num = Double.parseDouble(value);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + value);
            }
        }
        System.out.printf("Sum: %.2f%n", sum);
    }
}
