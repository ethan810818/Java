package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardsAndSubtyping {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        List<Number> listInteger = listNumber; //compile error

        List<? extends Integer> listNumberPlus = new ArrayList<>();
        List<? extends Number> listIntegerPlus = listNumberPlus;
    }
}
