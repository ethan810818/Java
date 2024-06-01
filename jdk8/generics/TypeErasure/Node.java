package generics.TypeErasure;

public class Node {
    private Comparable data;
    private Node next;

    public Node(Comparable data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Comparable getData() { return data; }

    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
            return cnt;
    }



}