package generics.TypeErasure.EffectsOfTypeErasureAndBridgeMethods;

public class MyNode extends Node {
    public MyNode(Integer data) { super(data); }

    public void setData(Object data) {
        setData((Integer) data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
