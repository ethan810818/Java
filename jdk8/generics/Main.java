package generics;

public class Main {
    public static void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
        System.out.println(p1);
        System.out.println(p2);
    }
}
