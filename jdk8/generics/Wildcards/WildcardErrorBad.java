package generics.Wildcards;

import java.util.List;
import java.util.Arrays;

public class WildcardErrorBad {
    static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
        Number temp = l1.get(0);
        l1.set(0, l2.get(0));//error
        l2.set(0, temp);//error
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Double> ld = Arrays.asList(10.10, 20.20, 30.30);
        swapFirst(li, ld);
    }
}
