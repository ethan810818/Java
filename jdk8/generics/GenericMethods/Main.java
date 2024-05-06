package generics.GenericMethods;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);

        //So, The type has been explicitly provided, as shown in bold. Generally, this can be left out and the compiler will infer the type that is needed:
        Pair<Integer, String> p1New = new Pair<>(1, "apple");
        Pair<Integer, String> p2New = new Pair<>(2, "pear");
        boolean sameNew = Util.compare(p1New, p2New);

        /*This feature, known as type inference*/
    }
}
