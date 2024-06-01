package generics.RestrictionsOnGenerics.CannotCreateInstancesOfTypeParameters;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    public static <E> void append(List<E> list) {
        E elem = new E();//ERROR --> You cannot create an instance of a type parameter
        list.add(elem);
    }


    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();//OK
        list.add(elem);
    }

    public static void main(String[] args) throws Exception {
        List<String> ls = new ArrayList<>();
        append(ls, String.class);
    }
}
