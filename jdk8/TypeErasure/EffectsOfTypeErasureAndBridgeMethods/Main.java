package TypeErasure.EffectsOfTypeErasureAndBridgeMethods;

public class Main {
    public static void main (String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn;
        n.setData("Hello");
        Integer x = (Integer)mn.data;
    }
}
