package LanguageBasics.Operators.BitwiseAndBitShift;

public class BitDemo {
    public void bitDemo1() {
        int bitMask = 0x000F;
        int val = 0x2222;

        // prints "2"
        System.out.println(val & bitMask);
    }
}
