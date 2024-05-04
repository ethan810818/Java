package generics;

public class Main {
    public static void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
        System.out.println(p1);
        System.out.println(p2);

        Box<String> stringBox = new Box<>();
        Box rawBox = stringBox; //ok

        Box rawBox1 = new Box(); // rawBox is a raw type of Box<T>
        Box<Integer> stringBox1 = rawBox; // warning: unchecked conversion
    }
}
