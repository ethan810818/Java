package generics.GenericsInheritanceSubtypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    static <T> T pick(T a1, T a2) {
        return a2;
    }
    Serializable s = pick("d", new ArrayList<String>());

    public static void main(String[] args) {
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;
    }
}
