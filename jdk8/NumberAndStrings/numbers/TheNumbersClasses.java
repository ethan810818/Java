package NumberAndStrings.numbers;

import java.util.List;

public class TheNumbersClasses {
    
    //As an argument of a method that expects an object
    public double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return  sum / numbers.size();
    }

    //To use constants defined by the class
    public String getMax() {

        Byte maxByte = Byte.MAX_VALUE;
        Byte minByte = Byte.MIN_VALUE;

        Integer maxInteger = Integer.MAX_VALUE;
        Integer minInteger = Integer.MIN_VALUE;

        Double maxDouble = Double.MAX_VALUE;
        Double minDouble = Double.MIN_VALUE;

        Short maxShort = Short.MAX_VALUE;
        Short minShort = Short.MIN_VALUE;

        Float maxFloat = Float.MAX_VALUE;
        Float minFloat = Float.MIN_VALUE;

        Long maxLong = Long.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;

        return "pending";
    }

    //Use for converting values to ... from ...
    public void convertExample() {
        Number number = 8108;

       //Converts the value of this Number object to the primitive data type returned
        byte byteValue = number.byteValue();
        short shortValue = number.shortValue();
        int intValue = number.intValue();
        long longValue = number.longValue();
        float floatValue = number.floatValue();
        double doubleValue = number.doubleValue();


        //Compares this Number object to the argument
        Byte byteNum1 = 1;
        Byte buteNum2 = 1;
        int byteResult = byteNum1.compareTo(buteNum2);

        Short shortNum1 = 1;
        Short shortNum2 = 1;
        int shortResult = shortNum1.compareTo(shortNum2);

        Integer intNum1 = 1;
        Integer intNum2 = 1;
        int intResult = intNum1.compareTo(intNum2);

        Long longNum1 = 1L;
        Long longNum2 = 1L;
        int longResult = longNum1.compareTo(longNum2);

        Float floatNum1 = 1F;
        Float floatNum2 = 1F;
        int floatResult = floatNum1.compareTo(floatNum2);

        Double doubleNum1 = 1D;
        Double doubleNum2 = 1D;
        int doubleResult = doubleNum1.compareTo(doubleNum2);


        //Determines whether this number object is equal to the argument
        boolean equals = number.equals(byteNum1);

    }

    //another methods in each subClass of Number, example with Integer:
    public Integer anotherMethod() {

        String binaryString = "1010";
        Integer binaryInteger = 1010;
        int intValueOf = 1;
        String stringValueOf = "1";
        String octalStringValueOf = "1";

        Integer decimalValue = Integer.decode(binaryString);
        int intValue = Integer.parseInt(binaryString);
        int octalValue = Integer.parseInt(binaryString, 8);
        String stringValue = binaryInteger.toString();
        String stringValueHasParameter = Integer.toString(binaryInteger);
        Integer integerValueOf = Integer.valueOf(intValueOf);
        Integer integerValueOfHasParameter = Integer.valueOf(stringValueOf);
        Integer integerOctalStringValueOf = Integer.valueOf(octalStringValueOf, 8);

        return 0;
    }

}
