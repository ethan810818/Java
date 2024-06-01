package generics.TypeErasure.EffectsOfTypeErasureAndBridgeMethods;

public class Node {
    public Object data;
    public Node(Object data) { this.data = data; }

    public void setData(Object data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
