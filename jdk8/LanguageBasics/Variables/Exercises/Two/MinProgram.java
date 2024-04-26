package LanguageBasics.Variables.Exercises.Two;

import java.math.BigDecimal;

import Constants.Constants;

public class MinProgram {
    private byte byteIs;
    private short shortIs;
    private int intIs;
    private long longIs;
    private float floatIs;
    private double doubleIs;
    private boolean booleanIs;
    private char charIs;
    private String stringIs;
    private Long LongIs;
    private BigDecimal bigDecimalIs;

    public void showFieldUninitialized() {
        System.out.println(
            "\nbyte " + Constants.DEFAULT + byteIs
            + "\nshort " + Constants.DEFAULT + shortIs
            + "\nint " + Constants.DEFAULT + intIs
            + "\nlong " + Constants.DEFAULT + longIs
            + "\nfloat " + Constants.DEFAULT + floatIs
            + "\ndouble " + Constants.DEFAULT + doubleIs
            + "\nbooleanIs " + Constants.DEFAULT + booleanIs
            + "\ncharIs " + Constants.DEFAULT + charIs
            + "\nstringIs " + Constants.DEFAULT + stringIs
            + "\nLongIs " + Constants.DEFAULT + LongIs
            + "\nbigDecimalIs " + Constants.DEFAULT + bigDecimalIs
        );
    }

    // public void showErrorOfLocalVariable() {
    //     int i;
    //     System.out.println(i);
    // }
}
