package generics.RestrictionsOnGenerics.CannotUseCastsOrInstanceofWithParameterizedTypes;

import java.util.List;
import java.util.ArrayList;

public class Pair {
    public static <E> void rtti(List<E> list) {
        if (list instanceof ArrayList<Integer>) {// compile-time error

        }

        List<Integer> li = new ArrayList<>();
        List<Number>  ln = (List<Number>) li;  // compile-time error

        List<String> l1 = ...;
        ArrayList<String> l2 = (ArrayList<String>)l1;  // OK
    }
}
